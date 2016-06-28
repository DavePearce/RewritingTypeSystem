package types.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import types.core.SyntacticType;
import types.core.WhileySubtypeOperator;

/**
 * Generate subtype tests as instances of JUnit tests. This is done using a
 * given type generator, and generates every pair of types as subtype tests. The
 * trick is that it must also determine which are valid subtype tests and which
 * are not.
 * 
 * @author David J. Pearce
 *
 */
public class TestSuiteGenerator {
	private final int depth;
	private final int width;
	private final List<SyntacticType> types;

	public TestSuiteGenerator(int depth, int width, List<SyntacticType> types) {
		this.depth = depth;
		this.width = width;
		this.types = types;
	}

	public void run() {
		// First, generate the list of types
		stripInvalidTypes(types);
		//
		printPreamble();
		int count = 0;
		int classIndex = 0;
		boolean firstTime = true;
		for (int i = 0; i != types.size(); ++i) {
			for (int j = 0; j != types.size(); ++j) {
				if ((count % 10000) == 0) {
					// Split inner classes up. The reason we use inner classes
					// is to ensure that the number of constant pool items
					// remains within the 64K limit. Otherwise, the generated
					// class cannot be compiled.
					if (!firstTime) {
						printCloseInnerClass();
					} else {
						firstTime = false;
					}
					printOpenInnerClass(classIndex++);
				}
				SyntacticType sup = types.get(i);
				SyntacticType sub = types.get(j);
				if (isValid(sup, sub)) {
					printValidTest(count++, sup, sub);
				} else {
					printInvalidTest(count++, sup, sub);
				}
			}
		}
		printCloseInnerClass();
		printPostamble();
	}

	private void printPreamble() {
		String className = "TestSuite_" + depth + "_" + width;
		System.out.println("import org.junit.FixMethodOrder;");
		System.out.println("import org.junit.runners.MethodSorters;");
		System.out.println("import org.junit.Test;");
		System.out.println("import types.testing.AbstractTestSuite;");
		System.out.println();
		System.out.println("@FixMethodOrder(MethodSorters.NAME_ASCENDING)");
		System.out.println("public class " + className + " extends AbstractTestSuite {");
	}

	private void printValidTest(int id, SyntacticType sup, SyntacticType sub) {
		System.out.println("\t\t@Test public void test_" + id + "() { testValid(\"" + sup + "\",\"" + sub + "\"); }");
	}

	private void printInvalidTest(int id, SyntacticType sup, SyntacticType sub) {
		System.out.println("\t\t@Test public void test_" + id + "() { testInvalid(\"" + sup + "\",\"" + sub + "\"); }");
	}

	private void printPostamble() {
		System.out.println("}");
	}

	private void printOpenInnerClass(int index) {
		System.out.println("\tpublic static class Part_" + index + " {");
	}

	private void printCloseInnerClass() {
		System.out.println("\t}");
	}

	private boolean isValid(SyntacticType sup, SyntacticType sub) {
		// We use the existing whiley subtype operator here as this is well
		// tested and assumed to be largely correct. In cases where the
		// rewrite-based operator disagrees we must then manualy inspect to
		// determine which is correct.
		return WhileySubtypeOperator.isSubtype(sup, sub);
	}

	/**
	 * Strip out any types which are "invalid". For example, the type {!any} is
	 * considered invalid by the Whiley subtype operator because it is
	 * equivalent to void. It's slightly annoying that we have to do this, but's
	 * an artifact of the way types are currently constructed in Whiley.
	 * 
	 * @param types
	 */
	private void stripInvalidTypes(List<SyntacticType> types) {
		for (int i = 0; i != types.size(); ++i) {
			try {
				WhileySubtypeOperator.toWhileyType(types.get(i));
			} catch (Exception e) {
				types.remove(i--);
			}
		}
	}

	public static List<SyntacticType> selectRandomSubset(List<SyntacticType> types, int n) {
		Collections.shuffle(types);
		return types.subList(0, n);
	}
	
	/**
	 * Select n elements chosen uniformly at random from a given iteration
	 * space.
	 * 
	 * @param t
	 * @param n
	 * @return
	 */
	public static List<SyntacticType> selectRandomElements(TypeGenerator generator, int n) {
		long space = generator.size();
		TypeGenerator.Iterator iter = generator.iterator();
		ArrayList<SyntacticType> types = new ArrayList<SyntacticType>();
		Random rand = new Random();
		while (types.size() < n && iter.hasNext()) {
			if (choose(rand, space, n)) {
				types.add(iter.next());
			} else {
				iter.skip();
			}
			space = space - 1;
		}
		return types;
	}

	/**
	 * Choose with a probability of n / space. That is, return true if should
	 * choose; otherwise, return false. This method has to deal with the fact
	 * that the space is a long, and Random is not so good for generating random
	 * long numbers.
	 * 
	 * @param rand
	 * @param space
	 * @param n
	 * @return
	 */
	private static boolean choose(Random rand, long space, int n) {
		if(space < Integer.MAX_VALUE) {
			// concrete method
			int i = rand.nextInt((int)space);
			return i < n;
		} else {
			// approximate method
			double p = rand.nextDouble();
			p = p * space;
			return p < n;
		}
	}
	
	public static void run(int depth, int width, int cardinality) {
		TypeGenerator typeGen = new TypeGenerator(depth, width);
		List<SyntacticType> types = selectRandomElements(typeGen,cardinality);
//		System.out.println("GENERATED: " + types.size() + " types");
//		for(SyntacticType t : types) {
//			System.out.println(t);
//		}
		TestSuiteGenerator testGen = new TestSuiteGenerator(depth,width,types);
		testGen.run();
	}
	
	public static void main(String[] args) {
		run(3,2,200);
	}
}