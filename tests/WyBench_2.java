import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import types.testing.AbstractTestSuite;
import types.core.SubtypeQuery;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WyBench_2 extends AbstractTestSuite {
	public static class Part_0 {
		private static final SubtypeQuery test_0_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("int"));
		@Test public void test_0() { testValid(test_0_query); }

		private static final SubtypeQuery test_1_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int[]"));
		@Test public void test_1() { testInvalid(test_1_query); }

		private static final SubtypeQuery test_2_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int"));
		@Test public void test_2() { testInvalid(test_2_query); }

		private static final SubtypeQuery test_3_query = createSubtypeQuery(parseWhiley("int[]"),parseWhiley("int[]"));
		@Test public void test_3() { testValid(test_3_query); }

		private static final SubtypeQuery test_4_query = createSubtypeQuery(parseWhiley("byte[]"),parseWhiley("byte[]"));
		@Test public void test_4() { testValid(test_4_query); }

		private static final SubtypeQuery test_5_query = createSubtypeQuery(parseWhiley("null|int[]"),parseWhiley("null|int[]"));
		@Test public void test_5() { testValid(test_5_query); }

		private static final SubtypeQuery test_6_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("int"));
		@Test public void test_6() { testValid(test_6_query); }

		private static final SubtypeQuery test_7_query = createSubtypeQuery(parseWhiley("bool"),parseWhiley("bool"));
		@Test public void test_7() { testValid(test_7_query); }

		private static final SubtypeQuery test_8_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[][] data,int height,int width}"));
		@Test public void test_8() { testInvalid(test_8_query); }

		private static final SubtypeQuery test_9_query = createSubtypeQuery(parseWhiley("int[][]"),parseWhiley("int[][]"));
		@Test public void test_9() { testValid(test_9_query); }

		private static final SubtypeQuery test_10_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int[][]"));
		@Test public void test_10() { testInvalid(test_10_query); }

		private static final SubtypeQuery test_11_query = createSubtypeQuery(parseWhiley("{int[][] data,int height,int width}"),parseWhiley("{int[][] data,int height,int width}"));
		@Test public void test_11() { testValid(test_11_query); }

		private static final SubtypeQuery test_12_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("bool"));
		@Test public void test_12() { testInvalid(test_12_query); }

		private static final SubtypeQuery test_13_query = createSubtypeQuery(parseWhiley("{int[][] data,int height,int width}"),parseWhiley("int"));
		@Test public void test_13() { testInvalid(test_13_query); }

		private static final SubtypeQuery test_14_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{int[][] data,int height,int width}"));
		@Test public void test_14() { testInvalid(test_14_query); }

		private static final SubtypeQuery test_15_query = createSubtypeQuery(parseWhiley("int[]"),parseWhiley("void"));
		@Test public void test_15() { testValid(test_15_query); }

		private static final SubtypeQuery test_16_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int col,int row}"));
		@Test public void test_16() { testInvalid(test_16_query); }

		private static final SubtypeQuery test_17_query = createSubtypeQuery(parseWhiley("{int col,int row}"),parseWhiley("{int col,int row}"));
		@Test public void test_17() { testValid(test_17_query); }

		private static final SubtypeQuery test_18_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int col,int row}[]"));
		@Test public void test_18() { testInvalid(test_18_query); }

		private static final SubtypeQuery test_19_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int col,int row}[][]"));
		@Test public void test_19() { testInvalid(test_19_query); }

		private static final SubtypeQuery test_20_query = createSubtypeQuery(parseWhiley("{int col,int row}[][]"),parseWhiley("{int col,int row}[][]"));
		@Test public void test_20() { testValid(test_20_query); }

		private static final SubtypeQuery test_21_query = createSubtypeQuery(parseWhiley("{int col,int row}[]"),parseWhiley("{int col,int row}[]"));
		@Test public void test_21() { testValid(test_21_query); }

		private static final SubtypeQuery test_22_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[] items,int length}"));
		@Test public void test_22() { testInvalid(test_22_query); }

		private static final SubtypeQuery test_23_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("int[]"));
		@Test public void test_23() { testInvalid(test_23_query); }

		private static final SubtypeQuery test_24_query = createSubtypeQuery(parseWhiley("bool[]"),parseWhiley("int[]"));
		@Test public void test_24() { testValid(test_24_query); }

		private static final SubtypeQuery test_25_query = createSubtypeQuery(parseWhiley("bool"),parseWhiley("int[]"));
		@Test public void test_25() { testInvalid(test_25_query); }

		private static final SubtypeQuery test_26_query = createSubtypeQuery(parseWhiley("int[]"),parseWhiley("int"));
		@Test public void test_26() { testInvalid(test_26_query); }

		private static final SubtypeQuery test_27_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int[][][]"));
		@Test public void test_27() { testInvalid(test_27_query); }

		private static final SubtypeQuery test_28_query = createSubtypeQuery(parseWhiley("int[][][]"),parseWhiley("int[][][]"));
		@Test public void test_28() { testValid(test_28_query); }

		private static final SubtypeQuery test_29_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int cindex,int[][] graph,bool[] inComponent,int index,int[] rindex,{int[] items,int length} stack,bool[] visited}"));
		@Test public void test_29() { testInvalid(test_29_query); }

		private static final SubtypeQuery test_30_query = createSubtypeQuery(parseWhiley("{int cindex,int[][] graph,bool[] inComponent,int index,int[] rindex,{int[] items,int length} stack,bool[] visited}"),parseWhiley("{int cindex,int[][] graph,bool[] inComponent,int index,int[] rindex,{int[] items,int length} stack,bool[] visited}"));
		@Test public void test_30() { testValid(test_30_query); }

		private static final SubtypeQuery test_31_query = createSubtypeQuery(parseWhiley("{int[] items,int length}"),parseWhiley("{int[] items,int length}"));
		@Test public void test_31() { testValid(test_31_query); }

		private static final SubtypeQuery test_32_query = createSubtypeQuery(parseWhiley("null|int[][]"),parseWhiley("null|int[][]"));
		@Test public void test_32() { testValid(test_32_query); }

		private static final SubtypeQuery test_33_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("byte[]"));
		@Test public void test_33() { testInvalid(test_33_query); }

		private static final SubtypeQuery test_34_query = createSubtypeQuery(parseWhiley("byte"),parseWhiley("byte"));
		@Test public void test_34() { testValid(test_34_query); }

		private static final SubtypeQuery test_35_query = createSubtypeQuery(parseWhiley("byte[]"),parseWhiley("byte"));
		@Test public void test_35() { testInvalid(test_35_query); }

		private static final SubtypeQuery test_36_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("byte"));
		@Test public void test_36() { testInvalid(test_36_query); }

		private static final SubtypeQuery test_37_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("null|int"));
		@Test public void test_37() { testInvalid(test_37_query); }

		private static final SubtypeQuery test_38_query = createSubtypeQuery(parseWhiley("null|int"),parseWhiley("int"));
		@Test public void test_38() { testValid(test_38_query); }

		private static final SubtypeQuery test_39_query = createSubtypeQuery(parseWhiley("null|int"),parseWhiley("null"));
		@Test public void test_39() { testValid(test_39_query); }

		private static final SubtypeQuery test_40_query = createSubtypeQuery(parseWhiley("null|int"),parseWhiley("null|int"));
		@Test public void test_40() { testValid(test_40_query); }

		private static final SubtypeQuery test_41_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("int[]"));
		@Test public void test_41() { testValid(test_41_query); }

		private static final SubtypeQuery test_42_query = createSubtypeQuery(parseWhiley("null|int[]"),parseWhiley("int[]"));
		@Test public void test_42() { testValid(test_42_query); }

		private static final SubtypeQuery test_43_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int button,bool orange}"));
		@Test public void test_43() { testInvalid(test_43_query); }

		private static final SubtypeQuery test_44_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int button,bool orange}[]"));
		@Test public void test_44() { testInvalid(test_44_query); }

		private static final SubtypeQuery test_45_query = createSubtypeQuery(parseWhiley("{int button,bool orange}[]"),parseWhiley("{int button,bool orange}[]"));
		@Test public void test_45() { testValid(test_45_query); }

		private static final SubtypeQuery test_46_query = createSubtypeQuery(parseWhiley("{int button,bool orange}"),parseWhiley("{int button,bool orange}"));
		@Test public void test_46() { testValid(test_46_query); }

		private static final SubtypeQuery test_47_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[] data,int rpos,int wpos}"));
		@Test public void test_47() { testInvalid(test_47_query); }

		private static final SubtypeQuery test_48_query = createSubtypeQuery(parseWhiley("{int[] data,int rpos,int wpos}"),parseWhiley("{int[] data,int rpos,int wpos}"));
		@Test public void test_48() { testValid(test_48_query); }

		private static final SubtypeQuery test_49_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{bool amber,bool green,bool red}"));
		@Test public void test_49() { testInvalid(test_49_query); }

		private static final SubtypeQuery test_50_query = createSubtypeQuery(parseWhiley("{bool amber,bool green,bool red}"),parseWhiley("{bool amber,bool green,bool red}"));
		@Test public void test_50() { testValid(test_50_query); }

		private static final SubtypeQuery test_51_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("null|int[]"));
		@Test public void test_51() { testInvalid(test_51_query); }

		private static final SubtypeQuery test_52_query = createSubtypeQuery(parseWhiley("null|int[]"),parseWhiley("null"));
		@Test public void test_52() { testValid(test_52_query); }

		private static final SubtypeQuery test_53_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int day,int month,int year}"));
		@Test public void test_53() { testInvalid(test_53_query); }

		private static final SubtypeQuery test_54_query = createSubtypeQuery(parseWhiley("{int day,int month,int year}"),parseWhiley("{int day,int month,int year}"));
		@Test public void test_54() { testValid(test_54_query); }

		private static final SubtypeQuery test_55_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[] data,int length}"));
		@Test public void test_55() { testInvalid(test_55_query); }

		private static final SubtypeQuery test_56_query = createSubtypeQuery(parseWhiley("{int[] data,int length}"),parseWhiley("{int[] data,int length}"));
		@Test public void test_56() { testValid(test_56_query); }

		private static final SubtypeQuery test_57_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int carsOnBr,int carsOnIl,int carsOnMl}"));
		@Test public void test_57() { testInvalid(test_57_query); }

		private static final SubtypeQuery test_58_query = createSubtypeQuery(parseWhiley("{int carsOnBr,int carsOnIl,int carsOnMl}"),parseWhiley("{int carsOnBr,int carsOnIl,int carsOnMl}"));
		@Test public void test_58() { testValid(test_58_query); }

		private static final SubtypeQuery test_59_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{bool doorOpen,bool heatOn,int timer}"));
		@Test public void test_59() { testInvalid(test_59_query); }

		private static final SubtypeQuery test_60_query = createSubtypeQuery(parseWhiley("{bool doorOpen,bool heatOn,int timer}"),parseWhiley("{bool doorOpen,bool heatOn,int timer}"));
		@Test public void test_60() { testValid(test_60_query); }

		private static final SubtypeQuery test_61_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("bool[]"));
		@Test public void test_61() { testInvalid(test_61_query); }

		private static final SubtypeQuery test_62_query = createSubtypeQuery(parseWhiley("bool[]"),parseWhiley("bool[]"));
		@Test public void test_62() { testValid(test_62_query); }

		private static final SubtypeQuery test_63_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("bool[]"));
		@Test public void test_63() { testInvalid(test_63_query); }

		private static final SubtypeQuery test_64_query = createSubtypeQuery(parseWhiley("int[]"),parseWhiley("bool[]"));
		@Test public void test_64() { testValid(test_64_query); }

		private static final SubtypeQuery test_65_query = createSubtypeQuery(parseWhiley("bool[]"),parseWhiley("bool"));
		@Test public void test_65() { testInvalid(test_65_query); }

		private static final SubtypeQuery test_66_query = createSubtypeQuery(parseWhiley("bool"),parseWhiley("bool[]"));
		@Test public void test_66() { testInvalid(test_66_query); }

		private static final SubtypeQuery test_67_query = createSubtypeQuery(parseWhiley("bool[]"),parseWhiley("int"));
		@Test public void test_67() { testInvalid(test_67_query); }

		private static final SubtypeQuery test_68_query = createSubtypeQuery(parseWhiley("bool"),parseWhiley("int"));
		@Test public void test_68() { testValid(test_68_query); }

		private static final SubtypeQuery test_69_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int character,int from,int to}"));
		@Test public void test_69() { testInvalid(test_69_query); }

		private static final SubtypeQuery test_70_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{{int character,int from,int to}[] transitions}"));
		@Test public void test_70() { testInvalid(test_70_query); }

		private static final SubtypeQuery test_71_query = createSubtypeQuery(parseWhiley("{{int character,int from,int to}[] transitions}"),parseWhiley("{{int character,int from,int to}[] transitions}"));
		@Test public void test_71() { testValid(test_71_query); }

		private static final SubtypeQuery test_72_query = createSubtypeQuery(parseWhiley("{int character,int from,int to}"),parseWhiley("{int character,int from,int to}"));
		@Test public void test_72() { testValid(test_72_query); }

		private static final SubtypeQuery test_73_query = createSubtypeQuery(parseWhiley("{{int character,int from,int to}[] transitions}"),parseWhiley("{int character,int from,int to}[]"));
		@Test public void test_73() { testInvalid(test_73_query); }

		private static final SubtypeQuery test_74_query = createSubtypeQuery(parseWhiley("{int character,int from,int to}[]"),parseWhiley("{int character,int from,int to}[]"));
		@Test public void test_74() { testValid(test_74_query); }

		private static final SubtypeQuery test_75_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int character,int from,int to}[]"));
		@Test public void test_75() { testInvalid(test_75_query); }

		private static final SubtypeQuery test_76_query = createSubtypeQuery(parseWhiley("{int character,int from,int to}[]"),parseWhiley("{{int character,int from,int to}[] transitions}"));
		@Test public void test_76() { testInvalid(test_76_query); }

		private static final SubtypeQuery test_77_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("bool"));
		@Test public void test_77() { testValid(test_77_query); }

		private static final SubtypeQuery test_78_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int denominator,int numerator}"));
		@Test public void test_78() { testInvalid(test_78_query); }

		private static final SubtypeQuery test_79_query = createSubtypeQuery(parseWhiley("{int denominator,int numerator}"),parseWhiley("{int denominator,int numerator}"));
		@Test public void test_79() { testValid(test_79_query); }

		private static final SubtypeQuery test_80_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{bool[][] cells,int height,int width}"));
		@Test public void test_80() { testInvalid(test_80_query); }

		private static final SubtypeQuery test_81_query = createSubtypeQuery(parseWhiley("bool[][]"),parseWhiley("bool[][]"));
		@Test public void test_81() { testValid(test_81_query); }

		private static final SubtypeQuery test_82_query = createSubtypeQuery(parseWhiley("{bool[][] cells,int height,int width}"),parseWhiley("{bool[][] cells,int height,int width}"));
		@Test public void test_82() { testValid(test_82_query); }

		private static final SubtypeQuery test_83_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int x,int y}"));
		@Test public void test_83() { testInvalid(test_83_query); }

		private static final SubtypeQuery test_84_query = createSubtypeQuery(parseWhiley("{int[] board,bool circlesTurn}"),parseWhiley("{int[] board,bool circlesTurn}"));
		@Test public void test_84() { testValid(test_84_query); }

		private static final SubtypeQuery test_85_query = createSubtypeQuery(parseWhiley("{int x,int y}"),parseWhiley("{int x,int y}"));
		@Test public void test_85() { testValid(test_85_query); }

		private static final SubtypeQuery test_86_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[] board,bool circlesTurn}"));
		@Test public void test_86() { testInvalid(test_86_query); }

	}
}
