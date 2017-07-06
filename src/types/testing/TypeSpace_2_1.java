package types.testing;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import types.testing.AbstractTestSuite;
import types.core.RewritingSubtypeQuery;
import types.core.SyntacticType;
import types.core.WhileySubtypeQuery;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TypeSpace_2_1 extends AbstractTestSuite {
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
		private static final SyntacticType test_6_sub = parse("{{any}}");
		@Test public void test_6() { testValid(test_6_sup,test_6_sub); }

		private static final SyntacticType test_7_sup = parse("any");
		private static final SyntacticType test_7_sub = parse("{{int}}");
		@Test public void test_7() { testValid(test_7_sup,test_7_sub); }

		private static final SyntacticType test_8_sup = parse("any");
		private static final SyntacticType test_8_sub = parse("{!int}");
		@Test public void test_8() { testValid(test_8_sup,test_8_sub); }

		private static final SyntacticType test_9_sup = parse("any");
		private static final SyntacticType test_9_sub = parse("!{any}");
		@Test public void test_9() { testValid(test_9_sup,test_9_sub); }

		private static final SyntacticType test_10_sup = parse("any");
		private static final SyntacticType test_10_sub = parse("!{int}");
		@Test public void test_10() { testValid(test_10_sup,test_10_sub); }

		private static final SyntacticType test_11_sup = parse("any");
		private static final SyntacticType test_11_sub = parse("!!any");
		@Test public void test_11() { testValid(test_11_sup,test_11_sub); }

		private static final SyntacticType test_12_sup = parse("any");
		private static final SyntacticType test_12_sub = parse("!!int");
		@Test public void test_12() { testValid(test_12_sup,test_12_sub); }

		private static final SyntacticType test_13_sup = parse("int");
		private static final SyntacticType test_13_sub = parse("any");
		@Test public void test_13() { testInvalid(test_13_sup,test_13_sub); }

		private static final SyntacticType test_14_sup = parse("int");
		private static final SyntacticType test_14_sub = parse("int");
		@Test public void test_14() { testValid(test_14_sup,test_14_sub); }

		private static final SyntacticType test_15_sup = parse("int");
		private static final SyntacticType test_15_sub = parse("{any}");
		@Test public void test_15() { testInvalid(test_15_sup,test_15_sub); }

		private static final SyntacticType test_16_sup = parse("int");
		private static final SyntacticType test_16_sub = parse("{int}");
		@Test public void test_16() { testInvalid(test_16_sup,test_16_sub); }

		private static final SyntacticType test_17_sup = parse("int");
		private static final SyntacticType test_17_sub = parse("!any");
		@Test public void test_17() { testValid(test_17_sup,test_17_sub); }

		private static final SyntacticType test_18_sup = parse("int");
		private static final SyntacticType test_18_sub = parse("!int");
		@Test public void test_18() { testInvalid(test_18_sup,test_18_sub); }

		private static final SyntacticType test_19_sup = parse("int");
		private static final SyntacticType test_19_sub = parse("{{any}}");
		@Test public void test_19() { testInvalid(test_19_sup,test_19_sub); }

		private static final SyntacticType test_20_sup = parse("int");
		private static final SyntacticType test_20_sub = parse("{{int}}");
		@Test public void test_20() { testInvalid(test_20_sup,test_20_sub); }

		private static final SyntacticType test_21_sup = parse("int");
		private static final SyntacticType test_21_sub = parse("{!int}");
		@Test public void test_21() { testInvalid(test_21_sup,test_21_sub); }

		private static final SyntacticType test_22_sup = parse("int");
		private static final SyntacticType test_22_sub = parse("!{any}");
		@Test public void test_22() { testInvalid(test_22_sup,test_22_sub); }

		private static final SyntacticType test_23_sup = parse("int");
		private static final SyntacticType test_23_sub = parse("!{int}");
		@Test public void test_23() { testInvalid(test_23_sup,test_23_sub); }

		private static final SyntacticType test_24_sup = parse("int");
		private static final SyntacticType test_24_sub = parse("!!any");
		@Test public void test_24() { testInvalid(test_24_sup,test_24_sub); }

		private static final SyntacticType test_25_sup = parse("int");
		private static final SyntacticType test_25_sub = parse("!!int");
		@Test public void test_25() { testValid(test_25_sup,test_25_sub); }

		private static final SyntacticType test_26_sup = parse("{any}");
		private static final SyntacticType test_26_sub = parse("any");
		@Test public void test_26() { testInvalid(test_26_sup,test_26_sub); }

		private static final SyntacticType test_27_sup = parse("{any}");
		private static final SyntacticType test_27_sub = parse("int");
		@Test public void test_27() { testInvalid(test_27_sup,test_27_sub); }

		private static final SyntacticType test_28_sup = parse("{any}");
		private static final SyntacticType test_28_sub = parse("{any}");
		@Test public void test_28() { testValid(test_28_sup,test_28_sub); }

		private static final SyntacticType test_29_sup = parse("{any}");
		private static final SyntacticType test_29_sub = parse("{int}");
		@Test public void test_29() { testValid(test_29_sup,test_29_sub); }

		private static final SyntacticType test_30_sup = parse("{any}");
		private static final SyntacticType test_30_sub = parse("!any");
		@Test public void test_30() { testValid(test_30_sup,test_30_sub); }

		private static final SyntacticType test_31_sup = parse("{any}");
		private static final SyntacticType test_31_sub = parse("!int");
		@Test public void test_31() { testInvalid(test_31_sup,test_31_sub); }

		private static final SyntacticType test_32_sup = parse("{any}");
		private static final SyntacticType test_32_sub = parse("{{any}}");
		@Test public void test_32() { testValid(test_32_sup,test_32_sub); }

		private static final SyntacticType test_33_sup = parse("{any}");
		private static final SyntacticType test_33_sub = parse("{{int}}");
		@Test public void test_33() { testValid(test_33_sup,test_33_sub); }

		private static final SyntacticType test_34_sup = parse("{any}");
		private static final SyntacticType test_34_sub = parse("{!int}");
		@Test public void test_34() { testValid(test_34_sup,test_34_sub); }

		private static final SyntacticType test_35_sup = parse("{any}");
		private static final SyntacticType test_35_sub = parse("!{any}");
		@Test public void test_35() { testInvalid(test_35_sup,test_35_sub); }

		private static final SyntacticType test_36_sup = parse("{any}");
		private static final SyntacticType test_36_sub = parse("!{int}");
		@Test public void test_36() { testInvalid(test_36_sup,test_36_sub); }

		private static final SyntacticType test_37_sup = parse("{any}");
		private static final SyntacticType test_37_sub = parse("!!any");
		@Test public void test_37() { testInvalid(test_37_sup,test_37_sub); }

		private static final SyntacticType test_38_sup = parse("{any}");
		private static final SyntacticType test_38_sub = parse("!!int");
		@Test public void test_38() { testInvalid(test_38_sup,test_38_sub); }

		private static final SyntacticType test_39_sup = parse("{int}");
		private static final SyntacticType test_39_sub = parse("any");
		@Test public void test_39() { testInvalid(test_39_sup,test_39_sub); }

		private static final SyntacticType test_40_sup = parse("{int}");
		private static final SyntacticType test_40_sub = parse("int");
		@Test public void test_40() { testInvalid(test_40_sup,test_40_sub); }

		private static final SyntacticType test_41_sup = parse("{int}");
		private static final SyntacticType test_41_sub = parse("{any}");
		@Test public void test_41() { testInvalid(test_41_sup,test_41_sub); }

		private static final SyntacticType test_42_sup = parse("{int}");
		private static final SyntacticType test_42_sub = parse("{int}");
		@Test public void test_42() { testValid(test_42_sup,test_42_sub); }

		private static final SyntacticType test_43_sup = parse("{int}");
		private static final SyntacticType test_43_sub = parse("!any");
		@Test public void test_43() { testValid(test_43_sup,test_43_sub); }

		private static final SyntacticType test_44_sup = parse("{int}");
		private static final SyntacticType test_44_sub = parse("!int");
		@Test public void test_44() { testInvalid(test_44_sup,test_44_sub); }

		private static final SyntacticType test_45_sup = parse("{int}");
		private static final SyntacticType test_45_sub = parse("{{any}}");
		@Test public void test_45() { testInvalid(test_45_sup,test_45_sub); }

		private static final SyntacticType test_46_sup = parse("{int}");
		private static final SyntacticType test_46_sub = parse("{{int}}");
		@Test public void test_46() { testInvalid(test_46_sup,test_46_sub); }

		private static final SyntacticType test_47_sup = parse("{int}");
		private static final SyntacticType test_47_sub = parse("{!int}");
		@Test public void test_47() { testInvalid(test_47_sup,test_47_sub); }

		private static final SyntacticType test_48_sup = parse("{int}");
		private static final SyntacticType test_48_sub = parse("!{any}");
		@Test public void test_48() { testInvalid(test_48_sup,test_48_sub); }

		private static final SyntacticType test_49_sup = parse("{int}");
		private static final SyntacticType test_49_sub = parse("!{int}");
		@Test public void test_49() { testInvalid(test_49_sup,test_49_sub); }

		private static final SyntacticType test_50_sup = parse("{int}");
		private static final SyntacticType test_50_sub = parse("!!any");
		@Test public void test_50() { testInvalid(test_50_sup,test_50_sub); }

		private static final SyntacticType test_51_sup = parse("{int}");
		private static final SyntacticType test_51_sub = parse("!!int");
		@Test public void test_51() { testInvalid(test_51_sup,test_51_sub); }

		private static final SyntacticType test_52_sup = parse("!any");
		private static final SyntacticType test_52_sub = parse("any");
		@Test public void test_52() { testInvalid(test_52_sup,test_52_sub); }

		private static final SyntacticType test_53_sup = parse("!any");
		private static final SyntacticType test_53_sub = parse("int");
		@Test public void test_53() { testInvalid(test_53_sup,test_53_sub); }

		private static final SyntacticType test_54_sup = parse("!any");
		private static final SyntacticType test_54_sub = parse("{any}");
		@Test public void test_54() { testInvalid(test_54_sup,test_54_sub); }

		private static final SyntacticType test_55_sup = parse("!any");
		private static final SyntacticType test_55_sub = parse("{int}");
		@Test public void test_55() { testInvalid(test_55_sup,test_55_sub); }

		private static final SyntacticType test_56_sup = parse("!any");
		private static final SyntacticType test_56_sub = parse("!any");
		@Test public void test_56() { testValid(test_56_sup,test_56_sub); }

		private static final SyntacticType test_57_sup = parse("!any");
		private static final SyntacticType test_57_sub = parse("!int");
		@Test public void test_57() { testInvalid(test_57_sup,test_57_sub); }

		private static final SyntacticType test_58_sup = parse("!any");
		private static final SyntacticType test_58_sub = parse("{{any}}");
		@Test public void test_58() { testInvalid(test_58_sup,test_58_sub); }

		private static final SyntacticType test_59_sup = parse("!any");
		private static final SyntacticType test_59_sub = parse("{{int}}");
		@Test public void test_59() { testInvalid(test_59_sup,test_59_sub); }

		private static final SyntacticType test_60_sup = parse("!any");
		private static final SyntacticType test_60_sub = parse("{!int}");
		@Test public void test_60() { testInvalid(test_60_sup,test_60_sub); }

		private static final SyntacticType test_61_sup = parse("!any");
		private static final SyntacticType test_61_sub = parse("!{any}");
		@Test public void test_61() { testInvalid(test_61_sup,test_61_sub); }

		private static final SyntacticType test_62_sup = parse("!any");
		private static final SyntacticType test_62_sub = parse("!{int}");
		@Test public void test_62() { testInvalid(test_62_sup,test_62_sub); }

		private static final SyntacticType test_63_sup = parse("!any");
		private static final SyntacticType test_63_sub = parse("!!any");
		@Test public void test_63() { testInvalid(test_63_sup,test_63_sub); }

		private static final SyntacticType test_64_sup = parse("!any");
		private static final SyntacticType test_64_sub = parse("!!int");
		@Test public void test_64() { testInvalid(test_64_sup,test_64_sub); }

		private static final SyntacticType test_65_sup = parse("!int");
		private static final SyntacticType test_65_sub = parse("any");
		@Test public void test_65() { testInvalid(test_65_sup,test_65_sub); }

		private static final SyntacticType test_66_sup = parse("!int");
		private static final SyntacticType test_66_sub = parse("int");
		@Test public void test_66() { testInvalid(test_66_sup,test_66_sub); }

		private static final SyntacticType test_67_sup = parse("!int");
		private static final SyntacticType test_67_sub = parse("{any}");
		@Test public void test_67() { testValid(test_67_sup,test_67_sub); }

		private static final SyntacticType test_68_sup = parse("!int");
		private static final SyntacticType test_68_sub = parse("{int}");
		@Test public void test_68() { testValid(test_68_sup,test_68_sub); }

		private static final SyntacticType test_69_sup = parse("!int");
		private static final SyntacticType test_69_sub = parse("!any");
		@Test public void test_69() { testValid(test_69_sup,test_69_sub); }

		private static final SyntacticType test_70_sup = parse("!int");
		private static final SyntacticType test_70_sub = parse("!int");
		@Test public void test_70() { testValid(test_70_sup,test_70_sub); }

		private static final SyntacticType test_71_sup = parse("!int");
		private static final SyntacticType test_71_sub = parse("{{any}}");
		@Test public void test_71() { testValid(test_71_sup,test_71_sub); }

		private static final SyntacticType test_72_sup = parse("!int");
		private static final SyntacticType test_72_sub = parse("{{int}}");
		@Test public void test_72() { testValid(test_72_sup,test_72_sub); }

		private static final SyntacticType test_73_sup = parse("!int");
		private static final SyntacticType test_73_sub = parse("{!int}");
		@Test public void test_73() { testValid(test_73_sup,test_73_sub); }

		private static final SyntacticType test_74_sup = parse("!int");
		private static final SyntacticType test_74_sub = parse("!{any}");
		@Test public void test_74() { testInvalid(test_74_sup,test_74_sub); }

		private static final SyntacticType test_75_sup = parse("!int");
		private static final SyntacticType test_75_sub = parse("!{int}");
		@Test public void test_75() { testInvalid(test_75_sup,test_75_sub); }

		private static final SyntacticType test_76_sup = parse("!int");
		private static final SyntacticType test_76_sub = parse("!!any");
		@Test public void test_76() { testInvalid(test_76_sup,test_76_sub); }

		private static final SyntacticType test_77_sup = parse("!int");
		private static final SyntacticType test_77_sub = parse("!!int");
		@Test public void test_77() { testInvalid(test_77_sup,test_77_sub); }

		private static final SyntacticType test_78_sup = parse("{{any}}");
		private static final SyntacticType test_78_sub = parse("any");
		@Test public void test_78() { testInvalid(test_78_sup,test_78_sub); }

		private static final SyntacticType test_79_sup = parse("{{any}}");
		private static final SyntacticType test_79_sub = parse("int");
		@Test public void test_79() { testInvalid(test_79_sup,test_79_sub); }

		private static final SyntacticType test_80_sup = parse("{{any}}");
		private static final SyntacticType test_80_sub = parse("{any}");
		@Test public void test_80() { testInvalid(test_80_sup,test_80_sub); }

		private static final SyntacticType test_81_sup = parse("{{any}}");
		private static final SyntacticType test_81_sub = parse("{int}");
		@Test public void test_81() { testInvalid(test_81_sup,test_81_sub); }

		private static final SyntacticType test_82_sup = parse("{{any}}");
		private static final SyntacticType test_82_sub = parse("!any");
		@Test public void test_82() { testValid(test_82_sup,test_82_sub); }

		private static final SyntacticType test_83_sup = parse("{{any}}");
		private static final SyntacticType test_83_sub = parse("!int");
		@Test public void test_83() { testInvalid(test_83_sup,test_83_sub); }

		private static final SyntacticType test_84_sup = parse("{{any}}");
		private static final SyntacticType test_84_sub = parse("{{any}}");
		@Test public void test_84() { testValid(test_84_sup,test_84_sub); }

		private static final SyntacticType test_85_sup = parse("{{any}}");
		private static final SyntacticType test_85_sub = parse("{{int}}");
		@Test public void test_85() { testValid(test_85_sup,test_85_sub); }

		private static final SyntacticType test_86_sup = parse("{{any}}");
		private static final SyntacticType test_86_sub = parse("{!int}");
		@Test public void test_86() { testInvalid(test_86_sup,test_86_sub); }

		private static final SyntacticType test_87_sup = parse("{{any}}");
		private static final SyntacticType test_87_sub = parse("!{any}");
		@Test public void test_87() { testInvalid(test_87_sup,test_87_sub); }

		private static final SyntacticType test_88_sup = parse("{{any}}");
		private static final SyntacticType test_88_sub = parse("!{int}");
		@Test public void test_88() { testInvalid(test_88_sup,test_88_sub); }

		private static final SyntacticType test_89_sup = parse("{{any}}");
		private static final SyntacticType test_89_sub = parse("!!any");
		@Test public void test_89() { testInvalid(test_89_sup,test_89_sub); }

		private static final SyntacticType test_90_sup = parse("{{any}}");
		private static final SyntacticType test_90_sub = parse("!!int");
		@Test public void test_90() { testInvalid(test_90_sup,test_90_sub); }

		private static final SyntacticType test_91_sup = parse("{{int}}");
		private static final SyntacticType test_91_sub = parse("any");
		@Test public void test_91() { testInvalid(test_91_sup,test_91_sub); }

		private static final SyntacticType test_92_sup = parse("{{int}}");
		private static final SyntacticType test_92_sub = parse("int");
		@Test public void test_92() { testInvalid(test_92_sup,test_92_sub); }

		private static final SyntacticType test_93_sup = parse("{{int}}");
		private static final SyntacticType test_93_sub = parse("{any}");
		@Test public void test_93() { testInvalid(test_93_sup,test_93_sub); }

		private static final SyntacticType test_94_sup = parse("{{int}}");
		private static final SyntacticType test_94_sub = parse("{int}");
		@Test public void test_94() { testInvalid(test_94_sup,test_94_sub); }

		private static final SyntacticType test_95_sup = parse("{{int}}");
		private static final SyntacticType test_95_sub = parse("!any");
		@Test public void test_95() { testValid(test_95_sup,test_95_sub); }

		private static final SyntacticType test_96_sup = parse("{{int}}");
		private static final SyntacticType test_96_sub = parse("!int");
		@Test public void test_96() { testInvalid(test_96_sup,test_96_sub); }

		private static final SyntacticType test_97_sup = parse("{{int}}");
		private static final SyntacticType test_97_sub = parse("{{any}}");
		@Test public void test_97() { testInvalid(test_97_sup,test_97_sub); }

		private static final SyntacticType test_98_sup = parse("{{int}}");
		private static final SyntacticType test_98_sub = parse("{{int}}");
		@Test public void test_98() { testValid(test_98_sup,test_98_sub); }

		private static final SyntacticType test_99_sup = parse("{{int}}");
		private static final SyntacticType test_99_sub = parse("{!int}");
		@Test public void test_99() { testInvalid(test_99_sup,test_99_sub); }

		private static final SyntacticType test_100_sup = parse("{{int}}");
		private static final SyntacticType test_100_sub = parse("!{any}");
		@Test public void test_100() { testInvalid(test_100_sup,test_100_sub); }

		private static final SyntacticType test_101_sup = parse("{{int}}");
		private static final SyntacticType test_101_sub = parse("!{int}");
		@Test public void test_101() { testInvalid(test_101_sup,test_101_sub); }

		private static final SyntacticType test_102_sup = parse("{{int}}");
		private static final SyntacticType test_102_sub = parse("!!any");
		@Test public void test_102() { testInvalid(test_102_sup,test_102_sub); }

		private static final SyntacticType test_103_sup = parse("{{int}}");
		private static final SyntacticType test_103_sub = parse("!!int");
		@Test public void test_103() { testInvalid(test_103_sup,test_103_sub); }

		private static final SyntacticType test_104_sup = parse("{!int}");
		private static final SyntacticType test_104_sub = parse("any");
		@Test public void test_104() { testInvalid(test_104_sup,test_104_sub); }

		private static final SyntacticType test_105_sup = parse("{!int}");
		private static final SyntacticType test_105_sub = parse("int");
		@Test public void test_105() { testInvalid(test_105_sup,test_105_sub); }

		private static final SyntacticType test_106_sup = parse("{!int}");
		private static final SyntacticType test_106_sub = parse("{any}");
		@Test public void test_106() { testInvalid(test_106_sup,test_106_sub); }

		private static final SyntacticType test_107_sup = parse("{!int}");
		private static final SyntacticType test_107_sub = parse("{int}");
		@Test public void test_107() { testInvalid(test_107_sup,test_107_sub); }

		private static final SyntacticType test_108_sup = parse("{!int}");
		private static final SyntacticType test_108_sub = parse("!any");
		@Test public void test_108() { testValid(test_108_sup,test_108_sub); }

		private static final SyntacticType test_109_sup = parse("{!int}");
		private static final SyntacticType test_109_sub = parse("!int");
		@Test public void test_109() { testInvalid(test_109_sup,test_109_sub); }

		private static final SyntacticType test_110_sup = parse("{!int}");
		private static final SyntacticType test_110_sub = parse("{{any}}");
		@Test public void test_110() { testValid(test_110_sup,test_110_sub); }

		private static final SyntacticType test_111_sup = parse("{!int}");
		private static final SyntacticType test_111_sub = parse("{{int}}");
		@Test public void test_111() { testValid(test_111_sup,test_111_sub); }

		private static final SyntacticType test_112_sup = parse("{!int}");
		private static final SyntacticType test_112_sub = parse("{!int}");
		@Test public void test_112() { testValid(test_112_sup,test_112_sub); }

		private static final SyntacticType test_113_sup = parse("{!int}");
		private static final SyntacticType test_113_sub = parse("!{any}");
		@Test public void test_113() { testInvalid(test_113_sup,test_113_sub); }

		private static final SyntacticType test_114_sup = parse("{!int}");
		private static final SyntacticType test_114_sub = parse("!{int}");
		@Test public void test_114() { testInvalid(test_114_sup,test_114_sub); }

		private static final SyntacticType test_115_sup = parse("{!int}");
		private static final SyntacticType test_115_sub = parse("!!any");
		@Test public void test_115() { testInvalid(test_115_sup,test_115_sub); }

		private static final SyntacticType test_116_sup = parse("{!int}");
		private static final SyntacticType test_116_sub = parse("!!int");
		@Test public void test_116() { testInvalid(test_116_sup,test_116_sub); }

		private static final SyntacticType test_117_sup = parse("!{any}");
		private static final SyntacticType test_117_sub = parse("any");
		@Test public void test_117() { testInvalid(test_117_sup,test_117_sub); }

		private static final SyntacticType test_118_sup = parse("!{any}");
		private static final SyntacticType test_118_sub = parse("int");
		@Test public void test_118() { testValid(test_118_sup,test_118_sub); }

		private static final SyntacticType test_119_sup = parse("!{any}");
		private static final SyntacticType test_119_sub = parse("{any}");
		@Test public void test_119() { testInvalid(test_119_sup,test_119_sub); }

		private static final SyntacticType test_120_sup = parse("!{any}");
		private static final SyntacticType test_120_sub = parse("{int}");
		@Test public void test_120() { testInvalid(test_120_sup,test_120_sub); }

		private static final SyntacticType test_121_sup = parse("!{any}");
		private static final SyntacticType test_121_sub = parse("!any");
		@Test public void test_121() { testValid(test_121_sup,test_121_sub); }

		private static final SyntacticType test_122_sup = parse("!{any}");
		private static final SyntacticType test_122_sub = parse("!int");
		@Test public void test_122() { testInvalid(test_122_sup,test_122_sub); }

		private static final SyntacticType test_123_sup = parse("!{any}");
		private static final SyntacticType test_123_sub = parse("{{any}}");
		@Test public void test_123() { testInvalid(test_123_sup,test_123_sub); }

		private static final SyntacticType test_124_sup = parse("!{any}");
		private static final SyntacticType test_124_sub = parse("{{int}}");
		@Test public void test_124() { testInvalid(test_124_sup,test_124_sub); }

		private static final SyntacticType test_125_sup = parse("!{any}");
		private static final SyntacticType test_125_sub = parse("{!int}");
		@Test public void test_125() { testInvalid(test_125_sup,test_125_sub); }

		private static final SyntacticType test_126_sup = parse("!{any}");
		private static final SyntacticType test_126_sub = parse("!{any}");
		@Test public void test_126() { testValid(test_126_sup,test_126_sub); }

		private static final SyntacticType test_127_sup = parse("!{any}");
		private static final SyntacticType test_127_sub = parse("!{int}");
		@Test public void test_127() { testInvalid(test_127_sup,test_127_sub); }

		private static final SyntacticType test_128_sup = parse("!{any}");
		private static final SyntacticType test_128_sub = parse("!!any");
		@Test public void test_128() { testInvalid(test_128_sup,test_128_sub); }

		private static final SyntacticType test_129_sup = parse("!{any}");
		private static final SyntacticType test_129_sub = parse("!!int");
		@Test public void test_129() { testValid(test_129_sup,test_129_sub); }

		private static final SyntacticType test_130_sup = parse("!{int}");
		private static final SyntacticType test_130_sub = parse("any");
		@Test public void test_130() { testInvalid(test_130_sup,test_130_sub); }

		private static final SyntacticType test_131_sup = parse("!{int}");
		private static final SyntacticType test_131_sub = parse("int");
		@Test public void test_131() { testValid(test_131_sup,test_131_sub); }

		private static final SyntacticType test_132_sup = parse("!{int}");
		private static final SyntacticType test_132_sub = parse("{any}");
		@Test public void test_132() { testInvalid(test_132_sup,test_132_sub); }

		private static final SyntacticType test_133_sup = parse("!{int}");
		private static final SyntacticType test_133_sub = parse("{int}");
		@Test public void test_133() { testInvalid(test_133_sup,test_133_sub); }

		private static final SyntacticType test_134_sup = parse("!{int}");
		private static final SyntacticType test_134_sub = parse("!any");
		@Test public void test_134() { testValid(test_134_sup,test_134_sub); }

		private static final SyntacticType test_135_sup = parse("!{int}");
		private static final SyntacticType test_135_sub = parse("!int");
		@Test public void test_135() { testInvalid(test_135_sup,test_135_sub); }

		private static final SyntacticType test_136_sup = parse("!{int}");
		private static final SyntacticType test_136_sub = parse("{{any}}");
		@Test public void test_136() { testValid(test_136_sup,test_136_sub); }

		private static final SyntacticType test_137_sup = parse("!{int}");
		private static final SyntacticType test_137_sub = parse("{{int}}");
		@Test public void test_137() { testValid(test_137_sup,test_137_sub); }

		private static final SyntacticType test_138_sup = parse("!{int}");
		private static final SyntacticType test_138_sub = parse("{!int}");
		@Test public void test_138() { testValid(test_138_sup,test_138_sub); }

		private static final SyntacticType test_139_sup = parse("!{int}");
		private static final SyntacticType test_139_sub = parse("!{any}");
		@Test public void test_139() { testValid(test_139_sup,test_139_sub); }

		private static final SyntacticType test_140_sup = parse("!{int}");
		private static final SyntacticType test_140_sub = parse("!{int}");
		@Test public void test_140() { testValid(test_140_sup,test_140_sub); }

		private static final SyntacticType test_141_sup = parse("!{int}");
		private static final SyntacticType test_141_sub = parse("!!any");
		@Test public void test_141() { testInvalid(test_141_sup,test_141_sub); }

		private static final SyntacticType test_142_sup = parse("!{int}");
		private static final SyntacticType test_142_sub = parse("!!int");
		@Test public void test_142() { testValid(test_142_sup,test_142_sub); }

		private static final SyntacticType test_143_sup = parse("!!any");
		private static final SyntacticType test_143_sub = parse("any");
		@Test public void test_143() { testValid(test_143_sup,test_143_sub); }

		private static final SyntacticType test_144_sup = parse("!!any");
		private static final SyntacticType test_144_sub = parse("int");
		@Test public void test_144() { testValid(test_144_sup,test_144_sub); }

		private static final SyntacticType test_145_sup = parse("!!any");
		private static final SyntacticType test_145_sub = parse("{any}");
		@Test public void test_145() { testValid(test_145_sup,test_145_sub); }

		private static final SyntacticType test_146_sup = parse("!!any");
		private static final SyntacticType test_146_sub = parse("{int}");
		@Test public void test_146() { testValid(test_146_sup,test_146_sub); }

		private static final SyntacticType test_147_sup = parse("!!any");
		private static final SyntacticType test_147_sub = parse("!any");
		@Test public void test_147() { testValid(test_147_sup,test_147_sub); }

		private static final SyntacticType test_148_sup = parse("!!any");
		private static final SyntacticType test_148_sub = parse("!int");
		@Test public void test_148() { testValid(test_148_sup,test_148_sub); }

		private static final SyntacticType test_149_sup = parse("!!any");
		private static final SyntacticType test_149_sub = parse("{{any}}");
		@Test public void test_149() { testValid(test_149_sup,test_149_sub); }

		private static final SyntacticType test_150_sup = parse("!!any");
		private static final SyntacticType test_150_sub = parse("{{int}}");
		@Test public void test_150() { testValid(test_150_sup,test_150_sub); }

		private static final SyntacticType test_151_sup = parse("!!any");
		private static final SyntacticType test_151_sub = parse("{!int}");
		@Test public void test_151() { testValid(test_151_sup,test_151_sub); }

		private static final SyntacticType test_152_sup = parse("!!any");
		private static final SyntacticType test_152_sub = parse("!{any}");
		@Test public void test_152() { testValid(test_152_sup,test_152_sub); }

		private static final SyntacticType test_153_sup = parse("!!any");
		private static final SyntacticType test_153_sub = parse("!{int}");
		@Test public void test_153() { testValid(test_153_sup,test_153_sub); }

		private static final SyntacticType test_154_sup = parse("!!any");
		private static final SyntacticType test_154_sub = parse("!!any");
		@Test public void test_154() { testValid(test_154_sup,test_154_sub); }

		private static final SyntacticType test_155_sup = parse("!!any");
		private static final SyntacticType test_155_sub = parse("!!int");
		@Test public void test_155() { testValid(test_155_sup,test_155_sub); }

		private static final SyntacticType test_156_sup = parse("!!int");
		private static final SyntacticType test_156_sub = parse("any");
		@Test public void test_156() { testInvalid(test_156_sup,test_156_sub); }

		private static final SyntacticType test_157_sup = parse("!!int");
		private static final SyntacticType test_157_sub = parse("int");
		@Test public void test_157() { testValid(test_157_sup,test_157_sub); }

		private static final SyntacticType test_158_sup = parse("!!int");
		private static final SyntacticType test_158_sub = parse("{any}");
		@Test public void test_158() { testInvalid(test_158_sup,test_158_sub); }

		private static final SyntacticType test_159_sup = parse("!!int");
		private static final SyntacticType test_159_sub = parse("{int}");
		@Test public void test_159() { testInvalid(test_159_sup,test_159_sub); }

		private static final SyntacticType test_160_sup = parse("!!int");
		private static final SyntacticType test_160_sub = parse("!any");
		@Test public void test_160() { testValid(test_160_sup,test_160_sub); }

		private static final SyntacticType test_161_sup = parse("!!int");
		private static final SyntacticType test_161_sub = parse("!int");
		@Test public void test_161() { testInvalid(test_161_sup,test_161_sub); }

		private static final SyntacticType test_162_sup = parse("!!int");
		private static final SyntacticType test_162_sub = parse("{{any}}");
		@Test public void test_162() { testInvalid(test_162_sup,test_162_sub); }

		private static final SyntacticType test_163_sup = parse("!!int");
		private static final SyntacticType test_163_sub = parse("{{int}}");
		@Test public void test_163() { testInvalid(test_163_sup,test_163_sub); }

		private static final SyntacticType test_164_sup = parse("!!int");
		private static final SyntacticType test_164_sub = parse("{!int}");
		@Test public void test_164() { testInvalid(test_164_sup,test_164_sub); }

		private static final SyntacticType test_165_sup = parse("!!int");
		private static final SyntacticType test_165_sub = parse("!{any}");
		@Test public void test_165() { testInvalid(test_165_sup,test_165_sub); }

		private static final SyntacticType test_166_sup = parse("!!int");
		private static final SyntacticType test_166_sub = parse("!{int}");
		@Test public void test_166() { testInvalid(test_166_sup,test_166_sub); }

		private static final SyntacticType test_167_sup = parse("!!int");
		private static final SyntacticType test_167_sub = parse("!!any");
		@Test public void test_167() { testInvalid(test_167_sup,test_167_sub); }

		private static final SyntacticType test_168_sup = parse("!!int");
		private static final SyntacticType test_168_sub = parse("!!int");
		@Test public void test_168() { testValid(test_168_sup,test_168_sub); }

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
