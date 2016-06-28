import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import types.testing.AbstractTestSuite;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSuite_1_1 extends AbstractTestSuite {
	public static class Part_0 {
		@Test public void test_0() { testValid("any","any"); }
		@Test public void test_1() { testValid("any","int"); }
		@Test public void test_2() { testValid("any","{any}"); }
		@Test public void test_3() { testValid("any","{int}"); }
		@Test public void test_4() { testValid("any","!any"); }
		@Test public void test_5() { testValid("any","!int"); }
		@Test public void test_6() { testInvalid("int","any"); }
		@Test public void test_7() { testValid("int","int"); }
		@Test public void test_8() { testInvalid("int","{any}"); }
		@Test public void test_9() { testInvalid("int","{int}"); }
		@Test public void test_10() { testValid("int","!any"); }
		@Test public void test_11() { testInvalid("int","!int"); }
		@Test public void test_12() { testInvalid("{any}","any"); }
		@Test public void test_13() { testInvalid("{any}","int"); }
		@Test public void test_14() { testValid("{any}","{any}"); }
		@Test public void test_15() { testValid("{any}","{int}"); }
		@Test public void test_16() { testValid("{any}","!any"); }
		@Test public void test_17() { testInvalid("{any}","!int"); }
		@Test public void test_18() { testInvalid("{int}","any"); }
		@Test public void test_19() { testInvalid("{int}","int"); }
		@Test public void test_20() { testInvalid("{int}","{any}"); }
		@Test public void test_21() { testValid("{int}","{int}"); }
		@Test public void test_22() { testValid("{int}","!any"); }
		@Test public void test_23() { testInvalid("{int}","!int"); }
		@Test public void test_24() { testInvalid("!any","any"); }
		@Test public void test_25() { testInvalid("!any","int"); }
		@Test public void test_26() { testInvalid("!any","{any}"); }
		@Test public void test_27() { testInvalid("!any","{int}"); }
		@Test public void test_28() { testValid("!any","!any"); }
		@Test public void test_29() { testInvalid("!any","!int"); }
		@Test public void test_30() { testInvalid("!int","any"); }
		@Test public void test_31() { testInvalid("!int","int"); }
		@Test public void test_32() { testValid("!int","{any}"); }
		@Test public void test_33() { testValid("!int","{int}"); }
		@Test public void test_34() { testValid("!int","!any"); }
		@Test public void test_35() { testValid("!int","!int"); }
	}
}
