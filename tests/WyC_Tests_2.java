import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import types.testing.AbstractTestSuite;
import types.core.SubtypeQuery;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WyC_Tests_2 extends AbstractTestSuite {
	public static class Part_0 {
		private static final SubtypeQuery test_0_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int[]"));
		@Test public void test_0() { testInvalid(test_0_query); }

		private static final SubtypeQuery test_1_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("int"));
		@Test public void test_1() { testValid(test_1_query); }

		private static final SubtypeQuery test_2_query = createSubtypeQuery(parseWhiley("bool"),parseWhiley("bool"));
		@Test public void test_2() { testValid(test_2_query); }

		private static final SubtypeQuery test_3_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int"));
		@Test public void test_3() { testInvalid(test_3_query); }

		private static final SubtypeQuery test_4_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("any"));
		@Test public void test_4() { testInvalid(test_4_query); }

		private static final SubtypeQuery test_5_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("int"));
		@Test public void test_5() { testValid(test_5_query); }

		private static final SubtypeQuery test_6_query = createSubtypeQuery(parseWhiley("int[]"),parseWhiley("int[]"));
		@Test public void test_6() { testValid(test_6_query); }

		private static final SubtypeQuery test_7_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("bool"));
		@Test public void test_7() { testInvalid(test_7_query); }

		private static final SubtypeQuery test_8_query = createSubtypeQuery(parseWhiley("bool"),parseWhiley("int"));
		@Test public void test_8() { testValid(test_8_query); }

		private static final SubtypeQuery test_9_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("bool"));
		@Test public void test_9() { testValid(test_9_query); }

		private static final SubtypeQuery test_10_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("null|int[]"));
		@Test public void test_10() { testInvalid(test_10_query); }

		private static final SubtypeQuery test_11_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("bool|int[]"));
		@Test public void test_11() { testInvalid(test_11_query); }

		private static final SubtypeQuery test_12_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("null|int[]|bool|int[]"));
		@Test public void test_12() { testInvalid(test_12_query); }

		private static final SubtypeQuery test_13_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("null|bool|int"));
		@Test public void test_13() { testInvalid(test_13_query); }

		private static final SubtypeQuery test_14_query = createSubtypeQuery(parseWhiley("null|bool|int"),parseWhiley("null|bool|int"));
		@Test public void test_14() { testValid(test_14_query); }

		private static final SubtypeQuery test_15_query = createSubtypeQuery(parseWhiley("null|int[]|bool|int[]"),parseWhiley("null|int[]|bool|int[]"));
		@Test public void test_15() { testValid(test_15_query); }

		private static final SubtypeQuery test_16_query = createSubtypeQuery(parseWhiley("null|int[]|bool|int[]"),parseWhiley("null|int[]"));
		@Test public void test_16() { testValid(test_16_query); }

		private static final SubtypeQuery test_17_query = createSubtypeQuery(parseWhiley("null|bool|int"),parseWhiley("int"));
		@Test public void test_17() { testValid(test_17_query); }

		private static final SubtypeQuery test_18_query = createSubtypeQuery(parseWhiley("null|bool|int"),parseWhiley("null"));
		@Test public void test_18() { testValid(test_18_query); }

		private static final SubtypeQuery test_19_query = createSubtypeQuery(parseWhiley("null|int[]|bool|int[]"),parseWhiley("int[]"));
		@Test public void test_19() { testValid(test_19_query); }

		private static final SubtypeQuery test_20_query = createSubtypeQuery(parseWhiley("bool[]"),parseWhiley("bool[]"));
		@Test public void test_20() { testValid(test_20_query); }

		private static final SubtypeQuery test_21_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("bool[]"));
		@Test public void test_21() { testInvalid(test_21_query); }

		private static final SubtypeQuery test_22_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("bool[][]"));
		@Test public void test_22() { testInvalid(test_22_query); }

		private static final SubtypeQuery test_23_query = createSubtypeQuery(parseWhiley("bool[][]"),parseWhiley("bool[][]"));
		@Test public void test_23() { testValid(test_23_query); }

		private static final SubtypeQuery test_24_query = createSubtypeQuery(parseWhiley("{int code,bool flag}"),parseWhiley("{int code,bool flag}"));
		@Test public void test_24() { testValid(test_24_query); }

		private static final SubtypeQuery test_25_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("byte"));
		@Test public void test_25() { testInvalid(test_25_query); }

		private static final SubtypeQuery test_26_query = createSubtypeQuery(parseWhiley("byte"),parseWhiley("byte"));
		@Test public void test_26() { testValid(test_26_query); }

		private static final SubtypeQuery test_27_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("bool|int"));
		@Test public void test_27() { testInvalid(test_27_query); }

		private static final SubtypeQuery test_28_query = createSubtypeQuery(parseWhiley("bool|int"),parseWhiley("bool"));
		@Test public void test_28() { testValid(test_28_query); }

		private static final SubtypeQuery test_29_query = createSubtypeQuery(parseWhiley("bool|int"),parseWhiley("int"));
		@Test public void test_29() { testValid(test_29_query); }

		private static final SubtypeQuery test_30_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int data}"));
		@Test public void test_30() { testInvalid(test_30_query); }

		private static final SubtypeQuery test_31_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int code,int data}"));
		@Test public void test_31() { testInvalid(test_31_query); }

		private static final SubtypeQuery test_32_query = createSubtypeQuery(parseWhiley("{int data}"),parseWhiley("{int data}"));
		@Test public void test_32() { testValid(test_32_query); }

		private static final SubtypeQuery test_33_query = createSubtypeQuery(parseWhiley("{int code,int data}"),parseWhiley("{int code,int data}"));
		@Test public void test_33() { testValid(test_33_query); }

		private static final SubtypeQuery test_34_query = createSubtypeQuery(parseWhiley("{int data}"),parseWhiley("{int code,int data}"));
		@Test public void test_34() { testInvalid(test_34_query); }

		private static final SubtypeQuery test_35_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{bool colour,int kind}"));
		@Test public void test_35() { testInvalid(test_35_query); }

		private static final SubtypeQuery test_36_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int col,int row}"));
		@Test public void test_36() { testInvalid(test_36_query); }

		private static final SubtypeQuery test_37_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("null|{bool colour,int kind}"));
		@Test public void test_37() { testInvalid(test_37_query); }

		private static final SubtypeQuery test_38_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("null|{bool colour,int kind}[]"));
		@Test public void test_38() { testInvalid(test_38_query); }

		private static final SubtypeQuery test_39_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{bool blackCastleKingSide,bool blackCastleQueenSide,null|{bool colour,int kind}[][] rows,bool whiteCastleKingSide,bool whiteCastleQueenSide}"));
		@Test public void test_39() { testInvalid(test_39_query); }

		private static final SubtypeQuery test_40_query = createSubtypeQuery(parseWhiley("{int col,int row}"),parseWhiley("{int col,int row}"));
		@Test public void test_40() { testValid(test_40_query); }

		private static final SubtypeQuery test_41_query = createSubtypeQuery(parseWhiley("{bool blackCastleKingSide,bool blackCastleQueenSide,null|{bool colour,int kind}[][] rows,bool whiteCastleKingSide,bool whiteCastleQueenSide}"),parseWhiley("{bool blackCastleKingSide,bool blackCastleQueenSide,null[]|{bool colour,int kind}[][] rows,bool whiteCastleKingSide,bool whiteCastleQueenSide}"));
		@Test public void test_41() { testInvalid(test_41_query); }

		private static final SubtypeQuery test_42_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{{int col,int row} from,{bool colour,int kind} piece,{int col,int row} to}"));
		@Test public void test_42() { testInvalid(test_42_query); }

		private static final SubtypeQuery test_43_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{{int col,int row} from,{bool colour,int kind} piece,{bool colour,int kind} taken,{int col,int row} to}"));
		@Test public void test_43() { testInvalid(test_43_query); }

		private static final SubtypeQuery test_44_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{{int col,int row} from,{bool colour,int kind} piece,{int col,int row} to}|{{int col,int row} from,{bool colour,int kind} piece,{bool colour,int kind} taken,{int col,int row} to}"));
		@Test public void test_44() { testInvalid(test_44_query); }

		private static final SubtypeQuery test_45_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{bool isWhite,bool kingSide}"));
		@Test public void test_45() { testInvalid(test_45_query); }

		private static final SubtypeQuery test_46_query = createSubtypeQuery(parseWhiley("{bool colour,int kind}"),parseWhiley("{bool colour,int kind}"));
		@Test public void test_46() { testValid(test_46_query); }

		private static final SubtypeQuery test_47_query = createSubtypeQuery(parseWhiley("int[]"),parseWhiley("void"));
		@Test public void test_47() { testValid(test_47_query); }

		private static final SubtypeQuery test_48_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int move,int[] pieces}"));
		@Test public void test_48() { testInvalid(test_48_query); }

		private static final SubtypeQuery test_49_query = createSubtypeQuery(parseWhiley("{int move,int[] pieces}"),parseWhiley("{int move,int[] pieces}"));
		@Test public void test_49() { testValid(test_49_query); }

		private static final SubtypeQuery test_50_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int character,int from,int to}"));
		@Test public void test_50() { testInvalid(test_50_query); }

		private static final SubtypeQuery test_51_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{{int character,int from,int to}[] transitions}"));
		@Test public void test_51() { testInvalid(test_51_query); }

		private static final SubtypeQuery test_52_query = createSubtypeQuery(parseWhiley("{int character,int from,int to}[]"),parseWhiley("{int character,int from,int to}[]"));
		@Test public void test_52() { testValid(test_52_query); }

		private static final SubtypeQuery test_53_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int character,int from,int to}[]"));
		@Test public void test_53() { testInvalid(test_53_query); }

		private static final SubtypeQuery test_54_query = createSubtypeQuery(parseWhiley("{int character,int from,int to}"),parseWhiley("{int character,int from,int to}"));
		@Test public void test_54() { testValid(test_54_query); }

		private static final SubtypeQuery test_55_query = createSubtypeQuery(parseWhiley("{{int character,int from,int to}[] transitions}"),parseWhiley("{{int character,int from,int to}[] transitions}"));
		@Test public void test_55() { testValid(test_55_query); }

		private static final SubtypeQuery test_56_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int op,int[] payload}"));
		@Test public void test_56() { testInvalid(test_56_query); }

		private static final SubtypeQuery test_57_query = createSubtypeQuery(parseWhiley("{int op,int[] payload}"),parseWhiley("{int op,int[] payload}"));
		@Test public void test_57() { testValid(test_57_query); }

		private static final SubtypeQuery test_58_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[] input,int pos}"));
		@Test public void test_58() { testInvalid(test_58_query); }

		private static final SubtypeQuery test_59_query = createSubtypeQuery(parseWhiley("{int[] input,int pos}"),parseWhiley("{int[] input,int pos}"));
		@Test public void test_59() { testValid(test_59_query); }

		private static final SubtypeQuery test_60_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int[][]"));
		@Test public void test_60() { testInvalid(test_60_query); }

		private static final SubtypeQuery test_61_query = createSubtypeQuery(parseWhiley("int[][]"),parseWhiley("int[][]"));
		@Test public void test_61() { testValid(test_61_query); }

		private static final SubtypeQuery test_62_query = createSubtypeQuery(parseWhiley("int[]"),parseWhiley("int"));
		@Test public void test_62() { testInvalid(test_62_query); }

		private static final SubtypeQuery test_63_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("int[]"));
		@Test public void test_63() { testInvalid(test_63_query); }

		private static final SubtypeQuery test_64_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int op}"));
		@Test public void test_64() { testInvalid(test_64_query); }

		private static final SubtypeQuery test_65_query = createSubtypeQuery(parseWhiley("{int op}"),parseWhiley("{int op}"));
		@Test public void test_65() { testValid(test_65_query); }

		private static final SubtypeQuery test_66_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int f}"));
		@Test public void test_66() { testInvalid(test_66_query); }

		private static final SubtypeQuery test_67_query = createSubtypeQuery(parseWhiley("{int f}"),parseWhiley("{int f}"));
		@Test public void test_67() { testValid(test_67_query); }

		private static final SubtypeQuery test_68_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int index,int op}"));
		@Test public void test_68() { testInvalid(test_68_query); }

		private static final SubtypeQuery test_69_query = createSubtypeQuery(parseWhiley("{int index,int op}"),parseWhiley("{int index,int op}"));
		@Test public void test_69() { testValid(test_69_query); }

		private static final SubtypeQuery test_70_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int x,int y}"));
		@Test public void test_70() { testInvalid(test_70_query); }

		private static final SubtypeQuery test_71_query = createSubtypeQuery(parseWhiley("{int x,int y}"),parseWhiley("{int x,int y}"));
		@Test public void test_71() { testValid(test_71_query); }

		private static final SubtypeQuery test_72_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[][] data,int height,int width}"));
		@Test public void test_72() { testInvalid(test_72_query); }

		private static final SubtypeQuery test_73_query = createSubtypeQuery(parseWhiley("{int[][] data,int height,int width}"),parseWhiley("{int[][] data,int height,int width}"));
		@Test public void test_73() { testValid(test_73_query); }

		private static final SubtypeQuery test_74_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("any"));
		@Test public void test_74() { testValid(test_74_query); }

		private static final SubtypeQuery test_75_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("null"));
		@Test public void test_75() { testValid(test_75_query); }

		private static final SubtypeQuery test_76_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{bool x,bool y}"));
		@Test public void test_76() { testInvalid(test_76_query); }

		private static final SubtypeQuery test_77_query = createSubtypeQuery(parseWhiley("{bool x,bool y}"),parseWhiley("{bool x,bool y}"));
		@Test public void test_77() { testValid(test_77_query); }

		private static final SubtypeQuery test_78_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("null|bool"));
		@Test public void test_78() { testInvalid(test_78_query); }

		private static final SubtypeQuery test_79_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("null|bool[]"));
		@Test public void test_79() { testInvalid(test_79_query); }

		private static final SubtypeQuery test_80_query = createSubtypeQuery(parseWhiley("null|bool[]"),parseWhiley("bool[]"));
		@Test public void test_80() { testValid(test_80_query); }

		private static final SubtypeQuery test_81_query = createSubtypeQuery(parseWhiley("null|bool"),parseWhiley("bool"));
		@Test public void test_81() { testValid(test_81_query); }

		private static final SubtypeQuery test_82_query = createSubtypeQuery(parseWhiley("null|bool"),parseWhiley("null"));
		@Test public void test_82() { testValid(test_82_query); }

		private static final SubtypeQuery test_83_query = createSubtypeQuery(parseWhiley("null|bool[]"),parseWhiley("null|bool[]"));
		@Test public void test_83() { testValid(test_83_query); }

		private static final SubtypeQuery test_84_query = createSubtypeQuery(parseWhiley("null|bool[]"),parseWhiley("null[]"));
		@Test public void test_84() { testValid(test_84_query); }

		private static final SubtypeQuery test_85_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("null|int"));
		@Test public void test_85() { testInvalid(test_85_query); }

		private static final SubtypeQuery test_86_query = createSubtypeQuery(parseWhiley("null|int"),parseWhiley("int"));
		@Test public void test_86() { testValid(test_86_query); }

		private static final SubtypeQuery test_87_query = createSubtypeQuery(parseWhiley("null|int"),parseWhiley("null"));
		@Test public void test_87() { testValid(test_87_query); }

		private static final SubtypeQuery test_88_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("null"));
		@Test public void test_88() { testInvalid(test_88_query); }

		private static final SubtypeQuery test_89_query = createSubtypeQuery(parseWhiley("null"),parseWhiley("null"));
		@Test public void test_89() { testValid(test_89_query); }

		private static final SubtypeQuery test_90_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int value}"));
		@Test public void test_90() { testInvalid(test_90_query); }

		private static final SubtypeQuery test_91_query = createSubtypeQuery(parseWhiley("{int value}"),parseWhiley("{int value}"));
		@Test public void test_91() { testValid(test_91_query); }

		private static final SubtypeQuery test_92_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int op,int s}"));
		@Test public void test_92() { testInvalid(test_92_query); }

		private static final SubtypeQuery test_93_query = createSubtypeQuery(parseWhiley("{int op,int s}"),parseWhiley("int[]"));
		@Test public void test_93() { testInvalid(test_93_query); }

		private static final SubtypeQuery test_94_query = createSubtypeQuery(parseWhiley("bool[]"),parseWhiley("int[]"));
		@Test public void test_94() { testValid(test_94_query); }

		private static final SubtypeQuery test_95_query = createSubtypeQuery(parseWhiley("int[]"),parseWhiley("bool[]"));
		@Test public void test_95() { testValid(test_95_query); }

		private static final SubtypeQuery test_96_query = createSubtypeQuery(parseWhiley("{int op,int s}"),parseWhiley("bool[]"));
		@Test public void test_96() { testInvalid(test_96_query); }

		private static final SubtypeQuery test_97_query = createSubtypeQuery(parseWhiley("int[]"),parseWhiley("bool"));
		@Test public void test_97() { testInvalid(test_97_query); }

		private static final SubtypeQuery test_98_query = createSubtypeQuery(parseWhiley("bool"),parseWhiley("int[]"));
		@Test public void test_98() { testInvalid(test_98_query); }

		private static final SubtypeQuery test_99_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int flag}"));
		@Test public void test_99() { testInvalid(test_99_query); }

		private static final SubtypeQuery test_100_query = createSubtypeQuery(parseWhiley("{int flag}"),parseWhiley("{int flag}"));
		@Test public void test_100() { testValid(test_100_query); }

		private static final SubtypeQuery test_101_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int nx,int ny}"));
		@Test public void test_101() { testInvalid(test_101_query); }

		private static final SubtypeQuery test_102_query = createSubtypeQuery(parseWhiley("{int nx,int ny}"),parseWhiley("{int nx,int ny}"));
		@Test public void test_102() { testValid(test_102_query); }

		private static final SubtypeQuery test_103_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int data,null next}"));
		@Test public void test_103() { testInvalid(test_103_query); }

		private static final SubtypeQuery test_104_query = createSubtypeQuery(parseWhiley("{int data,null next}"),parseWhiley("{int data,null next}"));
		@Test public void test_104() { testValid(test_104_query); }

		private static final SubtypeQuery test_105_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("byte[]"));
		@Test public void test_105() { testInvalid(test_105_query); }

		private static final SubtypeQuery test_106_query = createSubtypeQuery(parseWhiley("byte[]"),parseWhiley("byte[]"));
		@Test public void test_106() { testValid(test_106_query); }

		private static final SubtypeQuery test_107_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("bool[]|int[]"));
		@Test public void test_107() { testInvalid(test_107_query); }

		private static final SubtypeQuery test_108_query = createSubtypeQuery(parseWhiley("bool[]|int[]"),parseWhiley("int[]"));
		@Test public void test_108() { testValid(test_108_query); }

		private static final SubtypeQuery test_109_query = createSubtypeQuery(parseWhiley("bool[]|int[]"),parseWhiley("bool[]"));
		@Test public void test_109() { testValid(test_109_query); }

		private static final SubtypeQuery test_110_query = createSubtypeQuery(parseWhiley("bool"),parseWhiley("bool|int"));
		@Test public void test_110() { testValid(test_110_query); }

		private static final SubtypeQuery test_111_query = createSubtypeQuery(parseWhiley("null|int[]"),parseWhiley("null"));
		@Test public void test_111() { testValid(test_111_query); }

		private static final SubtypeQuery test_112_query = createSubtypeQuery(parseWhiley("null|int[]"),parseWhiley("int[]"));
		@Test public void test_112() { testValid(test_112_query); }

		private static final SubtypeQuery test_113_query = createSubtypeQuery(parseWhiley("null|int[]"),parseWhiley("null|int[]"));
		@Test public void test_113() { testValid(test_113_query); }

		private static final SubtypeQuery test_114_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{bool[] items}"));
		@Test public void test_114() { testInvalid(test_114_query); }

		private static final SubtypeQuery test_115_query = createSubtypeQuery(parseWhiley("{bool[] items}"),parseWhiley("{bool[] items}"));
		@Test public void test_115() { testValid(test_115_query); }

		private static final SubtypeQuery test_116_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int|int[]"));
		@Test public void test_116() { testInvalid(test_116_query); }

		private static final SubtypeQuery test_117_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int|int[][]"));
		@Test public void test_117() { testInvalid(test_117_query); }

		private static final SubtypeQuery test_118_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("int|int[][]"));
		@Test public void test_118() { testValid(test_118_query); }

		private static final SubtypeQuery test_119_query = createSubtypeQuery(parseWhiley("int|int[][]"),parseWhiley("int[]"));
		@Test public void test_119() { testInvalid(test_119_query); }

		private static final SubtypeQuery test_120_query = createSubtypeQuery(parseWhiley("int|int[][]"),parseWhiley("int[][]"));
		@Test public void test_120() { testValid(test_120_query); }

		private static final SubtypeQuery test_121_query = createSubtypeQuery(parseWhiley("int|int[]"),parseWhiley("int"));
		@Test public void test_121() { testValid(test_121_query); }

		private static final SubtypeQuery test_122_query = createSubtypeQuery(parseWhiley("int|int[][]"),parseWhiley("int|int[][]"));
		@Test public void test_122() { testValid(test_122_query); }

		private static final SubtypeQuery test_123_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("int[]"));
		@Test public void test_123() { testValid(test_123_query); }

		private static final SubtypeQuery test_124_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[][] f1,int[][] f2}"));
		@Test public void test_124() { testInvalid(test_124_query); }

		private static final SubtypeQuery test_125_query = createSubtypeQuery(parseWhiley("{int[][] f1,int[][] f2}"),parseWhiley("{int[][] f1,int[][] f2}"));
		@Test public void test_125() { testValid(test_125_query); }

		private static final SubtypeQuery test_126_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{bool flag,{bool colour,int kind}[] rows}"));
		@Test public void test_126() { testInvalid(test_126_query); }

		private static final SubtypeQuery test_127_query = createSubtypeQuery(parseWhiley("{bool flag,{bool colour,int kind}[] rows}"),parseWhiley("{bool flag,{bool colour,int kind}[] rows}"));
		@Test public void test_127() { testValid(test_127_query); }

		private static final SubtypeQuery test_128_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("null|int[][]"));
		@Test public void test_128() { testInvalid(test_128_query); }

		private static final SubtypeQuery test_129_query = createSubtypeQuery(parseWhiley("null|int"),parseWhiley("null|int"));
		@Test public void test_129() { testValid(test_129_query); }

		private static final SubtypeQuery test_130_query = createSubtypeQuery(parseWhiley("null|int[][]"),parseWhiley("null|int[][]"));
		@Test public void test_130() { testValid(test_130_query); }

		private static final SubtypeQuery test_131_query = createSubtypeQuery(parseWhiley("null|int[][]"),parseWhiley("int[][]"));
		@Test public void test_131() { testValid(test_131_query); }

		private static final SubtypeQuery test_132_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[] f1,int[] f2}"));
		@Test public void test_132() { testInvalid(test_132_query); }

		private static final SubtypeQuery test_133_query = createSubtypeQuery(parseWhiley("{int[] f1,int[] f2}"),parseWhiley("{int[] f1,int[] f2}"));
		@Test public void test_133() { testValid(test_133_query); }

		private static final SubtypeQuery test_134_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{bool b1,bool b2}[]"));
		@Test public void test_134() { testInvalid(test_134_query); }

		private static final SubtypeQuery test_135_query = createSubtypeQuery(parseWhiley("{bool b1,bool b2}[]"),parseWhiley("{bool b1,bool b2}[]"));
		@Test public void test_135() { testValid(test_135_query); }

		private static final SubtypeQuery test_136_query = createSubtypeQuery(parseWhiley("{bool b1,bool b2}"),parseWhiley("{bool b1,bool b2}"));
		@Test public void test_136() { testValid(test_136_query); }

		private static final SubtypeQuery test_137_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("!null"));
		@Test public void test_137() { testInvalid(test_137_query); }

		private static final SubtypeQuery test_138_query = createSubtypeQuery(parseWhiley("!null"),parseWhiley("int"));
		@Test public void test_138() { testInvalid(test_138_query); }

		private static final SubtypeQuery test_139_query = createSubtypeQuery(parseWhiley("!null"),parseWhiley("!null"));
		@Test public void test_139() { testValid(test_139_query); }

		private static final SubtypeQuery test_140_query = createSubtypeQuery(parseWhiley("!null"),parseWhiley("int[]"));
		@Test public void test_140() { testValid(test_140_query); }

		private static final SubtypeQuery test_141_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("!(null|int)"));
		@Test public void test_141() { testInvalid(test_141_query); }

		private static final SubtypeQuery test_142_query = createSubtypeQuery(parseWhiley("!(null|int)"),parseWhiley("int[]"));
		@Test public void test_142() { testValid(test_142_query); }

		private static final SubtypeQuery test_143_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{byte[] data,int maxLocals,int maxStack,int[] name}"));
		@Test public void test_143() { testInvalid(test_143_query); }

		private static final SubtypeQuery test_144_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[][] classes,int[] pkg}"));
		@Test public void test_144() { testInvalid(test_144_query); }

		private static final SubtypeQuery test_145_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int|{int[][] classes,int[] pkg}"));
		@Test public void test_145() { testInvalid(test_145_query); }

		private static final SubtypeQuery test_146_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int offset,int op}"));
		@Test public void test_146() { testInvalid(test_146_query); }

		private static final SubtypeQuery test_147_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[] name,int offset,int op,{int[][] classes,int[] pkg} owner,{int[][] classes,int[] pkg}|int type}"));
		@Test public void test_147() { testInvalid(test_147_query); }

		private static final SubtypeQuery test_148_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int offset,int op}|{int[] name,int offset,int op,{int[][] classes,int[] pkg} owner,{int[][] classes,int[] pkg}|int type}"));
		@Test public void test_148() { testInvalid(test_148_query); }

		private static final SubtypeQuery test_149_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{{int[] name,int offset,int op,{int[][] classes,int[] pkg} owner,{int[][] classes,int[] pkg}|int type}|{int offset,int op}[] data,int[] name}"));
		@Test public void test_149() { testInvalid(test_149_query); }

		private static final SubtypeQuery test_150_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int x,int y,int z}"));
		@Test public void test_150() { testInvalid(test_150_query); }

		private static final SubtypeQuery test_151_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int mode,int rest}"));
		@Test public void test_151() { testInvalid(test_151_query); }

		private static final SubtypeQuery test_152_query = createSubtypeQuery(parseWhiley("{int mode,int rest}"),parseWhiley("{int mode,int rest}"));
		@Test public void test_152() { testValid(test_152_query); }

		private static final SubtypeQuery test_153_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[] items,int length}"));
		@Test public void test_153() { testInvalid(test_153_query); }

		private static final SubtypeQuery test_154_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("bool"));
		@Test public void test_154() { testValid(test_154_query); }

		private static final SubtypeQuery test_155_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{any data}"));
		@Test public void test_155() { testInvalid(test_155_query); }

		private static final SubtypeQuery test_156_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int f1,int f2}"));
		@Test public void test_156() { testInvalid(test_156_query); }

		private static final SubtypeQuery test_157_query = createSubtypeQuery(parseWhiley("{int f1,int f2}"),parseWhiley("{int f1,int f2}"));
		@Test public void test_157() { testValid(test_157_query); }

		private static final SubtypeQuery test_158_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int b1,int b2}"));
		@Test public void test_158() { testInvalid(test_158_query); }

		private static final SubtypeQuery test_159_query = createSubtypeQuery(parseWhiley("{int b1,int b2}"),parseWhiley("{int b1,int b2}"));
		@Test public void test_159() { testValid(test_159_query); }

		private static final SubtypeQuery test_160_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{null|int f}"));
		@Test public void test_160() { testInvalid(test_160_query); }

		private static final SubtypeQuery test_161_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{bool|int f}"));
		@Test public void test_161() { testInvalid(test_161_query); }

		private static final SubtypeQuery test_162_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{null|int f}|{bool|int f}"));
		@Test public void test_162() { testInvalid(test_162_query); }

		private static final SubtypeQuery test_163_query = createSubtypeQuery(parseWhiley("{null|int f}|{bool|int f}"),parseWhiley("{null|int f}|{bool|int f}"));
		@Test public void test_163() { testValid(test_163_query); }

		private static final SubtypeQuery test_164_query = createSubtypeQuery(parseWhiley("{null|int f}|{bool|int f}"),parseWhiley("{null f}"));
		@Test public void test_164() { testValid(test_164_query); }

		private static final SubtypeQuery test_165_query = createSubtypeQuery(parseWhiley("{null|int f}|{bool|int f}"),parseWhiley("{int f}"));
		@Test public void test_165() { testValid(test_165_query); }

		private static final SubtypeQuery test_166_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[] data,int wp}"));
		@Test public void test_166() { testInvalid(test_166_query); }

		private static final SubtypeQuery test_167_query = createSubtypeQuery(parseWhiley("{int[] data,int wp}"),parseWhiley("{int[] data,int wp}"));
		@Test public void test_167() { testValid(test_167_query); }

		private static final SubtypeQuery test_168_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int x}"));
		@Test public void test_168() { testInvalid(test_168_query); }

		private static final SubtypeQuery test_169_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{{int x} current}"));
		@Test public void test_169() { testInvalid(test_169_query); }

		private static final SubtypeQuery test_170_query = createSubtypeQuery(parseWhiley("{{int x} current}"),parseWhiley("{{int x} current}"));
		@Test public void test_170() { testValid(test_170_query); }

		private static final SubtypeQuery test_171_query = createSubtypeQuery(parseWhiley("{int x}"),parseWhiley("{int x}"));
		@Test public void test_171() { testValid(test_171_query); }

		private static final SubtypeQuery test_172_query = createSubtypeQuery(parseWhiley("{int x}"),parseWhiley("{int x,int y}"));
		@Test public void test_172() { testInvalid(test_172_query); }

		private static final SubtypeQuery test_173_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int x,int y}[]"));
		@Test public void test_173() { testInvalid(test_173_query); }

		private static final SubtypeQuery test_174_query = createSubtypeQuery(parseWhiley("{int x,int y}[]"),parseWhiley("{int x,int y}[]"));
		@Test public void test_174() { testValid(test_174_query); }

		private static final SubtypeQuery test_175_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{bool r}"));
		@Test public void test_175() { testInvalid(test_175_query); }

		private static final SubtypeQuery test_176_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{any r}"));
		@Test public void test_176() { testInvalid(test_176_query); }

		private static final SubtypeQuery test_177_query = createSubtypeQuery(parseWhiley("{any r}"),parseWhiley("{bool r}"));
		@Test public void test_177() { testValid(test_177_query); }

		private static final SubtypeQuery test_178_query = createSubtypeQuery(parseWhiley("{bool r}"),parseWhiley("{bool r}"));
		@Test public void test_178() { testValid(test_178_query); }

		private static final SubtypeQuery test_179_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[] id}"));
		@Test public void test_179() { testInvalid(test_179_query); }

		private static final SubtypeQuery test_180_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[] err}"));
		@Test public void test_180() { testInvalid(test_180_query); }

		private static final SubtypeQuery test_181_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int off,int offset,int op}"));
		@Test public void test_181() { testInvalid(test_181_query); }

		private static final SubtypeQuery test_182_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int index,int offset,int op}"));
		@Test public void test_182() { testInvalid(test_182_query); }

		private static final SubtypeQuery test_183_query = createSubtypeQuery(parseWhiley("{int offset,int op}"),parseWhiley("{int offset,int op}"));
		@Test public void test_183() { testValid(test_183_query); }

		private static final SubtypeQuery test_184_query = createSubtypeQuery(parseWhiley("{int index,int offset,int op}"),parseWhiley("{int index,int offset,int op}"));
		@Test public void test_184() { testValid(test_184_query); }

		private static final SubtypeQuery test_185_query = createSubtypeQuery(parseWhiley("{int[][] classes,int[] pkg}"),parseWhiley("{int[][] classes,int[] pkg}"));
		@Test public void test_185() { testValid(test_185_query); }

		private static final SubtypeQuery test_186_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int f,int g}"));
		@Test public void test_186() { testInvalid(test_186_query); }

		private static final SubtypeQuery test_187_query = createSubtypeQuery(parseWhiley("{int f,int g}"),parseWhiley("{int f,int g}"));
		@Test public void test_187() { testValid(test_187_query); }

		private static final SubtypeQuery test_188_query = createSubtypeQuery(parseWhiley("{int f,int g}[]"),parseWhiley("{int f,int g}[]"));
		@Test public void test_188() { testValid(test_188_query); }

		private static final SubtypeQuery test_189_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int f,int g}[]"));
		@Test public void test_189() { testInvalid(test_189_query); }

		private static final SubtypeQuery test_190_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int|{int x,int y}"));
		@Test public void test_190() { testInvalid(test_190_query); }

		private static final SubtypeQuery test_191_query = createSubtypeQuery(parseWhiley("int|{int x,int y}"),parseWhiley("int"));
		@Test public void test_191() { testValid(test_191_query); }

		private static final SubtypeQuery test_192_query = createSubtypeQuery(parseWhiley("int|{int x,int y}"),parseWhiley("int|{int x,int y}"));
		@Test public void test_192() { testValid(test_192_query); }

		private static final SubtypeQuery test_193_query = createSubtypeQuery(parseWhiley("int|{int x,int y}"),parseWhiley("{int x,int y}"));
		@Test public void test_193() { testValid(test_193_query); }

		private static final SubtypeQuery test_194_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int x,int y}|{int x,int z}"));
		@Test public void test_194() { testInvalid(test_194_query); }

		private static final SubtypeQuery test_195_query = createSubtypeQuery(parseWhiley("{int x,int y}|{int x,int z}"),parseWhiley("{int x,int y}"));
		@Test public void test_195() { testValid(test_195_query); }

		private static final SubtypeQuery test_196_query = createSubtypeQuery(parseWhiley("{int x,int y}|{int x,int z}"),parseWhiley("{int x,int z}"));
		@Test public void test_196() { testValid(test_196_query); }

		private static final SubtypeQuery test_197_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{bool x,bool y}|{int x,int z}"));
		@Test public void test_197() { testInvalid(test_197_query); }

		private static final SubtypeQuery test_198_query = createSubtypeQuery(parseWhiley("{bool x,bool y}|{int x,int z}"),parseWhiley("{bool x,bool y}"));
		@Test public void test_198() { testValid(test_198_query); }

		private static final SubtypeQuery test_199_query = createSubtypeQuery(parseWhiley("{bool x,bool y}|{int x,int z}"),parseWhiley("{int x,int z}"));
		@Test public void test_199() { testValid(test_199_query); }

		private static final SubtypeQuery test_200_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int x}|{int y}"));
		@Test public void test_200() { testInvalid(test_200_query); }

		private static final SubtypeQuery test_201_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int|{int x}|{int y}"));
		@Test public void test_201() { testInvalid(test_201_query); }

		private static final SubtypeQuery test_202_query = createSubtypeQuery(parseWhiley("int|{int x}|{int y}"),parseWhiley("{int x}"));
		@Test public void test_202() { testValid(test_202_query); }

		private static final SubtypeQuery test_203_query = createSubtypeQuery(parseWhiley("int|{int x}|{int y}"),parseWhiley("{int y}"));
		@Test public void test_203() { testValid(test_203_query); }

		private static final SubtypeQuery test_204_query = createSubtypeQuery(parseWhiley("int|{int x}|{int y}"),parseWhiley("int"));
		@Test public void test_204() { testValid(test_204_query); }

		private static final SubtypeQuery test_205_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int|int[]|int[][]"));
		@Test public void test_205() { testInvalid(test_205_query); }

		private static final SubtypeQuery test_206_query = createSubtypeQuery(parseWhiley("int|int[]|int[][]"),parseWhiley("int[]"));
		@Test public void test_206() { testValid(test_206_query); }

		private static final SubtypeQuery test_207_query = createSubtypeQuery(parseWhiley("int|int[]|int[][]"),parseWhiley("int[][]"));
		@Test public void test_207() { testInvalid(test_207_query); }

		private static final SubtypeQuery test_208_query = createSubtypeQuery(parseWhiley("int|int[]|int[][]"),parseWhiley("int"));
		@Test public void test_208() { testValid(test_208_query); }

		private static final SubtypeQuery test_209_query = createSubtypeQuery(parseWhiley("bool|int[]"),parseWhiley("bool"));
		@Test public void test_209() { testValid(test_209_query); }

		private static final SubtypeQuery test_210_query = createSubtypeQuery(parseWhiley("bool|int[]"),parseWhiley("int[]"));
		@Test public void test_210() { testValid(test_210_query); }

		private static final SubtypeQuery test_211_query = createSubtypeQuery(parseWhiley("bool|int[]"),parseWhiley("bool|int[]"));
		@Test public void test_211() { testValid(test_211_query); }

		private static final SubtypeQuery test_212_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("bool|int[][]"));
		@Test public void test_212() { testInvalid(test_212_query); }

		private static final SubtypeQuery test_213_query = createSubtypeQuery(parseWhiley("bool|int[][]"),parseWhiley("int[][]"));
		@Test public void test_213() { testValid(test_213_query); }

		private static final SubtypeQuery test_214_query = createSubtypeQuery(parseWhiley("bool|int[][]"),parseWhiley("bool|int[][]"));
		@Test public void test_214() { testValid(test_214_query); }

		private static final SubtypeQuery test_215_query = createSubtypeQuery(parseWhiley("int|int[]"),parseWhiley("int[]"));
		@Test public void test_215() { testValid(test_215_query); }

		private static final SubtypeQuery test_216_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int x,int y}|{int x,int y,int z}"));
		@Test public void test_216() { testInvalid(test_216_query); }

		private static final SubtypeQuery test_217_query = createSubtypeQuery(parseWhiley("{int x,int y,int z}"),parseWhiley("{int x,int y,int z}"));
		@Test public void test_217() { testValid(test_217_query); }

		private static final SubtypeQuery test_218_query = createSubtypeQuery(parseWhiley("{int x,int y}|{int x,int y,int z}"),parseWhiley("{int x,int y,int z}"));
		@Test public void test_218() { testValid(test_218_query); }

		private static final SubtypeQuery test_219_query = createSubtypeQuery(parseWhiley("{int x,int y}|{int x,int y,int z}"),parseWhiley("{int x,int y}"));
		@Test public void test_219() { testValid(test_219_query); }

		private static final SubtypeQuery test_220_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int row}"));
		@Test public void test_220() { testInvalid(test_220_query); }

		private static final SubtypeQuery test_221_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int col}"));
		@Test public void test_221() { testInvalid(test_221_query); }

		private static final SubtypeQuery test_222_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("null|{int col}|{int row}|{int col,int row}"));
		@Test public void test_222() { testInvalid(test_222_query); }

		private static final SubtypeQuery test_223_query = createSubtypeQuery(parseWhiley("null|{int col}|{int row}|{int col,int row}"),parseWhiley("null"));
		@Test public void test_223() { testValid(test_223_query); }

		private static final SubtypeQuery test_224_query = createSubtypeQuery(parseWhiley("null|{int col}|{int row}|{int col,int row}"),parseWhiley("{int row}"));
		@Test public void test_224() { testValid(test_224_query); }

		private static final SubtypeQuery test_225_query = createSubtypeQuery(parseWhiley("null|{int col}|{int row}|{int col,int row}"),parseWhiley("{int col}"));
		@Test public void test_225() { testValid(test_225_query); }

		private static final SubtypeQuery test_226_query = createSubtypeQuery(parseWhiley("null|{int col}|{int row}|{int col,int row}"),parseWhiley("{int col,int row}"));
		@Test public void test_226() { testInvalid(test_226_query); }

		private static final SubtypeQuery test_227_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{any f1,int f2}"));
		@Test public void test_227() { testInvalid(test_227_query); }

		private static final SubtypeQuery test_228_query = createSubtypeQuery(parseWhiley("{any f1,int f2}"),parseWhiley("{int[] f1,int f2}"));
		@Test public void test_228() { testValid(test_228_query); }

		private static final SubtypeQuery test_229_query = createSubtypeQuery(parseWhiley("{any f1,int f2}"),parseWhiley("{any f1,int f2}"));
		@Test public void test_229() { testValid(test_229_query); }

		private static final SubtypeQuery test_230_query = createSubtypeQuery(parseWhiley("{any f1,int f2}"),parseWhiley("{int f1,int f2}"));
		@Test public void test_230() { testValid(test_230_query); }

		private static final SubtypeQuery test_231_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("bool|int|int[]"));
		@Test public void test_231() { testInvalid(test_231_query); }

		private static final SubtypeQuery test_232_query = createSubtypeQuery(parseWhiley("bool|int|int[]"),parseWhiley("int"));
		@Test public void test_232() { testValid(test_232_query); }

		private static final SubtypeQuery test_233_query = createSubtypeQuery(parseWhiley("bool|int|int[]"),parseWhiley("bool"));
		@Test public void test_233() { testValid(test_233_query); }

		private static final SubtypeQuery test_234_query = createSubtypeQuery(parseWhiley("bool|int|int[]"),parseWhiley("int[]"));
		@Test public void test_234() { testInvalid(test_234_query); }

		private static final SubtypeQuery test_235_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int|{int[] msg}"));
		@Test public void test_235() { testInvalid(test_235_query); }

		private static final SubtypeQuery test_236_query = createSubtypeQuery(parseWhiley("int|{int[] msg}"),parseWhiley("{int[] msg}"));
		@Test public void test_236() { testValid(test_236_query); }

		private static final SubtypeQuery test_237_query = createSubtypeQuery(parseWhiley("int|{int[] msg}"),parseWhiley("int"));
		@Test public void test_237() { testValid(test_237_query); }

		private static final SubtypeQuery test_238_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int|{int op}|{int[] msg}"));
		@Test public void test_238() { testInvalid(test_238_query); }

		private static final SubtypeQuery test_239_query = createSubtypeQuery(parseWhiley("int|{int op}|{int[] msg}"),parseWhiley("{int[] msg}"));
		@Test public void test_239() { testInvalid(test_239_query); }

		private static final SubtypeQuery test_240_query = createSubtypeQuery(parseWhiley("int|{int op}|{int[] msg}"),parseWhiley("int"));
		@Test public void test_240() { testValid(test_240_query); }

		private static final SubtypeQuery test_241_query = createSubtypeQuery(parseWhiley("int|{int op}|{int[] msg}"),parseWhiley("{int op}"));
		@Test public void test_241() { testValid(test_241_query); }

		private static final SubtypeQuery test_242_query = createSubtypeQuery(parseWhiley("null|bool|int"),parseWhiley("bool"));
		@Test public void test_242() { testValid(test_242_query); }

		private static final SubtypeQuery test_243_query = createSubtypeQuery(parseWhiley("bool|int"),parseWhiley("bool|int"));
		@Test public void test_243() { testValid(test_243_query); }

		private static final SubtypeQuery test_244_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("null|int"));
		@Test public void test_244() { testValid(test_244_query); }

		private static final SubtypeQuery test_245_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[] msg}"));
		@Test public void test_245() { testInvalid(test_245_query); }

		private static final SubtypeQuery test_246_query = createSubtypeQuery(parseWhiley("{int[] input}|{int[] msg}"),parseWhiley("{int[] input}"));
		@Test public void test_246() { testValid(test_246_query); }

		private static final SubtypeQuery test_247_query = createSubtypeQuery(parseWhiley("{int[] input}|{int[] msg}"),parseWhiley("{int[] msg}"));
		@Test public void test_247() { testValid(test_247_query); }

		private static final SubtypeQuery test_248_query = createSubtypeQuery(parseWhiley("{int[] msg}"),parseWhiley("{int[] msg}"));
		@Test public void test_248() { testValid(test_248_query); }

		private static final SubtypeQuery test_249_query = createSubtypeQuery(parseWhiley("int|int[]"),parseWhiley("int|int[]"));
		@Test public void test_249() { testValid(test_249_query); }

		private static final SubtypeQuery test_250_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[] data,int op}"));
		@Test public void test_250() { testInvalid(test_250_query); }

		private static final SubtypeQuery test_251_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int index}"));
		@Test public void test_251() { testInvalid(test_251_query); }

		private static final SubtypeQuery test_252_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int index}|{int[] data,int op}"));
		@Test public void test_252() { testInvalid(test_252_query); }

		private static final SubtypeQuery test_253_query = createSubtypeQuery(parseWhiley("{int index}|{int[] data,int op}"),parseWhiley("{int index}|{int[] data,int op}"));
		@Test public void test_253() { testValid(test_253_query); }

		private static final SubtypeQuery test_254_query = createSubtypeQuery(parseWhiley("{int[] data,int op}"),parseWhiley("{int[] data,int op}"));
		@Test public void test_254() { testValid(test_254_query); }

		private static final SubtypeQuery test_255_query = createSubtypeQuery(parseWhiley("{int index}|{int[] data,int op}"),parseWhiley("{int[] data,int op}"));
		@Test public void test_255() { testValid(test_255_query); }

		private static final SubtypeQuery test_256_query = createSubtypeQuery(parseWhiley("{int index}"),parseWhiley("{int index}"));
		@Test public void test_256() { testValid(test_256_query); }

		private static final SubtypeQuery test_257_query = createSubtypeQuery(parseWhiley("{int index}|{int[] data,int op}"),parseWhiley("{int index}"));
		@Test public void test_257() { testValid(test_257_query); }

		private static final SubtypeQuery test_258_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int mode,int op}"));
		@Test public void test_258() { testInvalid(test_258_query); }

		private static final SubtypeQuery test_259_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int mode,int op}|{int op,bool[] rest}"));
		@Test public void test_259() { testInvalid(test_259_query); }

		private static final SubtypeQuery test_260_query = createSubtypeQuery(parseWhiley("{int mode,int op}|{int op,bool[] rest}"),parseWhiley("{int mode,int op}|{int op,bool[] rest}"));
		@Test public void test_260() { testValid(test_260_query); }

		private static final SubtypeQuery test_261_query = createSubtypeQuery(parseWhiley("{int mode,int op}|{int op,bool[] rest}"),parseWhiley("{int mode,int op}"));
		@Test public void test_261() { testValid(test_261_query); }

		private static final SubtypeQuery test_262_query = createSubtypeQuery(parseWhiley("{int mode,int op}|{int op,bool[] rest}"),parseWhiley("{int op,bool[] rest}"));
		@Test public void test_262() { testValid(test_262_query); }

		private static final SubtypeQuery test_263_query = createSubtypeQuery(parseWhiley("{int mode,int op}"),parseWhiley("{int mode,int op}"));
		@Test public void test_263() { testValid(test_263_query); }

		private static final SubtypeQuery test_264_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{{int dum}[] data,int op}"));
		@Test public void test_264() { testInvalid(test_264_query); }

		private static final SubtypeQuery test_265_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[] data,int op}|{{int dum}[] data,int op}"));
		@Test public void test_265() { testInvalid(test_265_query); }

		private static final SubtypeQuery test_266_query = createSubtypeQuery(parseWhiley("{int[] data,int op}|{{int dum}[] data,int op}"),parseWhiley("{int[] data,int op}|{{int dum}[] data,int op}"));
		@Test public void test_266() { testValid(test_266_query); }

		private static final SubtypeQuery test_267_query = createSubtypeQuery(parseWhiley("{int[] data,int op}|{{int dum}[] data,int op}"),parseWhiley("{int[] data,int op}"));
		@Test public void test_267() { testValid(test_267_query); }

		private static final SubtypeQuery test_268_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int|int[] op}"));
		@Test public void test_268() { testInvalid(test_268_query); }

		private static final SubtypeQuery test_269_query = createSubtypeQuery(parseWhiley("{int|int[] op}"),parseWhiley("{int op}"));
		@Test public void test_269() { testValid(test_269_query); }

		private static final SubtypeQuery test_270_query = createSubtypeQuery(parseWhiley("{int|int[] op}"),parseWhiley("{int|int[] op}"));
		@Test public void test_270() { testValid(test_270_query); }

		private static final SubtypeQuery test_271_query = createSubtypeQuery(parseWhiley("{int|int[] op}"),parseWhiley("{int[] op}"));
		@Test public void test_271() { testValid(test_271_query); }

		private static final SubtypeQuery test_272_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int[]|int il,int op}"));
		@Test public void test_272() { testInvalid(test_272_query); }

		private static final SubtypeQuery test_273_query = createSubtypeQuery(parseWhiley("{int[]|int il,int op}"),parseWhiley("{int il,int op}"));
		@Test public void test_273() { testValid(test_273_query); }

		private static final SubtypeQuery test_274_query = createSubtypeQuery(parseWhiley("{int[]|int il,int op}"),parseWhiley("{int[]|int il,int op}"));
		@Test public void test_274() { testValid(test_274_query); }

		private static final SubtypeQuery test_275_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int|{int[] id}"));
		@Test public void test_275() { testInvalid(test_275_query); }

		private static final SubtypeQuery test_276_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("int|{int[] err}|{int[] id}"));
		@Test public void test_276() { testInvalid(test_276_query); }

		private static final SubtypeQuery test_277_query = createSubtypeQuery(parseWhiley("int|{int[] err}|{int[] id}"),parseWhiley("int|{int[] id}"));
		@Test public void test_277() { testValid(test_277_query); }

		private static final SubtypeQuery test_278_query = createSubtypeQuery(parseWhiley("int|{int[] err}|{int[] id}"),parseWhiley("{int[] err}"));
		@Test public void test_278() { testValid(test_278_query); }

		private static final SubtypeQuery test_279_query = createSubtypeQuery(parseWhiley("int|{int[] id}"),parseWhiley("int"));
		@Test public void test_279() { testValid(test_279_query); }

		private static final SubtypeQuery test_280_query = createSubtypeQuery(parseWhiley("int|{int[] err}|{int[] id}"),parseWhiley("int|{int[] err}|{int[] id}"));
		@Test public void test_280() { testValid(test_280_query); }

		private static final SubtypeQuery test_281_query = createSubtypeQuery(parseWhiley("int|{int[] err}|{int[] id}"),parseWhiley("int"));
		@Test public void test_281() { testValid(test_281_query); }

		private static final SubtypeQuery test_282_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int index,int op}|{int offset,int op}"));
		@Test public void test_282() { testInvalid(test_282_query); }

		private static final SubtypeQuery test_283_query = createSubtypeQuery(parseWhiley("{int index,int op}|{int offset,int op}"),parseWhiley("{int index,int op}|{int offset,int op}"));
		@Test public void test_283() { testValid(test_283_query); }

		private static final SubtypeQuery test_284_query = createSubtypeQuery(parseWhiley("{int index,int op}|{int offset,int op}"),parseWhiley("{int index,int op}"));
		@Test public void test_284() { testValid(test_284_query); }

		private static final SubtypeQuery test_285_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int header,int op,int[] rest}"));
		@Test public void test_285() { testInvalid(test_285_query); }

		private static final SubtypeQuery test_286_query = createSubtypeQuery(parseWhiley("void"),parseWhiley("{int op,int[] payload}|{int header,int op,int[] rest}"));
		@Test public void test_286() { testInvalid(test_286_query); }

		private static final SubtypeQuery test_287_query = createSubtypeQuery(parseWhiley("{int op,int[] payload}|{int header,int op,int[] rest}"),parseWhiley("{int op,int[] payload}"));
		@Test public void test_287() { testValid(test_287_query); }

		private static final SubtypeQuery test_288_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("{int index}|{int[] data,int op}"));
		@Test public void test_288() { testValid(test_288_query); }

		private static final SubtypeQuery test_289_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("{int[] data,int op}"));
		@Test public void test_289() { testValid(test_289_query); }

	}
}
