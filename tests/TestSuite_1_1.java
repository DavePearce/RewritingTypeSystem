import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import types.testing.AbstractTestSuite;
import types.core.SubtypeQuery;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSuite_1_1 extends AbstractTestSuite {
	public static class Part_0 {
		private static final SubtypeQuery test_0_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("any"));
		@Test public void test_0() { testValid(test_0_query); }

		private static final SubtypeQuery test_1_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("int"));
		@Test public void test_1() { testValid(test_1_query); }

		private static final SubtypeQuery test_2_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("{any}"));
		@Test public void test_2() { testValid(test_2_query); }

		private static final SubtypeQuery test_3_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("{int}"));
		@Test public void test_3() { testValid(test_3_query); }

		private static final SubtypeQuery test_4_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("!any"));
		@Test public void test_4() { testValid(test_4_query); }

		private static final SubtypeQuery test_5_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("!int"));
		@Test public void test_5() { testValid(test_5_query); }

		private static final SubtypeQuery test_6_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("any"));
		@Test public void test_6() { testInvalid(test_6_query); }

		private static final SubtypeQuery test_7_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("int"));
		@Test public void test_7() { testValid(test_7_query); }

		private static final SubtypeQuery test_8_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{any}"));
		@Test public void test_8() { testInvalid(test_8_query); }

		private static final SubtypeQuery test_9_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{int}"));
		@Test public void test_9() { testInvalid(test_9_query); }

		private static final SubtypeQuery test_10_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!any"));
		@Test public void test_10() { testValid(test_10_query); }

		private static final SubtypeQuery test_11_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!int"));
		@Test public void test_11() { testInvalid(test_11_query); }

		private static final SubtypeQuery test_12_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("any"));
		@Test public void test_12() { testInvalid(test_12_query); }

		private static final SubtypeQuery test_13_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("int"));
		@Test public void test_13() { testInvalid(test_13_query); }

		private static final SubtypeQuery test_14_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{any}"));
		@Test public void test_14() { testValid(test_14_query); }

		private static final SubtypeQuery test_15_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{int}"));
		@Test public void test_15() { testValid(test_15_query); }

		private static final SubtypeQuery test_16_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!any"));
		@Test public void test_16() { testValid(test_16_query); }

		private static final SubtypeQuery test_17_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!int"));
		@Test public void test_17() { testInvalid(test_17_query); }

		private static final SubtypeQuery test_18_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("any"));
		@Test public void test_18() { testInvalid(test_18_query); }

		private static final SubtypeQuery test_19_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("int"));
		@Test public void test_19() { testInvalid(test_19_query); }

		private static final SubtypeQuery test_20_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{any}"));
		@Test public void test_20() { testInvalid(test_20_query); }

		private static final SubtypeQuery test_21_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{int}"));
		@Test public void test_21() { testValid(test_21_query); }

		private static final SubtypeQuery test_22_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!any"));
		@Test public void test_22() { testValid(test_22_query); }

		private static final SubtypeQuery test_23_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!int"));
		@Test public void test_23() { testInvalid(test_23_query); }

		private static final SubtypeQuery test_24_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("any"));
		@Test public void test_24() { testInvalid(test_24_query); }

		private static final SubtypeQuery test_25_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("int"));
		@Test public void test_25() { testInvalid(test_25_query); }

		private static final SubtypeQuery test_26_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{any}"));
		@Test public void test_26() { testInvalid(test_26_query); }

		private static final SubtypeQuery test_27_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{int}"));
		@Test public void test_27() { testInvalid(test_27_query); }

		private static final SubtypeQuery test_28_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!any"));
		@Test public void test_28() { testValid(test_28_query); }

		private static final SubtypeQuery test_29_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!int"));
		@Test public void test_29() { testInvalid(test_29_query); }

		private static final SubtypeQuery test_30_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("any"));
		@Test public void test_30() { testInvalid(test_30_query); }

		private static final SubtypeQuery test_31_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("int"));
		@Test public void test_31() { testInvalid(test_31_query); }

		private static final SubtypeQuery test_32_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{any}"));
		@Test public void test_32() { testValid(test_32_query); }

		private static final SubtypeQuery test_33_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{int}"));
		@Test public void test_33() { testValid(test_33_query); }

		private static final SubtypeQuery test_34_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!any"));
		@Test public void test_34() { testValid(test_34_query); }

		private static final SubtypeQuery test_35_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!int"));
		@Test public void test_35() { testValid(test_35_query); }

	}
}
