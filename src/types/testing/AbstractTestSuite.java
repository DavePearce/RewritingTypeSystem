package types.testing;

import static org.junit.Assert.fail;

import types.core.RewritingSubtypeOperator;
import types.core.SyntacticType;
import types.core.WhileySubtypeOperator;
import types.io.Parser;

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
	
	public static void testValid(SyntacticType sup, SyntacticType sub) {
		if (rewriting) {
			if (!RewritingSubtypeOperator.isSubtype(sup, sub)) {
				//System.out.println("*** ERROR: !(" + sup + ":>" + sub + ")");
				//fail("should be subtypes (rewriting operator)");
			}
		} else {
			if (!WhileySubtypeOperator.isSubtype(sup, sub)) {
				fail("should be subtypes (whiley operator)");
			}
		}
	}
	
	public static void testInvalid(SyntacticType sup, SyntacticType sub) {
		if(rewriting) {
			if (RewritingSubtypeOperator.isSubtype(sup, sub)) {
				//System.out.println("*** ERROR: " + sup + ":>" + sub);
				//fail("should not be subtypes (rewriting operator)");
			}
		} else {
			if (WhileySubtypeOperator.isSubtype(sup, sub)) {
				fail("should not be subtypes (whiley operator)");
			}
		}		
	}
	
	public static SyntacticType parse(String type) {
		return new Parser(type).parse();
	}
}
