import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import types.testing.AbstractTestSuite;
import types.core.SyntacticType;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSuite_1_1 extends AbstractTestSuite {
	public static class Part_0 {
		private static final SyntacticType test_0_sup = parse("any");
		private static final SyntacticType test_0_sub = parse("any");
		@Test public void test_0() { testValid(test_0_sup,test_0_sub); }

		private static final SyntacticType test_1_sup = parse("any");
		private static final SyntacticType test_1_sub = parse("int");
		@Test public void test_1() { testValid(test_1_sup,test_1_sub); }

		private static final SyntacticType test_2_sup = parse("any");
		private static final SyntacticType test_2_sub = parse("{any}");
		@Test public void test_2() { testValid(test_2_sup,test_2_sub); }

		private static final SyntacticType test_3_sup = parse("any");
		private static final SyntacticType test_3_sub = parse("{int}");
		@Test public void test_3() { testValid(test_3_sup,test_3_sub); }

		private static final SyntacticType test_4_sup = parse("any");
		private static final SyntacticType test_4_sub = parse("!any");
		@Test public void test_4() { testValid(test_4_sup,test_4_sub); }

		private static final SyntacticType test_5_sup = parse("any");
		private static final SyntacticType test_5_sub = parse("!int");
		@Test public void test_5() { testValid(test_5_sup,test_5_sub); }

		private static final SyntacticType test_6_sup = parse("int");
		private static final SyntacticType test_6_sub = parse("any");
		@Test public void test_6() { testInvalid(test_6_sup,test_6_sub); }

		private static final SyntacticType test_7_sup = parse("int");
		private static final SyntacticType test_7_sub = parse("int");
		@Test public void test_7() { testValid(test_7_sup,test_7_sub); }

		private static final SyntacticType test_8_sup = parse("int");
		private static final SyntacticType test_8_sub = parse("{any}");
		@Test public void test_8() { testInvalid(test_8_sup,test_8_sub); }

		private static final SyntacticType test_9_sup = parse("int");
		private static final SyntacticType test_9_sub = parse("{int}");
		@Test public void test_9() { testInvalid(test_9_sup,test_9_sub); }

		private static final SyntacticType test_10_sup = parse("int");
		private static final SyntacticType test_10_sub = parse("!any");
		@Test public void test_10() { testValid(test_10_sup,test_10_sub); }

		private static final SyntacticType test_11_sup = parse("int");
		private static final SyntacticType test_11_sub = parse("!int");
		@Test public void test_11() { testInvalid(test_11_sup,test_11_sub); }

		private static final SyntacticType test_12_sup = parse("{any}");
		private static final SyntacticType test_12_sub = parse("any");
		@Test public void test_12() { testInvalid(test_12_sup,test_12_sub); }

		private static final SyntacticType test_13_sup = parse("{any}");
		private static final SyntacticType test_13_sub = parse("int");
		@Test public void test_13() { testInvalid(test_13_sup,test_13_sub); }

		private static final SyntacticType test_14_sup = parse("{any}");
		private static final SyntacticType test_14_sub = parse("{any}");
		@Test public void test_14() { testValid(test_14_sup,test_14_sub); }

		private static final SyntacticType test_15_sup = parse("{any}");
		private static final SyntacticType test_15_sub = parse("{int}");
		@Test public void test_15() { testValid(test_15_sup,test_15_sub); }

		private static final SyntacticType test_16_sup = parse("{any}");
		private static final SyntacticType test_16_sub = parse("!any");
		@Test public void test_16() { testValid(test_16_sup,test_16_sub); }

		private static final SyntacticType test_17_sup = parse("{any}");
		private static final SyntacticType test_17_sub = parse("!int");
		@Test public void test_17() { testInvalid(test_17_sup,test_17_sub); }

		private static final SyntacticType test_18_sup = parse("{int}");
		private static final SyntacticType test_18_sub = parse("any");
		@Test public void test_18() { testInvalid(test_18_sup,test_18_sub); }

		private static final SyntacticType test_19_sup = parse("{int}");
		private static final SyntacticType test_19_sub = parse("int");
		@Test public void test_19() { testInvalid(test_19_sup,test_19_sub); }

		private static final SyntacticType test_20_sup = parse("{int}");
		private static final SyntacticType test_20_sub = parse("{any}");
		@Test public void test_20() { testInvalid(test_20_sup,test_20_sub); }

		private static final SyntacticType test_21_sup = parse("{int}");
		private static final SyntacticType test_21_sub = parse("{int}");
		@Test public void test_21() { testValid(test_21_sup,test_21_sub); }

		private static final SyntacticType test_22_sup = parse("{int}");
		private static final SyntacticType test_22_sub = parse("!any");
		@Test public void test_22() { testValid(test_22_sup,test_22_sub); }

		private static final SyntacticType test_23_sup = parse("{int}");
		private static final SyntacticType test_23_sub = parse("!int");
		@Test public void test_23() { testInvalid(test_23_sup,test_23_sub); }

		private static final SyntacticType test_24_sup = parse("!any");
		private static final SyntacticType test_24_sub = parse("any");
		@Test public void test_24() { testInvalid(test_24_sup,test_24_sub); }

		private static final SyntacticType test_25_sup = parse("!any");
		private static final SyntacticType test_25_sub = parse("int");
		@Test public void test_25() { testInvalid(test_25_sup,test_25_sub); }

		private static final SyntacticType test_26_sup = parse("!any");
		private static final SyntacticType test_26_sub = parse("{any}");
		@Test public void test_26() { testInvalid(test_26_sup,test_26_sub); }

		private static final SyntacticType test_27_sup = parse("!any");
		private static final SyntacticType test_27_sub = parse("{int}");
		@Test public void test_27() { testInvalid(test_27_sup,test_27_sub); }

		private static final SyntacticType test_28_sup = parse("!any");
		private static final SyntacticType test_28_sub = parse("!any");
		@Test public void test_28() { testValid(test_28_sup,test_28_sub); }

		private static final SyntacticType test_29_sup = parse("!any");
		private static final SyntacticType test_29_sub = parse("!int");
		@Test public void test_29() { testInvalid(test_29_sup,test_29_sub); }

		private static final SyntacticType test_30_sup = parse("!int");
		private static final SyntacticType test_30_sub = parse("any");
		@Test public void test_30() { testInvalid(test_30_sup,test_30_sub); }

		private static final SyntacticType test_31_sup = parse("!int");
		private static final SyntacticType test_31_sub = parse("int");
		@Test public void test_31() { testInvalid(test_31_sup,test_31_sub); }

		private static final SyntacticType test_32_sup = parse("!int");
		private static final SyntacticType test_32_sub = parse("{any}");
		@Test public void test_32() { testValid(test_32_sup,test_32_sub); }

		private static final SyntacticType test_33_sup = parse("!int");
		private static final SyntacticType test_33_sub = parse("{int}");
		@Test public void test_33() { testValid(test_33_sup,test_33_sub); }

		private static final SyntacticType test_34_sup = parse("!int");
		private static final SyntacticType test_34_sub = parse("!any");
		@Test public void test_34() { testValid(test_34_sup,test_34_sub); }

		private static final SyntacticType test_35_sup = parse("!int");
		private static final SyntacticType test_35_sub = parse("!int");
		@Test public void test_35() { testValid(test_35_sup,test_35_sub); }

	}
}
