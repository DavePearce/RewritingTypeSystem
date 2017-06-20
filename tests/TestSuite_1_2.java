import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import types.testing.AbstractTestSuite;
import types.core.SyntacticType;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSuite_1_2 extends AbstractTestSuite {
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

		private static final SyntacticType test_6_sup = parse("any");
		private static final SyntacticType test_6_sub = parse("{any, any}");
		@Test public void test_6() { testValid(test_6_sup,test_6_sub); }

		private static final SyntacticType test_7_sup = parse("any");
		private static final SyntacticType test_7_sub = parse("{int, any}");
		@Test public void test_7() { testValid(test_7_sup,test_7_sub); }

		private static final SyntacticType test_8_sup = parse("any");
		private static final SyntacticType test_8_sub = parse("{any, int}");
		@Test public void test_8() { testValid(test_8_sup,test_8_sub); }

		private static final SyntacticType test_9_sup = parse("any");
		private static final SyntacticType test_9_sub = parse("{int, int}");
		@Test public void test_9() { testValid(test_9_sup,test_9_sub); }

		private static final SyntacticType test_10_sup = parse("any");
		private static final SyntacticType test_10_sub = parse("(any | any)");
		@Test public void test_10() { testValid(test_10_sup,test_10_sub); }

		private static final SyntacticType test_11_sup = parse("any");
		private static final SyntacticType test_11_sub = parse("(int | any)");
		@Test public void test_11() { testValid(test_11_sup,test_11_sub); }

		private static final SyntacticType test_12_sup = parse("any");
		private static final SyntacticType test_12_sub = parse("(any | int)");
		@Test public void test_12() { testValid(test_12_sup,test_12_sub); }

		private static final SyntacticType test_13_sup = parse("any");
		private static final SyntacticType test_13_sub = parse("(int | int)");
		@Test public void test_13() { testValid(test_13_sup,test_13_sub); }

		private static final SyntacticType test_14_sup = parse("any");
		private static final SyntacticType test_14_sub = parse("(any & any)");
		@Test public void test_14() { testValid(test_14_sup,test_14_sub); }

		private static final SyntacticType test_15_sup = parse("any");
		private static final SyntacticType test_15_sub = parse("(int & any)");
		@Test public void test_15() { testValid(test_15_sup,test_15_sub); }

		private static final SyntacticType test_16_sup = parse("any");
		private static final SyntacticType test_16_sub = parse("(any & int)");
		@Test public void test_16() { testValid(test_16_sup,test_16_sub); }

		private static final SyntacticType test_17_sup = parse("any");
		private static final SyntacticType test_17_sub = parse("(int & int)");
		@Test public void test_17() { testValid(test_17_sup,test_17_sub); }

		private static final SyntacticType test_18_sup = parse("int");
		private static final SyntacticType test_18_sub = parse("any");
		@Test public void test_18() { testInvalid(test_18_sup,test_18_sub); }

		private static final SyntacticType test_19_sup = parse("int");
		private static final SyntacticType test_19_sub = parse("int");
		@Test public void test_19() { testValid(test_19_sup,test_19_sub); }

		private static final SyntacticType test_20_sup = parse("int");
		private static final SyntacticType test_20_sub = parse("{any}");
		@Test public void test_20() { testInvalid(test_20_sup,test_20_sub); }

		private static final SyntacticType test_21_sup = parse("int");
		private static final SyntacticType test_21_sub = parse("{int}");
		@Test public void test_21() { testInvalid(test_21_sup,test_21_sub); }

		private static final SyntacticType test_22_sup = parse("int");
		private static final SyntacticType test_22_sub = parse("!any");
		@Test public void test_22() { testValid(test_22_sup,test_22_sub); }

		private static final SyntacticType test_23_sup = parse("int");
		private static final SyntacticType test_23_sub = parse("!int");
		@Test public void test_23() { testInvalid(test_23_sup,test_23_sub); }

		private static final SyntacticType test_24_sup = parse("int");
		private static final SyntacticType test_24_sub = parse("{any, any}");
		@Test public void test_24() { testInvalid(test_24_sup,test_24_sub); }

		private static final SyntacticType test_25_sup = parse("int");
		private static final SyntacticType test_25_sub = parse("{int, any}");
		@Test public void test_25() { testInvalid(test_25_sup,test_25_sub); }

		private static final SyntacticType test_26_sup = parse("int");
		private static final SyntacticType test_26_sub = parse("{any, int}");
		@Test public void test_26() { testInvalid(test_26_sup,test_26_sub); }

		private static final SyntacticType test_27_sup = parse("int");
		private static final SyntacticType test_27_sub = parse("{int, int}");
		@Test public void test_27() { testInvalid(test_27_sup,test_27_sub); }

		private static final SyntacticType test_28_sup = parse("int");
		private static final SyntacticType test_28_sub = parse("(any | any)");
		@Test public void test_28() { testInvalid(test_28_sup,test_28_sub); }

		private static final SyntacticType test_29_sup = parse("int");
		private static final SyntacticType test_29_sub = parse("(int | any)");
		@Test public void test_29() { testInvalid(test_29_sup,test_29_sub); }

		private static final SyntacticType test_30_sup = parse("int");
		private static final SyntacticType test_30_sub = parse("(any | int)");
		@Test public void test_30() { testInvalid(test_30_sup,test_30_sub); }

		private static final SyntacticType test_31_sup = parse("int");
		private static final SyntacticType test_31_sub = parse("(int | int)");
		@Test public void test_31() { testValid(test_31_sup,test_31_sub); }

		private static final SyntacticType test_32_sup = parse("int");
		private static final SyntacticType test_32_sub = parse("(any & any)");
		@Test public void test_32() { testInvalid(test_32_sup,test_32_sub); }

		private static final SyntacticType test_33_sup = parse("int");
		private static final SyntacticType test_33_sub = parse("(int & any)");
		@Test public void test_33() { testValid(test_33_sup,test_33_sub); }

		private static final SyntacticType test_34_sup = parse("int");
		private static final SyntacticType test_34_sub = parse("(any & int)");
		@Test public void test_34() { testValid(test_34_sup,test_34_sub); }

		private static final SyntacticType test_35_sup = parse("int");
		private static final SyntacticType test_35_sub = parse("(int & int)");
		@Test public void test_35() { testValid(test_35_sup,test_35_sub); }

		private static final SyntacticType test_36_sup = parse("{any}");
		private static final SyntacticType test_36_sub = parse("any");
		@Test public void test_36() { testInvalid(test_36_sup,test_36_sub); }

		private static final SyntacticType test_37_sup = parse("{any}");
		private static final SyntacticType test_37_sub = parse("int");
		@Test public void test_37() { testInvalid(test_37_sup,test_37_sub); }

		private static final SyntacticType test_38_sup = parse("{any}");
		private static final SyntacticType test_38_sub = parse("{any}");
		@Test public void test_38() { testValid(test_38_sup,test_38_sub); }

		private static final SyntacticType test_39_sup = parse("{any}");
		private static final SyntacticType test_39_sub = parse("{int}");
		@Test public void test_39() { testValid(test_39_sup,test_39_sub); }

		private static final SyntacticType test_40_sup = parse("{any}");
		private static final SyntacticType test_40_sub = parse("!any");
		@Test public void test_40() { testValid(test_40_sup,test_40_sub); }

		private static final SyntacticType test_41_sup = parse("{any}");
		private static final SyntacticType test_41_sub = parse("!int");
		@Test public void test_41() { testInvalid(test_41_sup,test_41_sub); }

		private static final SyntacticType test_42_sup = parse("{any}");
		private static final SyntacticType test_42_sub = parse("{any, any}");
		@Test public void test_42() { testInvalid(test_42_sup,test_42_sub); }

		private static final SyntacticType test_43_sup = parse("{any}");
		private static final SyntacticType test_43_sub = parse("{int, any}");
		@Test public void test_43() { testInvalid(test_43_sup,test_43_sub); }

		private static final SyntacticType test_44_sup = parse("{any}");
		private static final SyntacticType test_44_sub = parse("{any, int}");
		@Test public void test_44() { testInvalid(test_44_sup,test_44_sub); }

		private static final SyntacticType test_45_sup = parse("{any}");
		private static final SyntacticType test_45_sub = parse("{int, int}");
		@Test public void test_45() { testInvalid(test_45_sup,test_45_sub); }

		private static final SyntacticType test_46_sup = parse("{any}");
		private static final SyntacticType test_46_sub = parse("(any | any)");
		@Test public void test_46() { testInvalid(test_46_sup,test_46_sub); }

		private static final SyntacticType test_47_sup = parse("{any}");
		private static final SyntacticType test_47_sub = parse("(int | any)");
		@Test public void test_47() { testInvalid(test_47_sup,test_47_sub); }

		private static final SyntacticType test_48_sup = parse("{any}");
		private static final SyntacticType test_48_sub = parse("(any | int)");
		@Test public void test_48() { testInvalid(test_48_sup,test_48_sub); }

		private static final SyntacticType test_49_sup = parse("{any}");
		private static final SyntacticType test_49_sub = parse("(int | int)");
		@Test public void test_49() { testInvalid(test_49_sup,test_49_sub); }

		private static final SyntacticType test_50_sup = parse("{any}");
		private static final SyntacticType test_50_sub = parse("(any & any)");
		@Test public void test_50() { testInvalid(test_50_sup,test_50_sub); }

		private static final SyntacticType test_51_sup = parse("{any}");
		private static final SyntacticType test_51_sub = parse("(int & any)");
		@Test public void test_51() { testInvalid(test_51_sup,test_51_sub); }

		private static final SyntacticType test_52_sup = parse("{any}");
		private static final SyntacticType test_52_sub = parse("(any & int)");
		@Test public void test_52() { testInvalid(test_52_sup,test_52_sub); }

		private static final SyntacticType test_53_sup = parse("{any}");
		private static final SyntacticType test_53_sub = parse("(int & int)");
		@Test public void test_53() { testInvalid(test_53_sup,test_53_sub); }

		private static final SyntacticType test_54_sup = parse("{int}");
		private static final SyntacticType test_54_sub = parse("any");
		@Test public void test_54() { testInvalid(test_54_sup,test_54_sub); }

		private static final SyntacticType test_55_sup = parse("{int}");
		private static final SyntacticType test_55_sub = parse("int");
		@Test public void test_55() { testInvalid(test_55_sup,test_55_sub); }

		private static final SyntacticType test_56_sup = parse("{int}");
		private static final SyntacticType test_56_sub = parse("{any}");
		@Test public void test_56() { testInvalid(test_56_sup,test_56_sub); }

		private static final SyntacticType test_57_sup = parse("{int}");
		private static final SyntacticType test_57_sub = parse("{int}");
		@Test public void test_57() { testValid(test_57_sup,test_57_sub); }

		private static final SyntacticType test_58_sup = parse("{int}");
		private static final SyntacticType test_58_sub = parse("!any");
		@Test public void test_58() { testValid(test_58_sup,test_58_sub); }

		private static final SyntacticType test_59_sup = parse("{int}");
		private static final SyntacticType test_59_sub = parse("!int");
		@Test public void test_59() { testInvalid(test_59_sup,test_59_sub); }

		private static final SyntacticType test_60_sup = parse("{int}");
		private static final SyntacticType test_60_sub = parse("{any, any}");
		@Test public void test_60() { testInvalid(test_60_sup,test_60_sub); }

		private static final SyntacticType test_61_sup = parse("{int}");
		private static final SyntacticType test_61_sub = parse("{int, any}");
		@Test public void test_61() { testInvalid(test_61_sup,test_61_sub); }

		private static final SyntacticType test_62_sup = parse("{int}");
		private static final SyntacticType test_62_sub = parse("{any, int}");
		@Test public void test_62() { testInvalid(test_62_sup,test_62_sub); }

		private static final SyntacticType test_63_sup = parse("{int}");
		private static final SyntacticType test_63_sub = parse("{int, int}");
		@Test public void test_63() { testInvalid(test_63_sup,test_63_sub); }

		private static final SyntacticType test_64_sup = parse("{int}");
		private static final SyntacticType test_64_sub = parse("(any | any)");
		@Test public void test_64() { testInvalid(test_64_sup,test_64_sub); }

		private static final SyntacticType test_65_sup = parse("{int}");
		private static final SyntacticType test_65_sub = parse("(int | any)");
		@Test public void test_65() { testInvalid(test_65_sup,test_65_sub); }

		private static final SyntacticType test_66_sup = parse("{int}");
		private static final SyntacticType test_66_sub = parse("(any | int)");
		@Test public void test_66() { testInvalid(test_66_sup,test_66_sub); }

		private static final SyntacticType test_67_sup = parse("{int}");
		private static final SyntacticType test_67_sub = parse("(int | int)");
		@Test public void test_67() { testInvalid(test_67_sup,test_67_sub); }

		private static final SyntacticType test_68_sup = parse("{int}");
		private static final SyntacticType test_68_sub = parse("(any & any)");
		@Test public void test_68() { testInvalid(test_68_sup,test_68_sub); }

		private static final SyntacticType test_69_sup = parse("{int}");
		private static final SyntacticType test_69_sub = parse("(int & any)");
		@Test public void test_69() { testInvalid(test_69_sup,test_69_sub); }

		private static final SyntacticType test_70_sup = parse("{int}");
		private static final SyntacticType test_70_sub = parse("(any & int)");
		@Test public void test_70() { testInvalid(test_70_sup,test_70_sub); }

		private static final SyntacticType test_71_sup = parse("{int}");
		private static final SyntacticType test_71_sub = parse("(int & int)");
		@Test public void test_71() { testInvalid(test_71_sup,test_71_sub); }

		private static final SyntacticType test_72_sup = parse("!any");
		private static final SyntacticType test_72_sub = parse("any");
		@Test public void test_72() { testInvalid(test_72_sup,test_72_sub); }

		private static final SyntacticType test_73_sup = parse("!any");
		private static final SyntacticType test_73_sub = parse("int");
		@Test public void test_73() { testInvalid(test_73_sup,test_73_sub); }

		private static final SyntacticType test_74_sup = parse("!any");
		private static final SyntacticType test_74_sub = parse("{any}");
		@Test public void test_74() { testInvalid(test_74_sup,test_74_sub); }

		private static final SyntacticType test_75_sup = parse("!any");
		private static final SyntacticType test_75_sub = parse("{int}");
		@Test public void test_75() { testInvalid(test_75_sup,test_75_sub); }

		private static final SyntacticType test_76_sup = parse("!any");
		private static final SyntacticType test_76_sub = parse("!any");
		@Test public void test_76() { testValid(test_76_sup,test_76_sub); }

		private static final SyntacticType test_77_sup = parse("!any");
		private static final SyntacticType test_77_sub = parse("!int");
		@Test public void test_77() { testInvalid(test_77_sup,test_77_sub); }

		private static final SyntacticType test_78_sup = parse("!any");
		private static final SyntacticType test_78_sub = parse("{any, any}");
		@Test public void test_78() { testInvalid(test_78_sup,test_78_sub); }

		private static final SyntacticType test_79_sup = parse("!any");
		private static final SyntacticType test_79_sub = parse("{int, any}");
		@Test public void test_79() { testInvalid(test_79_sup,test_79_sub); }

		private static final SyntacticType test_80_sup = parse("!any");
		private static final SyntacticType test_80_sub = parse("{any, int}");
		@Test public void test_80() { testInvalid(test_80_sup,test_80_sub); }

		private static final SyntacticType test_81_sup = parse("!any");
		private static final SyntacticType test_81_sub = parse("{int, int}");
		@Test public void test_81() { testInvalid(test_81_sup,test_81_sub); }

		private static final SyntacticType test_82_sup = parse("!any");
		private static final SyntacticType test_82_sub = parse("(any | any)");
		@Test public void test_82() { testInvalid(test_82_sup,test_82_sub); }

		private static final SyntacticType test_83_sup = parse("!any");
		private static final SyntacticType test_83_sub = parse("(int | any)");
		@Test public void test_83() { testInvalid(test_83_sup,test_83_sub); }

		private static final SyntacticType test_84_sup = parse("!any");
		private static final SyntacticType test_84_sub = parse("(any | int)");
		@Test public void test_84() { testInvalid(test_84_sup,test_84_sub); }

		private static final SyntacticType test_85_sup = parse("!any");
		private static final SyntacticType test_85_sub = parse("(int | int)");
		@Test public void test_85() { testInvalid(test_85_sup,test_85_sub); }

		private static final SyntacticType test_86_sup = parse("!any");
		private static final SyntacticType test_86_sub = parse("(any & any)");
		@Test public void test_86() { testInvalid(test_86_sup,test_86_sub); }

		private static final SyntacticType test_87_sup = parse("!any");
		private static final SyntacticType test_87_sub = parse("(int & any)");
		@Test public void test_87() { testInvalid(test_87_sup,test_87_sub); }

		private static final SyntacticType test_88_sup = parse("!any");
		private static final SyntacticType test_88_sub = parse("(any & int)");
		@Test public void test_88() { testInvalid(test_88_sup,test_88_sub); }

		private static final SyntacticType test_89_sup = parse("!any");
		private static final SyntacticType test_89_sub = parse("(int & int)");
		@Test public void test_89() { testInvalid(test_89_sup,test_89_sub); }

		private static final SyntacticType test_90_sup = parse("!int");
		private static final SyntacticType test_90_sub = parse("any");
		@Test public void test_90() { testInvalid(test_90_sup,test_90_sub); }

		private static final SyntacticType test_91_sup = parse("!int");
		private static final SyntacticType test_91_sub = parse("int");
		@Test public void test_91() { testInvalid(test_91_sup,test_91_sub); }

		private static final SyntacticType test_92_sup = parse("!int");
		private static final SyntacticType test_92_sub = parse("{any}");
		@Test public void test_92() { testValid(test_92_sup,test_92_sub); }

		private static final SyntacticType test_93_sup = parse("!int");
		private static final SyntacticType test_93_sub = parse("{int}");
		@Test public void test_93() { testValid(test_93_sup,test_93_sub); }

		private static final SyntacticType test_94_sup = parse("!int");
		private static final SyntacticType test_94_sub = parse("!any");
		@Test public void test_94() { testValid(test_94_sup,test_94_sub); }

		private static final SyntacticType test_95_sup = parse("!int");
		private static final SyntacticType test_95_sub = parse("!int");
		@Test public void test_95() { testValid(test_95_sup,test_95_sub); }

		private static final SyntacticType test_96_sup = parse("!int");
		private static final SyntacticType test_96_sub = parse("{any, any}");
		@Test public void test_96() { testValid(test_96_sup,test_96_sub); }

		private static final SyntacticType test_97_sup = parse("!int");
		private static final SyntacticType test_97_sub = parse("{int, any}");
		@Test public void test_97() { testValid(test_97_sup,test_97_sub); }

		private static final SyntacticType test_98_sup = parse("!int");
		private static final SyntacticType test_98_sub = parse("{any, int}");
		@Test public void test_98() { testValid(test_98_sup,test_98_sub); }

		private static final SyntacticType test_99_sup = parse("!int");
		private static final SyntacticType test_99_sub = parse("{int, int}");
		@Test public void test_99() { testValid(test_99_sup,test_99_sub); }

		private static final SyntacticType test_100_sup = parse("!int");
		private static final SyntacticType test_100_sub = parse("(any | any)");
		@Test public void test_100() { testInvalid(test_100_sup,test_100_sub); }

		private static final SyntacticType test_101_sup = parse("!int");
		private static final SyntacticType test_101_sub = parse("(int | any)");
		@Test public void test_101() { testInvalid(test_101_sup,test_101_sub); }

		private static final SyntacticType test_102_sup = parse("!int");
		private static final SyntacticType test_102_sub = parse("(any | int)");
		@Test public void test_102() { testInvalid(test_102_sup,test_102_sub); }

		private static final SyntacticType test_103_sup = parse("!int");
		private static final SyntacticType test_103_sub = parse("(int | int)");
		@Test public void test_103() { testInvalid(test_103_sup,test_103_sub); }

		private static final SyntacticType test_104_sup = parse("!int");
		private static final SyntacticType test_104_sub = parse("(any & any)");
		@Test public void test_104() { testInvalid(test_104_sup,test_104_sub); }

		private static final SyntacticType test_105_sup = parse("!int");
		private static final SyntacticType test_105_sub = parse("(int & any)");
		@Test public void test_105() { testInvalid(test_105_sup,test_105_sub); }

		private static final SyntacticType test_106_sup = parse("!int");
		private static final SyntacticType test_106_sub = parse("(any & int)");
		@Test public void test_106() { testInvalid(test_106_sup,test_106_sub); }

		private static final SyntacticType test_107_sup = parse("!int");
		private static final SyntacticType test_107_sub = parse("(int & int)");
		@Test public void test_107() { testInvalid(test_107_sup,test_107_sub); }

		private static final SyntacticType test_108_sup = parse("{any, any}");
		private static final SyntacticType test_108_sub = parse("any");
		@Test public void test_108() { testInvalid(test_108_sup,test_108_sub); }

		private static final SyntacticType test_109_sup = parse("{any, any}");
		private static final SyntacticType test_109_sub = parse("int");
		@Test public void test_109() { testInvalid(test_109_sup,test_109_sub); }

		private static final SyntacticType test_110_sup = parse("{any, any}");
		private static final SyntacticType test_110_sub = parse("{any}");
		@Test public void test_110() { testInvalid(test_110_sup,test_110_sub); }

		private static final SyntacticType test_111_sup = parse("{any, any}");
		private static final SyntacticType test_111_sub = parse("{int}");
		@Test public void test_111() { testInvalid(test_111_sup,test_111_sub); }

		private static final SyntacticType test_112_sup = parse("{any, any}");
		private static final SyntacticType test_112_sub = parse("!any");
		@Test public void test_112() { testValid(test_112_sup,test_112_sub); }

		private static final SyntacticType test_113_sup = parse("{any, any}");
		private static final SyntacticType test_113_sub = parse("!int");
		@Test public void test_113() { testInvalid(test_113_sup,test_113_sub); }

		private static final SyntacticType test_114_sup = parse("{any, any}");
		private static final SyntacticType test_114_sub = parse("{any, any}");
		@Test public void test_114() { testValid(test_114_sup,test_114_sub); }

		private static final SyntacticType test_115_sup = parse("{any, any}");
		private static final SyntacticType test_115_sub = parse("{int, any}");
		@Test public void test_115() { testValid(test_115_sup,test_115_sub); }

		private static final SyntacticType test_116_sup = parse("{any, any}");
		private static final SyntacticType test_116_sub = parse("{any, int}");
		@Test public void test_116() { testValid(test_116_sup,test_116_sub); }

		private static final SyntacticType test_117_sup = parse("{any, any}");
		private static final SyntacticType test_117_sub = parse("{int, int}");
		@Test public void test_117() { testValid(test_117_sup,test_117_sub); }

		private static final SyntacticType test_118_sup = parse("{any, any}");
		private static final SyntacticType test_118_sub = parse("(any | any)");
		@Test public void test_118() { testInvalid(test_118_sup,test_118_sub); }

		private static final SyntacticType test_119_sup = parse("{any, any}");
		private static final SyntacticType test_119_sub = parse("(int | any)");
		@Test public void test_119() { testInvalid(test_119_sup,test_119_sub); }

		private static final SyntacticType test_120_sup = parse("{any, any}");
		private static final SyntacticType test_120_sub = parse("(any | int)");
		@Test public void test_120() { testInvalid(test_120_sup,test_120_sub); }

		private static final SyntacticType test_121_sup = parse("{any, any}");
		private static final SyntacticType test_121_sub = parse("(int | int)");
		@Test public void test_121() { testInvalid(test_121_sup,test_121_sub); }

		private static final SyntacticType test_122_sup = parse("{any, any}");
		private static final SyntacticType test_122_sub = parse("(any & any)");
		@Test public void test_122() { testInvalid(test_122_sup,test_122_sub); }

		private static final SyntacticType test_123_sup = parse("{any, any}");
		private static final SyntacticType test_123_sub = parse("(int & any)");
		@Test public void test_123() { testInvalid(test_123_sup,test_123_sub); }

		private static final SyntacticType test_124_sup = parse("{any, any}");
		private static final SyntacticType test_124_sub = parse("(any & int)");
		@Test public void test_124() { testInvalid(test_124_sup,test_124_sub); }

		private static final SyntacticType test_125_sup = parse("{any, any}");
		private static final SyntacticType test_125_sub = parse("(int & int)");
		@Test public void test_125() { testInvalid(test_125_sup,test_125_sub); }

		private static final SyntacticType test_126_sup = parse("{int, any}");
		private static final SyntacticType test_126_sub = parse("any");
		@Test public void test_126() { testInvalid(test_126_sup,test_126_sub); }

		private static final SyntacticType test_127_sup = parse("{int, any}");
		private static final SyntacticType test_127_sub = parse("int");
		@Test public void test_127() { testInvalid(test_127_sup,test_127_sub); }

		private static final SyntacticType test_128_sup = parse("{int, any}");
		private static final SyntacticType test_128_sub = parse("{any}");
		@Test public void test_128() { testInvalid(test_128_sup,test_128_sub); }

		private static final SyntacticType test_129_sup = parse("{int, any}");
		private static final SyntacticType test_129_sub = parse("{int}");
		@Test public void test_129() { testInvalid(test_129_sup,test_129_sub); }

		private static final SyntacticType test_130_sup = parse("{int, any}");
		private static final SyntacticType test_130_sub = parse("!any");
		@Test public void test_130() { testValid(test_130_sup,test_130_sub); }

		private static final SyntacticType test_131_sup = parse("{int, any}");
		private static final SyntacticType test_131_sub = parse("!int");
		@Test public void test_131() { testInvalid(test_131_sup,test_131_sub); }

		private static final SyntacticType test_132_sup = parse("{int, any}");
		private static final SyntacticType test_132_sub = parse("{any, any}");
		@Test public void test_132() { testInvalid(test_132_sup,test_132_sub); }

		private static final SyntacticType test_133_sup = parse("{int, any}");
		private static final SyntacticType test_133_sub = parse("{int, any}");
		@Test public void test_133() { testValid(test_133_sup,test_133_sub); }

		private static final SyntacticType test_134_sup = parse("{int, any}");
		private static final SyntacticType test_134_sub = parse("{any, int}");
		@Test public void test_134() { testInvalid(test_134_sup,test_134_sub); }

		private static final SyntacticType test_135_sup = parse("{int, any}");
		private static final SyntacticType test_135_sub = parse("{int, int}");
		@Test public void test_135() { testValid(test_135_sup,test_135_sub); }

		private static final SyntacticType test_136_sup = parse("{int, any}");
		private static final SyntacticType test_136_sub = parse("(any | any)");
		@Test public void test_136() { testInvalid(test_136_sup,test_136_sub); }

		private static final SyntacticType test_137_sup = parse("{int, any}");
		private static final SyntacticType test_137_sub = parse("(int | any)");
		@Test public void test_137() { testInvalid(test_137_sup,test_137_sub); }

		private static final SyntacticType test_138_sup = parse("{int, any}");
		private static final SyntacticType test_138_sub = parse("(any | int)");
		@Test public void test_138() { testInvalid(test_138_sup,test_138_sub); }

		private static final SyntacticType test_139_sup = parse("{int, any}");
		private static final SyntacticType test_139_sub = parse("(int | int)");
		@Test public void test_139() { testInvalid(test_139_sup,test_139_sub); }

		private static final SyntacticType test_140_sup = parse("{int, any}");
		private static final SyntacticType test_140_sub = parse("(any & any)");
		@Test public void test_140() { testInvalid(test_140_sup,test_140_sub); }

		private static final SyntacticType test_141_sup = parse("{int, any}");
		private static final SyntacticType test_141_sub = parse("(int & any)");
		@Test public void test_141() { testInvalid(test_141_sup,test_141_sub); }

		private static final SyntacticType test_142_sup = parse("{int, any}");
		private static final SyntacticType test_142_sub = parse("(any & int)");
		@Test public void test_142() { testInvalid(test_142_sup,test_142_sub); }

		private static final SyntacticType test_143_sup = parse("{int, any}");
		private static final SyntacticType test_143_sub = parse("(int & int)");
		@Test public void test_143() { testInvalid(test_143_sup,test_143_sub); }

		private static final SyntacticType test_144_sup = parse("{any, int}");
		private static final SyntacticType test_144_sub = parse("any");
		@Test public void test_144() { testInvalid(test_144_sup,test_144_sub); }

		private static final SyntacticType test_145_sup = parse("{any, int}");
		private static final SyntacticType test_145_sub = parse("int");
		@Test public void test_145() { testInvalid(test_145_sup,test_145_sub); }

		private static final SyntacticType test_146_sup = parse("{any, int}");
		private static final SyntacticType test_146_sub = parse("{any}");
		@Test public void test_146() { testInvalid(test_146_sup,test_146_sub); }

		private static final SyntacticType test_147_sup = parse("{any, int}");
		private static final SyntacticType test_147_sub = parse("{int}");
		@Test public void test_147() { testInvalid(test_147_sup,test_147_sub); }

		private static final SyntacticType test_148_sup = parse("{any, int}");
		private static final SyntacticType test_148_sub = parse("!any");
		@Test public void test_148() { testValid(test_148_sup,test_148_sub); }

		private static final SyntacticType test_149_sup = parse("{any, int}");
		private static final SyntacticType test_149_sub = parse("!int");
		@Test public void test_149() { testInvalid(test_149_sup,test_149_sub); }

		private static final SyntacticType test_150_sup = parse("{any, int}");
		private static final SyntacticType test_150_sub = parse("{any, any}");
		@Test public void test_150() { testInvalid(test_150_sup,test_150_sub); }

		private static final SyntacticType test_151_sup = parse("{any, int}");
		private static final SyntacticType test_151_sub = parse("{int, any}");
		@Test public void test_151() { testInvalid(test_151_sup,test_151_sub); }

		private static final SyntacticType test_152_sup = parse("{any, int}");
		private static final SyntacticType test_152_sub = parse("{any, int}");
		@Test public void test_152() { testValid(test_152_sup,test_152_sub); }

		private static final SyntacticType test_153_sup = parse("{any, int}");
		private static final SyntacticType test_153_sub = parse("{int, int}");
		@Test public void test_153() { testValid(test_153_sup,test_153_sub); }

		private static final SyntacticType test_154_sup = parse("{any, int}");
		private static final SyntacticType test_154_sub = parse("(any | any)");
		@Test public void test_154() { testInvalid(test_154_sup,test_154_sub); }

		private static final SyntacticType test_155_sup = parse("{any, int}");
		private static final SyntacticType test_155_sub = parse("(int | any)");
		@Test public void test_155() { testInvalid(test_155_sup,test_155_sub); }

		private static final SyntacticType test_156_sup = parse("{any, int}");
		private static final SyntacticType test_156_sub = parse("(any | int)");
		@Test public void test_156() { testInvalid(test_156_sup,test_156_sub); }

		private static final SyntacticType test_157_sup = parse("{any, int}");
		private static final SyntacticType test_157_sub = parse("(int | int)");
		@Test public void test_157() { testInvalid(test_157_sup,test_157_sub); }

		private static final SyntacticType test_158_sup = parse("{any, int}");
		private static final SyntacticType test_158_sub = parse("(any & any)");
		@Test public void test_158() { testInvalid(test_158_sup,test_158_sub); }

		private static final SyntacticType test_159_sup = parse("{any, int}");
		private static final SyntacticType test_159_sub = parse("(int & any)");
		@Test public void test_159() { testInvalid(test_159_sup,test_159_sub); }

		private static final SyntacticType test_160_sup = parse("{any, int}");
		private static final SyntacticType test_160_sub = parse("(any & int)");
		@Test public void test_160() { testInvalid(test_160_sup,test_160_sub); }

		private static final SyntacticType test_161_sup = parse("{any, int}");
		private static final SyntacticType test_161_sub = parse("(int & int)");
		@Test public void test_161() { testInvalid(test_161_sup,test_161_sub); }

		private static final SyntacticType test_162_sup = parse("{int, int}");
		private static final SyntacticType test_162_sub = parse("any");
		@Test public void test_162() { testInvalid(test_162_sup,test_162_sub); }

		private static final SyntacticType test_163_sup = parse("{int, int}");
		private static final SyntacticType test_163_sub = parse("int");
		@Test public void test_163() { testInvalid(test_163_sup,test_163_sub); }

		private static final SyntacticType test_164_sup = parse("{int, int}");
		private static final SyntacticType test_164_sub = parse("{any}");
		@Test public void test_164() { testInvalid(test_164_sup,test_164_sub); }

		private static final SyntacticType test_165_sup = parse("{int, int}");
		private static final SyntacticType test_165_sub = parse("{int}");
		@Test public void test_165() { testInvalid(test_165_sup,test_165_sub); }

		private static final SyntacticType test_166_sup = parse("{int, int}");
		private static final SyntacticType test_166_sub = parse("!any");
		@Test public void test_166() { testValid(test_166_sup,test_166_sub); }

		private static final SyntacticType test_167_sup = parse("{int, int}");
		private static final SyntacticType test_167_sub = parse("!int");
		@Test public void test_167() { testInvalid(test_167_sup,test_167_sub); }

		private static final SyntacticType test_168_sup = parse("{int, int}");
		private static final SyntacticType test_168_sub = parse("{any, any}");
		@Test public void test_168() { testInvalid(test_168_sup,test_168_sub); }

		private static final SyntacticType test_169_sup = parse("{int, int}");
		private static final SyntacticType test_169_sub = parse("{int, any}");
		@Test public void test_169() { testInvalid(test_169_sup,test_169_sub); }

		private static final SyntacticType test_170_sup = parse("{int, int}");
		private static final SyntacticType test_170_sub = parse("{any, int}");
		@Test public void test_170() { testInvalid(test_170_sup,test_170_sub); }

		private static final SyntacticType test_171_sup = parse("{int, int}");
		private static final SyntacticType test_171_sub = parse("{int, int}");
		@Test public void test_171() { testValid(test_171_sup,test_171_sub); }

		private static final SyntacticType test_172_sup = parse("{int, int}");
		private static final SyntacticType test_172_sub = parse("(any | any)");
		@Test public void test_172() { testInvalid(test_172_sup,test_172_sub); }

		private static final SyntacticType test_173_sup = parse("{int, int}");
		private static final SyntacticType test_173_sub = parse("(int | any)");
		@Test public void test_173() { testInvalid(test_173_sup,test_173_sub); }

		private static final SyntacticType test_174_sup = parse("{int, int}");
		private static final SyntacticType test_174_sub = parse("(any | int)");
		@Test public void test_174() { testInvalid(test_174_sup,test_174_sub); }

		private static final SyntacticType test_175_sup = parse("{int, int}");
		private static final SyntacticType test_175_sub = parse("(int | int)");
		@Test public void test_175() { testInvalid(test_175_sup,test_175_sub); }

		private static final SyntacticType test_176_sup = parse("{int, int}");
		private static final SyntacticType test_176_sub = parse("(any & any)");
		@Test public void test_176() { testInvalid(test_176_sup,test_176_sub); }

		private static final SyntacticType test_177_sup = parse("{int, int}");
		private static final SyntacticType test_177_sub = parse("(int & any)");
		@Test public void test_177() { testInvalid(test_177_sup,test_177_sub); }

		private static final SyntacticType test_178_sup = parse("{int, int}");
		private static final SyntacticType test_178_sub = parse("(any & int)");
		@Test public void test_178() { testInvalid(test_178_sup,test_178_sub); }

		private static final SyntacticType test_179_sup = parse("{int, int}");
		private static final SyntacticType test_179_sub = parse("(int & int)");
		@Test public void test_179() { testInvalid(test_179_sup,test_179_sub); }

		private static final SyntacticType test_180_sup = parse("(any | any)");
		private static final SyntacticType test_180_sub = parse("any");
		@Test public void test_180() { testValid(test_180_sup,test_180_sub); }

		private static final SyntacticType test_181_sup = parse("(any | any)");
		private static final SyntacticType test_181_sub = parse("int");
		@Test public void test_181() { testValid(test_181_sup,test_181_sub); }

		private static final SyntacticType test_182_sup = parse("(any | any)");
		private static final SyntacticType test_182_sub = parse("{any}");
		@Test public void test_182() { testValid(test_182_sup,test_182_sub); }

		private static final SyntacticType test_183_sup = parse("(any | any)");
		private static final SyntacticType test_183_sub = parse("{int}");
		@Test public void test_183() { testValid(test_183_sup,test_183_sub); }

		private static final SyntacticType test_184_sup = parse("(any | any)");
		private static final SyntacticType test_184_sub = parse("!any");
		@Test public void test_184() { testValid(test_184_sup,test_184_sub); }

		private static final SyntacticType test_185_sup = parse("(any | any)");
		private static final SyntacticType test_185_sub = parse("!int");
		@Test public void test_185() { testValid(test_185_sup,test_185_sub); }

		private static final SyntacticType test_186_sup = parse("(any | any)");
		private static final SyntacticType test_186_sub = parse("{any, any}");
		@Test public void test_186() { testValid(test_186_sup,test_186_sub); }

		private static final SyntacticType test_187_sup = parse("(any | any)");
		private static final SyntacticType test_187_sub = parse("{int, any}");
		@Test public void test_187() { testValid(test_187_sup,test_187_sub); }

		private static final SyntacticType test_188_sup = parse("(any | any)");
		private static final SyntacticType test_188_sub = parse("{any, int}");
		@Test public void test_188() { testValid(test_188_sup,test_188_sub); }

		private static final SyntacticType test_189_sup = parse("(any | any)");
		private static final SyntacticType test_189_sub = parse("{int, int}");
		@Test public void test_189() { testValid(test_189_sup,test_189_sub); }

		private static final SyntacticType test_190_sup = parse("(any | any)");
		private static final SyntacticType test_190_sub = parse("(any | any)");
		@Test public void test_190() { testValid(test_190_sup,test_190_sub); }

		private static final SyntacticType test_191_sup = parse("(any | any)");
		private static final SyntacticType test_191_sub = parse("(int | any)");
		@Test public void test_191() { testValid(test_191_sup,test_191_sub); }

		private static final SyntacticType test_192_sup = parse("(any | any)");
		private static final SyntacticType test_192_sub = parse("(any | int)");
		@Test public void test_192() { testValid(test_192_sup,test_192_sub); }

		private static final SyntacticType test_193_sup = parse("(any | any)");
		private static final SyntacticType test_193_sub = parse("(int | int)");
		@Test public void test_193() { testValid(test_193_sup,test_193_sub); }

		private static final SyntacticType test_194_sup = parse("(any | any)");
		private static final SyntacticType test_194_sub = parse("(any & any)");
		@Test public void test_194() { testValid(test_194_sup,test_194_sub); }

		private static final SyntacticType test_195_sup = parse("(any | any)");
		private static final SyntacticType test_195_sub = parse("(int & any)");
		@Test public void test_195() { testValid(test_195_sup,test_195_sub); }

		private static final SyntacticType test_196_sup = parse("(any | any)");
		private static final SyntacticType test_196_sub = parse("(any & int)");
		@Test public void test_196() { testValid(test_196_sup,test_196_sub); }

		private static final SyntacticType test_197_sup = parse("(any | any)");
		private static final SyntacticType test_197_sub = parse("(int & int)");
		@Test public void test_197() { testValid(test_197_sup,test_197_sub); }

		private static final SyntacticType test_198_sup = parse("(int | any)");
		private static final SyntacticType test_198_sub = parse("any");
		@Test public void test_198() { testValid(test_198_sup,test_198_sub); }

		private static final SyntacticType test_199_sup = parse("(int | any)");
		private static final SyntacticType test_199_sub = parse("int");
		@Test public void test_199() { testValid(test_199_sup,test_199_sub); }

		private static final SyntacticType test_200_sup = parse("(int | any)");
		private static final SyntacticType test_200_sub = parse("{any}");
		@Test public void test_200() { testValid(test_200_sup,test_200_sub); }

		private static final SyntacticType test_201_sup = parse("(int | any)");
		private static final SyntacticType test_201_sub = parse("{int}");
		@Test public void test_201() { testValid(test_201_sup,test_201_sub); }

		private static final SyntacticType test_202_sup = parse("(int | any)");
		private static final SyntacticType test_202_sub = parse("!any");
		@Test public void test_202() { testValid(test_202_sup,test_202_sub); }

		private static final SyntacticType test_203_sup = parse("(int | any)");
		private static final SyntacticType test_203_sub = parse("!int");
		@Test public void test_203() { testValid(test_203_sup,test_203_sub); }

		private static final SyntacticType test_204_sup = parse("(int | any)");
		private static final SyntacticType test_204_sub = parse("{any, any}");
		@Test public void test_204() { testValid(test_204_sup,test_204_sub); }

		private static final SyntacticType test_205_sup = parse("(int | any)");
		private static final SyntacticType test_205_sub = parse("{int, any}");
		@Test public void test_205() { testValid(test_205_sup,test_205_sub); }

		private static final SyntacticType test_206_sup = parse("(int | any)");
		private static final SyntacticType test_206_sub = parse("{any, int}");
		@Test public void test_206() { testValid(test_206_sup,test_206_sub); }

		private static final SyntacticType test_207_sup = parse("(int | any)");
		private static final SyntacticType test_207_sub = parse("{int, int}");
		@Test public void test_207() { testValid(test_207_sup,test_207_sub); }

		private static final SyntacticType test_208_sup = parse("(int | any)");
		private static final SyntacticType test_208_sub = parse("(any | any)");
		@Test public void test_208() { testValid(test_208_sup,test_208_sub); }

		private static final SyntacticType test_209_sup = parse("(int | any)");
		private static final SyntacticType test_209_sub = parse("(int | any)");
		@Test public void test_209() { testValid(test_209_sup,test_209_sub); }

		private static final SyntacticType test_210_sup = parse("(int | any)");
		private static final SyntacticType test_210_sub = parse("(any | int)");
		@Test public void test_210() { testValid(test_210_sup,test_210_sub); }

		private static final SyntacticType test_211_sup = parse("(int | any)");
		private static final SyntacticType test_211_sub = parse("(int | int)");
		@Test public void test_211() { testValid(test_211_sup,test_211_sub); }

		private static final SyntacticType test_212_sup = parse("(int | any)");
		private static final SyntacticType test_212_sub = parse("(any & any)");
		@Test public void test_212() { testValid(test_212_sup,test_212_sub); }

		private static final SyntacticType test_213_sup = parse("(int | any)");
		private static final SyntacticType test_213_sub = parse("(int & any)");
		@Test public void test_213() { testValid(test_213_sup,test_213_sub); }

		private static final SyntacticType test_214_sup = parse("(int | any)");
		private static final SyntacticType test_214_sub = parse("(any & int)");
		@Test public void test_214() { testValid(test_214_sup,test_214_sub); }

		private static final SyntacticType test_215_sup = parse("(int | any)");
		private static final SyntacticType test_215_sub = parse("(int & int)");
		@Test public void test_215() { testValid(test_215_sup,test_215_sub); }

		private static final SyntacticType test_216_sup = parse("(any | int)");
		private static final SyntacticType test_216_sub = parse("any");
		@Test public void test_216() { testValid(test_216_sup,test_216_sub); }

		private static final SyntacticType test_217_sup = parse("(any | int)");
		private static final SyntacticType test_217_sub = parse("int");
		@Test public void test_217() { testValid(test_217_sup,test_217_sub); }

		private static final SyntacticType test_218_sup = parse("(any | int)");
		private static final SyntacticType test_218_sub = parse("{any}");
		@Test public void test_218() { testValid(test_218_sup,test_218_sub); }

		private static final SyntacticType test_219_sup = parse("(any | int)");
		private static final SyntacticType test_219_sub = parse("{int}");
		@Test public void test_219() { testValid(test_219_sup,test_219_sub); }

		private static final SyntacticType test_220_sup = parse("(any | int)");
		private static final SyntacticType test_220_sub = parse("!any");
		@Test public void test_220() { testValid(test_220_sup,test_220_sub); }

		private static final SyntacticType test_221_sup = parse("(any | int)");
		private static final SyntacticType test_221_sub = parse("!int");
		@Test public void test_221() { testValid(test_221_sup,test_221_sub); }

		private static final SyntacticType test_222_sup = parse("(any | int)");
		private static final SyntacticType test_222_sub = parse("{any, any}");
		@Test public void test_222() { testValid(test_222_sup,test_222_sub); }

		private static final SyntacticType test_223_sup = parse("(any | int)");
		private static final SyntacticType test_223_sub = parse("{int, any}");
		@Test public void test_223() { testValid(test_223_sup,test_223_sub); }

		private static final SyntacticType test_224_sup = parse("(any | int)");
		private static final SyntacticType test_224_sub = parse("{any, int}");
		@Test public void test_224() { testValid(test_224_sup,test_224_sub); }

		private static final SyntacticType test_225_sup = parse("(any | int)");
		private static final SyntacticType test_225_sub = parse("{int, int}");
		@Test public void test_225() { testValid(test_225_sup,test_225_sub); }

		private static final SyntacticType test_226_sup = parse("(any | int)");
		private static final SyntacticType test_226_sub = parse("(any | any)");
		@Test public void test_226() { testValid(test_226_sup,test_226_sub); }

		private static final SyntacticType test_227_sup = parse("(any | int)");
		private static final SyntacticType test_227_sub = parse("(int | any)");
		@Test public void test_227() { testValid(test_227_sup,test_227_sub); }

		private static final SyntacticType test_228_sup = parse("(any | int)");
		private static final SyntacticType test_228_sub = parse("(any | int)");
		@Test public void test_228() { testValid(test_228_sup,test_228_sub); }

		private static final SyntacticType test_229_sup = parse("(any | int)");
		private static final SyntacticType test_229_sub = parse("(int | int)");
		@Test public void test_229() { testValid(test_229_sup,test_229_sub); }

		private static final SyntacticType test_230_sup = parse("(any | int)");
		private static final SyntacticType test_230_sub = parse("(any & any)");
		@Test public void test_230() { testValid(test_230_sup,test_230_sub); }

		private static final SyntacticType test_231_sup = parse("(any | int)");
		private static final SyntacticType test_231_sub = parse("(int & any)");
		@Test public void test_231() { testValid(test_231_sup,test_231_sub); }

		private static final SyntacticType test_232_sup = parse("(any | int)");
		private static final SyntacticType test_232_sub = parse("(any & int)");
		@Test public void test_232() { testValid(test_232_sup,test_232_sub); }

		private static final SyntacticType test_233_sup = parse("(any | int)");
		private static final SyntacticType test_233_sub = parse("(int & int)");
		@Test public void test_233() { testValid(test_233_sup,test_233_sub); }

		private static final SyntacticType test_234_sup = parse("(int | int)");
		private static final SyntacticType test_234_sub = parse("any");
		@Test public void test_234() { testInvalid(test_234_sup,test_234_sub); }

		private static final SyntacticType test_235_sup = parse("(int | int)");
		private static final SyntacticType test_235_sub = parse("int");
		@Test public void test_235() { testValid(test_235_sup,test_235_sub); }

		private static final SyntacticType test_236_sup = parse("(int | int)");
		private static final SyntacticType test_236_sub = parse("{any}");
		@Test public void test_236() { testInvalid(test_236_sup,test_236_sub); }

		private static final SyntacticType test_237_sup = parse("(int | int)");
		private static final SyntacticType test_237_sub = parse("{int}");
		@Test public void test_237() { testInvalid(test_237_sup,test_237_sub); }

		private static final SyntacticType test_238_sup = parse("(int | int)");
		private static final SyntacticType test_238_sub = parse("!any");
		@Test public void test_238() { testValid(test_238_sup,test_238_sub); }

		private static final SyntacticType test_239_sup = parse("(int | int)");
		private static final SyntacticType test_239_sub = parse("!int");
		@Test public void test_239() { testInvalid(test_239_sup,test_239_sub); }

		private static final SyntacticType test_240_sup = parse("(int | int)");
		private static final SyntacticType test_240_sub = parse("{any, any}");
		@Test public void test_240() { testInvalid(test_240_sup,test_240_sub); }

		private static final SyntacticType test_241_sup = parse("(int | int)");
		private static final SyntacticType test_241_sub = parse("{int, any}");
		@Test public void test_241() { testInvalid(test_241_sup,test_241_sub); }

		private static final SyntacticType test_242_sup = parse("(int | int)");
		private static final SyntacticType test_242_sub = parse("{any, int}");
		@Test public void test_242() { testInvalid(test_242_sup,test_242_sub); }

		private static final SyntacticType test_243_sup = parse("(int | int)");
		private static final SyntacticType test_243_sub = parse("{int, int}");
		@Test public void test_243() { testInvalid(test_243_sup,test_243_sub); }

		private static final SyntacticType test_244_sup = parse("(int | int)");
		private static final SyntacticType test_244_sub = parse("(any | any)");
		@Test public void test_244() { testInvalid(test_244_sup,test_244_sub); }

		private static final SyntacticType test_245_sup = parse("(int | int)");
		private static final SyntacticType test_245_sub = parse("(int | any)");
		@Test public void test_245() { testInvalid(test_245_sup,test_245_sub); }

		private static final SyntacticType test_246_sup = parse("(int | int)");
		private static final SyntacticType test_246_sub = parse("(any | int)");
		@Test public void test_246() { testInvalid(test_246_sup,test_246_sub); }

		private static final SyntacticType test_247_sup = parse("(int | int)");
		private static final SyntacticType test_247_sub = parse("(int | int)");
		@Test public void test_247() { testValid(test_247_sup,test_247_sub); }

		private static final SyntacticType test_248_sup = parse("(int | int)");
		private static final SyntacticType test_248_sub = parse("(any & any)");
		@Test public void test_248() { testInvalid(test_248_sup,test_248_sub); }

		private static final SyntacticType test_249_sup = parse("(int | int)");
		private static final SyntacticType test_249_sub = parse("(int & any)");
		@Test public void test_249() { testValid(test_249_sup,test_249_sub); }

		private static final SyntacticType test_250_sup = parse("(int | int)");
		private static final SyntacticType test_250_sub = parse("(any & int)");
		@Test public void test_250() { testValid(test_250_sup,test_250_sub); }

		private static final SyntacticType test_251_sup = parse("(int | int)");
		private static final SyntacticType test_251_sub = parse("(int & int)");
		@Test public void test_251() { testValid(test_251_sup,test_251_sub); }

		private static final SyntacticType test_252_sup = parse("(any & any)");
		private static final SyntacticType test_252_sub = parse("any");
		@Test public void test_252() { testValid(test_252_sup,test_252_sub); }

		private static final SyntacticType test_253_sup = parse("(any & any)");
		private static final SyntacticType test_253_sub = parse("int");
		@Test public void test_253() { testValid(test_253_sup,test_253_sub); }

		private static final SyntacticType test_254_sup = parse("(any & any)");
		private static final SyntacticType test_254_sub = parse("{any}");
		@Test public void test_254() { testValid(test_254_sup,test_254_sub); }

		private static final SyntacticType test_255_sup = parse("(any & any)");
		private static final SyntacticType test_255_sub = parse("{int}");
		@Test public void test_255() { testValid(test_255_sup,test_255_sub); }

		private static final SyntacticType test_256_sup = parse("(any & any)");
		private static final SyntacticType test_256_sub = parse("!any");
		@Test public void test_256() { testValid(test_256_sup,test_256_sub); }

		private static final SyntacticType test_257_sup = parse("(any & any)");
		private static final SyntacticType test_257_sub = parse("!int");
		@Test public void test_257() { testValid(test_257_sup,test_257_sub); }

		private static final SyntacticType test_258_sup = parse("(any & any)");
		private static final SyntacticType test_258_sub = parse("{any, any}");
		@Test public void test_258() { testValid(test_258_sup,test_258_sub); }

		private static final SyntacticType test_259_sup = parse("(any & any)");
		private static final SyntacticType test_259_sub = parse("{int, any}");
		@Test public void test_259() { testValid(test_259_sup,test_259_sub); }

		private static final SyntacticType test_260_sup = parse("(any & any)");
		private static final SyntacticType test_260_sub = parse("{any, int}");
		@Test public void test_260() { testValid(test_260_sup,test_260_sub); }

		private static final SyntacticType test_261_sup = parse("(any & any)");
		private static final SyntacticType test_261_sub = parse("{int, int}");
		@Test public void test_261() { testValid(test_261_sup,test_261_sub); }

		private static final SyntacticType test_262_sup = parse("(any & any)");
		private static final SyntacticType test_262_sub = parse("(any | any)");
		@Test public void test_262() { testValid(test_262_sup,test_262_sub); }

		private static final SyntacticType test_263_sup = parse("(any & any)");
		private static final SyntacticType test_263_sub = parse("(int | any)");
		@Test public void test_263() { testValid(test_263_sup,test_263_sub); }

		private static final SyntacticType test_264_sup = parse("(any & any)");
		private static final SyntacticType test_264_sub = parse("(any | int)");
		@Test public void test_264() { testValid(test_264_sup,test_264_sub); }

		private static final SyntacticType test_265_sup = parse("(any & any)");
		private static final SyntacticType test_265_sub = parse("(int | int)");
		@Test public void test_265() { testValid(test_265_sup,test_265_sub); }

		private static final SyntacticType test_266_sup = parse("(any & any)");
		private static final SyntacticType test_266_sub = parse("(any & any)");
		@Test public void test_266() { testValid(test_266_sup,test_266_sub); }

		private static final SyntacticType test_267_sup = parse("(any & any)");
		private static final SyntacticType test_267_sub = parse("(int & any)");
		@Test public void test_267() { testValid(test_267_sup,test_267_sub); }

		private static final SyntacticType test_268_sup = parse("(any & any)");
		private static final SyntacticType test_268_sub = parse("(any & int)");
		@Test public void test_268() { testValid(test_268_sup,test_268_sub); }

		private static final SyntacticType test_269_sup = parse("(any & any)");
		private static final SyntacticType test_269_sub = parse("(int & int)");
		@Test public void test_269() { testValid(test_269_sup,test_269_sub); }

		private static final SyntacticType test_270_sup = parse("(int & any)");
		private static final SyntacticType test_270_sub = parse("any");
		@Test public void test_270() { testInvalid(test_270_sup,test_270_sub); }

		private static final SyntacticType test_271_sup = parse("(int & any)");
		private static final SyntacticType test_271_sub = parse("int");
		@Test public void test_271() { testValid(test_271_sup,test_271_sub); }

		private static final SyntacticType test_272_sup = parse("(int & any)");
		private static final SyntacticType test_272_sub = parse("{any}");
		@Test public void test_272() { testInvalid(test_272_sup,test_272_sub); }

		private static final SyntacticType test_273_sup = parse("(int & any)");
		private static final SyntacticType test_273_sub = parse("{int}");
		@Test public void test_273() { testInvalid(test_273_sup,test_273_sub); }

		private static final SyntacticType test_274_sup = parse("(int & any)");
		private static final SyntacticType test_274_sub = parse("!any");
		@Test public void test_274() { testValid(test_274_sup,test_274_sub); }

		private static final SyntacticType test_275_sup = parse("(int & any)");
		private static final SyntacticType test_275_sub = parse("!int");
		@Test public void test_275() { testInvalid(test_275_sup,test_275_sub); }

		private static final SyntacticType test_276_sup = parse("(int & any)");
		private static final SyntacticType test_276_sub = parse("{any, any}");
		@Test public void test_276() { testInvalid(test_276_sup,test_276_sub); }

		private static final SyntacticType test_277_sup = parse("(int & any)");
		private static final SyntacticType test_277_sub = parse("{int, any}");
		@Test public void test_277() { testInvalid(test_277_sup,test_277_sub); }

		private static final SyntacticType test_278_sup = parse("(int & any)");
		private static final SyntacticType test_278_sub = parse("{any, int}");
		@Test public void test_278() { testInvalid(test_278_sup,test_278_sub); }

		private static final SyntacticType test_279_sup = parse("(int & any)");
		private static final SyntacticType test_279_sub = parse("{int, int}");
		@Test public void test_279() { testInvalid(test_279_sup,test_279_sub); }

		private static final SyntacticType test_280_sup = parse("(int & any)");
		private static final SyntacticType test_280_sub = parse("(any | any)");
		@Test public void test_280() { testInvalid(test_280_sup,test_280_sub); }

		private static final SyntacticType test_281_sup = parse("(int & any)");
		private static final SyntacticType test_281_sub = parse("(int | any)");
		@Test public void test_281() { testInvalid(test_281_sup,test_281_sub); }

		private static final SyntacticType test_282_sup = parse("(int & any)");
		private static final SyntacticType test_282_sub = parse("(any | int)");
		@Test public void test_282() { testInvalid(test_282_sup,test_282_sub); }

		private static final SyntacticType test_283_sup = parse("(int & any)");
		private static final SyntacticType test_283_sub = parse("(int | int)");
		@Test public void test_283() { testValid(test_283_sup,test_283_sub); }

		private static final SyntacticType test_284_sup = parse("(int & any)");
		private static final SyntacticType test_284_sub = parse("(any & any)");
		@Test public void test_284() { testInvalid(test_284_sup,test_284_sub); }

		private static final SyntacticType test_285_sup = parse("(int & any)");
		private static final SyntacticType test_285_sub = parse("(int & any)");
		@Test public void test_285() { testValid(test_285_sup,test_285_sub); }

		private static final SyntacticType test_286_sup = parse("(int & any)");
		private static final SyntacticType test_286_sub = parse("(any & int)");
		@Test public void test_286() { testValid(test_286_sup,test_286_sub); }

		private static final SyntacticType test_287_sup = parse("(int & any)");
		private static final SyntacticType test_287_sub = parse("(int & int)");
		@Test public void test_287() { testValid(test_287_sup,test_287_sub); }

		private static final SyntacticType test_288_sup = parse("(any & int)");
		private static final SyntacticType test_288_sub = parse("any");
		@Test public void test_288() { testInvalid(test_288_sup,test_288_sub); }

		private static final SyntacticType test_289_sup = parse("(any & int)");
		private static final SyntacticType test_289_sub = parse("int");
		@Test public void test_289() { testValid(test_289_sup,test_289_sub); }

		private static final SyntacticType test_290_sup = parse("(any & int)");
		private static final SyntacticType test_290_sub = parse("{any}");
		@Test public void test_290() { testInvalid(test_290_sup,test_290_sub); }

		private static final SyntacticType test_291_sup = parse("(any & int)");
		private static final SyntacticType test_291_sub = parse("{int}");
		@Test public void test_291() { testInvalid(test_291_sup,test_291_sub); }

		private static final SyntacticType test_292_sup = parse("(any & int)");
		private static final SyntacticType test_292_sub = parse("!any");
		@Test public void test_292() { testValid(test_292_sup,test_292_sub); }

		private static final SyntacticType test_293_sup = parse("(any & int)");
		private static final SyntacticType test_293_sub = parse("!int");
		@Test public void test_293() { testInvalid(test_293_sup,test_293_sub); }

		private static final SyntacticType test_294_sup = parse("(any & int)");
		private static final SyntacticType test_294_sub = parse("{any, any}");
		@Test public void test_294() { testInvalid(test_294_sup,test_294_sub); }

		private static final SyntacticType test_295_sup = parse("(any & int)");
		private static final SyntacticType test_295_sub = parse("{int, any}");
		@Test public void test_295() { testInvalid(test_295_sup,test_295_sub); }

		private static final SyntacticType test_296_sup = parse("(any & int)");
		private static final SyntacticType test_296_sub = parse("{any, int}");
		@Test public void test_296() { testInvalid(test_296_sup,test_296_sub); }

		private static final SyntacticType test_297_sup = parse("(any & int)");
		private static final SyntacticType test_297_sub = parse("{int, int}");
		@Test public void test_297() { testInvalid(test_297_sup,test_297_sub); }

		private static final SyntacticType test_298_sup = parse("(any & int)");
		private static final SyntacticType test_298_sub = parse("(any | any)");
		@Test public void test_298() { testInvalid(test_298_sup,test_298_sub); }

		private static final SyntacticType test_299_sup = parse("(any & int)");
		private static final SyntacticType test_299_sub = parse("(int | any)");
		@Test public void test_299() { testInvalid(test_299_sup,test_299_sub); }

		private static final SyntacticType test_300_sup = parse("(any & int)");
		private static final SyntacticType test_300_sub = parse("(any | int)");
		@Test public void test_300() { testInvalid(test_300_sup,test_300_sub); }

		private static final SyntacticType test_301_sup = parse("(any & int)");
		private static final SyntacticType test_301_sub = parse("(int | int)");
		@Test public void test_301() { testValid(test_301_sup,test_301_sub); }

		private static final SyntacticType test_302_sup = parse("(any & int)");
		private static final SyntacticType test_302_sub = parse("(any & any)");
		@Test public void test_302() { testInvalid(test_302_sup,test_302_sub); }

		private static final SyntacticType test_303_sup = parse("(any & int)");
		private static final SyntacticType test_303_sub = parse("(int & any)");
		@Test public void test_303() { testValid(test_303_sup,test_303_sub); }

		private static final SyntacticType test_304_sup = parse("(any & int)");
		private static final SyntacticType test_304_sub = parse("(any & int)");
		@Test public void test_304() { testValid(test_304_sup,test_304_sub); }

		private static final SyntacticType test_305_sup = parse("(any & int)");
		private static final SyntacticType test_305_sub = parse("(int & int)");
		@Test public void test_305() { testValid(test_305_sup,test_305_sub); }

		private static final SyntacticType test_306_sup = parse("(int & int)");
		private static final SyntacticType test_306_sub = parse("any");
		@Test public void test_306() { testInvalid(test_306_sup,test_306_sub); }

		private static final SyntacticType test_307_sup = parse("(int & int)");
		private static final SyntacticType test_307_sub = parse("int");
		@Test public void test_307() { testValid(test_307_sup,test_307_sub); }

		private static final SyntacticType test_308_sup = parse("(int & int)");
		private static final SyntacticType test_308_sub = parse("{any}");
		@Test public void test_308() { testInvalid(test_308_sup,test_308_sub); }

		private static final SyntacticType test_309_sup = parse("(int & int)");
		private static final SyntacticType test_309_sub = parse("{int}");
		@Test public void test_309() { testInvalid(test_309_sup,test_309_sub); }

		private static final SyntacticType test_310_sup = parse("(int & int)");
		private static final SyntacticType test_310_sub = parse("!any");
		@Test public void test_310() { testValid(test_310_sup,test_310_sub); }

		private static final SyntacticType test_311_sup = parse("(int & int)");
		private static final SyntacticType test_311_sub = parse("!int");
		@Test public void test_311() { testInvalid(test_311_sup,test_311_sub); }

		private static final SyntacticType test_312_sup = parse("(int & int)");
		private static final SyntacticType test_312_sub = parse("{any, any}");
		@Test public void test_312() { testInvalid(test_312_sup,test_312_sub); }

		private static final SyntacticType test_313_sup = parse("(int & int)");
		private static final SyntacticType test_313_sub = parse("{int, any}");
		@Test public void test_313() { testInvalid(test_313_sup,test_313_sub); }

		private static final SyntacticType test_314_sup = parse("(int & int)");
		private static final SyntacticType test_314_sub = parse("{any, int}");
		@Test public void test_314() { testInvalid(test_314_sup,test_314_sub); }

		private static final SyntacticType test_315_sup = parse("(int & int)");
		private static final SyntacticType test_315_sub = parse("{int, int}");
		@Test public void test_315() { testInvalid(test_315_sup,test_315_sub); }

		private static final SyntacticType test_316_sup = parse("(int & int)");
		private static final SyntacticType test_316_sub = parse("(any | any)");
		@Test public void test_316() { testInvalid(test_316_sup,test_316_sub); }

		private static final SyntacticType test_317_sup = parse("(int & int)");
		private static final SyntacticType test_317_sub = parse("(int | any)");
		@Test public void test_317() { testInvalid(test_317_sup,test_317_sub); }

		private static final SyntacticType test_318_sup = parse("(int & int)");
		private static final SyntacticType test_318_sub = parse("(any | int)");
		@Test public void test_318() { testInvalid(test_318_sup,test_318_sub); }

		private static final SyntacticType test_319_sup = parse("(int & int)");
		private static final SyntacticType test_319_sub = parse("(int | int)");
		@Test public void test_319() { testValid(test_319_sup,test_319_sub); }

		private static final SyntacticType test_320_sup = parse("(int & int)");
		private static final SyntacticType test_320_sub = parse("(any & any)");
		@Test public void test_320() { testInvalid(test_320_sup,test_320_sub); }

		private static final SyntacticType test_321_sup = parse("(int & int)");
		private static final SyntacticType test_321_sub = parse("(int & any)");
		@Test public void test_321() { testValid(test_321_sup,test_321_sub); }

		private static final SyntacticType test_322_sup = parse("(int & int)");
		private static final SyntacticType test_322_sub = parse("(any & int)");
		@Test public void test_322() { testValid(test_322_sup,test_322_sub); }

		private static final SyntacticType test_323_sup = parse("(int & int)");
		private static final SyntacticType test_323_sub = parse("(int & int)");
		@Test public void test_323() { testValid(test_323_sup,test_323_sub); }

	}
}
