package types.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import types.core.SyntacticType;
import types.core.WhileySubtypeQuery;
import types.io.WhileyParser;

/**
 * A very simple parser for test suite files of the following form:
 *
 * <pre>
 * int <: int
 * int[] <: (int[])|int
 * </pre>
 *
 * @author djp
 *
 */
public class TestSuiteParser {
	public static void main(String[] args) throws IOException {
		String filename = args[0];
		printPreamble(filename);
		printTests(filename);
		printPostamble();
	}

	public static void printTests(String filename) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		String line;
		int count = 0;
		boolean firstTime = true;
		int classIndex = 0;
		while((line=reader.readLine()) != null) {
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
			line = line.replaceAll(" :> ", ":");
			String[] split = line.split(":");
			if(split.length == 2) {
				printTest(count++,split[0],split[1]);
			}
		}
		printCloseInnerClass();
	}

	private static void printPreamble(String name) {
		String className = "TestSuite_" + name.replace(".dat","").replace(".","_");
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

	private static void printTest(int id, String sup, String sub) {
		SyntacticType lhs = new WhileyParser(sup).parse();
		SyntacticType rhs = new WhileyParser(sub).parse();
		if(WhileySubtypeQuery.isSubtype(lhs, rhs)) {
			printValidTest(id,sup,sub);
		} else {
			printInvalidTest(id,sup,sub);
		}
	}

	private static void printValidTest(int id, String sup, String sub) {
		String queryName = "test_" + id + "_query";
		System.out.println("\t\tprivate static final SubtypeQuery " + queryName + " = createSubtypeQuery(parseWhiley(\"" + sup + "\"),parseWhiley(\"" + sub + "\"));");
		System.out.println("\t\t@Test public void test_" + id + "() { testValid(" + queryName + "); }\n");
	}

	private static void printInvalidTest(int id, String sup, String sub) {
		String queryName = "test_" + id + "_query";
		System.out.println("\t\tprivate static final SubtypeQuery " + queryName + " = createSubtypeQuery(parseWhiley(\"" + sup + "\"),parseWhiley(\"" + sub + "\"));");
		System.out.println("\t\t@Test public void test_" + id + "() { testInvalid(" + queryName + "); }\n");
	}

	private static void printPostamble() {
		System.out.println("}");
	}

	private static void printOpenInnerClass(int index) {
		System.out.println("\tpublic static class Part_" + index + " {");
	}

	private static void printCloseInnerClass() {
		System.out.println("\t}");
	}
}
