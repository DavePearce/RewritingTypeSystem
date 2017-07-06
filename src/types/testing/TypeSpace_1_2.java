package types.testing;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import types.testing.AbstractTestSuite;
import types.core.RewritingSubtypeQuery;
import types.core.SyntacticType;
import types.core.WhileySubtypeQuery;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TypeSpace_1_2 extends AbstractTestSuite {
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
		private static final SyntacticType test_10_sub = parse("{any, any}");
		@Test public void test_10() { testValid(test_10_sup,test_10_sub); }

		private static final SyntacticType test_11_sup = parse("any");
		private static final SyntacticType test_11_sub = parse("{int, any}");
		@Test public void test_11() { testValid(test_11_sup,test_11_sub); }

		private static final SyntacticType test_12_sup = parse("any");
		private static final SyntacticType test_12_sub = parse("{any, int}");
		@Test public void test_12() { testValid(test_12_sup,test_12_sub); }

		private static final SyntacticType test_13_sup = parse("any");
		private static final SyntacticType test_13_sub = parse("{int, int}");
		@Test public void test_13() { testValid(test_13_sup,test_13_sub); }

		private static final SyntacticType test_14_sup = parse("any");
		private static final SyntacticType test_14_sub = parse("(any | any)");
		@Test public void test_14() { testValid(test_14_sup,test_14_sub); }

		private static final SyntacticType test_15_sup = parse("any");
		private static final SyntacticType test_15_sub = parse("(int | any)");
		@Test public void test_15() { testValid(test_15_sup,test_15_sub); }

		private static final SyntacticType test_16_sup = parse("any");
		private static final SyntacticType test_16_sub = parse("(any | int)");
		@Test public void test_16() { testValid(test_16_sup,test_16_sub); }

		private static final SyntacticType test_17_sup = parse("any");
		private static final SyntacticType test_17_sub = parse("(int | int)");
		@Test public void test_17() { testValid(test_17_sup,test_17_sub); }

		private static final SyntacticType test_18_sup = parse("any");
		private static final SyntacticType test_18_sub = parse("(any | any)");
		@Test public void test_18() { testValid(test_18_sup,test_18_sub); }

		private static final SyntacticType test_19_sup = parse("any");
		private static final SyntacticType test_19_sub = parse("(int | any)");
		@Test public void test_19() { testValid(test_19_sup,test_19_sub); }

		private static final SyntacticType test_20_sup = parse("any");
		private static final SyntacticType test_20_sub = parse("(any | int)");
		@Test public void test_20() { testValid(test_20_sup,test_20_sub); }

		private static final SyntacticType test_21_sup = parse("any");
		private static final SyntacticType test_21_sub = parse("(int | int)");
		@Test public void test_21() { testValid(test_21_sup,test_21_sub); }

		private static final SyntacticType test_22_sup = parse("any");
		private static final SyntacticType test_22_sub = parse("(any & any)");
		@Test public void test_22() { testValid(test_22_sup,test_22_sub); }

		private static final SyntacticType test_23_sup = parse("any");
		private static final SyntacticType test_23_sub = parse("(int & any)");
		@Test public void test_23() { testValid(test_23_sup,test_23_sub); }

		private static final SyntacticType test_24_sup = parse("any");
		private static final SyntacticType test_24_sub = parse("(any & int)");
		@Test public void test_24() { testValid(test_24_sup,test_24_sub); }

		private static final SyntacticType test_25_sup = parse("any");
		private static final SyntacticType test_25_sub = parse("(int & int)");
		@Test public void test_25() { testValid(test_25_sup,test_25_sub); }

		private static final SyntacticType test_26_sup = parse("any");
		private static final SyntacticType test_26_sub = parse("(any & any)");
		@Test public void test_26() { testValid(test_26_sup,test_26_sub); }

		private static final SyntacticType test_27_sup = parse("any");
		private static final SyntacticType test_27_sub = parse("(int & any)");
		@Test public void test_27() { testValid(test_27_sup,test_27_sub); }

		private static final SyntacticType test_28_sup = parse("any");
		private static final SyntacticType test_28_sub = parse("(any & int)");
		@Test public void test_28() { testValid(test_28_sup,test_28_sub); }

		private static final SyntacticType test_29_sup = parse("any");
		private static final SyntacticType test_29_sub = parse("(int & int)");
		@Test public void test_29() { testValid(test_29_sup,test_29_sub); }

		private static final SyntacticType test_30_sup = parse("int");
		private static final SyntacticType test_30_sub = parse("any");
		@Test public void test_30() { testInvalid(test_30_sup,test_30_sub); }

		private static final SyntacticType test_31_sup = parse("int");
		private static final SyntacticType test_31_sub = parse("int");
		@Test public void test_31() { testValid(test_31_sup,test_31_sub); }

		private static final SyntacticType test_32_sup = parse("int");
		private static final SyntacticType test_32_sub = parse("{any}");
		@Test public void test_32() { testInvalid(test_32_sup,test_32_sub); }

		private static final SyntacticType test_33_sup = parse("int");
		private static final SyntacticType test_33_sub = parse("{int}");
		@Test public void test_33() { testInvalid(test_33_sup,test_33_sub); }

		private static final SyntacticType test_34_sup = parse("int");
		private static final SyntacticType test_34_sub = parse("!any");
		@Test public void test_34() { testValid(test_34_sup,test_34_sub); }

		private static final SyntacticType test_35_sup = parse("int");
		private static final SyntacticType test_35_sub = parse("!int");
		@Test public void test_35() { testInvalid(test_35_sup,test_35_sub); }

		private static final SyntacticType test_36_sup = parse("int");
		private static final SyntacticType test_36_sub = parse("{any, any}");
		@Test public void test_36() { testInvalid(test_36_sup,test_36_sub); }

		private static final SyntacticType test_37_sup = parse("int");
		private static final SyntacticType test_37_sub = parse("{int, any}");
		@Test public void test_37() { testInvalid(test_37_sup,test_37_sub); }

		private static final SyntacticType test_38_sup = parse("int");
		private static final SyntacticType test_38_sub = parse("{any, int}");
		@Test public void test_38() { testInvalid(test_38_sup,test_38_sub); }

		private static final SyntacticType test_39_sup = parse("int");
		private static final SyntacticType test_39_sub = parse("{int, int}");
		@Test public void test_39() { testInvalid(test_39_sup,test_39_sub); }

		private static final SyntacticType test_40_sup = parse("int");
		private static final SyntacticType test_40_sub = parse("{any, any}");
		@Test public void test_40() { testInvalid(test_40_sup,test_40_sub); }

		private static final SyntacticType test_41_sup = parse("int");
		private static final SyntacticType test_41_sub = parse("{int, any}");
		@Test public void test_41() { testInvalid(test_41_sup,test_41_sub); }

		private static final SyntacticType test_42_sup = parse("int");
		private static final SyntacticType test_42_sub = parse("{any, int}");
		@Test public void test_42() { testInvalid(test_42_sup,test_42_sub); }

		private static final SyntacticType test_43_sup = parse("int");
		private static final SyntacticType test_43_sub = parse("{int, int}");
		@Test public void test_43() { testInvalid(test_43_sup,test_43_sub); }

		private static final SyntacticType test_44_sup = parse("int");
		private static final SyntacticType test_44_sub = parse("(any | any)");
		@Test public void test_44() { testInvalid(test_44_sup,test_44_sub); }

		private static final SyntacticType test_45_sup = parse("int");
		private static final SyntacticType test_45_sub = parse("(int | any)");
		@Test public void test_45() { testInvalid(test_45_sup,test_45_sub); }

		private static final SyntacticType test_46_sup = parse("int");
		private static final SyntacticType test_46_sub = parse("(any | int)");
		@Test public void test_46() { testInvalid(test_46_sup,test_46_sub); }

		private static final SyntacticType test_47_sup = parse("int");
		private static final SyntacticType test_47_sub = parse("(int | int)");
		@Test public void test_47() { testValid(test_47_sup,test_47_sub); }

		private static final SyntacticType test_48_sup = parse("int");
		private static final SyntacticType test_48_sub = parse("(any | any)");
		@Test public void test_48() { testInvalid(test_48_sup,test_48_sub); }

		private static final SyntacticType test_49_sup = parse("int");
		private static final SyntacticType test_49_sub = parse("(int | any)");
		@Test public void test_49() { testInvalid(test_49_sup,test_49_sub); }

		private static final SyntacticType test_50_sup = parse("int");
		private static final SyntacticType test_50_sub = parse("(any | int)");
		@Test public void test_50() { testInvalid(test_50_sup,test_50_sub); }

		private static final SyntacticType test_51_sup = parse("int");
		private static final SyntacticType test_51_sub = parse("(int | int)");
		@Test public void test_51() { testValid(test_51_sup,test_51_sub); }

		private static final SyntacticType test_52_sup = parse("int");
		private static final SyntacticType test_52_sub = parse("(any & any)");
		@Test public void test_52() { testInvalid(test_52_sup,test_52_sub); }

		private static final SyntacticType test_53_sup = parse("int");
		private static final SyntacticType test_53_sub = parse("(int & any)");
		@Test public void test_53() { testValid(test_53_sup,test_53_sub); }

		private static final SyntacticType test_54_sup = parse("int");
		private static final SyntacticType test_54_sub = parse("(any & int)");
		@Test public void test_54() { testValid(test_54_sup,test_54_sub); }

		private static final SyntacticType test_55_sup = parse("int");
		private static final SyntacticType test_55_sub = parse("(int & int)");
		@Test public void test_55() { testValid(test_55_sup,test_55_sub); }

		private static final SyntacticType test_56_sup = parse("int");
		private static final SyntacticType test_56_sub = parse("(any & any)");
		@Test public void test_56() { testInvalid(test_56_sup,test_56_sub); }

		private static final SyntacticType test_57_sup = parse("int");
		private static final SyntacticType test_57_sub = parse("(int & any)");
		@Test public void test_57() { testValid(test_57_sup,test_57_sub); }

		private static final SyntacticType test_58_sup = parse("int");
		private static final SyntacticType test_58_sub = parse("(any & int)");
		@Test public void test_58() { testValid(test_58_sup,test_58_sub); }

		private static final SyntacticType test_59_sup = parse("int");
		private static final SyntacticType test_59_sub = parse("(int & int)");
		@Test public void test_59() { testValid(test_59_sup,test_59_sub); }

		private static final SyntacticType test_60_sup = parse("{any}");
		private static final SyntacticType test_60_sub = parse("any");
		@Test public void test_60() { testInvalid(test_60_sup,test_60_sub); }

		private static final SyntacticType test_61_sup = parse("{any}");
		private static final SyntacticType test_61_sub = parse("int");
		@Test public void test_61() { testInvalid(test_61_sup,test_61_sub); }

		private static final SyntacticType test_62_sup = parse("{any}");
		private static final SyntacticType test_62_sub = parse("{any}");
		@Test public void test_62() { testValid(test_62_sup,test_62_sub); }

		private static final SyntacticType test_63_sup = parse("{any}");
		private static final SyntacticType test_63_sub = parse("{int}");
		@Test public void test_63() { testValid(test_63_sup,test_63_sub); }

		private static final SyntacticType test_64_sup = parse("{any}");
		private static final SyntacticType test_64_sub = parse("!any");
		@Test public void test_64() { testValid(test_64_sup,test_64_sub); }

		private static final SyntacticType test_65_sup = parse("{any}");
		private static final SyntacticType test_65_sub = parse("!int");
		@Test public void test_65() { testInvalid(test_65_sup,test_65_sub); }

		private static final SyntacticType test_66_sup = parse("{any}");
		private static final SyntacticType test_66_sub = parse("{any, any}");
		@Test public void test_66() { testInvalid(test_66_sup,test_66_sub); }

		private static final SyntacticType test_67_sup = parse("{any}");
		private static final SyntacticType test_67_sub = parse("{int, any}");
		@Test public void test_67() { testInvalid(test_67_sup,test_67_sub); }

		private static final SyntacticType test_68_sup = parse("{any}");
		private static final SyntacticType test_68_sub = parse("{any, int}");
		@Test public void test_68() { testInvalid(test_68_sup,test_68_sub); }

		private static final SyntacticType test_69_sup = parse("{any}");
		private static final SyntacticType test_69_sub = parse("{int, int}");
		@Test public void test_69() { testInvalid(test_69_sup,test_69_sub); }

		private static final SyntacticType test_70_sup = parse("{any}");
		private static final SyntacticType test_70_sub = parse("{any, any}");
		@Test public void test_70() { testInvalid(test_70_sup,test_70_sub); }

		private static final SyntacticType test_71_sup = parse("{any}");
		private static final SyntacticType test_71_sub = parse("{int, any}");
		@Test public void test_71() { testInvalid(test_71_sup,test_71_sub); }

		private static final SyntacticType test_72_sup = parse("{any}");
		private static final SyntacticType test_72_sub = parse("{any, int}");
		@Test public void test_72() { testInvalid(test_72_sup,test_72_sub); }

		private static final SyntacticType test_73_sup = parse("{any}");
		private static final SyntacticType test_73_sub = parse("{int, int}");
		@Test public void test_73() { testInvalid(test_73_sup,test_73_sub); }

		private static final SyntacticType test_74_sup = parse("{any}");
		private static final SyntacticType test_74_sub = parse("(any | any)");
		@Test public void test_74() { testInvalid(test_74_sup,test_74_sub); }

		private static final SyntacticType test_75_sup = parse("{any}");
		private static final SyntacticType test_75_sub = parse("(int | any)");
		@Test public void test_75() { testInvalid(test_75_sup,test_75_sub); }

		private static final SyntacticType test_76_sup = parse("{any}");
		private static final SyntacticType test_76_sub = parse("(any | int)");
		@Test public void test_76() { testInvalid(test_76_sup,test_76_sub); }

		private static final SyntacticType test_77_sup = parse("{any}");
		private static final SyntacticType test_77_sub = parse("(int | int)");
		@Test public void test_77() { testInvalid(test_77_sup,test_77_sub); }

		private static final SyntacticType test_78_sup = parse("{any}");
		private static final SyntacticType test_78_sub = parse("(any | any)");
		@Test public void test_78() { testInvalid(test_78_sup,test_78_sub); }

		private static final SyntacticType test_79_sup = parse("{any}");
		private static final SyntacticType test_79_sub = parse("(int | any)");
		@Test public void test_79() { testInvalid(test_79_sup,test_79_sub); }

		private static final SyntacticType test_80_sup = parse("{any}");
		private static final SyntacticType test_80_sub = parse("(any | int)");
		@Test public void test_80() { testInvalid(test_80_sup,test_80_sub); }

		private static final SyntacticType test_81_sup = parse("{any}");
		private static final SyntacticType test_81_sub = parse("(int | int)");
		@Test public void test_81() { testInvalid(test_81_sup,test_81_sub); }

		private static final SyntacticType test_82_sup = parse("{any}");
		private static final SyntacticType test_82_sub = parse("(any & any)");
		@Test public void test_82() { testInvalid(test_82_sup,test_82_sub); }

		private static final SyntacticType test_83_sup = parse("{any}");
		private static final SyntacticType test_83_sub = parse("(int & any)");
		@Test public void test_83() { testInvalid(test_83_sup,test_83_sub); }

		private static final SyntacticType test_84_sup = parse("{any}");
		private static final SyntacticType test_84_sub = parse("(any & int)");
		@Test public void test_84() { testInvalid(test_84_sup,test_84_sub); }

		private static final SyntacticType test_85_sup = parse("{any}");
		private static final SyntacticType test_85_sub = parse("(int & int)");
		@Test public void test_85() { testInvalid(test_85_sup,test_85_sub); }

		private static final SyntacticType test_86_sup = parse("{any}");
		private static final SyntacticType test_86_sub = parse("(any & any)");
		@Test public void test_86() { testInvalid(test_86_sup,test_86_sub); }

		private static final SyntacticType test_87_sup = parse("{any}");
		private static final SyntacticType test_87_sub = parse("(int & any)");
		@Test public void test_87() { testInvalid(test_87_sup,test_87_sub); }

		private static final SyntacticType test_88_sup = parse("{any}");
		private static final SyntacticType test_88_sub = parse("(any & int)");
		@Test public void test_88() { testInvalid(test_88_sup,test_88_sub); }

		private static final SyntacticType test_89_sup = parse("{any}");
		private static final SyntacticType test_89_sub = parse("(int & int)");
		@Test public void test_89() { testInvalid(test_89_sup,test_89_sub); }

		private static final SyntacticType test_90_sup = parse("{int}");
		private static final SyntacticType test_90_sub = parse("any");
		@Test public void test_90() { testInvalid(test_90_sup,test_90_sub); }

		private static final SyntacticType test_91_sup = parse("{int}");
		private static final SyntacticType test_91_sub = parse("int");
		@Test public void test_91() { testInvalid(test_91_sup,test_91_sub); }

		private static final SyntacticType test_92_sup = parse("{int}");
		private static final SyntacticType test_92_sub = parse("{any}");
		@Test public void test_92() { testInvalid(test_92_sup,test_92_sub); }

		private static final SyntacticType test_93_sup = parse("{int}");
		private static final SyntacticType test_93_sub = parse("{int}");
		@Test public void test_93() { testValid(test_93_sup,test_93_sub); }

		private static final SyntacticType test_94_sup = parse("{int}");
		private static final SyntacticType test_94_sub = parse("!any");
		@Test public void test_94() { testValid(test_94_sup,test_94_sub); }

		private static final SyntacticType test_95_sup = parse("{int}");
		private static final SyntacticType test_95_sub = parse("!int");
		@Test public void test_95() { testInvalid(test_95_sup,test_95_sub); }

		private static final SyntacticType test_96_sup = parse("{int}");
		private static final SyntacticType test_96_sub = parse("{any, any}");
		@Test public void test_96() { testInvalid(test_96_sup,test_96_sub); }

		private static final SyntacticType test_97_sup = parse("{int}");
		private static final SyntacticType test_97_sub = parse("{int, any}");
		@Test public void test_97() { testInvalid(test_97_sup,test_97_sub); }

		private static final SyntacticType test_98_sup = parse("{int}");
		private static final SyntacticType test_98_sub = parse("{any, int}");
		@Test public void test_98() { testInvalid(test_98_sup,test_98_sub); }

		private static final SyntacticType test_99_sup = parse("{int}");
		private static final SyntacticType test_99_sub = parse("{int, int}");
		@Test public void test_99() { testInvalid(test_99_sup,test_99_sub); }

		private static final SyntacticType test_100_sup = parse("{int}");
		private static final SyntacticType test_100_sub = parse("{any, any}");
		@Test public void test_100() { testInvalid(test_100_sup,test_100_sub); }

		private static final SyntacticType test_101_sup = parse("{int}");
		private static final SyntacticType test_101_sub = parse("{int, any}");
		@Test public void test_101() { testInvalid(test_101_sup,test_101_sub); }

		private static final SyntacticType test_102_sup = parse("{int}");
		private static final SyntacticType test_102_sub = parse("{any, int}");
		@Test public void test_102() { testInvalid(test_102_sup,test_102_sub); }

		private static final SyntacticType test_103_sup = parse("{int}");
		private static final SyntacticType test_103_sub = parse("{int, int}");
		@Test public void test_103() { testInvalid(test_103_sup,test_103_sub); }

		private static final SyntacticType test_104_sup = parse("{int}");
		private static final SyntacticType test_104_sub = parse("(any | any)");
		@Test public void test_104() { testInvalid(test_104_sup,test_104_sub); }

		private static final SyntacticType test_105_sup = parse("{int}");
		private static final SyntacticType test_105_sub = parse("(int | any)");
		@Test public void test_105() { testInvalid(test_105_sup,test_105_sub); }

		private static final SyntacticType test_106_sup = parse("{int}");
		private static final SyntacticType test_106_sub = parse("(any | int)");
		@Test public void test_106() { testInvalid(test_106_sup,test_106_sub); }

		private static final SyntacticType test_107_sup = parse("{int}");
		private static final SyntacticType test_107_sub = parse("(int | int)");
		@Test public void test_107() { testInvalid(test_107_sup,test_107_sub); }

		private static final SyntacticType test_108_sup = parse("{int}");
		private static final SyntacticType test_108_sub = parse("(any | any)");
		@Test public void test_108() { testInvalid(test_108_sup,test_108_sub); }

		private static final SyntacticType test_109_sup = parse("{int}");
		private static final SyntacticType test_109_sub = parse("(int | any)");
		@Test public void test_109() { testInvalid(test_109_sup,test_109_sub); }

		private static final SyntacticType test_110_sup = parse("{int}");
		private static final SyntacticType test_110_sub = parse("(any | int)");
		@Test public void test_110() { testInvalid(test_110_sup,test_110_sub); }

		private static final SyntacticType test_111_sup = parse("{int}");
		private static final SyntacticType test_111_sub = parse("(int | int)");
		@Test public void test_111() { testInvalid(test_111_sup,test_111_sub); }

		private static final SyntacticType test_112_sup = parse("{int}");
		private static final SyntacticType test_112_sub = parse("(any & any)");
		@Test public void test_112() { testInvalid(test_112_sup,test_112_sub); }

		private static final SyntacticType test_113_sup = parse("{int}");
		private static final SyntacticType test_113_sub = parse("(int & any)");
		@Test public void test_113() { testInvalid(test_113_sup,test_113_sub); }

		private static final SyntacticType test_114_sup = parse("{int}");
		private static final SyntacticType test_114_sub = parse("(any & int)");
		@Test public void test_114() { testInvalid(test_114_sup,test_114_sub); }

		private static final SyntacticType test_115_sup = parse("{int}");
		private static final SyntacticType test_115_sub = parse("(int & int)");
		@Test public void test_115() { testInvalid(test_115_sup,test_115_sub); }

		private static final SyntacticType test_116_sup = parse("{int}");
		private static final SyntacticType test_116_sub = parse("(any & any)");
		@Test public void test_116() { testInvalid(test_116_sup,test_116_sub); }

		private static final SyntacticType test_117_sup = parse("{int}");
		private static final SyntacticType test_117_sub = parse("(int & any)");
		@Test public void test_117() { testInvalid(test_117_sup,test_117_sub); }

		private static final SyntacticType test_118_sup = parse("{int}");
		private static final SyntacticType test_118_sub = parse("(any & int)");
		@Test public void test_118() { testInvalid(test_118_sup,test_118_sub); }

		private static final SyntacticType test_119_sup = parse("{int}");
		private static final SyntacticType test_119_sub = parse("(int & int)");
		@Test public void test_119() { testInvalid(test_119_sup,test_119_sub); }

		private static final SyntacticType test_120_sup = parse("!any");
		private static final SyntacticType test_120_sub = parse("any");
		@Test public void test_120() { testInvalid(test_120_sup,test_120_sub); }

		private static final SyntacticType test_121_sup = parse("!any");
		private static final SyntacticType test_121_sub = parse("int");
		@Test public void test_121() { testInvalid(test_121_sup,test_121_sub); }

		private static final SyntacticType test_122_sup = parse("!any");
		private static final SyntacticType test_122_sub = parse("{any}");
		@Test public void test_122() { testInvalid(test_122_sup,test_122_sub); }

		private static final SyntacticType test_123_sup = parse("!any");
		private static final SyntacticType test_123_sub = parse("{int}");
		@Test public void test_123() { testInvalid(test_123_sup,test_123_sub); }

		private static final SyntacticType test_124_sup = parse("!any");
		private static final SyntacticType test_124_sub = parse("!any");
		@Test public void test_124() { testValid(test_124_sup,test_124_sub); }

		private static final SyntacticType test_125_sup = parse("!any");
		private static final SyntacticType test_125_sub = parse("!int");
		@Test public void test_125() { testInvalid(test_125_sup,test_125_sub); }

		private static final SyntacticType test_126_sup = parse("!any");
		private static final SyntacticType test_126_sub = parse("{any, any}");
		@Test public void test_126() { testInvalid(test_126_sup,test_126_sub); }

		private static final SyntacticType test_127_sup = parse("!any");
		private static final SyntacticType test_127_sub = parse("{int, any}");
		@Test public void test_127() { testInvalid(test_127_sup,test_127_sub); }

		private static final SyntacticType test_128_sup = parse("!any");
		private static final SyntacticType test_128_sub = parse("{any, int}");
		@Test public void test_128() { testInvalid(test_128_sup,test_128_sub); }

		private static final SyntacticType test_129_sup = parse("!any");
		private static final SyntacticType test_129_sub = parse("{int, int}");
		@Test public void test_129() { testInvalid(test_129_sup,test_129_sub); }

		private static final SyntacticType test_130_sup = parse("!any");
		private static final SyntacticType test_130_sub = parse("{any, any}");
		@Test public void test_130() { testInvalid(test_130_sup,test_130_sub); }

		private static final SyntacticType test_131_sup = parse("!any");
		private static final SyntacticType test_131_sub = parse("{int, any}");
		@Test public void test_131() { testInvalid(test_131_sup,test_131_sub); }

		private static final SyntacticType test_132_sup = parse("!any");
		private static final SyntacticType test_132_sub = parse("{any, int}");
		@Test public void test_132() { testInvalid(test_132_sup,test_132_sub); }

		private static final SyntacticType test_133_sup = parse("!any");
		private static final SyntacticType test_133_sub = parse("{int, int}");
		@Test public void test_133() { testInvalid(test_133_sup,test_133_sub); }

		private static final SyntacticType test_134_sup = parse("!any");
		private static final SyntacticType test_134_sub = parse("(any | any)");
		@Test public void test_134() { testInvalid(test_134_sup,test_134_sub); }

		private static final SyntacticType test_135_sup = parse("!any");
		private static final SyntacticType test_135_sub = parse("(int | any)");
		@Test public void test_135() { testInvalid(test_135_sup,test_135_sub); }

		private static final SyntacticType test_136_sup = parse("!any");
		private static final SyntacticType test_136_sub = parse("(any | int)");
		@Test public void test_136() { testInvalid(test_136_sup,test_136_sub); }

		private static final SyntacticType test_137_sup = parse("!any");
		private static final SyntacticType test_137_sub = parse("(int | int)");
		@Test public void test_137() { testInvalid(test_137_sup,test_137_sub); }

		private static final SyntacticType test_138_sup = parse("!any");
		private static final SyntacticType test_138_sub = parse("(any | any)");
		@Test public void test_138() { testInvalid(test_138_sup,test_138_sub); }

		private static final SyntacticType test_139_sup = parse("!any");
		private static final SyntacticType test_139_sub = parse("(int | any)");
		@Test public void test_139() { testInvalid(test_139_sup,test_139_sub); }

		private static final SyntacticType test_140_sup = parse("!any");
		private static final SyntacticType test_140_sub = parse("(any | int)");
		@Test public void test_140() { testInvalid(test_140_sup,test_140_sub); }

		private static final SyntacticType test_141_sup = parse("!any");
		private static final SyntacticType test_141_sub = parse("(int | int)");
		@Test public void test_141() { testInvalid(test_141_sup,test_141_sub); }

		private static final SyntacticType test_142_sup = parse("!any");
		private static final SyntacticType test_142_sub = parse("(any & any)");
		@Test public void test_142() { testInvalid(test_142_sup,test_142_sub); }

		private static final SyntacticType test_143_sup = parse("!any");
		private static final SyntacticType test_143_sub = parse("(int & any)");
		@Test public void test_143() { testInvalid(test_143_sup,test_143_sub); }

		private static final SyntacticType test_144_sup = parse("!any");
		private static final SyntacticType test_144_sub = parse("(any & int)");
		@Test public void test_144() { testInvalid(test_144_sup,test_144_sub); }

		private static final SyntacticType test_145_sup = parse("!any");
		private static final SyntacticType test_145_sub = parse("(int & int)");
		@Test public void test_145() { testInvalid(test_145_sup,test_145_sub); }

		private static final SyntacticType test_146_sup = parse("!any");
		private static final SyntacticType test_146_sub = parse("(any & any)");
		@Test public void test_146() { testInvalid(test_146_sup,test_146_sub); }

		private static final SyntacticType test_147_sup = parse("!any");
		private static final SyntacticType test_147_sub = parse("(int & any)");
		@Test public void test_147() { testInvalid(test_147_sup,test_147_sub); }

		private static final SyntacticType test_148_sup = parse("!any");
		private static final SyntacticType test_148_sub = parse("(any & int)");
		@Test public void test_148() { testInvalid(test_148_sup,test_148_sub); }

		private static final SyntacticType test_149_sup = parse("!any");
		private static final SyntacticType test_149_sub = parse("(int & int)");
		@Test public void test_149() { testInvalid(test_149_sup,test_149_sub); }

		private static final SyntacticType test_150_sup = parse("!int");
		private static final SyntacticType test_150_sub = parse("any");
		@Test public void test_150() { testInvalid(test_150_sup,test_150_sub); }

		private static final SyntacticType test_151_sup = parse("!int");
		private static final SyntacticType test_151_sub = parse("int");
		@Test public void test_151() { testInvalid(test_151_sup,test_151_sub); }

		private static final SyntacticType test_152_sup = parse("!int");
		private static final SyntacticType test_152_sub = parse("{any}");
		@Test public void test_152() { testValid(test_152_sup,test_152_sub); }

		private static final SyntacticType test_153_sup = parse("!int");
		private static final SyntacticType test_153_sub = parse("{int}");
		@Test public void test_153() { testValid(test_153_sup,test_153_sub); }

		private static final SyntacticType test_154_sup = parse("!int");
		private static final SyntacticType test_154_sub = parse("!any");
		@Test public void test_154() { testValid(test_154_sup,test_154_sub); }

		private static final SyntacticType test_155_sup = parse("!int");
		private static final SyntacticType test_155_sub = parse("!int");
		@Test public void test_155() { testValid(test_155_sup,test_155_sub); }

		private static final SyntacticType test_156_sup = parse("!int");
		private static final SyntacticType test_156_sub = parse("{any, any}");
		@Test public void test_156() { testValid(test_156_sup,test_156_sub); }

		private static final SyntacticType test_157_sup = parse("!int");
		private static final SyntacticType test_157_sub = parse("{int, any}");
		@Test public void test_157() { testValid(test_157_sup,test_157_sub); }

		private static final SyntacticType test_158_sup = parse("!int");
		private static final SyntacticType test_158_sub = parse("{any, int}");
		@Test public void test_158() { testValid(test_158_sup,test_158_sub); }

		private static final SyntacticType test_159_sup = parse("!int");
		private static final SyntacticType test_159_sub = parse("{int, int}");
		@Test public void test_159() { testValid(test_159_sup,test_159_sub); }

		private static final SyntacticType test_160_sup = parse("!int");
		private static final SyntacticType test_160_sub = parse("{any, any}");
		@Test public void test_160() { testValid(test_160_sup,test_160_sub); }

		private static final SyntacticType test_161_sup = parse("!int");
		private static final SyntacticType test_161_sub = parse("{int, any}");
		@Test public void test_161() { testValid(test_161_sup,test_161_sub); }

		private static final SyntacticType test_162_sup = parse("!int");
		private static final SyntacticType test_162_sub = parse("{any, int}");
		@Test public void test_162() { testValid(test_162_sup,test_162_sub); }

		private static final SyntacticType test_163_sup = parse("!int");
		private static final SyntacticType test_163_sub = parse("{int, int}");
		@Test public void test_163() { testValid(test_163_sup,test_163_sub); }

		private static final SyntacticType test_164_sup = parse("!int");
		private static final SyntacticType test_164_sub = parse("(any | any)");
		@Test public void test_164() { testInvalid(test_164_sup,test_164_sub); }

		private static final SyntacticType test_165_sup = parse("!int");
		private static final SyntacticType test_165_sub = parse("(int | any)");
		@Test public void test_165() { testInvalid(test_165_sup,test_165_sub); }

		private static final SyntacticType test_166_sup = parse("!int");
		private static final SyntacticType test_166_sub = parse("(any | int)");
		@Test public void test_166() { testInvalid(test_166_sup,test_166_sub); }

		private static final SyntacticType test_167_sup = parse("!int");
		private static final SyntacticType test_167_sub = parse("(int | int)");
		@Test public void test_167() { testInvalid(test_167_sup,test_167_sub); }

		private static final SyntacticType test_168_sup = parse("!int");
		private static final SyntacticType test_168_sub = parse("(any | any)");
		@Test public void test_168() { testInvalid(test_168_sup,test_168_sub); }

		private static final SyntacticType test_169_sup = parse("!int");
		private static final SyntacticType test_169_sub = parse("(int | any)");
		@Test public void test_169() { testInvalid(test_169_sup,test_169_sub); }

		private static final SyntacticType test_170_sup = parse("!int");
		private static final SyntacticType test_170_sub = parse("(any | int)");
		@Test public void test_170() { testInvalid(test_170_sup,test_170_sub); }

		private static final SyntacticType test_171_sup = parse("!int");
		private static final SyntacticType test_171_sub = parse("(int | int)");
		@Test public void test_171() { testInvalid(test_171_sup,test_171_sub); }

		private static final SyntacticType test_172_sup = parse("!int");
		private static final SyntacticType test_172_sub = parse("(any & any)");
		@Test public void test_172() { testInvalid(test_172_sup,test_172_sub); }

		private static final SyntacticType test_173_sup = parse("!int");
		private static final SyntacticType test_173_sub = parse("(int & any)");
		@Test public void test_173() { testInvalid(test_173_sup,test_173_sub); }

		private static final SyntacticType test_174_sup = parse("!int");
		private static final SyntacticType test_174_sub = parse("(any & int)");
		@Test public void test_174() { testInvalid(test_174_sup,test_174_sub); }

		private static final SyntacticType test_175_sup = parse("!int");
		private static final SyntacticType test_175_sub = parse("(int & int)");
		@Test public void test_175() { testInvalid(test_175_sup,test_175_sub); }

		private static final SyntacticType test_176_sup = parse("!int");
		private static final SyntacticType test_176_sub = parse("(any & any)");
		@Test public void test_176() { testInvalid(test_176_sup,test_176_sub); }

		private static final SyntacticType test_177_sup = parse("!int");
		private static final SyntacticType test_177_sub = parse("(int & any)");
		@Test public void test_177() { testInvalid(test_177_sup,test_177_sub); }

		private static final SyntacticType test_178_sup = parse("!int");
		private static final SyntacticType test_178_sub = parse("(any & int)");
		@Test public void test_178() { testInvalid(test_178_sup,test_178_sub); }

		private static final SyntacticType test_179_sup = parse("!int");
		private static final SyntacticType test_179_sub = parse("(int & int)");
		@Test public void test_179() { testInvalid(test_179_sup,test_179_sub); }

		private static final SyntacticType test_180_sup = parse("{any, any}");
		private static final SyntacticType test_180_sub = parse("any");
		@Test public void test_180() { testInvalid(test_180_sup,test_180_sub); }

		private static final SyntacticType test_181_sup = parse("{any, any}");
		private static final SyntacticType test_181_sub = parse("int");
		@Test public void test_181() { testInvalid(test_181_sup,test_181_sub); }

		private static final SyntacticType test_182_sup = parse("{any, any}");
		private static final SyntacticType test_182_sub = parse("{any}");
		@Test public void test_182() { testInvalid(test_182_sup,test_182_sub); }

		private static final SyntacticType test_183_sup = parse("{any, any}");
		private static final SyntacticType test_183_sub = parse("{int}");
		@Test public void test_183() { testInvalid(test_183_sup,test_183_sub); }

		private static final SyntacticType test_184_sup = parse("{any, any}");
		private static final SyntacticType test_184_sub = parse("!any");
		@Test public void test_184() { testValid(test_184_sup,test_184_sub); }

		private static final SyntacticType test_185_sup = parse("{any, any}");
		private static final SyntacticType test_185_sub = parse("!int");
		@Test public void test_185() { testInvalid(test_185_sup,test_185_sub); }

		private static final SyntacticType test_186_sup = parse("{any, any}");
		private static final SyntacticType test_186_sub = parse("{any, any}");
		@Test public void test_186() { testValid(test_186_sup,test_186_sub); }

		private static final SyntacticType test_187_sup = parse("{any, any}");
		private static final SyntacticType test_187_sub = parse("{int, any}");
		@Test public void test_187() { testValid(test_187_sup,test_187_sub); }

		private static final SyntacticType test_188_sup = parse("{any, any}");
		private static final SyntacticType test_188_sub = parse("{any, int}");
		@Test public void test_188() { testValid(test_188_sup,test_188_sub); }

		private static final SyntacticType test_189_sup = parse("{any, any}");
		private static final SyntacticType test_189_sub = parse("{int, int}");
		@Test public void test_189() { testValid(test_189_sup,test_189_sub); }

		private static final SyntacticType test_190_sup = parse("{any, any}");
		private static final SyntacticType test_190_sub = parse("{any, any}");
		@Test public void test_190() { testValid(test_190_sup,test_190_sub); }

		private static final SyntacticType test_191_sup = parse("{any, any}");
		private static final SyntacticType test_191_sub = parse("{int, any}");
		@Test public void test_191() { testValid(test_191_sup,test_191_sub); }

		private static final SyntacticType test_192_sup = parse("{any, any}");
		private static final SyntacticType test_192_sub = parse("{any, int}");
		@Test public void test_192() { testValid(test_192_sup,test_192_sub); }

		private static final SyntacticType test_193_sup = parse("{any, any}");
		private static final SyntacticType test_193_sub = parse("{int, int}");
		@Test public void test_193() { testValid(test_193_sup,test_193_sub); }

		private static final SyntacticType test_194_sup = parse("{any, any}");
		private static final SyntacticType test_194_sub = parse("(any | any)");
		@Test public void test_194() { testInvalid(test_194_sup,test_194_sub); }

		private static final SyntacticType test_195_sup = parse("{any, any}");
		private static final SyntacticType test_195_sub = parse("(int | any)");
		@Test public void test_195() { testInvalid(test_195_sup,test_195_sub); }

		private static final SyntacticType test_196_sup = parse("{any, any}");
		private static final SyntacticType test_196_sub = parse("(any | int)");
		@Test public void test_196() { testInvalid(test_196_sup,test_196_sub); }

		private static final SyntacticType test_197_sup = parse("{any, any}");
		private static final SyntacticType test_197_sub = parse("(int | int)");
		@Test public void test_197() { testInvalid(test_197_sup,test_197_sub); }

		private static final SyntacticType test_198_sup = parse("{any, any}");
		private static final SyntacticType test_198_sub = parse("(any | any)");
		@Test public void test_198() { testInvalid(test_198_sup,test_198_sub); }

		private static final SyntacticType test_199_sup = parse("{any, any}");
		private static final SyntacticType test_199_sub = parse("(int | any)");
		@Test public void test_199() { testInvalid(test_199_sup,test_199_sub); }

		private static final SyntacticType test_200_sup = parse("{any, any}");
		private static final SyntacticType test_200_sub = parse("(any | int)");
		@Test public void test_200() { testInvalid(test_200_sup,test_200_sub); }

		private static final SyntacticType test_201_sup = parse("{any, any}");
		private static final SyntacticType test_201_sub = parse("(int | int)");
		@Test public void test_201() { testInvalid(test_201_sup,test_201_sub); }

		private static final SyntacticType test_202_sup = parse("{any, any}");
		private static final SyntacticType test_202_sub = parse("(any & any)");
		@Test public void test_202() { testInvalid(test_202_sup,test_202_sub); }

		private static final SyntacticType test_203_sup = parse("{any, any}");
		private static final SyntacticType test_203_sub = parse("(int & any)");
		@Test public void test_203() { testInvalid(test_203_sup,test_203_sub); }

		private static final SyntacticType test_204_sup = parse("{any, any}");
		private static final SyntacticType test_204_sub = parse("(any & int)");
		@Test public void test_204() { testInvalid(test_204_sup,test_204_sub); }

		private static final SyntacticType test_205_sup = parse("{any, any}");
		private static final SyntacticType test_205_sub = parse("(int & int)");
		@Test public void test_205() { testInvalid(test_205_sup,test_205_sub); }

		private static final SyntacticType test_206_sup = parse("{any, any}");
		private static final SyntacticType test_206_sub = parse("(any & any)");
		@Test public void test_206() { testInvalid(test_206_sup,test_206_sub); }

		private static final SyntacticType test_207_sup = parse("{any, any}");
		private static final SyntacticType test_207_sub = parse("(int & any)");
		@Test public void test_207() { testInvalid(test_207_sup,test_207_sub); }

		private static final SyntacticType test_208_sup = parse("{any, any}");
		private static final SyntacticType test_208_sub = parse("(any & int)");
		@Test public void test_208() { testInvalid(test_208_sup,test_208_sub); }

		private static final SyntacticType test_209_sup = parse("{any, any}");
		private static final SyntacticType test_209_sub = parse("(int & int)");
		@Test public void test_209() { testInvalid(test_209_sup,test_209_sub); }

		private static final SyntacticType test_210_sup = parse("{int, any}");
		private static final SyntacticType test_210_sub = parse("any");
		@Test public void test_210() { testInvalid(test_210_sup,test_210_sub); }

		private static final SyntacticType test_211_sup = parse("{int, any}");
		private static final SyntacticType test_211_sub = parse("int");
		@Test public void test_211() { testInvalid(test_211_sup,test_211_sub); }

		private static final SyntacticType test_212_sup = parse("{int, any}");
		private static final SyntacticType test_212_sub = parse("{any}");
		@Test public void test_212() { testInvalid(test_212_sup,test_212_sub); }

		private static final SyntacticType test_213_sup = parse("{int, any}");
		private static final SyntacticType test_213_sub = parse("{int}");
		@Test public void test_213() { testInvalid(test_213_sup,test_213_sub); }

		private static final SyntacticType test_214_sup = parse("{int, any}");
		private static final SyntacticType test_214_sub = parse("!any");
		@Test public void test_214() { testValid(test_214_sup,test_214_sub); }

		private static final SyntacticType test_215_sup = parse("{int, any}");
		private static final SyntacticType test_215_sub = parse("!int");
		@Test public void test_215() { testInvalid(test_215_sup,test_215_sub); }

		private static final SyntacticType test_216_sup = parse("{int, any}");
		private static final SyntacticType test_216_sub = parse("{any, any}");
		@Test public void test_216() { testInvalid(test_216_sup,test_216_sub); }

		private static final SyntacticType test_217_sup = parse("{int, any}");
		private static final SyntacticType test_217_sub = parse("{int, any}");
		@Test public void test_217() { testValid(test_217_sup,test_217_sub); }

		private static final SyntacticType test_218_sup = parse("{int, any}");
		private static final SyntacticType test_218_sub = parse("{any, int}");
		@Test public void test_218() { testInvalid(test_218_sup,test_218_sub); }

		private static final SyntacticType test_219_sup = parse("{int, any}");
		private static final SyntacticType test_219_sub = parse("{int, int}");
		@Test public void test_219() { testValid(test_219_sup,test_219_sub); }

		private static final SyntacticType test_220_sup = parse("{int, any}");
		private static final SyntacticType test_220_sub = parse("{any, any}");
		@Test public void test_220() { testInvalid(test_220_sup,test_220_sub); }

		private static final SyntacticType test_221_sup = parse("{int, any}");
		private static final SyntacticType test_221_sub = parse("{int, any}");
		@Test public void test_221() { testValid(test_221_sup,test_221_sub); }

		private static final SyntacticType test_222_sup = parse("{int, any}");
		private static final SyntacticType test_222_sub = parse("{any, int}");
		@Test public void test_222() { testInvalid(test_222_sup,test_222_sub); }

		private static final SyntacticType test_223_sup = parse("{int, any}");
		private static final SyntacticType test_223_sub = parse("{int, int}");
		@Test public void test_223() { testValid(test_223_sup,test_223_sub); }

		private static final SyntacticType test_224_sup = parse("{int, any}");
		private static final SyntacticType test_224_sub = parse("(any | any)");
		@Test public void test_224() { testInvalid(test_224_sup,test_224_sub); }

		private static final SyntacticType test_225_sup = parse("{int, any}");
		private static final SyntacticType test_225_sub = parse("(int | any)");
		@Test public void test_225() { testInvalid(test_225_sup,test_225_sub); }

		private static final SyntacticType test_226_sup = parse("{int, any}");
		private static final SyntacticType test_226_sub = parse("(any | int)");
		@Test public void test_226() { testInvalid(test_226_sup,test_226_sub); }

		private static final SyntacticType test_227_sup = parse("{int, any}");
		private static final SyntacticType test_227_sub = parse("(int | int)");
		@Test public void test_227() { testInvalid(test_227_sup,test_227_sub); }

		private static final SyntacticType test_228_sup = parse("{int, any}");
		private static final SyntacticType test_228_sub = parse("(any | any)");
		@Test public void test_228() { testInvalid(test_228_sup,test_228_sub); }

		private static final SyntacticType test_229_sup = parse("{int, any}");
		private static final SyntacticType test_229_sub = parse("(int | any)");
		@Test public void test_229() { testInvalid(test_229_sup,test_229_sub); }

		private static final SyntacticType test_230_sup = parse("{int, any}");
		private static final SyntacticType test_230_sub = parse("(any | int)");
		@Test public void test_230() { testInvalid(test_230_sup,test_230_sub); }

		private static final SyntacticType test_231_sup = parse("{int, any}");
		private static final SyntacticType test_231_sub = parse("(int | int)");
		@Test public void test_231() { testInvalid(test_231_sup,test_231_sub); }

		private static final SyntacticType test_232_sup = parse("{int, any}");
		private static final SyntacticType test_232_sub = parse("(any & any)");
		@Test public void test_232() { testInvalid(test_232_sup,test_232_sub); }

		private static final SyntacticType test_233_sup = parse("{int, any}");
		private static final SyntacticType test_233_sub = parse("(int & any)");
		@Test public void test_233() { testInvalid(test_233_sup,test_233_sub); }

		private static final SyntacticType test_234_sup = parse("{int, any}");
		private static final SyntacticType test_234_sub = parse("(any & int)");
		@Test public void test_234() { testInvalid(test_234_sup,test_234_sub); }

		private static final SyntacticType test_235_sup = parse("{int, any}");
		private static final SyntacticType test_235_sub = parse("(int & int)");
		@Test public void test_235() { testInvalid(test_235_sup,test_235_sub); }

		private static final SyntacticType test_236_sup = parse("{int, any}");
		private static final SyntacticType test_236_sub = parse("(any & any)");
		@Test public void test_236() { testInvalid(test_236_sup,test_236_sub); }

		private static final SyntacticType test_237_sup = parse("{int, any}");
		private static final SyntacticType test_237_sub = parse("(int & any)");
		@Test public void test_237() { testInvalid(test_237_sup,test_237_sub); }

		private static final SyntacticType test_238_sup = parse("{int, any}");
		private static final SyntacticType test_238_sub = parse("(any & int)");
		@Test public void test_238() { testInvalid(test_238_sup,test_238_sub); }

		private static final SyntacticType test_239_sup = parse("{int, any}");
		private static final SyntacticType test_239_sub = parse("(int & int)");
		@Test public void test_239() { testInvalid(test_239_sup,test_239_sub); }

		private static final SyntacticType test_240_sup = parse("{any, int}");
		private static final SyntacticType test_240_sub = parse("any");
		@Test public void test_240() { testInvalid(test_240_sup,test_240_sub); }

		private static final SyntacticType test_241_sup = parse("{any, int}");
		private static final SyntacticType test_241_sub = parse("int");
		@Test public void test_241() { testInvalid(test_241_sup,test_241_sub); }

		private static final SyntacticType test_242_sup = parse("{any, int}");
		private static final SyntacticType test_242_sub = parse("{any}");
		@Test public void test_242() { testInvalid(test_242_sup,test_242_sub); }

		private static final SyntacticType test_243_sup = parse("{any, int}");
		private static final SyntacticType test_243_sub = parse("{int}");
		@Test public void test_243() { testInvalid(test_243_sup,test_243_sub); }

		private static final SyntacticType test_244_sup = parse("{any, int}");
		private static final SyntacticType test_244_sub = parse("!any");
		@Test public void test_244() { testValid(test_244_sup,test_244_sub); }

		private static final SyntacticType test_245_sup = parse("{any, int}");
		private static final SyntacticType test_245_sub = parse("!int");
		@Test public void test_245() { testInvalid(test_245_sup,test_245_sub); }

		private static final SyntacticType test_246_sup = parse("{any, int}");
		private static final SyntacticType test_246_sub = parse("{any, any}");
		@Test public void test_246() { testInvalid(test_246_sup,test_246_sub); }

		private static final SyntacticType test_247_sup = parse("{any, int}");
		private static final SyntacticType test_247_sub = parse("{int, any}");
		@Test public void test_247() { testInvalid(test_247_sup,test_247_sub); }

		private static final SyntacticType test_248_sup = parse("{any, int}");
		private static final SyntacticType test_248_sub = parse("{any, int}");
		@Test public void test_248() { testValid(test_248_sup,test_248_sub); }

		private static final SyntacticType test_249_sup = parse("{any, int}");
		private static final SyntacticType test_249_sub = parse("{int, int}");
		@Test public void test_249() { testValid(test_249_sup,test_249_sub); }

		private static final SyntacticType test_250_sup = parse("{any, int}");
		private static final SyntacticType test_250_sub = parse("{any, any}");
		@Test public void test_250() { testInvalid(test_250_sup,test_250_sub); }

		private static final SyntacticType test_251_sup = parse("{any, int}");
		private static final SyntacticType test_251_sub = parse("{int, any}");
		@Test public void test_251() { testInvalid(test_251_sup,test_251_sub); }

		private static final SyntacticType test_252_sup = parse("{any, int}");
		private static final SyntacticType test_252_sub = parse("{any, int}");
		@Test public void test_252() { testValid(test_252_sup,test_252_sub); }

		private static final SyntacticType test_253_sup = parse("{any, int}");
		private static final SyntacticType test_253_sub = parse("{int, int}");
		@Test public void test_253() { testValid(test_253_sup,test_253_sub); }

		private static final SyntacticType test_254_sup = parse("{any, int}");
		private static final SyntacticType test_254_sub = parse("(any | any)");
		@Test public void test_254() { testInvalid(test_254_sup,test_254_sub); }

		private static final SyntacticType test_255_sup = parse("{any, int}");
		private static final SyntacticType test_255_sub = parse("(int | any)");
		@Test public void test_255() { testInvalid(test_255_sup,test_255_sub); }

		private static final SyntacticType test_256_sup = parse("{any, int}");
		private static final SyntacticType test_256_sub = parse("(any | int)");
		@Test public void test_256() { testInvalid(test_256_sup,test_256_sub); }

		private static final SyntacticType test_257_sup = parse("{any, int}");
		private static final SyntacticType test_257_sub = parse("(int | int)");
		@Test public void test_257() { testInvalid(test_257_sup,test_257_sub); }

		private static final SyntacticType test_258_sup = parse("{any, int}");
		private static final SyntacticType test_258_sub = parse("(any | any)");
		@Test public void test_258() { testInvalid(test_258_sup,test_258_sub); }

		private static final SyntacticType test_259_sup = parse("{any, int}");
		private static final SyntacticType test_259_sub = parse("(int | any)");
		@Test public void test_259() { testInvalid(test_259_sup,test_259_sub); }

		private static final SyntacticType test_260_sup = parse("{any, int}");
		private static final SyntacticType test_260_sub = parse("(any | int)");
		@Test public void test_260() { testInvalid(test_260_sup,test_260_sub); }

		private static final SyntacticType test_261_sup = parse("{any, int}");
		private static final SyntacticType test_261_sub = parse("(int | int)");
		@Test public void test_261() { testInvalid(test_261_sup,test_261_sub); }

		private static final SyntacticType test_262_sup = parse("{any, int}");
		private static final SyntacticType test_262_sub = parse("(any & any)");
		@Test public void test_262() { testInvalid(test_262_sup,test_262_sub); }

		private static final SyntacticType test_263_sup = parse("{any, int}");
		private static final SyntacticType test_263_sub = parse("(int & any)");
		@Test public void test_263() { testInvalid(test_263_sup,test_263_sub); }

		private static final SyntacticType test_264_sup = parse("{any, int}");
		private static final SyntacticType test_264_sub = parse("(any & int)");
		@Test public void test_264() { testInvalid(test_264_sup,test_264_sub); }

		private static final SyntacticType test_265_sup = parse("{any, int}");
		private static final SyntacticType test_265_sub = parse("(int & int)");
		@Test public void test_265() { testInvalid(test_265_sup,test_265_sub); }

		private static final SyntacticType test_266_sup = parse("{any, int}");
		private static final SyntacticType test_266_sub = parse("(any & any)");
		@Test public void test_266() { testInvalid(test_266_sup,test_266_sub); }

		private static final SyntacticType test_267_sup = parse("{any, int}");
		private static final SyntacticType test_267_sub = parse("(int & any)");
		@Test public void test_267() { testInvalid(test_267_sup,test_267_sub); }

		private static final SyntacticType test_268_sup = parse("{any, int}");
		private static final SyntacticType test_268_sub = parse("(any & int)");
		@Test public void test_268() { testInvalid(test_268_sup,test_268_sub); }

		private static final SyntacticType test_269_sup = parse("{any, int}");
		private static final SyntacticType test_269_sub = parse("(int & int)");
		@Test public void test_269() { testInvalid(test_269_sup,test_269_sub); }

		private static final SyntacticType test_270_sup = parse("{int, int}");
		private static final SyntacticType test_270_sub = parse("any");
		@Test public void test_270() { testInvalid(test_270_sup,test_270_sub); }

		private static final SyntacticType test_271_sup = parse("{int, int}");
		private static final SyntacticType test_271_sub = parse("int");
		@Test public void test_271() { testInvalid(test_271_sup,test_271_sub); }

		private static final SyntacticType test_272_sup = parse("{int, int}");
		private static final SyntacticType test_272_sub = parse("{any}");
		@Test public void test_272() { testInvalid(test_272_sup,test_272_sub); }

		private static final SyntacticType test_273_sup = parse("{int, int}");
		private static final SyntacticType test_273_sub = parse("{int}");
		@Test public void test_273() { testInvalid(test_273_sup,test_273_sub); }

		private static final SyntacticType test_274_sup = parse("{int, int}");
		private static final SyntacticType test_274_sub = parse("!any");
		@Test public void test_274() { testValid(test_274_sup,test_274_sub); }

		private static final SyntacticType test_275_sup = parse("{int, int}");
		private static final SyntacticType test_275_sub = parse("!int");
		@Test public void test_275() { testInvalid(test_275_sup,test_275_sub); }

		private static final SyntacticType test_276_sup = parse("{int, int}");
		private static final SyntacticType test_276_sub = parse("{any, any}");
		@Test public void test_276() { testInvalid(test_276_sup,test_276_sub); }

		private static final SyntacticType test_277_sup = parse("{int, int}");
		private static final SyntacticType test_277_sub = parse("{int, any}");
		@Test public void test_277() { testInvalid(test_277_sup,test_277_sub); }

		private static final SyntacticType test_278_sup = parse("{int, int}");
		private static final SyntacticType test_278_sub = parse("{any, int}");
		@Test public void test_278() { testInvalid(test_278_sup,test_278_sub); }

		private static final SyntacticType test_279_sup = parse("{int, int}");
		private static final SyntacticType test_279_sub = parse("{int, int}");
		@Test public void test_279() { testValid(test_279_sup,test_279_sub); }

		private static final SyntacticType test_280_sup = parse("{int, int}");
		private static final SyntacticType test_280_sub = parse("{any, any}");
		@Test public void test_280() { testInvalid(test_280_sup,test_280_sub); }

		private static final SyntacticType test_281_sup = parse("{int, int}");
		private static final SyntacticType test_281_sub = parse("{int, any}");
		@Test public void test_281() { testInvalid(test_281_sup,test_281_sub); }

		private static final SyntacticType test_282_sup = parse("{int, int}");
		private static final SyntacticType test_282_sub = parse("{any, int}");
		@Test public void test_282() { testInvalid(test_282_sup,test_282_sub); }

		private static final SyntacticType test_283_sup = parse("{int, int}");
		private static final SyntacticType test_283_sub = parse("{int, int}");
		@Test public void test_283() { testValid(test_283_sup,test_283_sub); }

		private static final SyntacticType test_284_sup = parse("{int, int}");
		private static final SyntacticType test_284_sub = parse("(any | any)");
		@Test public void test_284() { testInvalid(test_284_sup,test_284_sub); }

		private static final SyntacticType test_285_sup = parse("{int, int}");
		private static final SyntacticType test_285_sub = parse("(int | any)");
		@Test public void test_285() { testInvalid(test_285_sup,test_285_sub); }

		private static final SyntacticType test_286_sup = parse("{int, int}");
		private static final SyntacticType test_286_sub = parse("(any | int)");
		@Test public void test_286() { testInvalid(test_286_sup,test_286_sub); }

		private static final SyntacticType test_287_sup = parse("{int, int}");
		private static final SyntacticType test_287_sub = parse("(int | int)");
		@Test public void test_287() { testInvalid(test_287_sup,test_287_sub); }

		private static final SyntacticType test_288_sup = parse("{int, int}");
		private static final SyntacticType test_288_sub = parse("(any | any)");
		@Test public void test_288() { testInvalid(test_288_sup,test_288_sub); }

		private static final SyntacticType test_289_sup = parse("{int, int}");
		private static final SyntacticType test_289_sub = parse("(int | any)");
		@Test public void test_289() { testInvalid(test_289_sup,test_289_sub); }

		private static final SyntacticType test_290_sup = parse("{int, int}");
		private static final SyntacticType test_290_sub = parse("(any | int)");
		@Test public void test_290() { testInvalid(test_290_sup,test_290_sub); }

		private static final SyntacticType test_291_sup = parse("{int, int}");
		private static final SyntacticType test_291_sub = parse("(int | int)");
		@Test public void test_291() { testInvalid(test_291_sup,test_291_sub); }

		private static final SyntacticType test_292_sup = parse("{int, int}");
		private static final SyntacticType test_292_sub = parse("(any & any)");
		@Test public void test_292() { testInvalid(test_292_sup,test_292_sub); }

		private static final SyntacticType test_293_sup = parse("{int, int}");
		private static final SyntacticType test_293_sub = parse("(int & any)");
		@Test public void test_293() { testInvalid(test_293_sup,test_293_sub); }

		private static final SyntacticType test_294_sup = parse("{int, int}");
		private static final SyntacticType test_294_sub = parse("(any & int)");
		@Test public void test_294() { testInvalid(test_294_sup,test_294_sub); }

		private static final SyntacticType test_295_sup = parse("{int, int}");
		private static final SyntacticType test_295_sub = parse("(int & int)");
		@Test public void test_295() { testInvalid(test_295_sup,test_295_sub); }

		private static final SyntacticType test_296_sup = parse("{int, int}");
		private static final SyntacticType test_296_sub = parse("(any & any)");
		@Test public void test_296() { testInvalid(test_296_sup,test_296_sub); }

		private static final SyntacticType test_297_sup = parse("{int, int}");
		private static final SyntacticType test_297_sub = parse("(int & any)");
		@Test public void test_297() { testInvalid(test_297_sup,test_297_sub); }

		private static final SyntacticType test_298_sup = parse("{int, int}");
		private static final SyntacticType test_298_sub = parse("(any & int)");
		@Test public void test_298() { testInvalid(test_298_sup,test_298_sub); }

		private static final SyntacticType test_299_sup = parse("{int, int}");
		private static final SyntacticType test_299_sub = parse("(int & int)");
		@Test public void test_299() { testInvalid(test_299_sup,test_299_sub); }

		private static final SyntacticType test_300_sup = parse("{any, any}");
		private static final SyntacticType test_300_sub = parse("any");
		@Test public void test_300() { testInvalid(test_300_sup,test_300_sub); }

		private static final SyntacticType test_301_sup = parse("{any, any}");
		private static final SyntacticType test_301_sub = parse("int");
		@Test public void test_301() { testInvalid(test_301_sup,test_301_sub); }

		private static final SyntacticType test_302_sup = parse("{any, any}");
		private static final SyntacticType test_302_sub = parse("{any}");
		@Test public void test_302() { testInvalid(test_302_sup,test_302_sub); }

		private static final SyntacticType test_303_sup = parse("{any, any}");
		private static final SyntacticType test_303_sub = parse("{int}");
		@Test public void test_303() { testInvalid(test_303_sup,test_303_sub); }

		private static final SyntacticType test_304_sup = parse("{any, any}");
		private static final SyntacticType test_304_sub = parse("!any");
		@Test public void test_304() { testValid(test_304_sup,test_304_sub); }

		private static final SyntacticType test_305_sup = parse("{any, any}");
		private static final SyntacticType test_305_sub = parse("!int");
		@Test public void test_305() { testInvalid(test_305_sup,test_305_sub); }

		private static final SyntacticType test_306_sup = parse("{any, any}");
		private static final SyntacticType test_306_sub = parse("{any, any}");
		@Test public void test_306() { testValid(test_306_sup,test_306_sub); }

		private static final SyntacticType test_307_sup = parse("{any, any}");
		private static final SyntacticType test_307_sub = parse("{int, any}");
		@Test public void test_307() { testValid(test_307_sup,test_307_sub); }

		private static final SyntacticType test_308_sup = parse("{any, any}");
		private static final SyntacticType test_308_sub = parse("{any, int}");
		@Test public void test_308() { testValid(test_308_sup,test_308_sub); }

		private static final SyntacticType test_309_sup = parse("{any, any}");
		private static final SyntacticType test_309_sub = parse("{int, int}");
		@Test public void test_309() { testValid(test_309_sup,test_309_sub); }

		private static final SyntacticType test_310_sup = parse("{any, any}");
		private static final SyntacticType test_310_sub = parse("{any, any}");
		@Test public void test_310() { testValid(test_310_sup,test_310_sub); }

		private static final SyntacticType test_311_sup = parse("{any, any}");
		private static final SyntacticType test_311_sub = parse("{int, any}");
		@Test public void test_311() { testValid(test_311_sup,test_311_sub); }

		private static final SyntacticType test_312_sup = parse("{any, any}");
		private static final SyntacticType test_312_sub = parse("{any, int}");
		@Test public void test_312() { testValid(test_312_sup,test_312_sub); }

		private static final SyntacticType test_313_sup = parse("{any, any}");
		private static final SyntacticType test_313_sub = parse("{int, int}");
		@Test public void test_313() { testValid(test_313_sup,test_313_sub); }

		private static final SyntacticType test_314_sup = parse("{any, any}");
		private static final SyntacticType test_314_sub = parse("(any | any)");
		@Test public void test_314() { testInvalid(test_314_sup,test_314_sub); }

		private static final SyntacticType test_315_sup = parse("{any, any}");
		private static final SyntacticType test_315_sub = parse("(int | any)");
		@Test public void test_315() { testInvalid(test_315_sup,test_315_sub); }

		private static final SyntacticType test_316_sup = parse("{any, any}");
		private static final SyntacticType test_316_sub = parse("(any | int)");
		@Test public void test_316() { testInvalid(test_316_sup,test_316_sub); }

		private static final SyntacticType test_317_sup = parse("{any, any}");
		private static final SyntacticType test_317_sub = parse("(int | int)");
		@Test public void test_317() { testInvalid(test_317_sup,test_317_sub); }

		private static final SyntacticType test_318_sup = parse("{any, any}");
		private static final SyntacticType test_318_sub = parse("(any | any)");
		@Test public void test_318() { testInvalid(test_318_sup,test_318_sub); }

		private static final SyntacticType test_319_sup = parse("{any, any}");
		private static final SyntacticType test_319_sub = parse("(int | any)");
		@Test public void test_319() { testInvalid(test_319_sup,test_319_sub); }

		private static final SyntacticType test_320_sup = parse("{any, any}");
		private static final SyntacticType test_320_sub = parse("(any | int)");
		@Test public void test_320() { testInvalid(test_320_sup,test_320_sub); }

		private static final SyntacticType test_321_sup = parse("{any, any}");
		private static final SyntacticType test_321_sub = parse("(int | int)");
		@Test public void test_321() { testInvalid(test_321_sup,test_321_sub); }

		private static final SyntacticType test_322_sup = parse("{any, any}");
		private static final SyntacticType test_322_sub = parse("(any & any)");
		@Test public void test_322() { testInvalid(test_322_sup,test_322_sub); }

		private static final SyntacticType test_323_sup = parse("{any, any}");
		private static final SyntacticType test_323_sub = parse("(int & any)");
		@Test public void test_323() { testInvalid(test_323_sup,test_323_sub); }

		private static final SyntacticType test_324_sup = parse("{any, any}");
		private static final SyntacticType test_324_sub = parse("(any & int)");
		@Test public void test_324() { testInvalid(test_324_sup,test_324_sub); }

		private static final SyntacticType test_325_sup = parse("{any, any}");
		private static final SyntacticType test_325_sub = parse("(int & int)");
		@Test public void test_325() { testInvalid(test_325_sup,test_325_sub); }

		private static final SyntacticType test_326_sup = parse("{any, any}");
		private static final SyntacticType test_326_sub = parse("(any & any)");
		@Test public void test_326() { testInvalid(test_326_sup,test_326_sub); }

		private static final SyntacticType test_327_sup = parse("{any, any}");
		private static final SyntacticType test_327_sub = parse("(int & any)");
		@Test public void test_327() { testInvalid(test_327_sup,test_327_sub); }

		private static final SyntacticType test_328_sup = parse("{any, any}");
		private static final SyntacticType test_328_sub = parse("(any & int)");
		@Test public void test_328() { testInvalid(test_328_sup,test_328_sub); }

		private static final SyntacticType test_329_sup = parse("{any, any}");
		private static final SyntacticType test_329_sub = parse("(int & int)");
		@Test public void test_329() { testInvalid(test_329_sup,test_329_sub); }

		private static final SyntacticType test_330_sup = parse("{int, any}");
		private static final SyntacticType test_330_sub = parse("any");
		@Test public void test_330() { testInvalid(test_330_sup,test_330_sub); }

		private static final SyntacticType test_331_sup = parse("{int, any}");
		private static final SyntacticType test_331_sub = parse("int");
		@Test public void test_331() { testInvalid(test_331_sup,test_331_sub); }

		private static final SyntacticType test_332_sup = parse("{int, any}");
		private static final SyntacticType test_332_sub = parse("{any}");
		@Test public void test_332() { testInvalid(test_332_sup,test_332_sub); }

		private static final SyntacticType test_333_sup = parse("{int, any}");
		private static final SyntacticType test_333_sub = parse("{int}");
		@Test public void test_333() { testInvalid(test_333_sup,test_333_sub); }

		private static final SyntacticType test_334_sup = parse("{int, any}");
		private static final SyntacticType test_334_sub = parse("!any");
		@Test public void test_334() { testValid(test_334_sup,test_334_sub); }

		private static final SyntacticType test_335_sup = parse("{int, any}");
		private static final SyntacticType test_335_sub = parse("!int");
		@Test public void test_335() { testInvalid(test_335_sup,test_335_sub); }

		private static final SyntacticType test_336_sup = parse("{int, any}");
		private static final SyntacticType test_336_sub = parse("{any, any}");
		@Test public void test_336() { testInvalid(test_336_sup,test_336_sub); }

		private static final SyntacticType test_337_sup = parse("{int, any}");
		private static final SyntacticType test_337_sub = parse("{int, any}");
		@Test public void test_337() { testValid(test_337_sup,test_337_sub); }

		private static final SyntacticType test_338_sup = parse("{int, any}");
		private static final SyntacticType test_338_sub = parse("{any, int}");
		@Test public void test_338() { testInvalid(test_338_sup,test_338_sub); }

		private static final SyntacticType test_339_sup = parse("{int, any}");
		private static final SyntacticType test_339_sub = parse("{int, int}");
		@Test public void test_339() { testValid(test_339_sup,test_339_sub); }

		private static final SyntacticType test_340_sup = parse("{int, any}");
		private static final SyntacticType test_340_sub = parse("{any, any}");
		@Test public void test_340() { testInvalid(test_340_sup,test_340_sub); }

		private static final SyntacticType test_341_sup = parse("{int, any}");
		private static final SyntacticType test_341_sub = parse("{int, any}");
		@Test public void test_341() { testValid(test_341_sup,test_341_sub); }

		private static final SyntacticType test_342_sup = parse("{int, any}");
		private static final SyntacticType test_342_sub = parse("{any, int}");
		@Test public void test_342() { testInvalid(test_342_sup,test_342_sub); }

		private static final SyntacticType test_343_sup = parse("{int, any}");
		private static final SyntacticType test_343_sub = parse("{int, int}");
		@Test public void test_343() { testValid(test_343_sup,test_343_sub); }

		private static final SyntacticType test_344_sup = parse("{int, any}");
		private static final SyntacticType test_344_sub = parse("(any | any)");
		@Test public void test_344() { testInvalid(test_344_sup,test_344_sub); }

		private static final SyntacticType test_345_sup = parse("{int, any}");
		private static final SyntacticType test_345_sub = parse("(int | any)");
		@Test public void test_345() { testInvalid(test_345_sup,test_345_sub); }

		private static final SyntacticType test_346_sup = parse("{int, any}");
		private static final SyntacticType test_346_sub = parse("(any | int)");
		@Test public void test_346() { testInvalid(test_346_sup,test_346_sub); }

		private static final SyntacticType test_347_sup = parse("{int, any}");
		private static final SyntacticType test_347_sub = parse("(int | int)");
		@Test public void test_347() { testInvalid(test_347_sup,test_347_sub); }

		private static final SyntacticType test_348_sup = parse("{int, any}");
		private static final SyntacticType test_348_sub = parse("(any | any)");
		@Test public void test_348() { testInvalid(test_348_sup,test_348_sub); }

		private static final SyntacticType test_349_sup = parse("{int, any}");
		private static final SyntacticType test_349_sub = parse("(int | any)");
		@Test public void test_349() { testInvalid(test_349_sup,test_349_sub); }

		private static final SyntacticType test_350_sup = parse("{int, any}");
		private static final SyntacticType test_350_sub = parse("(any | int)");
		@Test public void test_350() { testInvalid(test_350_sup,test_350_sub); }

		private static final SyntacticType test_351_sup = parse("{int, any}");
		private static final SyntacticType test_351_sub = parse("(int | int)");
		@Test public void test_351() { testInvalid(test_351_sup,test_351_sub); }

		private static final SyntacticType test_352_sup = parse("{int, any}");
		private static final SyntacticType test_352_sub = parse("(any & any)");
		@Test public void test_352() { testInvalid(test_352_sup,test_352_sub); }

		private static final SyntacticType test_353_sup = parse("{int, any}");
		private static final SyntacticType test_353_sub = parse("(int & any)");
		@Test public void test_353() { testInvalid(test_353_sup,test_353_sub); }

		private static final SyntacticType test_354_sup = parse("{int, any}");
		private static final SyntacticType test_354_sub = parse("(any & int)");
		@Test public void test_354() { testInvalid(test_354_sup,test_354_sub); }

		private static final SyntacticType test_355_sup = parse("{int, any}");
		private static final SyntacticType test_355_sub = parse("(int & int)");
		@Test public void test_355() { testInvalid(test_355_sup,test_355_sub); }

		private static final SyntacticType test_356_sup = parse("{int, any}");
		private static final SyntacticType test_356_sub = parse("(any & any)");
		@Test public void test_356() { testInvalid(test_356_sup,test_356_sub); }

		private static final SyntacticType test_357_sup = parse("{int, any}");
		private static final SyntacticType test_357_sub = parse("(int & any)");
		@Test public void test_357() { testInvalid(test_357_sup,test_357_sub); }

		private static final SyntacticType test_358_sup = parse("{int, any}");
		private static final SyntacticType test_358_sub = parse("(any & int)");
		@Test public void test_358() { testInvalid(test_358_sup,test_358_sub); }

		private static final SyntacticType test_359_sup = parse("{int, any}");
		private static final SyntacticType test_359_sub = parse("(int & int)");
		@Test public void test_359() { testInvalid(test_359_sup,test_359_sub); }

		private static final SyntacticType test_360_sup = parse("{any, int}");
		private static final SyntacticType test_360_sub = parse("any");
		@Test public void test_360() { testInvalid(test_360_sup,test_360_sub); }

		private static final SyntacticType test_361_sup = parse("{any, int}");
		private static final SyntacticType test_361_sub = parse("int");
		@Test public void test_361() { testInvalid(test_361_sup,test_361_sub); }

		private static final SyntacticType test_362_sup = parse("{any, int}");
		private static final SyntacticType test_362_sub = parse("{any}");
		@Test public void test_362() { testInvalid(test_362_sup,test_362_sub); }

		private static final SyntacticType test_363_sup = parse("{any, int}");
		private static final SyntacticType test_363_sub = parse("{int}");
		@Test public void test_363() { testInvalid(test_363_sup,test_363_sub); }

		private static final SyntacticType test_364_sup = parse("{any, int}");
		private static final SyntacticType test_364_sub = parse("!any");
		@Test public void test_364() { testValid(test_364_sup,test_364_sub); }

		private static final SyntacticType test_365_sup = parse("{any, int}");
		private static final SyntacticType test_365_sub = parse("!int");
		@Test public void test_365() { testInvalid(test_365_sup,test_365_sub); }

		private static final SyntacticType test_366_sup = parse("{any, int}");
		private static final SyntacticType test_366_sub = parse("{any, any}");
		@Test public void test_366() { testInvalid(test_366_sup,test_366_sub); }

		private static final SyntacticType test_367_sup = parse("{any, int}");
		private static final SyntacticType test_367_sub = parse("{int, any}");
		@Test public void test_367() { testInvalid(test_367_sup,test_367_sub); }

		private static final SyntacticType test_368_sup = parse("{any, int}");
		private static final SyntacticType test_368_sub = parse("{any, int}");
		@Test public void test_368() { testValid(test_368_sup,test_368_sub); }

		private static final SyntacticType test_369_sup = parse("{any, int}");
		private static final SyntacticType test_369_sub = parse("{int, int}");
		@Test public void test_369() { testValid(test_369_sup,test_369_sub); }

		private static final SyntacticType test_370_sup = parse("{any, int}");
		private static final SyntacticType test_370_sub = parse("{any, any}");
		@Test public void test_370() { testInvalid(test_370_sup,test_370_sub); }

		private static final SyntacticType test_371_sup = parse("{any, int}");
		private static final SyntacticType test_371_sub = parse("{int, any}");
		@Test public void test_371() { testInvalid(test_371_sup,test_371_sub); }

		private static final SyntacticType test_372_sup = parse("{any, int}");
		private static final SyntacticType test_372_sub = parse("{any, int}");
		@Test public void test_372() { testValid(test_372_sup,test_372_sub); }

		private static final SyntacticType test_373_sup = parse("{any, int}");
		private static final SyntacticType test_373_sub = parse("{int, int}");
		@Test public void test_373() { testValid(test_373_sup,test_373_sub); }

		private static final SyntacticType test_374_sup = parse("{any, int}");
		private static final SyntacticType test_374_sub = parse("(any | any)");
		@Test public void test_374() { testInvalid(test_374_sup,test_374_sub); }

		private static final SyntacticType test_375_sup = parse("{any, int}");
		private static final SyntacticType test_375_sub = parse("(int | any)");
		@Test public void test_375() { testInvalid(test_375_sup,test_375_sub); }

		private static final SyntacticType test_376_sup = parse("{any, int}");
		private static final SyntacticType test_376_sub = parse("(any | int)");
		@Test public void test_376() { testInvalid(test_376_sup,test_376_sub); }

		private static final SyntacticType test_377_sup = parse("{any, int}");
		private static final SyntacticType test_377_sub = parse("(int | int)");
		@Test public void test_377() { testInvalid(test_377_sup,test_377_sub); }

		private static final SyntacticType test_378_sup = parse("{any, int}");
		private static final SyntacticType test_378_sub = parse("(any | any)");
		@Test public void test_378() { testInvalid(test_378_sup,test_378_sub); }

		private static final SyntacticType test_379_sup = parse("{any, int}");
		private static final SyntacticType test_379_sub = parse("(int | any)");
		@Test public void test_379() { testInvalid(test_379_sup,test_379_sub); }

		private static final SyntacticType test_380_sup = parse("{any, int}");
		private static final SyntacticType test_380_sub = parse("(any | int)");
		@Test public void test_380() { testInvalid(test_380_sup,test_380_sub); }

		private static final SyntacticType test_381_sup = parse("{any, int}");
		private static final SyntacticType test_381_sub = parse("(int | int)");
		@Test public void test_381() { testInvalid(test_381_sup,test_381_sub); }

		private static final SyntacticType test_382_sup = parse("{any, int}");
		private static final SyntacticType test_382_sub = parse("(any & any)");
		@Test public void test_382() { testInvalid(test_382_sup,test_382_sub); }

		private static final SyntacticType test_383_sup = parse("{any, int}");
		private static final SyntacticType test_383_sub = parse("(int & any)");
		@Test public void test_383() { testInvalid(test_383_sup,test_383_sub); }

		private static final SyntacticType test_384_sup = parse("{any, int}");
		private static final SyntacticType test_384_sub = parse("(any & int)");
		@Test public void test_384() { testInvalid(test_384_sup,test_384_sub); }

		private static final SyntacticType test_385_sup = parse("{any, int}");
		private static final SyntacticType test_385_sub = parse("(int & int)");
		@Test public void test_385() { testInvalid(test_385_sup,test_385_sub); }

		private static final SyntacticType test_386_sup = parse("{any, int}");
		private static final SyntacticType test_386_sub = parse("(any & any)");
		@Test public void test_386() { testInvalid(test_386_sup,test_386_sub); }

		private static final SyntacticType test_387_sup = parse("{any, int}");
		private static final SyntacticType test_387_sub = parse("(int & any)");
		@Test public void test_387() { testInvalid(test_387_sup,test_387_sub); }

		private static final SyntacticType test_388_sup = parse("{any, int}");
		private static final SyntacticType test_388_sub = parse("(any & int)");
		@Test public void test_388() { testInvalid(test_388_sup,test_388_sub); }

		private static final SyntacticType test_389_sup = parse("{any, int}");
		private static final SyntacticType test_389_sub = parse("(int & int)");
		@Test public void test_389() { testInvalid(test_389_sup,test_389_sub); }

		private static final SyntacticType test_390_sup = parse("{int, int}");
		private static final SyntacticType test_390_sub = parse("any");
		@Test public void test_390() { testInvalid(test_390_sup,test_390_sub); }

		private static final SyntacticType test_391_sup = parse("{int, int}");
		private static final SyntacticType test_391_sub = parse("int");
		@Test public void test_391() { testInvalid(test_391_sup,test_391_sub); }

		private static final SyntacticType test_392_sup = parse("{int, int}");
		private static final SyntacticType test_392_sub = parse("{any}");
		@Test public void test_392() { testInvalid(test_392_sup,test_392_sub); }

		private static final SyntacticType test_393_sup = parse("{int, int}");
		private static final SyntacticType test_393_sub = parse("{int}");
		@Test public void test_393() { testInvalid(test_393_sup,test_393_sub); }

		private static final SyntacticType test_394_sup = parse("{int, int}");
		private static final SyntacticType test_394_sub = parse("!any");
		@Test public void test_394() { testValid(test_394_sup,test_394_sub); }

		private static final SyntacticType test_395_sup = parse("{int, int}");
		private static final SyntacticType test_395_sub = parse("!int");
		@Test public void test_395() { testInvalid(test_395_sup,test_395_sub); }

		private static final SyntacticType test_396_sup = parse("{int, int}");
		private static final SyntacticType test_396_sub = parse("{any, any}");
		@Test public void test_396() { testInvalid(test_396_sup,test_396_sub); }

		private static final SyntacticType test_397_sup = parse("{int, int}");
		private static final SyntacticType test_397_sub = parse("{int, any}");
		@Test public void test_397() { testInvalid(test_397_sup,test_397_sub); }

		private static final SyntacticType test_398_sup = parse("{int, int}");
		private static final SyntacticType test_398_sub = parse("{any, int}");
		@Test public void test_398() { testInvalid(test_398_sup,test_398_sub); }

		private static final SyntacticType test_399_sup = parse("{int, int}");
		private static final SyntacticType test_399_sub = parse("{int, int}");
		@Test public void test_399() { testValid(test_399_sup,test_399_sub); }

		private static final SyntacticType test_400_sup = parse("{int, int}");
		private static final SyntacticType test_400_sub = parse("{any, any}");
		@Test public void test_400() { testInvalid(test_400_sup,test_400_sub); }

		private static final SyntacticType test_401_sup = parse("{int, int}");
		private static final SyntacticType test_401_sub = parse("{int, any}");
		@Test public void test_401() { testInvalid(test_401_sup,test_401_sub); }

		private static final SyntacticType test_402_sup = parse("{int, int}");
		private static final SyntacticType test_402_sub = parse("{any, int}");
		@Test public void test_402() { testInvalid(test_402_sup,test_402_sub); }

		private static final SyntacticType test_403_sup = parse("{int, int}");
		private static final SyntacticType test_403_sub = parse("{int, int}");
		@Test public void test_403() { testValid(test_403_sup,test_403_sub); }

		private static final SyntacticType test_404_sup = parse("{int, int}");
		private static final SyntacticType test_404_sub = parse("(any | any)");
		@Test public void test_404() { testInvalid(test_404_sup,test_404_sub); }

		private static final SyntacticType test_405_sup = parse("{int, int}");
		private static final SyntacticType test_405_sub = parse("(int | any)");
		@Test public void test_405() { testInvalid(test_405_sup,test_405_sub); }

		private static final SyntacticType test_406_sup = parse("{int, int}");
		private static final SyntacticType test_406_sub = parse("(any | int)");
		@Test public void test_406() { testInvalid(test_406_sup,test_406_sub); }

		private static final SyntacticType test_407_sup = parse("{int, int}");
		private static final SyntacticType test_407_sub = parse("(int | int)");
		@Test public void test_407() { testInvalid(test_407_sup,test_407_sub); }

		private static final SyntacticType test_408_sup = parse("{int, int}");
		private static final SyntacticType test_408_sub = parse("(any | any)");
		@Test public void test_408() { testInvalid(test_408_sup,test_408_sub); }

		private static final SyntacticType test_409_sup = parse("{int, int}");
		private static final SyntacticType test_409_sub = parse("(int | any)");
		@Test public void test_409() { testInvalid(test_409_sup,test_409_sub); }

		private static final SyntacticType test_410_sup = parse("{int, int}");
		private static final SyntacticType test_410_sub = parse("(any | int)");
		@Test public void test_410() { testInvalid(test_410_sup,test_410_sub); }

		private static final SyntacticType test_411_sup = parse("{int, int}");
		private static final SyntacticType test_411_sub = parse("(int | int)");
		@Test public void test_411() { testInvalid(test_411_sup,test_411_sub); }

		private static final SyntacticType test_412_sup = parse("{int, int}");
		private static final SyntacticType test_412_sub = parse("(any & any)");
		@Test public void test_412() { testInvalid(test_412_sup,test_412_sub); }

		private static final SyntacticType test_413_sup = parse("{int, int}");
		private static final SyntacticType test_413_sub = parse("(int & any)");
		@Test public void test_413() { testInvalid(test_413_sup,test_413_sub); }

		private static final SyntacticType test_414_sup = parse("{int, int}");
		private static final SyntacticType test_414_sub = parse("(any & int)");
		@Test public void test_414() { testInvalid(test_414_sup,test_414_sub); }

		private static final SyntacticType test_415_sup = parse("{int, int}");
		private static final SyntacticType test_415_sub = parse("(int & int)");
		@Test public void test_415() { testInvalid(test_415_sup,test_415_sub); }

		private static final SyntacticType test_416_sup = parse("{int, int}");
		private static final SyntacticType test_416_sub = parse("(any & any)");
		@Test public void test_416() { testInvalid(test_416_sup,test_416_sub); }

		private static final SyntacticType test_417_sup = parse("{int, int}");
		private static final SyntacticType test_417_sub = parse("(int & any)");
		@Test public void test_417() { testInvalid(test_417_sup,test_417_sub); }

		private static final SyntacticType test_418_sup = parse("{int, int}");
		private static final SyntacticType test_418_sub = parse("(any & int)");
		@Test public void test_418() { testInvalid(test_418_sup,test_418_sub); }

		private static final SyntacticType test_419_sup = parse("{int, int}");
		private static final SyntacticType test_419_sub = parse("(int & int)");
		@Test public void test_419() { testInvalid(test_419_sup,test_419_sub); }

		private static final SyntacticType test_420_sup = parse("(any | any)");
		private static final SyntacticType test_420_sub = parse("any");
		@Test public void test_420() { testValid(test_420_sup,test_420_sub); }

		private static final SyntacticType test_421_sup = parse("(any | any)");
		private static final SyntacticType test_421_sub = parse("int");
		@Test public void test_421() { testValid(test_421_sup,test_421_sub); }

		private static final SyntacticType test_422_sup = parse("(any | any)");
		private static final SyntacticType test_422_sub = parse("{any}");
		@Test public void test_422() { testValid(test_422_sup,test_422_sub); }

		private static final SyntacticType test_423_sup = parse("(any | any)");
		private static final SyntacticType test_423_sub = parse("{int}");
		@Test public void test_423() { testValid(test_423_sup,test_423_sub); }

		private static final SyntacticType test_424_sup = parse("(any | any)");
		private static final SyntacticType test_424_sub = parse("!any");
		@Test public void test_424() { testValid(test_424_sup,test_424_sub); }

		private static final SyntacticType test_425_sup = parse("(any | any)");
		private static final SyntacticType test_425_sub = parse("!int");
		@Test public void test_425() { testValid(test_425_sup,test_425_sub); }

		private static final SyntacticType test_426_sup = parse("(any | any)");
		private static final SyntacticType test_426_sub = parse("{any, any}");
		@Test public void test_426() { testValid(test_426_sup,test_426_sub); }

		private static final SyntacticType test_427_sup = parse("(any | any)");
		private static final SyntacticType test_427_sub = parse("{int, any}");
		@Test public void test_427() { testValid(test_427_sup,test_427_sub); }

		private static final SyntacticType test_428_sup = parse("(any | any)");
		private static final SyntacticType test_428_sub = parse("{any, int}");
		@Test public void test_428() { testValid(test_428_sup,test_428_sub); }

		private static final SyntacticType test_429_sup = parse("(any | any)");
		private static final SyntacticType test_429_sub = parse("{int, int}");
		@Test public void test_429() { testValid(test_429_sup,test_429_sub); }

		private static final SyntacticType test_430_sup = parse("(any | any)");
		private static final SyntacticType test_430_sub = parse("{any, any}");
		@Test public void test_430() { testValid(test_430_sup,test_430_sub); }

		private static final SyntacticType test_431_sup = parse("(any | any)");
		private static final SyntacticType test_431_sub = parse("{int, any}");
		@Test public void test_431() { testValid(test_431_sup,test_431_sub); }

		private static final SyntacticType test_432_sup = parse("(any | any)");
		private static final SyntacticType test_432_sub = parse("{any, int}");
		@Test public void test_432() { testValid(test_432_sup,test_432_sub); }

		private static final SyntacticType test_433_sup = parse("(any | any)");
		private static final SyntacticType test_433_sub = parse("{int, int}");
		@Test public void test_433() { testValid(test_433_sup,test_433_sub); }

		private static final SyntacticType test_434_sup = parse("(any | any)");
		private static final SyntacticType test_434_sub = parse("(any | any)");
		@Test public void test_434() { testValid(test_434_sup,test_434_sub); }

		private static final SyntacticType test_435_sup = parse("(any | any)");
		private static final SyntacticType test_435_sub = parse("(int | any)");
		@Test public void test_435() { testValid(test_435_sup,test_435_sub); }

		private static final SyntacticType test_436_sup = parse("(any | any)");
		private static final SyntacticType test_436_sub = parse("(any | int)");
		@Test public void test_436() { testValid(test_436_sup,test_436_sub); }

		private static final SyntacticType test_437_sup = parse("(any | any)");
		private static final SyntacticType test_437_sub = parse("(int | int)");
		@Test public void test_437() { testValid(test_437_sup,test_437_sub); }

		private static final SyntacticType test_438_sup = parse("(any | any)");
		private static final SyntacticType test_438_sub = parse("(any | any)");
		@Test public void test_438() { testValid(test_438_sup,test_438_sub); }

		private static final SyntacticType test_439_sup = parse("(any | any)");
		private static final SyntacticType test_439_sub = parse("(int | any)");
		@Test public void test_439() { testValid(test_439_sup,test_439_sub); }

		private static final SyntacticType test_440_sup = parse("(any | any)");
		private static final SyntacticType test_440_sub = parse("(any | int)");
		@Test public void test_440() { testValid(test_440_sup,test_440_sub); }

		private static final SyntacticType test_441_sup = parse("(any | any)");
		private static final SyntacticType test_441_sub = parse("(int | int)");
		@Test public void test_441() { testValid(test_441_sup,test_441_sub); }

		private static final SyntacticType test_442_sup = parse("(any | any)");
		private static final SyntacticType test_442_sub = parse("(any & any)");
		@Test public void test_442() { testValid(test_442_sup,test_442_sub); }

		private static final SyntacticType test_443_sup = parse("(any | any)");
		private static final SyntacticType test_443_sub = parse("(int & any)");
		@Test public void test_443() { testValid(test_443_sup,test_443_sub); }

		private static final SyntacticType test_444_sup = parse("(any | any)");
		private static final SyntacticType test_444_sub = parse("(any & int)");
		@Test public void test_444() { testValid(test_444_sup,test_444_sub); }

		private static final SyntacticType test_445_sup = parse("(any | any)");
		private static final SyntacticType test_445_sub = parse("(int & int)");
		@Test public void test_445() { testValid(test_445_sup,test_445_sub); }

		private static final SyntacticType test_446_sup = parse("(any | any)");
		private static final SyntacticType test_446_sub = parse("(any & any)");
		@Test public void test_446() { testValid(test_446_sup,test_446_sub); }

		private static final SyntacticType test_447_sup = parse("(any | any)");
		private static final SyntacticType test_447_sub = parse("(int & any)");
		@Test public void test_447() { testValid(test_447_sup,test_447_sub); }

		private static final SyntacticType test_448_sup = parse("(any | any)");
		private static final SyntacticType test_448_sub = parse("(any & int)");
		@Test public void test_448() { testValid(test_448_sup,test_448_sub); }

		private static final SyntacticType test_449_sup = parse("(any | any)");
		private static final SyntacticType test_449_sub = parse("(int & int)");
		@Test public void test_449() { testValid(test_449_sup,test_449_sub); }

		private static final SyntacticType test_450_sup = parse("(int | any)");
		private static final SyntacticType test_450_sub = parse("any");
		@Test public void test_450() { testValid(test_450_sup,test_450_sub); }

		private static final SyntacticType test_451_sup = parse("(int | any)");
		private static final SyntacticType test_451_sub = parse("int");
		@Test public void test_451() { testValid(test_451_sup,test_451_sub); }

		private static final SyntacticType test_452_sup = parse("(int | any)");
		private static final SyntacticType test_452_sub = parse("{any}");
		@Test public void test_452() { testValid(test_452_sup,test_452_sub); }

		private static final SyntacticType test_453_sup = parse("(int | any)");
		private static final SyntacticType test_453_sub = parse("{int}");
		@Test public void test_453() { testValid(test_453_sup,test_453_sub); }

		private static final SyntacticType test_454_sup = parse("(int | any)");
		private static final SyntacticType test_454_sub = parse("!any");
		@Test public void test_454() { testValid(test_454_sup,test_454_sub); }

		private static final SyntacticType test_455_sup = parse("(int | any)");
		private static final SyntacticType test_455_sub = parse("!int");
		@Test public void test_455() { testValid(test_455_sup,test_455_sub); }

		private static final SyntacticType test_456_sup = parse("(int | any)");
		private static final SyntacticType test_456_sub = parse("{any, any}");
		@Test public void test_456() { testValid(test_456_sup,test_456_sub); }

		private static final SyntacticType test_457_sup = parse("(int | any)");
		private static final SyntacticType test_457_sub = parse("{int, any}");
		@Test public void test_457() { testValid(test_457_sup,test_457_sub); }

		private static final SyntacticType test_458_sup = parse("(int | any)");
		private static final SyntacticType test_458_sub = parse("{any, int}");
		@Test public void test_458() { testValid(test_458_sup,test_458_sub); }

		private static final SyntacticType test_459_sup = parse("(int | any)");
		private static final SyntacticType test_459_sub = parse("{int, int}");
		@Test public void test_459() { testValid(test_459_sup,test_459_sub); }

		private static final SyntacticType test_460_sup = parse("(int | any)");
		private static final SyntacticType test_460_sub = parse("{any, any}");
		@Test public void test_460() { testValid(test_460_sup,test_460_sub); }

		private static final SyntacticType test_461_sup = parse("(int | any)");
		private static final SyntacticType test_461_sub = parse("{int, any}");
		@Test public void test_461() { testValid(test_461_sup,test_461_sub); }

		private static final SyntacticType test_462_sup = parse("(int | any)");
		private static final SyntacticType test_462_sub = parse("{any, int}");
		@Test public void test_462() { testValid(test_462_sup,test_462_sub); }

		private static final SyntacticType test_463_sup = parse("(int | any)");
		private static final SyntacticType test_463_sub = parse("{int, int}");
		@Test public void test_463() { testValid(test_463_sup,test_463_sub); }

		private static final SyntacticType test_464_sup = parse("(int | any)");
		private static final SyntacticType test_464_sub = parse("(any | any)");
		@Test public void test_464() { testValid(test_464_sup,test_464_sub); }

		private static final SyntacticType test_465_sup = parse("(int | any)");
		private static final SyntacticType test_465_sub = parse("(int | any)");
		@Test public void test_465() { testValid(test_465_sup,test_465_sub); }

		private static final SyntacticType test_466_sup = parse("(int | any)");
		private static final SyntacticType test_466_sub = parse("(any | int)");
		@Test public void test_466() { testValid(test_466_sup,test_466_sub); }

		private static final SyntacticType test_467_sup = parse("(int | any)");
		private static final SyntacticType test_467_sub = parse("(int | int)");
		@Test public void test_467() { testValid(test_467_sup,test_467_sub); }

		private static final SyntacticType test_468_sup = parse("(int | any)");
		private static final SyntacticType test_468_sub = parse("(any | any)");
		@Test public void test_468() { testValid(test_468_sup,test_468_sub); }

		private static final SyntacticType test_469_sup = parse("(int | any)");
		private static final SyntacticType test_469_sub = parse("(int | any)");
		@Test public void test_469() { testValid(test_469_sup,test_469_sub); }

		private static final SyntacticType test_470_sup = parse("(int | any)");
		private static final SyntacticType test_470_sub = parse("(any | int)");
		@Test public void test_470() { testValid(test_470_sup,test_470_sub); }

		private static final SyntacticType test_471_sup = parse("(int | any)");
		private static final SyntacticType test_471_sub = parse("(int | int)");
		@Test public void test_471() { testValid(test_471_sup,test_471_sub); }

		private static final SyntacticType test_472_sup = parse("(int | any)");
		private static final SyntacticType test_472_sub = parse("(any & any)");
		@Test public void test_472() { testValid(test_472_sup,test_472_sub); }

		private static final SyntacticType test_473_sup = parse("(int | any)");
		private static final SyntacticType test_473_sub = parse("(int & any)");
		@Test public void test_473() { testValid(test_473_sup,test_473_sub); }

		private static final SyntacticType test_474_sup = parse("(int | any)");
		private static final SyntacticType test_474_sub = parse("(any & int)");
		@Test public void test_474() { testValid(test_474_sup,test_474_sub); }

		private static final SyntacticType test_475_sup = parse("(int | any)");
		private static final SyntacticType test_475_sub = parse("(int & int)");
		@Test public void test_475() { testValid(test_475_sup,test_475_sub); }

		private static final SyntacticType test_476_sup = parse("(int | any)");
		private static final SyntacticType test_476_sub = parse("(any & any)");
		@Test public void test_476() { testValid(test_476_sup,test_476_sub); }

		private static final SyntacticType test_477_sup = parse("(int | any)");
		private static final SyntacticType test_477_sub = parse("(int & any)");
		@Test public void test_477() { testValid(test_477_sup,test_477_sub); }

		private static final SyntacticType test_478_sup = parse("(int | any)");
		private static final SyntacticType test_478_sub = parse("(any & int)");
		@Test public void test_478() { testValid(test_478_sup,test_478_sub); }

		private static final SyntacticType test_479_sup = parse("(int | any)");
		private static final SyntacticType test_479_sub = parse("(int & int)");
		@Test public void test_479() { testValid(test_479_sup,test_479_sub); }

		private static final SyntacticType test_480_sup = parse("(any | int)");
		private static final SyntacticType test_480_sub = parse("any");
		@Test public void test_480() { testValid(test_480_sup,test_480_sub); }

		private static final SyntacticType test_481_sup = parse("(any | int)");
		private static final SyntacticType test_481_sub = parse("int");
		@Test public void test_481() { testValid(test_481_sup,test_481_sub); }

		private static final SyntacticType test_482_sup = parse("(any | int)");
		private static final SyntacticType test_482_sub = parse("{any}");
		@Test public void test_482() { testValid(test_482_sup,test_482_sub); }

		private static final SyntacticType test_483_sup = parse("(any | int)");
		private static final SyntacticType test_483_sub = parse("{int}");
		@Test public void test_483() { testValid(test_483_sup,test_483_sub); }

		private static final SyntacticType test_484_sup = parse("(any | int)");
		private static final SyntacticType test_484_sub = parse("!any");
		@Test public void test_484() { testValid(test_484_sup,test_484_sub); }

		private static final SyntacticType test_485_sup = parse("(any | int)");
		private static final SyntacticType test_485_sub = parse("!int");
		@Test public void test_485() { testValid(test_485_sup,test_485_sub); }

		private static final SyntacticType test_486_sup = parse("(any | int)");
		private static final SyntacticType test_486_sub = parse("{any, any}");
		@Test public void test_486() { testValid(test_486_sup,test_486_sub); }

		private static final SyntacticType test_487_sup = parse("(any | int)");
		private static final SyntacticType test_487_sub = parse("{int, any}");
		@Test public void test_487() { testValid(test_487_sup,test_487_sub); }

		private static final SyntacticType test_488_sup = parse("(any | int)");
		private static final SyntacticType test_488_sub = parse("{any, int}");
		@Test public void test_488() { testValid(test_488_sup,test_488_sub); }

		private static final SyntacticType test_489_sup = parse("(any | int)");
		private static final SyntacticType test_489_sub = parse("{int, int}");
		@Test public void test_489() { testValid(test_489_sup,test_489_sub); }

		private static final SyntacticType test_490_sup = parse("(any | int)");
		private static final SyntacticType test_490_sub = parse("{any, any}");
		@Test public void test_490() { testValid(test_490_sup,test_490_sub); }

		private static final SyntacticType test_491_sup = parse("(any | int)");
		private static final SyntacticType test_491_sub = parse("{int, any}");
		@Test public void test_491() { testValid(test_491_sup,test_491_sub); }

		private static final SyntacticType test_492_sup = parse("(any | int)");
		private static final SyntacticType test_492_sub = parse("{any, int}");
		@Test public void test_492() { testValid(test_492_sup,test_492_sub); }

		private static final SyntacticType test_493_sup = parse("(any | int)");
		private static final SyntacticType test_493_sub = parse("{int, int}");
		@Test public void test_493() { testValid(test_493_sup,test_493_sub); }

		private static final SyntacticType test_494_sup = parse("(any | int)");
		private static final SyntacticType test_494_sub = parse("(any | any)");
		@Test public void test_494() { testValid(test_494_sup,test_494_sub); }

		private static final SyntacticType test_495_sup = parse("(any | int)");
		private static final SyntacticType test_495_sub = parse("(int | any)");
		@Test public void test_495() { testValid(test_495_sup,test_495_sub); }

		private static final SyntacticType test_496_sup = parse("(any | int)");
		private static final SyntacticType test_496_sub = parse("(any | int)");
		@Test public void test_496() { testValid(test_496_sup,test_496_sub); }

		private static final SyntacticType test_497_sup = parse("(any | int)");
		private static final SyntacticType test_497_sub = parse("(int | int)");
		@Test public void test_497() { testValid(test_497_sup,test_497_sub); }

		private static final SyntacticType test_498_sup = parse("(any | int)");
		private static final SyntacticType test_498_sub = parse("(any | any)");
		@Test public void test_498() { testValid(test_498_sup,test_498_sub); }

		private static final SyntacticType test_499_sup = parse("(any | int)");
		private static final SyntacticType test_499_sub = parse("(int | any)");
		@Test public void test_499() { testValid(test_499_sup,test_499_sub); }

		private static final SyntacticType test_500_sup = parse("(any | int)");
		private static final SyntacticType test_500_sub = parse("(any | int)");
		@Test public void test_500() { testValid(test_500_sup,test_500_sub); }

		private static final SyntacticType test_501_sup = parse("(any | int)");
		private static final SyntacticType test_501_sub = parse("(int | int)");
		@Test public void test_501() { testValid(test_501_sup,test_501_sub); }

		private static final SyntacticType test_502_sup = parse("(any | int)");
		private static final SyntacticType test_502_sub = parse("(any & any)");
		@Test public void test_502() { testValid(test_502_sup,test_502_sub); }

		private static final SyntacticType test_503_sup = parse("(any | int)");
		private static final SyntacticType test_503_sub = parse("(int & any)");
		@Test public void test_503() { testValid(test_503_sup,test_503_sub); }

		private static final SyntacticType test_504_sup = parse("(any | int)");
		private static final SyntacticType test_504_sub = parse("(any & int)");
		@Test public void test_504() { testValid(test_504_sup,test_504_sub); }

		private static final SyntacticType test_505_sup = parse("(any | int)");
		private static final SyntacticType test_505_sub = parse("(int & int)");
		@Test public void test_505() { testValid(test_505_sup,test_505_sub); }

		private static final SyntacticType test_506_sup = parse("(any | int)");
		private static final SyntacticType test_506_sub = parse("(any & any)");
		@Test public void test_506() { testValid(test_506_sup,test_506_sub); }

		private static final SyntacticType test_507_sup = parse("(any | int)");
		private static final SyntacticType test_507_sub = parse("(int & any)");
		@Test public void test_507() { testValid(test_507_sup,test_507_sub); }

		private static final SyntacticType test_508_sup = parse("(any | int)");
		private static final SyntacticType test_508_sub = parse("(any & int)");
		@Test public void test_508() { testValid(test_508_sup,test_508_sub); }

		private static final SyntacticType test_509_sup = parse("(any | int)");
		private static final SyntacticType test_509_sub = parse("(int & int)");
		@Test public void test_509() { testValid(test_509_sup,test_509_sub); }

		private static final SyntacticType test_510_sup = parse("(int | int)");
		private static final SyntacticType test_510_sub = parse("any");
		@Test public void test_510() { testInvalid(test_510_sup,test_510_sub); }

		private static final SyntacticType test_511_sup = parse("(int | int)");
		private static final SyntacticType test_511_sub = parse("int");
		@Test public void test_511() { testValid(test_511_sup,test_511_sub); }

		private static final SyntacticType test_512_sup = parse("(int | int)");
		private static final SyntacticType test_512_sub = parse("{any}");
		@Test public void test_512() { testInvalid(test_512_sup,test_512_sub); }

		private static final SyntacticType test_513_sup = parse("(int | int)");
		private static final SyntacticType test_513_sub = parse("{int}");
		@Test public void test_513() { testInvalid(test_513_sup,test_513_sub); }

		private static final SyntacticType test_514_sup = parse("(int | int)");
		private static final SyntacticType test_514_sub = parse("!any");
		@Test public void test_514() { testValid(test_514_sup,test_514_sub); }

		private static final SyntacticType test_515_sup = parse("(int | int)");
		private static final SyntacticType test_515_sub = parse("!int");
		@Test public void test_515() { testInvalid(test_515_sup,test_515_sub); }

		private static final SyntacticType test_516_sup = parse("(int | int)");
		private static final SyntacticType test_516_sub = parse("{any, any}");
		@Test public void test_516() { testInvalid(test_516_sup,test_516_sub); }

		private static final SyntacticType test_517_sup = parse("(int | int)");
		private static final SyntacticType test_517_sub = parse("{int, any}");
		@Test public void test_517() { testInvalid(test_517_sup,test_517_sub); }

		private static final SyntacticType test_518_sup = parse("(int | int)");
		private static final SyntacticType test_518_sub = parse("{any, int}");
		@Test public void test_518() { testInvalid(test_518_sup,test_518_sub); }

		private static final SyntacticType test_519_sup = parse("(int | int)");
		private static final SyntacticType test_519_sub = parse("{int, int}");
		@Test public void test_519() { testInvalid(test_519_sup,test_519_sub); }

		private static final SyntacticType test_520_sup = parse("(int | int)");
		private static final SyntacticType test_520_sub = parse("{any, any}");
		@Test public void test_520() { testInvalid(test_520_sup,test_520_sub); }

		private static final SyntacticType test_521_sup = parse("(int | int)");
		private static final SyntacticType test_521_sub = parse("{int, any}");
		@Test public void test_521() { testInvalid(test_521_sup,test_521_sub); }

		private static final SyntacticType test_522_sup = parse("(int | int)");
		private static final SyntacticType test_522_sub = parse("{any, int}");
		@Test public void test_522() { testInvalid(test_522_sup,test_522_sub); }

		private static final SyntacticType test_523_sup = parse("(int | int)");
		private static final SyntacticType test_523_sub = parse("{int, int}");
		@Test public void test_523() { testInvalid(test_523_sup,test_523_sub); }

		private static final SyntacticType test_524_sup = parse("(int | int)");
		private static final SyntacticType test_524_sub = parse("(any | any)");
		@Test public void test_524() { testInvalid(test_524_sup,test_524_sub); }

		private static final SyntacticType test_525_sup = parse("(int | int)");
		private static final SyntacticType test_525_sub = parse("(int | any)");
		@Test public void test_525() { testInvalid(test_525_sup,test_525_sub); }

		private static final SyntacticType test_526_sup = parse("(int | int)");
		private static final SyntacticType test_526_sub = parse("(any | int)");
		@Test public void test_526() { testInvalid(test_526_sup,test_526_sub); }

		private static final SyntacticType test_527_sup = parse("(int | int)");
		private static final SyntacticType test_527_sub = parse("(int | int)");
		@Test public void test_527() { testValid(test_527_sup,test_527_sub); }

		private static final SyntacticType test_528_sup = parse("(int | int)");
		private static final SyntacticType test_528_sub = parse("(any | any)");
		@Test public void test_528() { testInvalid(test_528_sup,test_528_sub); }

		private static final SyntacticType test_529_sup = parse("(int | int)");
		private static final SyntacticType test_529_sub = parse("(int | any)");
		@Test public void test_529() { testInvalid(test_529_sup,test_529_sub); }

		private static final SyntacticType test_530_sup = parse("(int | int)");
		private static final SyntacticType test_530_sub = parse("(any | int)");
		@Test public void test_530() { testInvalid(test_530_sup,test_530_sub); }

		private static final SyntacticType test_531_sup = parse("(int | int)");
		private static final SyntacticType test_531_sub = parse("(int | int)");
		@Test public void test_531() { testValid(test_531_sup,test_531_sub); }

		private static final SyntacticType test_532_sup = parse("(int | int)");
		private static final SyntacticType test_532_sub = parse("(any & any)");
		@Test public void test_532() { testInvalid(test_532_sup,test_532_sub); }

		private static final SyntacticType test_533_sup = parse("(int | int)");
		private static final SyntacticType test_533_sub = parse("(int & any)");
		@Test public void test_533() { testValid(test_533_sup,test_533_sub); }

		private static final SyntacticType test_534_sup = parse("(int | int)");
		private static final SyntacticType test_534_sub = parse("(any & int)");
		@Test public void test_534() { testValid(test_534_sup,test_534_sub); }

		private static final SyntacticType test_535_sup = parse("(int | int)");
		private static final SyntacticType test_535_sub = parse("(int & int)");
		@Test public void test_535() { testValid(test_535_sup,test_535_sub); }

		private static final SyntacticType test_536_sup = parse("(int | int)");
		private static final SyntacticType test_536_sub = parse("(any & any)");
		@Test public void test_536() { testInvalid(test_536_sup,test_536_sub); }

		private static final SyntacticType test_537_sup = parse("(int | int)");
		private static final SyntacticType test_537_sub = parse("(int & any)");
		@Test public void test_537() { testValid(test_537_sup,test_537_sub); }

		private static final SyntacticType test_538_sup = parse("(int | int)");
		private static final SyntacticType test_538_sub = parse("(any & int)");
		@Test public void test_538() { testValid(test_538_sup,test_538_sub); }

		private static final SyntacticType test_539_sup = parse("(int | int)");
		private static final SyntacticType test_539_sub = parse("(int & int)");
		@Test public void test_539() { testValid(test_539_sup,test_539_sub); }

		private static final SyntacticType test_540_sup = parse("(any | any)");
		private static final SyntacticType test_540_sub = parse("any");
		@Test public void test_540() { testValid(test_540_sup,test_540_sub); }

		private static final SyntacticType test_541_sup = parse("(any | any)");
		private static final SyntacticType test_541_sub = parse("int");
		@Test public void test_541() { testValid(test_541_sup,test_541_sub); }

		private static final SyntacticType test_542_sup = parse("(any | any)");
		private static final SyntacticType test_542_sub = parse("{any}");
		@Test public void test_542() { testValid(test_542_sup,test_542_sub); }

		private static final SyntacticType test_543_sup = parse("(any | any)");
		private static final SyntacticType test_543_sub = parse("{int}");
		@Test public void test_543() { testValid(test_543_sup,test_543_sub); }

		private static final SyntacticType test_544_sup = parse("(any | any)");
		private static final SyntacticType test_544_sub = parse("!any");
		@Test public void test_544() { testValid(test_544_sup,test_544_sub); }

		private static final SyntacticType test_545_sup = parse("(any | any)");
		private static final SyntacticType test_545_sub = parse("!int");
		@Test public void test_545() { testValid(test_545_sup,test_545_sub); }

		private static final SyntacticType test_546_sup = parse("(any | any)");
		private static final SyntacticType test_546_sub = parse("{any, any}");
		@Test public void test_546() { testValid(test_546_sup,test_546_sub); }

		private static final SyntacticType test_547_sup = parse("(any | any)");
		private static final SyntacticType test_547_sub = parse("{int, any}");
		@Test public void test_547() { testValid(test_547_sup,test_547_sub); }

		private static final SyntacticType test_548_sup = parse("(any | any)");
		private static final SyntacticType test_548_sub = parse("{any, int}");
		@Test public void test_548() { testValid(test_548_sup,test_548_sub); }

		private static final SyntacticType test_549_sup = parse("(any | any)");
		private static final SyntacticType test_549_sub = parse("{int, int}");
		@Test public void test_549() { testValid(test_549_sup,test_549_sub); }

		private static final SyntacticType test_550_sup = parse("(any | any)");
		private static final SyntacticType test_550_sub = parse("{any, any}");
		@Test public void test_550() { testValid(test_550_sup,test_550_sub); }

		private static final SyntacticType test_551_sup = parse("(any | any)");
		private static final SyntacticType test_551_sub = parse("{int, any}");
		@Test public void test_551() { testValid(test_551_sup,test_551_sub); }

		private static final SyntacticType test_552_sup = parse("(any | any)");
		private static final SyntacticType test_552_sub = parse("{any, int}");
		@Test public void test_552() { testValid(test_552_sup,test_552_sub); }

		private static final SyntacticType test_553_sup = parse("(any | any)");
		private static final SyntacticType test_553_sub = parse("{int, int}");
		@Test public void test_553() { testValid(test_553_sup,test_553_sub); }

		private static final SyntacticType test_554_sup = parse("(any | any)");
		private static final SyntacticType test_554_sub = parse("(any | any)");
		@Test public void test_554() { testValid(test_554_sup,test_554_sub); }

		private static final SyntacticType test_555_sup = parse("(any | any)");
		private static final SyntacticType test_555_sub = parse("(int | any)");
		@Test public void test_555() { testValid(test_555_sup,test_555_sub); }

		private static final SyntacticType test_556_sup = parse("(any | any)");
		private static final SyntacticType test_556_sub = parse("(any | int)");
		@Test public void test_556() { testValid(test_556_sup,test_556_sub); }

		private static final SyntacticType test_557_sup = parse("(any | any)");
		private static final SyntacticType test_557_sub = parse("(int | int)");
		@Test public void test_557() { testValid(test_557_sup,test_557_sub); }

		private static final SyntacticType test_558_sup = parse("(any | any)");
		private static final SyntacticType test_558_sub = parse("(any | any)");
		@Test public void test_558() { testValid(test_558_sup,test_558_sub); }

		private static final SyntacticType test_559_sup = parse("(any | any)");
		private static final SyntacticType test_559_sub = parse("(int | any)");
		@Test public void test_559() { testValid(test_559_sup,test_559_sub); }

		private static final SyntacticType test_560_sup = parse("(any | any)");
		private static final SyntacticType test_560_sub = parse("(any | int)");
		@Test public void test_560() { testValid(test_560_sup,test_560_sub); }

		private static final SyntacticType test_561_sup = parse("(any | any)");
		private static final SyntacticType test_561_sub = parse("(int | int)");
		@Test public void test_561() { testValid(test_561_sup,test_561_sub); }

		private static final SyntacticType test_562_sup = parse("(any | any)");
		private static final SyntacticType test_562_sub = parse("(any & any)");
		@Test public void test_562() { testValid(test_562_sup,test_562_sub); }

		private static final SyntacticType test_563_sup = parse("(any | any)");
		private static final SyntacticType test_563_sub = parse("(int & any)");
		@Test public void test_563() { testValid(test_563_sup,test_563_sub); }

		private static final SyntacticType test_564_sup = parse("(any | any)");
		private static final SyntacticType test_564_sub = parse("(any & int)");
		@Test public void test_564() { testValid(test_564_sup,test_564_sub); }

		private static final SyntacticType test_565_sup = parse("(any | any)");
		private static final SyntacticType test_565_sub = parse("(int & int)");
		@Test public void test_565() { testValid(test_565_sup,test_565_sub); }

		private static final SyntacticType test_566_sup = parse("(any | any)");
		private static final SyntacticType test_566_sub = parse("(any & any)");
		@Test public void test_566() { testValid(test_566_sup,test_566_sub); }

		private static final SyntacticType test_567_sup = parse("(any | any)");
		private static final SyntacticType test_567_sub = parse("(int & any)");
		@Test public void test_567() { testValid(test_567_sup,test_567_sub); }

		private static final SyntacticType test_568_sup = parse("(any | any)");
		private static final SyntacticType test_568_sub = parse("(any & int)");
		@Test public void test_568() { testValid(test_568_sup,test_568_sub); }

		private static final SyntacticType test_569_sup = parse("(any | any)");
		private static final SyntacticType test_569_sub = parse("(int & int)");
		@Test public void test_569() { testValid(test_569_sup,test_569_sub); }

		private static final SyntacticType test_570_sup = parse("(int | any)");
		private static final SyntacticType test_570_sub = parse("any");
		@Test public void test_570() { testValid(test_570_sup,test_570_sub); }

		private static final SyntacticType test_571_sup = parse("(int | any)");
		private static final SyntacticType test_571_sub = parse("int");
		@Test public void test_571() { testValid(test_571_sup,test_571_sub); }

		private static final SyntacticType test_572_sup = parse("(int | any)");
		private static final SyntacticType test_572_sub = parse("{any}");
		@Test public void test_572() { testValid(test_572_sup,test_572_sub); }

		private static final SyntacticType test_573_sup = parse("(int | any)");
		private static final SyntacticType test_573_sub = parse("{int}");
		@Test public void test_573() { testValid(test_573_sup,test_573_sub); }

		private static final SyntacticType test_574_sup = parse("(int | any)");
		private static final SyntacticType test_574_sub = parse("!any");
		@Test public void test_574() { testValid(test_574_sup,test_574_sub); }

		private static final SyntacticType test_575_sup = parse("(int | any)");
		private static final SyntacticType test_575_sub = parse("!int");
		@Test public void test_575() { testValid(test_575_sup,test_575_sub); }

		private static final SyntacticType test_576_sup = parse("(int | any)");
		private static final SyntacticType test_576_sub = parse("{any, any}");
		@Test public void test_576() { testValid(test_576_sup,test_576_sub); }

		private static final SyntacticType test_577_sup = parse("(int | any)");
		private static final SyntacticType test_577_sub = parse("{int, any}");
		@Test public void test_577() { testValid(test_577_sup,test_577_sub); }

		private static final SyntacticType test_578_sup = parse("(int | any)");
		private static final SyntacticType test_578_sub = parse("{any, int}");
		@Test public void test_578() { testValid(test_578_sup,test_578_sub); }

		private static final SyntacticType test_579_sup = parse("(int | any)");
		private static final SyntacticType test_579_sub = parse("{int, int}");
		@Test public void test_579() { testValid(test_579_sup,test_579_sub); }

		private static final SyntacticType test_580_sup = parse("(int | any)");
		private static final SyntacticType test_580_sub = parse("{any, any}");
		@Test public void test_580() { testValid(test_580_sup,test_580_sub); }

		private static final SyntacticType test_581_sup = parse("(int | any)");
		private static final SyntacticType test_581_sub = parse("{int, any}");
		@Test public void test_581() { testValid(test_581_sup,test_581_sub); }

		private static final SyntacticType test_582_sup = parse("(int | any)");
		private static final SyntacticType test_582_sub = parse("{any, int}");
		@Test public void test_582() { testValid(test_582_sup,test_582_sub); }

		private static final SyntacticType test_583_sup = parse("(int | any)");
		private static final SyntacticType test_583_sub = parse("{int, int}");
		@Test public void test_583() { testValid(test_583_sup,test_583_sub); }

		private static final SyntacticType test_584_sup = parse("(int | any)");
		private static final SyntacticType test_584_sub = parse("(any | any)");
		@Test public void test_584() { testValid(test_584_sup,test_584_sub); }

		private static final SyntacticType test_585_sup = parse("(int | any)");
		private static final SyntacticType test_585_sub = parse("(int | any)");
		@Test public void test_585() { testValid(test_585_sup,test_585_sub); }

		private static final SyntacticType test_586_sup = parse("(int | any)");
		private static final SyntacticType test_586_sub = parse("(any | int)");
		@Test public void test_586() { testValid(test_586_sup,test_586_sub); }

		private static final SyntacticType test_587_sup = parse("(int | any)");
		private static final SyntacticType test_587_sub = parse("(int | int)");
		@Test public void test_587() { testValid(test_587_sup,test_587_sub); }

		private static final SyntacticType test_588_sup = parse("(int | any)");
		private static final SyntacticType test_588_sub = parse("(any | any)");
		@Test public void test_588() { testValid(test_588_sup,test_588_sub); }

		private static final SyntacticType test_589_sup = parse("(int | any)");
		private static final SyntacticType test_589_sub = parse("(int | any)");
		@Test public void test_589() { testValid(test_589_sup,test_589_sub); }

		private static final SyntacticType test_590_sup = parse("(int | any)");
		private static final SyntacticType test_590_sub = parse("(any | int)");
		@Test public void test_590() { testValid(test_590_sup,test_590_sub); }

		private static final SyntacticType test_591_sup = parse("(int | any)");
		private static final SyntacticType test_591_sub = parse("(int | int)");
		@Test public void test_591() { testValid(test_591_sup,test_591_sub); }

		private static final SyntacticType test_592_sup = parse("(int | any)");
		private static final SyntacticType test_592_sub = parse("(any & any)");
		@Test public void test_592() { testValid(test_592_sup,test_592_sub); }

		private static final SyntacticType test_593_sup = parse("(int | any)");
		private static final SyntacticType test_593_sub = parse("(int & any)");
		@Test public void test_593() { testValid(test_593_sup,test_593_sub); }

		private static final SyntacticType test_594_sup = parse("(int | any)");
		private static final SyntacticType test_594_sub = parse("(any & int)");
		@Test public void test_594() { testValid(test_594_sup,test_594_sub); }

		private static final SyntacticType test_595_sup = parse("(int | any)");
		private static final SyntacticType test_595_sub = parse("(int & int)");
		@Test public void test_595() { testValid(test_595_sup,test_595_sub); }

		private static final SyntacticType test_596_sup = parse("(int | any)");
		private static final SyntacticType test_596_sub = parse("(any & any)");
		@Test public void test_596() { testValid(test_596_sup,test_596_sub); }

		private static final SyntacticType test_597_sup = parse("(int | any)");
		private static final SyntacticType test_597_sub = parse("(int & any)");
		@Test public void test_597() { testValid(test_597_sup,test_597_sub); }

		private static final SyntacticType test_598_sup = parse("(int | any)");
		private static final SyntacticType test_598_sub = parse("(any & int)");
		@Test public void test_598() { testValid(test_598_sup,test_598_sub); }

		private static final SyntacticType test_599_sup = parse("(int | any)");
		private static final SyntacticType test_599_sub = parse("(int & int)");
		@Test public void test_599() { testValid(test_599_sup,test_599_sub); }

		private static final SyntacticType test_600_sup = parse("(any | int)");
		private static final SyntacticType test_600_sub = parse("any");
		@Test public void test_600() { testValid(test_600_sup,test_600_sub); }

		private static final SyntacticType test_601_sup = parse("(any | int)");
		private static final SyntacticType test_601_sub = parse("int");
		@Test public void test_601() { testValid(test_601_sup,test_601_sub); }

		private static final SyntacticType test_602_sup = parse("(any | int)");
		private static final SyntacticType test_602_sub = parse("{any}");
		@Test public void test_602() { testValid(test_602_sup,test_602_sub); }

		private static final SyntacticType test_603_sup = parse("(any | int)");
		private static final SyntacticType test_603_sub = parse("{int}");
		@Test public void test_603() { testValid(test_603_sup,test_603_sub); }

		private static final SyntacticType test_604_sup = parse("(any | int)");
		private static final SyntacticType test_604_sub = parse("!any");
		@Test public void test_604() { testValid(test_604_sup,test_604_sub); }

		private static final SyntacticType test_605_sup = parse("(any | int)");
		private static final SyntacticType test_605_sub = parse("!int");
		@Test public void test_605() { testValid(test_605_sup,test_605_sub); }

		private static final SyntacticType test_606_sup = parse("(any | int)");
		private static final SyntacticType test_606_sub = parse("{any, any}");
		@Test public void test_606() { testValid(test_606_sup,test_606_sub); }

		private static final SyntacticType test_607_sup = parse("(any | int)");
		private static final SyntacticType test_607_sub = parse("{int, any}");
		@Test public void test_607() { testValid(test_607_sup,test_607_sub); }

		private static final SyntacticType test_608_sup = parse("(any | int)");
		private static final SyntacticType test_608_sub = parse("{any, int}");
		@Test public void test_608() { testValid(test_608_sup,test_608_sub); }

		private static final SyntacticType test_609_sup = parse("(any | int)");
		private static final SyntacticType test_609_sub = parse("{int, int}");
		@Test public void test_609() { testValid(test_609_sup,test_609_sub); }

		private static final SyntacticType test_610_sup = parse("(any | int)");
		private static final SyntacticType test_610_sub = parse("{any, any}");
		@Test public void test_610() { testValid(test_610_sup,test_610_sub); }

		private static final SyntacticType test_611_sup = parse("(any | int)");
		private static final SyntacticType test_611_sub = parse("{int, any}");
		@Test public void test_611() { testValid(test_611_sup,test_611_sub); }

		private static final SyntacticType test_612_sup = parse("(any | int)");
		private static final SyntacticType test_612_sub = parse("{any, int}");
		@Test public void test_612() { testValid(test_612_sup,test_612_sub); }

		private static final SyntacticType test_613_sup = parse("(any | int)");
		private static final SyntacticType test_613_sub = parse("{int, int}");
		@Test public void test_613() { testValid(test_613_sup,test_613_sub); }

		private static final SyntacticType test_614_sup = parse("(any | int)");
		private static final SyntacticType test_614_sub = parse("(any | any)");
		@Test public void test_614() { testValid(test_614_sup,test_614_sub); }

		private static final SyntacticType test_615_sup = parse("(any | int)");
		private static final SyntacticType test_615_sub = parse("(int | any)");
		@Test public void test_615() { testValid(test_615_sup,test_615_sub); }

		private static final SyntacticType test_616_sup = parse("(any | int)");
		private static final SyntacticType test_616_sub = parse("(any | int)");
		@Test public void test_616() { testValid(test_616_sup,test_616_sub); }

		private static final SyntacticType test_617_sup = parse("(any | int)");
		private static final SyntacticType test_617_sub = parse("(int | int)");
		@Test public void test_617() { testValid(test_617_sup,test_617_sub); }

		private static final SyntacticType test_618_sup = parse("(any | int)");
		private static final SyntacticType test_618_sub = parse("(any | any)");
		@Test public void test_618() { testValid(test_618_sup,test_618_sub); }

		private static final SyntacticType test_619_sup = parse("(any | int)");
		private static final SyntacticType test_619_sub = parse("(int | any)");
		@Test public void test_619() { testValid(test_619_sup,test_619_sub); }

		private static final SyntacticType test_620_sup = parse("(any | int)");
		private static final SyntacticType test_620_sub = parse("(any | int)");
		@Test public void test_620() { testValid(test_620_sup,test_620_sub); }

		private static final SyntacticType test_621_sup = parse("(any | int)");
		private static final SyntacticType test_621_sub = parse("(int | int)");
		@Test public void test_621() { testValid(test_621_sup,test_621_sub); }

		private static final SyntacticType test_622_sup = parse("(any | int)");
		private static final SyntacticType test_622_sub = parse("(any & any)");
		@Test public void test_622() { testValid(test_622_sup,test_622_sub); }

		private static final SyntacticType test_623_sup = parse("(any | int)");
		private static final SyntacticType test_623_sub = parse("(int & any)");
		@Test public void test_623() { testValid(test_623_sup,test_623_sub); }

		private static final SyntacticType test_624_sup = parse("(any | int)");
		private static final SyntacticType test_624_sub = parse("(any & int)");
		@Test public void test_624() { testValid(test_624_sup,test_624_sub); }

		private static final SyntacticType test_625_sup = parse("(any | int)");
		private static final SyntacticType test_625_sub = parse("(int & int)");
		@Test public void test_625() { testValid(test_625_sup,test_625_sub); }

		private static final SyntacticType test_626_sup = parse("(any | int)");
		private static final SyntacticType test_626_sub = parse("(any & any)");
		@Test public void test_626() { testValid(test_626_sup,test_626_sub); }

		private static final SyntacticType test_627_sup = parse("(any | int)");
		private static final SyntacticType test_627_sub = parse("(int & any)");
		@Test public void test_627() { testValid(test_627_sup,test_627_sub); }

		private static final SyntacticType test_628_sup = parse("(any | int)");
		private static final SyntacticType test_628_sub = parse("(any & int)");
		@Test public void test_628() { testValid(test_628_sup,test_628_sub); }

		private static final SyntacticType test_629_sup = parse("(any | int)");
		private static final SyntacticType test_629_sub = parse("(int & int)");
		@Test public void test_629() { testValid(test_629_sup,test_629_sub); }

		private static final SyntacticType test_630_sup = parse("(int | int)");
		private static final SyntacticType test_630_sub = parse("any");
		@Test public void test_630() { testInvalid(test_630_sup,test_630_sub); }

		private static final SyntacticType test_631_sup = parse("(int | int)");
		private static final SyntacticType test_631_sub = parse("int");
		@Test public void test_631() { testValid(test_631_sup,test_631_sub); }

		private static final SyntacticType test_632_sup = parse("(int | int)");
		private static final SyntacticType test_632_sub = parse("{any}");
		@Test public void test_632() { testInvalid(test_632_sup,test_632_sub); }

		private static final SyntacticType test_633_sup = parse("(int | int)");
		private static final SyntacticType test_633_sub = parse("{int}");
		@Test public void test_633() { testInvalid(test_633_sup,test_633_sub); }

		private static final SyntacticType test_634_sup = parse("(int | int)");
		private static final SyntacticType test_634_sub = parse("!any");
		@Test public void test_634() { testValid(test_634_sup,test_634_sub); }

		private static final SyntacticType test_635_sup = parse("(int | int)");
		private static final SyntacticType test_635_sub = parse("!int");
		@Test public void test_635() { testInvalid(test_635_sup,test_635_sub); }

		private static final SyntacticType test_636_sup = parse("(int | int)");
		private static final SyntacticType test_636_sub = parse("{any, any}");
		@Test public void test_636() { testInvalid(test_636_sup,test_636_sub); }

		private static final SyntacticType test_637_sup = parse("(int | int)");
		private static final SyntacticType test_637_sub = parse("{int, any}");
		@Test public void test_637() { testInvalid(test_637_sup,test_637_sub); }

		private static final SyntacticType test_638_sup = parse("(int | int)");
		private static final SyntacticType test_638_sub = parse("{any, int}");
		@Test public void test_638() { testInvalid(test_638_sup,test_638_sub); }

		private static final SyntacticType test_639_sup = parse("(int | int)");
		private static final SyntacticType test_639_sub = parse("{int, int}");
		@Test public void test_639() { testInvalid(test_639_sup,test_639_sub); }

		private static final SyntacticType test_640_sup = parse("(int | int)");
		private static final SyntacticType test_640_sub = parse("{any, any}");
		@Test public void test_640() { testInvalid(test_640_sup,test_640_sub); }

		private static final SyntacticType test_641_sup = parse("(int | int)");
		private static final SyntacticType test_641_sub = parse("{int, any}");
		@Test public void test_641() { testInvalid(test_641_sup,test_641_sub); }

		private static final SyntacticType test_642_sup = parse("(int | int)");
		private static final SyntacticType test_642_sub = parse("{any, int}");
		@Test public void test_642() { testInvalid(test_642_sup,test_642_sub); }

		private static final SyntacticType test_643_sup = parse("(int | int)");
		private static final SyntacticType test_643_sub = parse("{int, int}");
		@Test public void test_643() { testInvalid(test_643_sup,test_643_sub); }

		private static final SyntacticType test_644_sup = parse("(int | int)");
		private static final SyntacticType test_644_sub = parse("(any | any)");
		@Test public void test_644() { testInvalid(test_644_sup,test_644_sub); }

		private static final SyntacticType test_645_sup = parse("(int | int)");
		private static final SyntacticType test_645_sub = parse("(int | any)");
		@Test public void test_645() { testInvalid(test_645_sup,test_645_sub); }

		private static final SyntacticType test_646_sup = parse("(int | int)");
		private static final SyntacticType test_646_sub = parse("(any | int)");
		@Test public void test_646() { testInvalid(test_646_sup,test_646_sub); }

		private static final SyntacticType test_647_sup = parse("(int | int)");
		private static final SyntacticType test_647_sub = parse("(int | int)");
		@Test public void test_647() { testValid(test_647_sup,test_647_sub); }

		private static final SyntacticType test_648_sup = parse("(int | int)");
		private static final SyntacticType test_648_sub = parse("(any | any)");
		@Test public void test_648() { testInvalid(test_648_sup,test_648_sub); }

		private static final SyntacticType test_649_sup = parse("(int | int)");
		private static final SyntacticType test_649_sub = parse("(int | any)");
		@Test public void test_649() { testInvalid(test_649_sup,test_649_sub); }

		private static final SyntacticType test_650_sup = parse("(int | int)");
		private static final SyntacticType test_650_sub = parse("(any | int)");
		@Test public void test_650() { testInvalid(test_650_sup,test_650_sub); }

		private static final SyntacticType test_651_sup = parse("(int | int)");
		private static final SyntacticType test_651_sub = parse("(int | int)");
		@Test public void test_651() { testValid(test_651_sup,test_651_sub); }

		private static final SyntacticType test_652_sup = parse("(int | int)");
		private static final SyntacticType test_652_sub = parse("(any & any)");
		@Test public void test_652() { testInvalid(test_652_sup,test_652_sub); }

		private static final SyntacticType test_653_sup = parse("(int | int)");
		private static final SyntacticType test_653_sub = parse("(int & any)");
		@Test public void test_653() { testValid(test_653_sup,test_653_sub); }

		private static final SyntacticType test_654_sup = parse("(int | int)");
		private static final SyntacticType test_654_sub = parse("(any & int)");
		@Test public void test_654() { testValid(test_654_sup,test_654_sub); }

		private static final SyntacticType test_655_sup = parse("(int | int)");
		private static final SyntacticType test_655_sub = parse("(int & int)");
		@Test public void test_655() { testValid(test_655_sup,test_655_sub); }

		private static final SyntacticType test_656_sup = parse("(int | int)");
		private static final SyntacticType test_656_sub = parse("(any & any)");
		@Test public void test_656() { testInvalid(test_656_sup,test_656_sub); }

		private static final SyntacticType test_657_sup = parse("(int | int)");
		private static final SyntacticType test_657_sub = parse("(int & any)");
		@Test public void test_657() { testValid(test_657_sup,test_657_sub); }

		private static final SyntacticType test_658_sup = parse("(int | int)");
		private static final SyntacticType test_658_sub = parse("(any & int)");
		@Test public void test_658() { testValid(test_658_sup,test_658_sub); }

		private static final SyntacticType test_659_sup = parse("(int | int)");
		private static final SyntacticType test_659_sub = parse("(int & int)");
		@Test public void test_659() { testValid(test_659_sup,test_659_sub); }

		private static final SyntacticType test_660_sup = parse("(any & any)");
		private static final SyntacticType test_660_sub = parse("any");
		@Test public void test_660() { testValid(test_660_sup,test_660_sub); }

		private static final SyntacticType test_661_sup = parse("(any & any)");
		private static final SyntacticType test_661_sub = parse("int");
		@Test public void test_661() { testValid(test_661_sup,test_661_sub); }

		private static final SyntacticType test_662_sup = parse("(any & any)");
		private static final SyntacticType test_662_sub = parse("{any}");
		@Test public void test_662() { testValid(test_662_sup,test_662_sub); }

		private static final SyntacticType test_663_sup = parse("(any & any)");
		private static final SyntacticType test_663_sub = parse("{int}");
		@Test public void test_663() { testValid(test_663_sup,test_663_sub); }

		private static final SyntacticType test_664_sup = parse("(any & any)");
		private static final SyntacticType test_664_sub = parse("!any");
		@Test public void test_664() { testValid(test_664_sup,test_664_sub); }

		private static final SyntacticType test_665_sup = parse("(any & any)");
		private static final SyntacticType test_665_sub = parse("!int");
		@Test public void test_665() { testValid(test_665_sup,test_665_sub); }

		private static final SyntacticType test_666_sup = parse("(any & any)");
		private static final SyntacticType test_666_sub = parse("{any, any}");
		@Test public void test_666() { testValid(test_666_sup,test_666_sub); }

		private static final SyntacticType test_667_sup = parse("(any & any)");
		private static final SyntacticType test_667_sub = parse("{int, any}");
		@Test public void test_667() { testValid(test_667_sup,test_667_sub); }

		private static final SyntacticType test_668_sup = parse("(any & any)");
		private static final SyntacticType test_668_sub = parse("{any, int}");
		@Test public void test_668() { testValid(test_668_sup,test_668_sub); }

		private static final SyntacticType test_669_sup = parse("(any & any)");
		private static final SyntacticType test_669_sub = parse("{int, int}");
		@Test public void test_669() { testValid(test_669_sup,test_669_sub); }

		private static final SyntacticType test_670_sup = parse("(any & any)");
		private static final SyntacticType test_670_sub = parse("{any, any}");
		@Test public void test_670() { testValid(test_670_sup,test_670_sub); }

		private static final SyntacticType test_671_sup = parse("(any & any)");
		private static final SyntacticType test_671_sub = parse("{int, any}");
		@Test public void test_671() { testValid(test_671_sup,test_671_sub); }

		private static final SyntacticType test_672_sup = parse("(any & any)");
		private static final SyntacticType test_672_sub = parse("{any, int}");
		@Test public void test_672() { testValid(test_672_sup,test_672_sub); }

		private static final SyntacticType test_673_sup = parse("(any & any)");
		private static final SyntacticType test_673_sub = parse("{int, int}");
		@Test public void test_673() { testValid(test_673_sup,test_673_sub); }

		private static final SyntacticType test_674_sup = parse("(any & any)");
		private static final SyntacticType test_674_sub = parse("(any | any)");
		@Test public void test_674() { testValid(test_674_sup,test_674_sub); }

		private static final SyntacticType test_675_sup = parse("(any & any)");
		private static final SyntacticType test_675_sub = parse("(int | any)");
		@Test public void test_675() { testValid(test_675_sup,test_675_sub); }

		private static final SyntacticType test_676_sup = parse("(any & any)");
		private static final SyntacticType test_676_sub = parse("(any | int)");
		@Test public void test_676() { testValid(test_676_sup,test_676_sub); }

		private static final SyntacticType test_677_sup = parse("(any & any)");
		private static final SyntacticType test_677_sub = parse("(int | int)");
		@Test public void test_677() { testValid(test_677_sup,test_677_sub); }

		private static final SyntacticType test_678_sup = parse("(any & any)");
		private static final SyntacticType test_678_sub = parse("(any | any)");
		@Test public void test_678() { testValid(test_678_sup,test_678_sub); }

		private static final SyntacticType test_679_sup = parse("(any & any)");
		private static final SyntacticType test_679_sub = parse("(int | any)");
		@Test public void test_679() { testValid(test_679_sup,test_679_sub); }

		private static final SyntacticType test_680_sup = parse("(any & any)");
		private static final SyntacticType test_680_sub = parse("(any | int)");
		@Test public void test_680() { testValid(test_680_sup,test_680_sub); }

		private static final SyntacticType test_681_sup = parse("(any & any)");
		private static final SyntacticType test_681_sub = parse("(int | int)");
		@Test public void test_681() { testValid(test_681_sup,test_681_sub); }

		private static final SyntacticType test_682_sup = parse("(any & any)");
		private static final SyntacticType test_682_sub = parse("(any & any)");
		@Test public void test_682() { testValid(test_682_sup,test_682_sub); }

		private static final SyntacticType test_683_sup = parse("(any & any)");
		private static final SyntacticType test_683_sub = parse("(int & any)");
		@Test public void test_683() { testValid(test_683_sup,test_683_sub); }

		private static final SyntacticType test_684_sup = parse("(any & any)");
		private static final SyntacticType test_684_sub = parse("(any & int)");
		@Test public void test_684() { testValid(test_684_sup,test_684_sub); }

		private static final SyntacticType test_685_sup = parse("(any & any)");
		private static final SyntacticType test_685_sub = parse("(int & int)");
		@Test public void test_685() { testValid(test_685_sup,test_685_sub); }

		private static final SyntacticType test_686_sup = parse("(any & any)");
		private static final SyntacticType test_686_sub = parse("(any & any)");
		@Test public void test_686() { testValid(test_686_sup,test_686_sub); }

		private static final SyntacticType test_687_sup = parse("(any & any)");
		private static final SyntacticType test_687_sub = parse("(int & any)");
		@Test public void test_687() { testValid(test_687_sup,test_687_sub); }

		private static final SyntacticType test_688_sup = parse("(any & any)");
		private static final SyntacticType test_688_sub = parse("(any & int)");
		@Test public void test_688() { testValid(test_688_sup,test_688_sub); }

		private static final SyntacticType test_689_sup = parse("(any & any)");
		private static final SyntacticType test_689_sub = parse("(int & int)");
		@Test public void test_689() { testValid(test_689_sup,test_689_sub); }

		private static final SyntacticType test_690_sup = parse("(int & any)");
		private static final SyntacticType test_690_sub = parse("any");
		@Test public void test_690() { testInvalid(test_690_sup,test_690_sub); }

		private static final SyntacticType test_691_sup = parse("(int & any)");
		private static final SyntacticType test_691_sub = parse("int");
		@Test public void test_691() { testValid(test_691_sup,test_691_sub); }

		private static final SyntacticType test_692_sup = parse("(int & any)");
		private static final SyntacticType test_692_sub = parse("{any}");
		@Test public void test_692() { testInvalid(test_692_sup,test_692_sub); }

		private static final SyntacticType test_693_sup = parse("(int & any)");
		private static final SyntacticType test_693_sub = parse("{int}");
		@Test public void test_693() { testInvalid(test_693_sup,test_693_sub); }

		private static final SyntacticType test_694_sup = parse("(int & any)");
		private static final SyntacticType test_694_sub = parse("!any");
		@Test public void test_694() { testValid(test_694_sup,test_694_sub); }

		private static final SyntacticType test_695_sup = parse("(int & any)");
		private static final SyntacticType test_695_sub = parse("!int");
		@Test public void test_695() { testInvalid(test_695_sup,test_695_sub); }

		private static final SyntacticType test_696_sup = parse("(int & any)");
		private static final SyntacticType test_696_sub = parse("{any, any}");
		@Test public void test_696() { testInvalid(test_696_sup,test_696_sub); }

		private static final SyntacticType test_697_sup = parse("(int & any)");
		private static final SyntacticType test_697_sub = parse("{int, any}");
		@Test public void test_697() { testInvalid(test_697_sup,test_697_sub); }

		private static final SyntacticType test_698_sup = parse("(int & any)");
		private static final SyntacticType test_698_sub = parse("{any, int}");
		@Test public void test_698() { testInvalid(test_698_sup,test_698_sub); }

		private static final SyntacticType test_699_sup = parse("(int & any)");
		private static final SyntacticType test_699_sub = parse("{int, int}");
		@Test public void test_699() { testInvalid(test_699_sup,test_699_sub); }

		private static final SyntacticType test_700_sup = parse("(int & any)");
		private static final SyntacticType test_700_sub = parse("{any, any}");
		@Test public void test_700() { testInvalid(test_700_sup,test_700_sub); }

		private static final SyntacticType test_701_sup = parse("(int & any)");
		private static final SyntacticType test_701_sub = parse("{int, any}");
		@Test public void test_701() { testInvalid(test_701_sup,test_701_sub); }

		private static final SyntacticType test_702_sup = parse("(int & any)");
		private static final SyntacticType test_702_sub = parse("{any, int}");
		@Test public void test_702() { testInvalid(test_702_sup,test_702_sub); }

		private static final SyntacticType test_703_sup = parse("(int & any)");
		private static final SyntacticType test_703_sub = parse("{int, int}");
		@Test public void test_703() { testInvalid(test_703_sup,test_703_sub); }

		private static final SyntacticType test_704_sup = parse("(int & any)");
		private static final SyntacticType test_704_sub = parse("(any | any)");
		@Test public void test_704() { testInvalid(test_704_sup,test_704_sub); }

		private static final SyntacticType test_705_sup = parse("(int & any)");
		private static final SyntacticType test_705_sub = parse("(int | any)");
		@Test public void test_705() { testInvalid(test_705_sup,test_705_sub); }

		private static final SyntacticType test_706_sup = parse("(int & any)");
		private static final SyntacticType test_706_sub = parse("(any | int)");
		@Test public void test_706() { testInvalid(test_706_sup,test_706_sub); }

		private static final SyntacticType test_707_sup = parse("(int & any)");
		private static final SyntacticType test_707_sub = parse("(int | int)");
		@Test public void test_707() { testValid(test_707_sup,test_707_sub); }

		private static final SyntacticType test_708_sup = parse("(int & any)");
		private static final SyntacticType test_708_sub = parse("(any | any)");
		@Test public void test_708() { testInvalid(test_708_sup,test_708_sub); }

		private static final SyntacticType test_709_sup = parse("(int & any)");
		private static final SyntacticType test_709_sub = parse("(int | any)");
		@Test public void test_709() { testInvalid(test_709_sup,test_709_sub); }

		private static final SyntacticType test_710_sup = parse("(int & any)");
		private static final SyntacticType test_710_sub = parse("(any | int)");
		@Test public void test_710() { testInvalid(test_710_sup,test_710_sub); }

		private static final SyntacticType test_711_sup = parse("(int & any)");
		private static final SyntacticType test_711_sub = parse("(int | int)");
		@Test public void test_711() { testValid(test_711_sup,test_711_sub); }

		private static final SyntacticType test_712_sup = parse("(int & any)");
		private static final SyntacticType test_712_sub = parse("(any & any)");
		@Test public void test_712() { testInvalid(test_712_sup,test_712_sub); }

		private static final SyntacticType test_713_sup = parse("(int & any)");
		private static final SyntacticType test_713_sub = parse("(int & any)");
		@Test public void test_713() { testValid(test_713_sup,test_713_sub); }

		private static final SyntacticType test_714_sup = parse("(int & any)");
		private static final SyntacticType test_714_sub = parse("(any & int)");
		@Test public void test_714() { testValid(test_714_sup,test_714_sub); }

		private static final SyntacticType test_715_sup = parse("(int & any)");
		private static final SyntacticType test_715_sub = parse("(int & int)");
		@Test public void test_715() { testValid(test_715_sup,test_715_sub); }

		private static final SyntacticType test_716_sup = parse("(int & any)");
		private static final SyntacticType test_716_sub = parse("(any & any)");
		@Test public void test_716() { testInvalid(test_716_sup,test_716_sub); }

		private static final SyntacticType test_717_sup = parse("(int & any)");
		private static final SyntacticType test_717_sub = parse("(int & any)");
		@Test public void test_717() { testValid(test_717_sup,test_717_sub); }

		private static final SyntacticType test_718_sup = parse("(int & any)");
		private static final SyntacticType test_718_sub = parse("(any & int)");
		@Test public void test_718() { testValid(test_718_sup,test_718_sub); }

		private static final SyntacticType test_719_sup = parse("(int & any)");
		private static final SyntacticType test_719_sub = parse("(int & int)");
		@Test public void test_719() { testValid(test_719_sup,test_719_sub); }

		private static final SyntacticType test_720_sup = parse("(any & int)");
		private static final SyntacticType test_720_sub = parse("any");
		@Test public void test_720() { testInvalid(test_720_sup,test_720_sub); }

		private static final SyntacticType test_721_sup = parse("(any & int)");
		private static final SyntacticType test_721_sub = parse("int");
		@Test public void test_721() { testValid(test_721_sup,test_721_sub); }

		private static final SyntacticType test_722_sup = parse("(any & int)");
		private static final SyntacticType test_722_sub = parse("{any}");
		@Test public void test_722() { testInvalid(test_722_sup,test_722_sub); }

		private static final SyntacticType test_723_sup = parse("(any & int)");
		private static final SyntacticType test_723_sub = parse("{int}");
		@Test public void test_723() { testInvalid(test_723_sup,test_723_sub); }

		private static final SyntacticType test_724_sup = parse("(any & int)");
		private static final SyntacticType test_724_sub = parse("!any");
		@Test public void test_724() { testValid(test_724_sup,test_724_sub); }

		private static final SyntacticType test_725_sup = parse("(any & int)");
		private static final SyntacticType test_725_sub = parse("!int");
		@Test public void test_725() { testInvalid(test_725_sup,test_725_sub); }

		private static final SyntacticType test_726_sup = parse("(any & int)");
		private static final SyntacticType test_726_sub = parse("{any, any}");
		@Test public void test_726() { testInvalid(test_726_sup,test_726_sub); }

		private static final SyntacticType test_727_sup = parse("(any & int)");
		private static final SyntacticType test_727_sub = parse("{int, any}");
		@Test public void test_727() { testInvalid(test_727_sup,test_727_sub); }

		private static final SyntacticType test_728_sup = parse("(any & int)");
		private static final SyntacticType test_728_sub = parse("{any, int}");
		@Test public void test_728() { testInvalid(test_728_sup,test_728_sub); }

		private static final SyntacticType test_729_sup = parse("(any & int)");
		private static final SyntacticType test_729_sub = parse("{int, int}");
		@Test public void test_729() { testInvalid(test_729_sup,test_729_sub); }

		private static final SyntacticType test_730_sup = parse("(any & int)");
		private static final SyntacticType test_730_sub = parse("{any, any}");
		@Test public void test_730() { testInvalid(test_730_sup,test_730_sub); }

		private static final SyntacticType test_731_sup = parse("(any & int)");
		private static final SyntacticType test_731_sub = parse("{int, any}");
		@Test public void test_731() { testInvalid(test_731_sup,test_731_sub); }

		private static final SyntacticType test_732_sup = parse("(any & int)");
		private static final SyntacticType test_732_sub = parse("{any, int}");
		@Test public void test_732() { testInvalid(test_732_sup,test_732_sub); }

		private static final SyntacticType test_733_sup = parse("(any & int)");
		private static final SyntacticType test_733_sub = parse("{int, int}");
		@Test public void test_733() { testInvalid(test_733_sup,test_733_sub); }

		private static final SyntacticType test_734_sup = parse("(any & int)");
		private static final SyntacticType test_734_sub = parse("(any | any)");
		@Test public void test_734() { testInvalid(test_734_sup,test_734_sub); }

		private static final SyntacticType test_735_sup = parse("(any & int)");
		private static final SyntacticType test_735_sub = parse("(int | any)");
		@Test public void test_735() { testInvalid(test_735_sup,test_735_sub); }

		private static final SyntacticType test_736_sup = parse("(any & int)");
		private static final SyntacticType test_736_sub = parse("(any | int)");
		@Test public void test_736() { testInvalid(test_736_sup,test_736_sub); }

		private static final SyntacticType test_737_sup = parse("(any & int)");
		private static final SyntacticType test_737_sub = parse("(int | int)");
		@Test public void test_737() { testValid(test_737_sup,test_737_sub); }

		private static final SyntacticType test_738_sup = parse("(any & int)");
		private static final SyntacticType test_738_sub = parse("(any | any)");
		@Test public void test_738() { testInvalid(test_738_sup,test_738_sub); }

		private static final SyntacticType test_739_sup = parse("(any & int)");
		private static final SyntacticType test_739_sub = parse("(int | any)");
		@Test public void test_739() { testInvalid(test_739_sup,test_739_sub); }

		private static final SyntacticType test_740_sup = parse("(any & int)");
		private static final SyntacticType test_740_sub = parse("(any | int)");
		@Test public void test_740() { testInvalid(test_740_sup,test_740_sub); }

		private static final SyntacticType test_741_sup = parse("(any & int)");
		private static final SyntacticType test_741_sub = parse("(int | int)");
		@Test public void test_741() { testValid(test_741_sup,test_741_sub); }

		private static final SyntacticType test_742_sup = parse("(any & int)");
		private static final SyntacticType test_742_sub = parse("(any & any)");
		@Test public void test_742() { testInvalid(test_742_sup,test_742_sub); }

		private static final SyntacticType test_743_sup = parse("(any & int)");
		private static final SyntacticType test_743_sub = parse("(int & any)");
		@Test public void test_743() { testValid(test_743_sup,test_743_sub); }

		private static final SyntacticType test_744_sup = parse("(any & int)");
		private static final SyntacticType test_744_sub = parse("(any & int)");
		@Test public void test_744() { testValid(test_744_sup,test_744_sub); }

		private static final SyntacticType test_745_sup = parse("(any & int)");
		private static final SyntacticType test_745_sub = parse("(int & int)");
		@Test public void test_745() { testValid(test_745_sup,test_745_sub); }

		private static final SyntacticType test_746_sup = parse("(any & int)");
		private static final SyntacticType test_746_sub = parse("(any & any)");
		@Test public void test_746() { testInvalid(test_746_sup,test_746_sub); }

		private static final SyntacticType test_747_sup = parse("(any & int)");
		private static final SyntacticType test_747_sub = parse("(int & any)");
		@Test public void test_747() { testValid(test_747_sup,test_747_sub); }

		private static final SyntacticType test_748_sup = parse("(any & int)");
		private static final SyntacticType test_748_sub = parse("(any & int)");
		@Test public void test_748() { testValid(test_748_sup,test_748_sub); }

		private static final SyntacticType test_749_sup = parse("(any & int)");
		private static final SyntacticType test_749_sub = parse("(int & int)");
		@Test public void test_749() { testValid(test_749_sup,test_749_sub); }

		private static final SyntacticType test_750_sup = parse("(int & int)");
		private static final SyntacticType test_750_sub = parse("any");
		@Test public void test_750() { testInvalid(test_750_sup,test_750_sub); }

		private static final SyntacticType test_751_sup = parse("(int & int)");
		private static final SyntacticType test_751_sub = parse("int");
		@Test public void test_751() { testValid(test_751_sup,test_751_sub); }

		private static final SyntacticType test_752_sup = parse("(int & int)");
		private static final SyntacticType test_752_sub = parse("{any}");
		@Test public void test_752() { testInvalid(test_752_sup,test_752_sub); }

		private static final SyntacticType test_753_sup = parse("(int & int)");
		private static final SyntacticType test_753_sub = parse("{int}");
		@Test public void test_753() { testInvalid(test_753_sup,test_753_sub); }

		private static final SyntacticType test_754_sup = parse("(int & int)");
		private static final SyntacticType test_754_sub = parse("!any");
		@Test public void test_754() { testValid(test_754_sup,test_754_sub); }

		private static final SyntacticType test_755_sup = parse("(int & int)");
		private static final SyntacticType test_755_sub = parse("!int");
		@Test public void test_755() { testInvalid(test_755_sup,test_755_sub); }

		private static final SyntacticType test_756_sup = parse("(int & int)");
		private static final SyntacticType test_756_sub = parse("{any, any}");
		@Test public void test_756() { testInvalid(test_756_sup,test_756_sub); }

		private static final SyntacticType test_757_sup = parse("(int & int)");
		private static final SyntacticType test_757_sub = parse("{int, any}");
		@Test public void test_757() { testInvalid(test_757_sup,test_757_sub); }

		private static final SyntacticType test_758_sup = parse("(int & int)");
		private static final SyntacticType test_758_sub = parse("{any, int}");
		@Test public void test_758() { testInvalid(test_758_sup,test_758_sub); }

		private static final SyntacticType test_759_sup = parse("(int & int)");
		private static final SyntacticType test_759_sub = parse("{int, int}");
		@Test public void test_759() { testInvalid(test_759_sup,test_759_sub); }

		private static final SyntacticType test_760_sup = parse("(int & int)");
		private static final SyntacticType test_760_sub = parse("{any, any}");
		@Test public void test_760() { testInvalid(test_760_sup,test_760_sub); }

		private static final SyntacticType test_761_sup = parse("(int & int)");
		private static final SyntacticType test_761_sub = parse("{int, any}");
		@Test public void test_761() { testInvalid(test_761_sup,test_761_sub); }

		private static final SyntacticType test_762_sup = parse("(int & int)");
		private static final SyntacticType test_762_sub = parse("{any, int}");
		@Test public void test_762() { testInvalid(test_762_sup,test_762_sub); }

		private static final SyntacticType test_763_sup = parse("(int & int)");
		private static final SyntacticType test_763_sub = parse("{int, int}");
		@Test public void test_763() { testInvalid(test_763_sup,test_763_sub); }

		private static final SyntacticType test_764_sup = parse("(int & int)");
		private static final SyntacticType test_764_sub = parse("(any | any)");
		@Test public void test_764() { testInvalid(test_764_sup,test_764_sub); }

		private static final SyntacticType test_765_sup = parse("(int & int)");
		private static final SyntacticType test_765_sub = parse("(int | any)");
		@Test public void test_765() { testInvalid(test_765_sup,test_765_sub); }

		private static final SyntacticType test_766_sup = parse("(int & int)");
		private static final SyntacticType test_766_sub = parse("(any | int)");
		@Test public void test_766() { testInvalid(test_766_sup,test_766_sub); }

		private static final SyntacticType test_767_sup = parse("(int & int)");
		private static final SyntacticType test_767_sub = parse("(int | int)");
		@Test public void test_767() { testValid(test_767_sup,test_767_sub); }

		private static final SyntacticType test_768_sup = parse("(int & int)");
		private static final SyntacticType test_768_sub = parse("(any | any)");
		@Test public void test_768() { testInvalid(test_768_sup,test_768_sub); }

		private static final SyntacticType test_769_sup = parse("(int & int)");
		private static final SyntacticType test_769_sub = parse("(int | any)");
		@Test public void test_769() { testInvalid(test_769_sup,test_769_sub); }

		private static final SyntacticType test_770_sup = parse("(int & int)");
		private static final SyntacticType test_770_sub = parse("(any | int)");
		@Test public void test_770() { testInvalid(test_770_sup,test_770_sub); }

		private static final SyntacticType test_771_sup = parse("(int & int)");
		private static final SyntacticType test_771_sub = parse("(int | int)");
		@Test public void test_771() { testValid(test_771_sup,test_771_sub); }

		private static final SyntacticType test_772_sup = parse("(int & int)");
		private static final SyntacticType test_772_sub = parse("(any & any)");
		@Test public void test_772() { testInvalid(test_772_sup,test_772_sub); }

		private static final SyntacticType test_773_sup = parse("(int & int)");
		private static final SyntacticType test_773_sub = parse("(int & any)");
		@Test public void test_773() { testValid(test_773_sup,test_773_sub); }

		private static final SyntacticType test_774_sup = parse("(int & int)");
		private static final SyntacticType test_774_sub = parse("(any & int)");
		@Test public void test_774() { testValid(test_774_sup,test_774_sub); }

		private static final SyntacticType test_775_sup = parse("(int & int)");
		private static final SyntacticType test_775_sub = parse("(int & int)");
		@Test public void test_775() { testValid(test_775_sup,test_775_sub); }

		private static final SyntacticType test_776_sup = parse("(int & int)");
		private static final SyntacticType test_776_sub = parse("(any & any)");
		@Test public void test_776() { testInvalid(test_776_sup,test_776_sub); }

		private static final SyntacticType test_777_sup = parse("(int & int)");
		private static final SyntacticType test_777_sub = parse("(int & any)");
		@Test public void test_777() { testValid(test_777_sup,test_777_sub); }

		private static final SyntacticType test_778_sup = parse("(int & int)");
		private static final SyntacticType test_778_sub = parse("(any & int)");
		@Test public void test_778() { testValid(test_778_sup,test_778_sub); }

		private static final SyntacticType test_779_sup = parse("(int & int)");
		private static final SyntacticType test_779_sub = parse("(int & int)");
		@Test public void test_779() { testValid(test_779_sup,test_779_sub); }

		private static final SyntacticType test_780_sup = parse("(any & any)");
		private static final SyntacticType test_780_sub = parse("any");
		@Test public void test_780() { testValid(test_780_sup,test_780_sub); }

		private static final SyntacticType test_781_sup = parse("(any & any)");
		private static final SyntacticType test_781_sub = parse("int");
		@Test public void test_781() { testValid(test_781_sup,test_781_sub); }

		private static final SyntacticType test_782_sup = parse("(any & any)");
		private static final SyntacticType test_782_sub = parse("{any}");
		@Test public void test_782() { testValid(test_782_sup,test_782_sub); }

		private static final SyntacticType test_783_sup = parse("(any & any)");
		private static final SyntacticType test_783_sub = parse("{int}");
		@Test public void test_783() { testValid(test_783_sup,test_783_sub); }

		private static final SyntacticType test_784_sup = parse("(any & any)");
		private static final SyntacticType test_784_sub = parse("!any");
		@Test public void test_784() { testValid(test_784_sup,test_784_sub); }

		private static final SyntacticType test_785_sup = parse("(any & any)");
		private static final SyntacticType test_785_sub = parse("!int");
		@Test public void test_785() { testValid(test_785_sup,test_785_sub); }

		private static final SyntacticType test_786_sup = parse("(any & any)");
		private static final SyntacticType test_786_sub = parse("{any, any}");
		@Test public void test_786() { testValid(test_786_sup,test_786_sub); }

		private static final SyntacticType test_787_sup = parse("(any & any)");
		private static final SyntacticType test_787_sub = parse("{int, any}");
		@Test public void test_787() { testValid(test_787_sup,test_787_sub); }

		private static final SyntacticType test_788_sup = parse("(any & any)");
		private static final SyntacticType test_788_sub = parse("{any, int}");
		@Test public void test_788() { testValid(test_788_sup,test_788_sub); }

		private static final SyntacticType test_789_sup = parse("(any & any)");
		private static final SyntacticType test_789_sub = parse("{int, int}");
		@Test public void test_789() { testValid(test_789_sup,test_789_sub); }

		private static final SyntacticType test_790_sup = parse("(any & any)");
		private static final SyntacticType test_790_sub = parse("{any, any}");
		@Test public void test_790() { testValid(test_790_sup,test_790_sub); }

		private static final SyntacticType test_791_sup = parse("(any & any)");
		private static final SyntacticType test_791_sub = parse("{int, any}");
		@Test public void test_791() { testValid(test_791_sup,test_791_sub); }

		private static final SyntacticType test_792_sup = parse("(any & any)");
		private static final SyntacticType test_792_sub = parse("{any, int}");
		@Test public void test_792() { testValid(test_792_sup,test_792_sub); }

		private static final SyntacticType test_793_sup = parse("(any & any)");
		private static final SyntacticType test_793_sub = parse("{int, int}");
		@Test public void test_793() { testValid(test_793_sup,test_793_sub); }

		private static final SyntacticType test_794_sup = parse("(any & any)");
		private static final SyntacticType test_794_sub = parse("(any | any)");
		@Test public void test_794() { testValid(test_794_sup,test_794_sub); }

		private static final SyntacticType test_795_sup = parse("(any & any)");
		private static final SyntacticType test_795_sub = parse("(int | any)");
		@Test public void test_795() { testValid(test_795_sup,test_795_sub); }

		private static final SyntacticType test_796_sup = parse("(any & any)");
		private static final SyntacticType test_796_sub = parse("(any | int)");
		@Test public void test_796() { testValid(test_796_sup,test_796_sub); }

		private static final SyntacticType test_797_sup = parse("(any & any)");
		private static final SyntacticType test_797_sub = parse("(int | int)");
		@Test public void test_797() { testValid(test_797_sup,test_797_sub); }

		private static final SyntacticType test_798_sup = parse("(any & any)");
		private static final SyntacticType test_798_sub = parse("(any | any)");
		@Test public void test_798() { testValid(test_798_sup,test_798_sub); }

		private static final SyntacticType test_799_sup = parse("(any & any)");
		private static final SyntacticType test_799_sub = parse("(int | any)");
		@Test public void test_799() { testValid(test_799_sup,test_799_sub); }

		private static final SyntacticType test_800_sup = parse("(any & any)");
		private static final SyntacticType test_800_sub = parse("(any | int)");
		@Test public void test_800() { testValid(test_800_sup,test_800_sub); }

		private static final SyntacticType test_801_sup = parse("(any & any)");
		private static final SyntacticType test_801_sub = parse("(int | int)");
		@Test public void test_801() { testValid(test_801_sup,test_801_sub); }

		private static final SyntacticType test_802_sup = parse("(any & any)");
		private static final SyntacticType test_802_sub = parse("(any & any)");
		@Test public void test_802() { testValid(test_802_sup,test_802_sub); }

		private static final SyntacticType test_803_sup = parse("(any & any)");
		private static final SyntacticType test_803_sub = parse("(int & any)");
		@Test public void test_803() { testValid(test_803_sup,test_803_sub); }

		private static final SyntacticType test_804_sup = parse("(any & any)");
		private static final SyntacticType test_804_sub = parse("(any & int)");
		@Test public void test_804() { testValid(test_804_sup,test_804_sub); }

		private static final SyntacticType test_805_sup = parse("(any & any)");
		private static final SyntacticType test_805_sub = parse("(int & int)");
		@Test public void test_805() { testValid(test_805_sup,test_805_sub); }

		private static final SyntacticType test_806_sup = parse("(any & any)");
		private static final SyntacticType test_806_sub = parse("(any & any)");
		@Test public void test_806() { testValid(test_806_sup,test_806_sub); }

		private static final SyntacticType test_807_sup = parse("(any & any)");
		private static final SyntacticType test_807_sub = parse("(int & any)");
		@Test public void test_807() { testValid(test_807_sup,test_807_sub); }

		private static final SyntacticType test_808_sup = parse("(any & any)");
		private static final SyntacticType test_808_sub = parse("(any & int)");
		@Test public void test_808() { testValid(test_808_sup,test_808_sub); }

		private static final SyntacticType test_809_sup = parse("(any & any)");
		private static final SyntacticType test_809_sub = parse("(int & int)");
		@Test public void test_809() { testValid(test_809_sup,test_809_sub); }

		private static final SyntacticType test_810_sup = parse("(int & any)");
		private static final SyntacticType test_810_sub = parse("any");
		@Test public void test_810() { testInvalid(test_810_sup,test_810_sub); }

		private static final SyntacticType test_811_sup = parse("(int & any)");
		private static final SyntacticType test_811_sub = parse("int");
		@Test public void test_811() { testValid(test_811_sup,test_811_sub); }

		private static final SyntacticType test_812_sup = parse("(int & any)");
		private static final SyntacticType test_812_sub = parse("{any}");
		@Test public void test_812() { testInvalid(test_812_sup,test_812_sub); }

		private static final SyntacticType test_813_sup = parse("(int & any)");
		private static final SyntacticType test_813_sub = parse("{int}");
		@Test public void test_813() { testInvalid(test_813_sup,test_813_sub); }

		private static final SyntacticType test_814_sup = parse("(int & any)");
		private static final SyntacticType test_814_sub = parse("!any");
		@Test public void test_814() { testValid(test_814_sup,test_814_sub); }

		private static final SyntacticType test_815_sup = parse("(int & any)");
		private static final SyntacticType test_815_sub = parse("!int");
		@Test public void test_815() { testInvalid(test_815_sup,test_815_sub); }

		private static final SyntacticType test_816_sup = parse("(int & any)");
		private static final SyntacticType test_816_sub = parse("{any, any}");
		@Test public void test_816() { testInvalid(test_816_sup,test_816_sub); }

		private static final SyntacticType test_817_sup = parse("(int & any)");
		private static final SyntacticType test_817_sub = parse("{int, any}");
		@Test public void test_817() { testInvalid(test_817_sup,test_817_sub); }

		private static final SyntacticType test_818_sup = parse("(int & any)");
		private static final SyntacticType test_818_sub = parse("{any, int}");
		@Test public void test_818() { testInvalid(test_818_sup,test_818_sub); }

		private static final SyntacticType test_819_sup = parse("(int & any)");
		private static final SyntacticType test_819_sub = parse("{int, int}");
		@Test public void test_819() { testInvalid(test_819_sup,test_819_sub); }

		private static final SyntacticType test_820_sup = parse("(int & any)");
		private static final SyntacticType test_820_sub = parse("{any, any}");
		@Test public void test_820() { testInvalid(test_820_sup,test_820_sub); }

		private static final SyntacticType test_821_sup = parse("(int & any)");
		private static final SyntacticType test_821_sub = parse("{int, any}");
		@Test public void test_821() { testInvalid(test_821_sup,test_821_sub); }

		private static final SyntacticType test_822_sup = parse("(int & any)");
		private static final SyntacticType test_822_sub = parse("{any, int}");
		@Test public void test_822() { testInvalid(test_822_sup,test_822_sub); }

		private static final SyntacticType test_823_sup = parse("(int & any)");
		private static final SyntacticType test_823_sub = parse("{int, int}");
		@Test public void test_823() { testInvalid(test_823_sup,test_823_sub); }

		private static final SyntacticType test_824_sup = parse("(int & any)");
		private static final SyntacticType test_824_sub = parse("(any | any)");
		@Test public void test_824() { testInvalid(test_824_sup,test_824_sub); }

		private static final SyntacticType test_825_sup = parse("(int & any)");
		private static final SyntacticType test_825_sub = parse("(int | any)");
		@Test public void test_825() { testInvalid(test_825_sup,test_825_sub); }

		private static final SyntacticType test_826_sup = parse("(int & any)");
		private static final SyntacticType test_826_sub = parse("(any | int)");
		@Test public void test_826() { testInvalid(test_826_sup,test_826_sub); }

		private static final SyntacticType test_827_sup = parse("(int & any)");
		private static final SyntacticType test_827_sub = parse("(int | int)");
		@Test public void test_827() { testValid(test_827_sup,test_827_sub); }

		private static final SyntacticType test_828_sup = parse("(int & any)");
		private static final SyntacticType test_828_sub = parse("(any | any)");
		@Test public void test_828() { testInvalid(test_828_sup,test_828_sub); }

		private static final SyntacticType test_829_sup = parse("(int & any)");
		private static final SyntacticType test_829_sub = parse("(int | any)");
		@Test public void test_829() { testInvalid(test_829_sup,test_829_sub); }

		private static final SyntacticType test_830_sup = parse("(int & any)");
		private static final SyntacticType test_830_sub = parse("(any | int)");
		@Test public void test_830() { testInvalid(test_830_sup,test_830_sub); }

		private static final SyntacticType test_831_sup = parse("(int & any)");
		private static final SyntacticType test_831_sub = parse("(int | int)");
		@Test public void test_831() { testValid(test_831_sup,test_831_sub); }

		private static final SyntacticType test_832_sup = parse("(int & any)");
		private static final SyntacticType test_832_sub = parse("(any & any)");
		@Test public void test_832() { testInvalid(test_832_sup,test_832_sub); }

		private static final SyntacticType test_833_sup = parse("(int & any)");
		private static final SyntacticType test_833_sub = parse("(int & any)");
		@Test public void test_833() { testValid(test_833_sup,test_833_sub); }

		private static final SyntacticType test_834_sup = parse("(int & any)");
		private static final SyntacticType test_834_sub = parse("(any & int)");
		@Test public void test_834() { testValid(test_834_sup,test_834_sub); }

		private static final SyntacticType test_835_sup = parse("(int & any)");
		private static final SyntacticType test_835_sub = parse("(int & int)");
		@Test public void test_835() { testValid(test_835_sup,test_835_sub); }

		private static final SyntacticType test_836_sup = parse("(int & any)");
		private static final SyntacticType test_836_sub = parse("(any & any)");
		@Test public void test_836() { testInvalid(test_836_sup,test_836_sub); }

		private static final SyntacticType test_837_sup = parse("(int & any)");
		private static final SyntacticType test_837_sub = parse("(int & any)");
		@Test public void test_837() { testValid(test_837_sup,test_837_sub); }

		private static final SyntacticType test_838_sup = parse("(int & any)");
		private static final SyntacticType test_838_sub = parse("(any & int)");
		@Test public void test_838() { testValid(test_838_sup,test_838_sub); }

		private static final SyntacticType test_839_sup = parse("(int & any)");
		private static final SyntacticType test_839_sub = parse("(int & int)");
		@Test public void test_839() { testValid(test_839_sup,test_839_sub); }

		private static final SyntacticType test_840_sup = parse("(any & int)");
		private static final SyntacticType test_840_sub = parse("any");
		@Test public void test_840() { testInvalid(test_840_sup,test_840_sub); }

		private static final SyntacticType test_841_sup = parse("(any & int)");
		private static final SyntacticType test_841_sub = parse("int");
		@Test public void test_841() { testValid(test_841_sup,test_841_sub); }

		private static final SyntacticType test_842_sup = parse("(any & int)");
		private static final SyntacticType test_842_sub = parse("{any}");
		@Test public void test_842() { testInvalid(test_842_sup,test_842_sub); }

		private static final SyntacticType test_843_sup = parse("(any & int)");
		private static final SyntacticType test_843_sub = parse("{int}");
		@Test public void test_843() { testInvalid(test_843_sup,test_843_sub); }

		private static final SyntacticType test_844_sup = parse("(any & int)");
		private static final SyntacticType test_844_sub = parse("!any");
		@Test public void test_844() { testValid(test_844_sup,test_844_sub); }

		private static final SyntacticType test_845_sup = parse("(any & int)");
		private static final SyntacticType test_845_sub = parse("!int");
		@Test public void test_845() { testInvalid(test_845_sup,test_845_sub); }

		private static final SyntacticType test_846_sup = parse("(any & int)");
		private static final SyntacticType test_846_sub = parse("{any, any}");
		@Test public void test_846() { testInvalid(test_846_sup,test_846_sub); }

		private static final SyntacticType test_847_sup = parse("(any & int)");
		private static final SyntacticType test_847_sub = parse("{int, any}");
		@Test public void test_847() { testInvalid(test_847_sup,test_847_sub); }

		private static final SyntacticType test_848_sup = parse("(any & int)");
		private static final SyntacticType test_848_sub = parse("{any, int}");
		@Test public void test_848() { testInvalid(test_848_sup,test_848_sub); }

		private static final SyntacticType test_849_sup = parse("(any & int)");
		private static final SyntacticType test_849_sub = parse("{int, int}");
		@Test public void test_849() { testInvalid(test_849_sup,test_849_sub); }

		private static final SyntacticType test_850_sup = parse("(any & int)");
		private static final SyntacticType test_850_sub = parse("{any, any}");
		@Test public void test_850() { testInvalid(test_850_sup,test_850_sub); }

		private static final SyntacticType test_851_sup = parse("(any & int)");
		private static final SyntacticType test_851_sub = parse("{int, any}");
		@Test public void test_851() { testInvalid(test_851_sup,test_851_sub); }

		private static final SyntacticType test_852_sup = parse("(any & int)");
		private static final SyntacticType test_852_sub = parse("{any, int}");
		@Test public void test_852() { testInvalid(test_852_sup,test_852_sub); }

		private static final SyntacticType test_853_sup = parse("(any & int)");
		private static final SyntacticType test_853_sub = parse("{int, int}");
		@Test public void test_853() { testInvalid(test_853_sup,test_853_sub); }

		private static final SyntacticType test_854_sup = parse("(any & int)");
		private static final SyntacticType test_854_sub = parse("(any | any)");
		@Test public void test_854() { testInvalid(test_854_sup,test_854_sub); }

		private static final SyntacticType test_855_sup = parse("(any & int)");
		private static final SyntacticType test_855_sub = parse("(int | any)");
		@Test public void test_855() { testInvalid(test_855_sup,test_855_sub); }

		private static final SyntacticType test_856_sup = parse("(any & int)");
		private static final SyntacticType test_856_sub = parse("(any | int)");
		@Test public void test_856() { testInvalid(test_856_sup,test_856_sub); }

		private static final SyntacticType test_857_sup = parse("(any & int)");
		private static final SyntacticType test_857_sub = parse("(int | int)");
		@Test public void test_857() { testValid(test_857_sup,test_857_sub); }

		private static final SyntacticType test_858_sup = parse("(any & int)");
		private static final SyntacticType test_858_sub = parse("(any | any)");
		@Test public void test_858() { testInvalid(test_858_sup,test_858_sub); }

		private static final SyntacticType test_859_sup = parse("(any & int)");
		private static final SyntacticType test_859_sub = parse("(int | any)");
		@Test public void test_859() { testInvalid(test_859_sup,test_859_sub); }

		private static final SyntacticType test_860_sup = parse("(any & int)");
		private static final SyntacticType test_860_sub = parse("(any | int)");
		@Test public void test_860() { testInvalid(test_860_sup,test_860_sub); }

		private static final SyntacticType test_861_sup = parse("(any & int)");
		private static final SyntacticType test_861_sub = parse("(int | int)");
		@Test public void test_861() { testValid(test_861_sup,test_861_sub); }

		private static final SyntacticType test_862_sup = parse("(any & int)");
		private static final SyntacticType test_862_sub = parse("(any & any)");
		@Test public void test_862() { testInvalid(test_862_sup,test_862_sub); }

		private static final SyntacticType test_863_sup = parse("(any & int)");
		private static final SyntacticType test_863_sub = parse("(int & any)");
		@Test public void test_863() { testValid(test_863_sup,test_863_sub); }

		private static final SyntacticType test_864_sup = parse("(any & int)");
		private static final SyntacticType test_864_sub = parse("(any & int)");
		@Test public void test_864() { testValid(test_864_sup,test_864_sub); }

		private static final SyntacticType test_865_sup = parse("(any & int)");
		private static final SyntacticType test_865_sub = parse("(int & int)");
		@Test public void test_865() { testValid(test_865_sup,test_865_sub); }

		private static final SyntacticType test_866_sup = parse("(any & int)");
		private static final SyntacticType test_866_sub = parse("(any & any)");
		@Test public void test_866() { testInvalid(test_866_sup,test_866_sub); }

		private static final SyntacticType test_867_sup = parse("(any & int)");
		private static final SyntacticType test_867_sub = parse("(int & any)");
		@Test public void test_867() { testValid(test_867_sup,test_867_sub); }

		private static final SyntacticType test_868_sup = parse("(any & int)");
		private static final SyntacticType test_868_sub = parse("(any & int)");
		@Test public void test_868() { testValid(test_868_sup,test_868_sub); }

		private static final SyntacticType test_869_sup = parse("(any & int)");
		private static final SyntacticType test_869_sub = parse("(int & int)");
		@Test public void test_869() { testValid(test_869_sup,test_869_sub); }

		private static final SyntacticType test_870_sup = parse("(int & int)");
		private static final SyntacticType test_870_sub = parse("any");
		@Test public void test_870() { testInvalid(test_870_sup,test_870_sub); }

		private static final SyntacticType test_871_sup = parse("(int & int)");
		private static final SyntacticType test_871_sub = parse("int");
		@Test public void test_871() { testValid(test_871_sup,test_871_sub); }

		private static final SyntacticType test_872_sup = parse("(int & int)");
		private static final SyntacticType test_872_sub = parse("{any}");
		@Test public void test_872() { testInvalid(test_872_sup,test_872_sub); }

		private static final SyntacticType test_873_sup = parse("(int & int)");
		private static final SyntacticType test_873_sub = parse("{int}");
		@Test public void test_873() { testInvalid(test_873_sup,test_873_sub); }

		private static final SyntacticType test_874_sup = parse("(int & int)");
		private static final SyntacticType test_874_sub = parse("!any");
		@Test public void test_874() { testValid(test_874_sup,test_874_sub); }

		private static final SyntacticType test_875_sup = parse("(int & int)");
		private static final SyntacticType test_875_sub = parse("!int");
		@Test public void test_875() { testInvalid(test_875_sup,test_875_sub); }

		private static final SyntacticType test_876_sup = parse("(int & int)");
		private static final SyntacticType test_876_sub = parse("{any, any}");
		@Test public void test_876() { testInvalid(test_876_sup,test_876_sub); }

		private static final SyntacticType test_877_sup = parse("(int & int)");
		private static final SyntacticType test_877_sub = parse("{int, any}");
		@Test public void test_877() { testInvalid(test_877_sup,test_877_sub); }

		private static final SyntacticType test_878_sup = parse("(int & int)");
		private static final SyntacticType test_878_sub = parse("{any, int}");
		@Test public void test_878() { testInvalid(test_878_sup,test_878_sub); }

		private static final SyntacticType test_879_sup = parse("(int & int)");
		private static final SyntacticType test_879_sub = parse("{int, int}");
		@Test public void test_879() { testInvalid(test_879_sup,test_879_sub); }

		private static final SyntacticType test_880_sup = parse("(int & int)");
		private static final SyntacticType test_880_sub = parse("{any, any}");
		@Test public void test_880() { testInvalid(test_880_sup,test_880_sub); }

		private static final SyntacticType test_881_sup = parse("(int & int)");
		private static final SyntacticType test_881_sub = parse("{int, any}");
		@Test public void test_881() { testInvalid(test_881_sup,test_881_sub); }

		private static final SyntacticType test_882_sup = parse("(int & int)");
		private static final SyntacticType test_882_sub = parse("{any, int}");
		@Test public void test_882() { testInvalid(test_882_sup,test_882_sub); }

		private static final SyntacticType test_883_sup = parse("(int & int)");
		private static final SyntacticType test_883_sub = parse("{int, int}");
		@Test public void test_883() { testInvalid(test_883_sup,test_883_sub); }

		private static final SyntacticType test_884_sup = parse("(int & int)");
		private static final SyntacticType test_884_sub = parse("(any | any)");
		@Test public void test_884() { testInvalid(test_884_sup,test_884_sub); }

		private static final SyntacticType test_885_sup = parse("(int & int)");
		private static final SyntacticType test_885_sub = parse("(int | any)");
		@Test public void test_885() { testInvalid(test_885_sup,test_885_sub); }

		private static final SyntacticType test_886_sup = parse("(int & int)");
		private static final SyntacticType test_886_sub = parse("(any | int)");
		@Test public void test_886() { testInvalid(test_886_sup,test_886_sub); }

		private static final SyntacticType test_887_sup = parse("(int & int)");
		private static final SyntacticType test_887_sub = parse("(int | int)");
		@Test public void test_887() { testValid(test_887_sup,test_887_sub); }

		private static final SyntacticType test_888_sup = parse("(int & int)");
		private static final SyntacticType test_888_sub = parse("(any | any)");
		@Test public void test_888() { testInvalid(test_888_sup,test_888_sub); }

		private static final SyntacticType test_889_sup = parse("(int & int)");
		private static final SyntacticType test_889_sub = parse("(int | any)");
		@Test public void test_889() { testInvalid(test_889_sup,test_889_sub); }

		private static final SyntacticType test_890_sup = parse("(int & int)");
		private static final SyntacticType test_890_sub = parse("(any | int)");
		@Test public void test_890() { testInvalid(test_890_sup,test_890_sub); }

		private static final SyntacticType test_891_sup = parse("(int & int)");
		private static final SyntacticType test_891_sub = parse("(int | int)");
		@Test public void test_891() { testValid(test_891_sup,test_891_sub); }

		private static final SyntacticType test_892_sup = parse("(int & int)");
		private static final SyntacticType test_892_sub = parse("(any & any)");
		@Test public void test_892() { testInvalid(test_892_sup,test_892_sub); }

		private static final SyntacticType test_893_sup = parse("(int & int)");
		private static final SyntacticType test_893_sub = parse("(int & any)");
		@Test public void test_893() { testValid(test_893_sup,test_893_sub); }

		private static final SyntacticType test_894_sup = parse("(int & int)");
		private static final SyntacticType test_894_sub = parse("(any & int)");
		@Test public void test_894() { testValid(test_894_sup,test_894_sub); }

		private static final SyntacticType test_895_sup = parse("(int & int)");
		private static final SyntacticType test_895_sub = parse("(int & int)");
		@Test public void test_895() { testValid(test_895_sup,test_895_sub); }

		private static final SyntacticType test_896_sup = parse("(int & int)");
		private static final SyntacticType test_896_sub = parse("(any & any)");
		@Test public void test_896() { testInvalid(test_896_sup,test_896_sub); }

		private static final SyntacticType test_897_sup = parse("(int & int)");
		private static final SyntacticType test_897_sub = parse("(int & any)");
		@Test public void test_897() { testValid(test_897_sup,test_897_sub); }

		private static final SyntacticType test_898_sup = parse("(int & int)");
		private static final SyntacticType test_898_sub = parse("(any & int)");
		@Test public void test_898() { testValid(test_898_sup,test_898_sub); }

		private static final SyntacticType test_899_sup = parse("(int & int)");
		private static final SyntacticType test_899_sub = parse("(int & int)");
		@Test public void test_899() { testValid(test_899_sup,test_899_sub); }

		public static void testValid(SyntacticType sup, SyntacticType sub) {
			AbstractTestSuite.testValid(new WhileySubtypeQuery(sup,sub));
			AbstractTestSuite.testValid(new RewritingSubtypeQuery(sup,sub));
		}

		public static void testInvalid(SyntacticType sup, SyntacticType sub) {
			AbstractTestSuite.testInvalid(new WhileySubtypeQuery(sup,sub));
			AbstractTestSuite.testInvalid(new RewritingSubtypeQuery(sup,sub));
		}
	}
}
