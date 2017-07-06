package types.testing;

import static org.junit.Assert.fail;

import types.core.RewritingSubtypeQuery;
import types.core.SubtypeQuery;
import types.core.SyntacticType;
import types.core.WhileySubtypeQuery;
import types.io.Parser;
import types.io.WhileyParser;

/**
 * A base class from which automatically (or hand-written) test suites can be
 * built.
 *
 * @author David J. Pearce
 *
 */
public class AbstractTestSuite {
	/**
	 * True if we should use the rewriting operator; false otherwise.
	 */
	public static boolean rewriting = true;

	public static void testValid(SubtypeQuery query) {
		query.exec();
		if (!query.result()) {
			// System.out.println("*** ERROR: !(" + sup + ":>" + sub + ")");
			//fail("should be subtypes (" + query.getClass().getName() + ")");
		}
	}

	public static void testInvalid(SubtypeQuery query) {
		query.exec();

		if (query.result()) {
			// System.out.println("*** ERROR: " + sup + ":>" + sub);
			//fail("should not be subtypes (" + query.getClass().getName() + ")");
		}
	}

	public static SyntacticType parse(String type) {
		return new Parser(type).parse();
	}


	public static SyntacticType parseWhiley(String type) {
		return new WhileyParser(type).parse();
	}

	public static SubtypeQuery createSubtypeQuery(SyntacticType sup, SyntacticType sub) {
		if(rewriting) {
			return new RewritingSubtypeQuery(sup,sub);
		} else {
			return new WhileySubtypeQuery(sup,sub);
		}
	}
}
