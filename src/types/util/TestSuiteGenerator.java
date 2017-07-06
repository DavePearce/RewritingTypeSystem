package types.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import types.core.SyntacticType;
import types.core.Value;
import types.core.WhileySubtypeQuery;
import types.testing.AbstractTestSuite;

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
	private final ArrayList<SyntacticType> types;
	private final ArrayList<Value> domain;

	public TestSuiteGenerator(int depth, int width, ArrayList<SyntacticType> types, ArrayList<Value> domain) {
		this.depth = depth;
		this.width = width;
		this.types = types;
		this.domain = domain;
	}

	public void run() {
		// First, generate the list of types
		// stripInvalidTypes(types);
		//
		printPreamble();
		int count = 0;
		int classIndex = 0;
		boolean firstTime = true;
		for (int i = 0; i != types.size(); ++i) {
			for (int j = 0; j != types.size(); ++j) {
				if ((count % 1000) == 0) {
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
		System.out.println("import types.core.SyntacticType;");
		System.out.println("import types.core.SubtypeQuery;");
		System.out.println();
		System.out.println("@FixMethodOrder(MethodSorters.NAME_ASCENDING)");
		System.out.println("public class " + className + " extends AbstractTestSuite {");
	}


	private static void printValidTest(int id, SyntacticType sup, SyntacticType sub) {
		String queryName = "test_" + id + "_query";
		System.out.println("\t\tprivate static final SubtypeQuery " + queryName + " = createSubtypeQuery(parseWhiley(\"" + sup + "\"),parseWhiley(\"" + sub + "\"));");
		System.out.println("\t\t@Test public void test_" + id + "() { testValid(" + queryName + "); }\n");
	}

	private static void printInvalidTest(int id, SyntacticType sup, SyntacticType sub) {
		String queryName = "test_" + id + "_query";
		System.out.println("\t\tprivate static final SubtypeQuery " + queryName + " = createSubtypeQuery(parseWhiley(\"" + sup + "\"),parseWhiley(\"" + sub + "\"));");
		System.out.println("\t\t@Test public void test_" + id + "() { testInvalid(" + queryName + "); }\n");
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

//		Set<Value> supset = computeSemanticSet(sup, domain);
//		Set<Value> subset = computeSemanticSet(sub, domain);
//		return isSupset(supset,subset);
		return WhileySubtypeQuery.isSubtype(sup, sub);
	}

	/**
	 * Determine whether one value set is a super set of another.
	 *
	 * @param superSet
	 * @param supSet
	 */
	private static boolean isSupset(Set<Value> superSet, Set<Value> subSet) {
		for(Value v : subSet) {
			if(!superSet.contains(v)) {
				return false;
			}
		}
		return true;
	}

	private static Set<Value> computeSemanticSet(SyntacticType t, ArrayList<Value> domain) {
		HashSet<Value> result = new HashSet<>();
		for(int i=0;i!=domain.size();++i) {
			Value v = domain.get(i);
			if(t.accepts(v)) {
				result.add(v);
			}
		}
		return result;
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
				WhileySubtypeQuery.toWhileyType(types.get(i));
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
	public static ArrayList<SyntacticType> selectRandomElements(TypeGenerator generator, int n) {
		long space = generator.size();
		TypeGenerator.Iterator iter = generator.iterator();
		ArrayList<SyntacticType> types = new ArrayList<>();
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

	public static void generateDomain(int depth, int width, ArrayList<Value> result) {
		if(depth == 0) {
			// Add a token integer.  One is actually enough.
			result.add(new Value.Int(0));
		} else {
			generateDomain(depth-1, width, result);
			int depth_m1 = result.size();
			for(int w=1;w<=width;++w) {
				genAllPermutations(w,depth_m1,result);
			}
		}
	}

	public static void genAllPermutations(int width, int end, ArrayList<Value> values) {
		if(width == 1) {
			for(int i=0;i<end;++i) {
				Value v = values.get(i);
				values.add(new Value.Tuple(v));
			}
		} else {
			Counter c = new Counter(width,end-1);
			while(!c.isFinished()) {
				Value[] vs = new Value[width];
				for(int i=0;i!=width;++i) {
					vs[i] = values.get(c.items[i]);
				}
				values.add(new Value.Tuple(vs));
				c.increment();
			}
		}
	}

	public static class Counter {
		private final int[] items;
		private final int max;

		public Counter(int dim, int max) {
			this.items = new int[dim];
			this.max = max;
		}
		/**
		 * The counter is finished when each dimension has reached the maximum value
		 *
		 * @param counter
		 * @param max
		 *            maximum value of any dimension
		 * @return
		 */
		public boolean isFinished() {
			return items[0] == -1;
		}

		/**
		 * To increment the counter we starting incrementing from the innermost
		 * dimensions first. If a dimension has the maximum value, we roll it over
		 * to zero and carry to the next dimension. Otherwise, we just increment the
		 * given dimension by 1.
		 *
		 * @param counter
		 * @param max
		 *            maximum value of any dimension
		 */
		public void increment() {
			int i = 0;
			while (i < items.length && items[i] == max) {
				items[i] = 0;
				i = i + 1;
			}
			if(i == items.length) {
				// signal count has finished
				items[0] = -1;
			} else {
				items[i] = items[i] + 1;
			}
		}

		@Override
		public String toString() {
			return Arrays.toString(items);
		}
	}

	public static void run(int depth, int width, int cardinality) {
		TypeGenerator typeGen = new TypeGenerator(depth, width);
		ArrayList<SyntacticType> types = selectRandomElements(typeGen,cardinality);
		ArrayList<Value> domain = new ArrayList<>();
//		generateDomain(depth+1,width+1,domain);
//		System.err.println("CONSTRUCTED DOMAIN: " + domain.size());
//		System.err.println("COMPUTED DOMAIN: " + domain.size());
//		System.err.println("REDUCED DOMAIN: " + new HashSet<Value>(domain).size());
//		SyntacticType sup = AbstractTestSuite.parse("!!int");
//		SyntacticType sub = AbstractTestSuite.parse("!{any}");
//		System.out.println(computeSemanticSet(sup,domain));
//		System.out.println(computeSemanticSet(sub,domain));
		//System.out.println("GOT: " + domain);
//		System.out.println("GENERATED: " + types.size() + " types");
//		for(SyntacticType t : types) {
//			System.out.println(t);
//		}
		TestSuiteGenerator testGen = new TestSuiteGenerator(depth,width,types,domain);
		testGen.run();
	}

	public static void main(String[] args) {
		run(3,2,100);
	}
}
