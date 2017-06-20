import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import types.testing.AbstractTestSuite;
import types.core.SyntacticType;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSuite_2_1 extends AbstractTestSuite {
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
		private static final SyntacticType test_8_sub = parse("{!any}");
		@Test public void test_8() { testValid(test_8_sup,test_8_sub); }

		private static final SyntacticType test_9_sup = parse("any");
		private static final SyntacticType test_9_sub = parse("{!int}");
		@Test public void test_9() { testValid(test_9_sup,test_9_sub); }

		private static final SyntacticType test_10_sup = parse("any");
		private static final SyntacticType test_10_sub = parse("!{any}");
		@Test public void test_10() { testValid(test_10_sup,test_10_sub); }

		private static final SyntacticType test_11_sup = parse("any");
		private static final SyntacticType test_11_sub = parse("!{int}");
		@Test public void test_11() { testValid(test_11_sup,test_11_sub); }

		private static final SyntacticType test_12_sup = parse("any");
		private static final SyntacticType test_12_sub = parse("!!any");
		@Test public void test_12() { testValid(test_12_sup,test_12_sub); }

		private static final SyntacticType test_13_sup = parse("any");
		private static final SyntacticType test_13_sub = parse("!!int");
		@Test public void test_13() { testValid(test_13_sup,test_13_sub); }

		private static final SyntacticType test_14_sup = parse("int");
		private static final SyntacticType test_14_sub = parse("any");
		@Test public void test_14() { testInvalid(test_14_sup,test_14_sub); }

		private static final SyntacticType test_15_sup = parse("int");
		private static final SyntacticType test_15_sub = parse("int");
		@Test public void test_15() { testValid(test_15_sup,test_15_sub); }

		private static final SyntacticType test_16_sup = parse("int");
		private static final SyntacticType test_16_sub = parse("{any}");
		@Test public void test_16() { testInvalid(test_16_sup,test_16_sub); }

		private static final SyntacticType test_17_sup = parse("int");
		private static final SyntacticType test_17_sub = parse("{int}");
		@Test public void test_17() { testInvalid(test_17_sup,test_17_sub); }

		private static final SyntacticType test_18_sup = parse("int");
		private static final SyntacticType test_18_sub = parse("!any");
		@Test public void test_18() { testValid(test_18_sup,test_18_sub); }

		private static final SyntacticType test_19_sup = parse("int");
		private static final SyntacticType test_19_sub = parse("!int");
		@Test public void test_19() { testInvalid(test_19_sup,test_19_sub); }

		private static final SyntacticType test_20_sup = parse("int");
		private static final SyntacticType test_20_sub = parse("{{any}}");
		@Test public void test_20() { testInvalid(test_20_sup,test_20_sub); }

		private static final SyntacticType test_21_sup = parse("int");
		private static final SyntacticType test_21_sub = parse("{{int}}");
		@Test public void test_21() { testInvalid(test_21_sup,test_21_sub); }

		private static final SyntacticType test_22_sup = parse("int");
		private static final SyntacticType test_22_sub = parse("{!any}");
		@Test public void test_22() { testValid(test_22_sup,test_22_sub); }

		private static final SyntacticType test_23_sup = parse("int");
		private static final SyntacticType test_23_sub = parse("{!int}");
		@Test public void test_23() { testInvalid(test_23_sup,test_23_sub); }

		private static final SyntacticType test_24_sup = parse("int");
		private static final SyntacticType test_24_sub = parse("!{any}");
		@Test public void test_24() { testInvalid(test_24_sup,test_24_sub); }

		private static final SyntacticType test_25_sup = parse("int");
		private static final SyntacticType test_25_sub = parse("!{int}");
		@Test public void test_25() { testInvalid(test_25_sup,test_25_sub); }

		private static final SyntacticType test_26_sup = parse("int");
		private static final SyntacticType test_26_sub = parse("!!any");
		@Test public void test_26() { testInvalid(test_26_sup,test_26_sub); }

		private static final SyntacticType test_27_sup = parse("int");
		private static final SyntacticType test_27_sub = parse("!!int");
		@Test public void test_27() { testValid(test_27_sup,test_27_sub); }

		private static final SyntacticType test_28_sup = parse("{any}");
		private static final SyntacticType test_28_sub = parse("any");
		@Test public void test_28() { testInvalid(test_28_sup,test_28_sub); }

		private static final SyntacticType test_29_sup = parse("{any}");
		private static final SyntacticType test_29_sub = parse("int");
		@Test public void test_29() { testInvalid(test_29_sup,test_29_sub); }

		private static final SyntacticType test_30_sup = parse("{any}");
		private static final SyntacticType test_30_sub = parse("{any}");
		@Test public void test_30() { testValid(test_30_sup,test_30_sub); }

		private static final SyntacticType test_31_sup = parse("{any}");
		private static final SyntacticType test_31_sub = parse("{int}");
		@Test public void test_31() { testValid(test_31_sup,test_31_sub); }

		private static final SyntacticType test_32_sup = parse("{any}");
		private static final SyntacticType test_32_sub = parse("!any");
		@Test public void test_32() { testValid(test_32_sup,test_32_sub); }

		private static final SyntacticType test_33_sup = parse("{any}");
		private static final SyntacticType test_33_sub = parse("!int");
		@Test public void test_33() { testInvalid(test_33_sup,test_33_sub); }

		private static final SyntacticType test_34_sup = parse("{any}");
		private static final SyntacticType test_34_sub = parse("{{any}}");
		@Test public void test_34() { testValid(test_34_sup,test_34_sub); }

		private static final SyntacticType test_35_sup = parse("{any}");
		private static final SyntacticType test_35_sub = parse("{{int}}");
		@Test public void test_35() { testValid(test_35_sup,test_35_sub); }

		private static final SyntacticType test_36_sup = parse("{any}");
		private static final SyntacticType test_36_sub = parse("{!any}");
		@Test public void test_36() { testValid(test_36_sup,test_36_sub); }

		private static final SyntacticType test_37_sup = parse("{any}");
		private static final SyntacticType test_37_sub = parse("{!int}");
		@Test public void test_37() { testValid(test_37_sup,test_37_sub); }

		private static final SyntacticType test_38_sup = parse("{any}");
		private static final SyntacticType test_38_sub = parse("!{any}");
		@Test public void test_38() { testInvalid(test_38_sup,test_38_sub); }

		private static final SyntacticType test_39_sup = parse("{any}");
		private static final SyntacticType test_39_sub = parse("!{int}");
		@Test public void test_39() { testInvalid(test_39_sup,test_39_sub); }

		private static final SyntacticType test_40_sup = parse("{any}");
		private static final SyntacticType test_40_sub = parse("!!any");
		@Test public void test_40() { testInvalid(test_40_sup,test_40_sub); }

		private static final SyntacticType test_41_sup = parse("{any}");
		private static final SyntacticType test_41_sub = parse("!!int");
		@Test public void test_41() { testInvalid(test_41_sup,test_41_sub); }

		private static final SyntacticType test_42_sup = parse("{int}");
		private static final SyntacticType test_42_sub = parse("any");
		@Test public void test_42() { testInvalid(test_42_sup,test_42_sub); }

		private static final SyntacticType test_43_sup = parse("{int}");
		private static final SyntacticType test_43_sub = parse("int");
		@Test public void test_43() { testInvalid(test_43_sup,test_43_sub); }

		private static final SyntacticType test_44_sup = parse("{int}");
		private static final SyntacticType test_44_sub = parse("{any}");
		@Test public void test_44() { testInvalid(test_44_sup,test_44_sub); }

		private static final SyntacticType test_45_sup = parse("{int}");
		private static final SyntacticType test_45_sub = parse("{int}");
		@Test public void test_45() { testValid(test_45_sup,test_45_sub); }

		private static final SyntacticType test_46_sup = parse("{int}");
		private static final SyntacticType test_46_sub = parse("!any");
		@Test public void test_46() { testValid(test_46_sup,test_46_sub); }

		private static final SyntacticType test_47_sup = parse("{int}");
		private static final SyntacticType test_47_sub = parse("!int");
		@Test public void test_47() { testInvalid(test_47_sup,test_47_sub); }

		private static final SyntacticType test_48_sup = parse("{int}");
		private static final SyntacticType test_48_sub = parse("{{any}}");
		@Test public void test_48() { testInvalid(test_48_sup,test_48_sub); }

		private static final SyntacticType test_49_sup = parse("{int}");
		private static final SyntacticType test_49_sub = parse("{{int}}");
		@Test public void test_49() { testInvalid(test_49_sup,test_49_sub); }

		private static final SyntacticType test_50_sup = parse("{int}");
		private static final SyntacticType test_50_sub = parse("{!any}");
		@Test public void test_50() { testValid(test_50_sup,test_50_sub); }

		private static final SyntacticType test_51_sup = parse("{int}");
		private static final SyntacticType test_51_sub = parse("{!int}");
		@Test public void test_51() { testInvalid(test_51_sup,test_51_sub); }

		private static final SyntacticType test_52_sup = parse("{int}");
		private static final SyntacticType test_52_sub = parse("!{any}");
		@Test public void test_52() { testInvalid(test_52_sup,test_52_sub); }

		private static final SyntacticType test_53_sup = parse("{int}");
		private static final SyntacticType test_53_sub = parse("!{int}");
		@Test public void test_53() { testInvalid(test_53_sup,test_53_sub); }

		private static final SyntacticType test_54_sup = parse("{int}");
		private static final SyntacticType test_54_sub = parse("!!any");
		@Test public void test_54() { testInvalid(test_54_sup,test_54_sub); }

		private static final SyntacticType test_55_sup = parse("{int}");
		private static final SyntacticType test_55_sub = parse("!!int");
		@Test public void test_55() { testInvalid(test_55_sup,test_55_sub); }

		private static final SyntacticType test_56_sup = parse("!any");
		private static final SyntacticType test_56_sub = parse("any");
		@Test public void test_56() { testInvalid(test_56_sup,test_56_sub); }

		private static final SyntacticType test_57_sup = parse("!any");
		private static final SyntacticType test_57_sub = parse("int");
		@Test public void test_57() { testInvalid(test_57_sup,test_57_sub); }

		private static final SyntacticType test_58_sup = parse("!any");
		private static final SyntacticType test_58_sub = parse("{any}");
		@Test public void test_58() { testInvalid(test_58_sup,test_58_sub); }

		private static final SyntacticType test_59_sup = parse("!any");
		private static final SyntacticType test_59_sub = parse("{int}");
		@Test public void test_59() { testInvalid(test_59_sup,test_59_sub); }

		private static final SyntacticType test_60_sup = parse("!any");
		private static final SyntacticType test_60_sub = parse("!any");
		@Test public void test_60() { testValid(test_60_sup,test_60_sub); }

		private static final SyntacticType test_61_sup = parse("!any");
		private static final SyntacticType test_61_sub = parse("!int");
		@Test public void test_61() { testInvalid(test_61_sup,test_61_sub); }

		private static final SyntacticType test_62_sup = parse("!any");
		private static final SyntacticType test_62_sub = parse("{{any}}");
		@Test public void test_62() { testInvalid(test_62_sup,test_62_sub); }

		private static final SyntacticType test_63_sup = parse("!any");
		private static final SyntacticType test_63_sub = parse("{{int}}");
		@Test public void test_63() { testInvalid(test_63_sup,test_63_sub); }

		private static final SyntacticType test_64_sup = parse("!any");
		private static final SyntacticType test_64_sub = parse("{!any}");
		@Test public void test_64() { testValid(test_64_sup,test_64_sub); }

		private static final SyntacticType test_65_sup = parse("!any");
		private static final SyntacticType test_65_sub = parse("{!int}");
		@Test public void test_65() { testInvalid(test_65_sup,test_65_sub); }

		private static final SyntacticType test_66_sup = parse("!any");
		private static final SyntacticType test_66_sub = parse("!{any}");
		@Test public void test_66() { testInvalid(test_66_sup,test_66_sub); }

		private static final SyntacticType test_67_sup = parse("!any");
		private static final SyntacticType test_67_sub = parse("!{int}");
		@Test public void test_67() { testInvalid(test_67_sup,test_67_sub); }

		private static final SyntacticType test_68_sup = parse("!any");
		private static final SyntacticType test_68_sub = parse("!!any");
		@Test public void test_68() { testInvalid(test_68_sup,test_68_sub); }

		private static final SyntacticType test_69_sup = parse("!any");
		private static final SyntacticType test_69_sub = parse("!!int");
		@Test public void test_69() { testInvalid(test_69_sup,test_69_sub); }

		private static final SyntacticType test_70_sup = parse("!int");
		private static final SyntacticType test_70_sub = parse("any");
		@Test public void test_70() { testInvalid(test_70_sup,test_70_sub); }

		private static final SyntacticType test_71_sup = parse("!int");
		private static final SyntacticType test_71_sub = parse("int");
		@Test public void test_71() { testInvalid(test_71_sup,test_71_sub); }

		private static final SyntacticType test_72_sup = parse("!int");
		private static final SyntacticType test_72_sub = parse("{any}");
		@Test public void test_72() { testValid(test_72_sup,test_72_sub); }

		private static final SyntacticType test_73_sup = parse("!int");
		private static final SyntacticType test_73_sub = parse("{int}");
		@Test public void test_73() { testValid(test_73_sup,test_73_sub); }

		private static final SyntacticType test_74_sup = parse("!int");
		private static final SyntacticType test_74_sub = parse("!any");
		@Test public void test_74() { testValid(test_74_sup,test_74_sub); }

		private static final SyntacticType test_75_sup = parse("!int");
		private static final SyntacticType test_75_sub = parse("!int");
		@Test public void test_75() { testValid(test_75_sup,test_75_sub); }

		private static final SyntacticType test_76_sup = parse("!int");
		private static final SyntacticType test_76_sub = parse("{{any}}");
		@Test public void test_76() { testValid(test_76_sup,test_76_sub); }

		private static final SyntacticType test_77_sup = parse("!int");
		private static final SyntacticType test_77_sub = parse("{{int}}");
		@Test public void test_77() { testValid(test_77_sup,test_77_sub); }

		private static final SyntacticType test_78_sup = parse("!int");
		private static final SyntacticType test_78_sub = parse("{!any}");
		@Test public void test_78() { testValid(test_78_sup,test_78_sub); }

		private static final SyntacticType test_79_sup = parse("!int");
		private static final SyntacticType test_79_sub = parse("{!int}");
		@Test public void test_79() { testValid(test_79_sup,test_79_sub); }

		private static final SyntacticType test_80_sup = parse("!int");
		private static final SyntacticType test_80_sub = parse("!{any}");
		@Test public void test_80() { testInvalid(test_80_sup,test_80_sub); }

		private static final SyntacticType test_81_sup = parse("!int");
		private static final SyntacticType test_81_sub = parse("!{int}");
		@Test public void test_81() { testInvalid(test_81_sup,test_81_sub); }

		private static final SyntacticType test_82_sup = parse("!int");
		private static final SyntacticType test_82_sub = parse("!!any");
		@Test public void test_82() { testInvalid(test_82_sup,test_82_sub); }

		private static final SyntacticType test_83_sup = parse("!int");
		private static final SyntacticType test_83_sub = parse("!!int");
		@Test public void test_83() { testInvalid(test_83_sup,test_83_sub); }

		private static final SyntacticType test_84_sup = parse("{{any}}");
		private static final SyntacticType test_84_sub = parse("any");
		@Test public void test_84() { testInvalid(test_84_sup,test_84_sub); }

		private static final SyntacticType test_85_sup = parse("{{any}}");
		private static final SyntacticType test_85_sub = parse("int");
		@Test public void test_85() { testInvalid(test_85_sup,test_85_sub); }

		private static final SyntacticType test_86_sup = parse("{{any}}");
		private static final SyntacticType test_86_sub = parse("{any}");
		@Test public void test_86() { testInvalid(test_86_sup,test_86_sub); }

		private static final SyntacticType test_87_sup = parse("{{any}}");
		private static final SyntacticType test_87_sub = parse("{int}");
		@Test public void test_87() { testInvalid(test_87_sup,test_87_sub); }

		private static final SyntacticType test_88_sup = parse("{{any}}");
		private static final SyntacticType test_88_sub = parse("!any");
		@Test public void test_88() { testValid(test_88_sup,test_88_sub); }

		private static final SyntacticType test_89_sup = parse("{{any}}");
		private static final SyntacticType test_89_sub = parse("!int");
		@Test public void test_89() { testInvalid(test_89_sup,test_89_sub); }

		private static final SyntacticType test_90_sup = parse("{{any}}");
		private static final SyntacticType test_90_sub = parse("{{any}}");
		@Test public void test_90() { testValid(test_90_sup,test_90_sub); }

		private static final SyntacticType test_91_sup = parse("{{any}}");
		private static final SyntacticType test_91_sub = parse("{{int}}");
		@Test public void test_91() { testValid(test_91_sup,test_91_sub); }

		private static final SyntacticType test_92_sup = parse("{{any}}");
		private static final SyntacticType test_92_sub = parse("{!any}");
		@Test public void test_92() { testValid(test_92_sup,test_92_sub); }

		private static final SyntacticType test_93_sup = parse("{{any}}");
		private static final SyntacticType test_93_sub = parse("{!int}");
		@Test public void test_93() { testInvalid(test_93_sup,test_93_sub); }

		private static final SyntacticType test_94_sup = parse("{{any}}");
		private static final SyntacticType test_94_sub = parse("!{any}");
		@Test public void test_94() { testInvalid(test_94_sup,test_94_sub); }

		private static final SyntacticType test_95_sup = parse("{{any}}");
		private static final SyntacticType test_95_sub = parse("!{int}");
		@Test public void test_95() { testInvalid(test_95_sup,test_95_sub); }

		private static final SyntacticType test_96_sup = parse("{{any}}");
		private static final SyntacticType test_96_sub = parse("!!any");
		@Test public void test_96() { testInvalid(test_96_sup,test_96_sub); }

		private static final SyntacticType test_97_sup = parse("{{any}}");
		private static final SyntacticType test_97_sub = parse("!!int");
		@Test public void test_97() { testInvalid(test_97_sup,test_97_sub); }

		private static final SyntacticType test_98_sup = parse("{{int}}");
		private static final SyntacticType test_98_sub = parse("any");
		@Test public void test_98() { testInvalid(test_98_sup,test_98_sub); }

		private static final SyntacticType test_99_sup = parse("{{int}}");
		private static final SyntacticType test_99_sub = parse("int");
		@Test public void test_99() { testInvalid(test_99_sup,test_99_sub); }

		private static final SyntacticType test_100_sup = parse("{{int}}");
		private static final SyntacticType test_100_sub = parse("{any}");
		@Test public void test_100() { testInvalid(test_100_sup,test_100_sub); }

		private static final SyntacticType test_101_sup = parse("{{int}}");
		private static final SyntacticType test_101_sub = parse("{int}");
		@Test public void test_101() { testInvalid(test_101_sup,test_101_sub); }

		private static final SyntacticType test_102_sup = parse("{{int}}");
		private static final SyntacticType test_102_sub = parse("!any");
		@Test public void test_102() { testValid(test_102_sup,test_102_sub); }

		private static final SyntacticType test_103_sup = parse("{{int}}");
		private static final SyntacticType test_103_sub = parse("!int");
		@Test public void test_103() { testInvalid(test_103_sup,test_103_sub); }

		private static final SyntacticType test_104_sup = parse("{{int}}");
		private static final SyntacticType test_104_sub = parse("{{any}}");
		@Test public void test_104() { testInvalid(test_104_sup,test_104_sub); }

		private static final SyntacticType test_105_sup = parse("{{int}}");
		private static final SyntacticType test_105_sub = parse("{{int}}");
		@Test public void test_105() { testValid(test_105_sup,test_105_sub); }

		private static final SyntacticType test_106_sup = parse("{{int}}");
		private static final SyntacticType test_106_sub = parse("{!any}");
		@Test public void test_106() { testValid(test_106_sup,test_106_sub); }

		private static final SyntacticType test_107_sup = parse("{{int}}");
		private static final SyntacticType test_107_sub = parse("{!int}");
		@Test public void test_107() { testInvalid(test_107_sup,test_107_sub); }

		private static final SyntacticType test_108_sup = parse("{{int}}");
		private static final SyntacticType test_108_sub = parse("!{any}");
		@Test public void test_108() { testInvalid(test_108_sup,test_108_sub); }

		private static final SyntacticType test_109_sup = parse("{{int}}");
		private static final SyntacticType test_109_sub = parse("!{int}");
		@Test public void test_109() { testInvalid(test_109_sup,test_109_sub); }

		private static final SyntacticType test_110_sup = parse("{{int}}");
		private static final SyntacticType test_110_sub = parse("!!any");
		@Test public void test_110() { testInvalid(test_110_sup,test_110_sub); }

		private static final SyntacticType test_111_sup = parse("{{int}}");
		private static final SyntacticType test_111_sub = parse("!!int");
		@Test public void test_111() { testInvalid(test_111_sup,test_111_sub); }

		private static final SyntacticType test_112_sup = parse("{!any}");
		private static final SyntacticType test_112_sub = parse("any");
		@Test public void test_112() { testInvalid(test_112_sup,test_112_sub); }

		private static final SyntacticType test_113_sup = parse("{!any}");
		private static final SyntacticType test_113_sub = parse("int");
		@Test public void test_113() { testInvalid(test_113_sup,test_113_sub); }

		private static final SyntacticType test_114_sup = parse("{!any}");
		private static final SyntacticType test_114_sub = parse("{any}");
		@Test public void test_114() { testInvalid(test_114_sup,test_114_sub); }

		private static final SyntacticType test_115_sup = parse("{!any}");
		private static final SyntacticType test_115_sub = parse("{int}");
		@Test public void test_115() { testInvalid(test_115_sup,test_115_sub); }

		private static final SyntacticType test_116_sup = parse("{!any}");
		private static final SyntacticType test_116_sub = parse("!any");
		@Test public void test_116() { testValid(test_116_sup,test_116_sub); }

		private static final SyntacticType test_117_sup = parse("{!any}");
		private static final SyntacticType test_117_sub = parse("!int");
		@Test public void test_117() { testInvalid(test_117_sup,test_117_sub); }

		private static final SyntacticType test_118_sup = parse("{!any}");
		private static final SyntacticType test_118_sub = parse("{{any}}");
		@Test public void test_118() { testInvalid(test_118_sup,test_118_sub); }

		private static final SyntacticType test_119_sup = parse("{!any}");
		private static final SyntacticType test_119_sub = parse("{{int}}");
		@Test public void test_119() { testInvalid(test_119_sup,test_119_sub); }

		private static final SyntacticType test_120_sup = parse("{!any}");
		private static final SyntacticType test_120_sub = parse("{!any}");
		@Test public void test_120() { testValid(test_120_sup,test_120_sub); }

		private static final SyntacticType test_121_sup = parse("{!any}");
		private static final SyntacticType test_121_sub = parse("{!int}");
		@Test public void test_121() { testInvalid(test_121_sup,test_121_sub); }

		private static final SyntacticType test_122_sup = parse("{!any}");
		private static final SyntacticType test_122_sub = parse("!{any}");
		@Test public void test_122() { testInvalid(test_122_sup,test_122_sub); }

		private static final SyntacticType test_123_sup = parse("{!any}");
		private static final SyntacticType test_123_sub = parse("!{int}");
		@Test public void test_123() { testInvalid(test_123_sup,test_123_sub); }

		private static final SyntacticType test_124_sup = parse("{!any}");
		private static final SyntacticType test_124_sub = parse("!!any");
		@Test public void test_124() { testInvalid(test_124_sup,test_124_sub); }

		private static final SyntacticType test_125_sup = parse("{!any}");
		private static final SyntacticType test_125_sub = parse("!!int");
		@Test public void test_125() { testInvalid(test_125_sup,test_125_sub); }

		private static final SyntacticType test_126_sup = parse("{!int}");
		private static final SyntacticType test_126_sub = parse("any");
		@Test public void test_126() { testInvalid(test_126_sup,test_126_sub); }

		private static final SyntacticType test_127_sup = parse("{!int}");
		private static final SyntacticType test_127_sub = parse("int");
		@Test public void test_127() { testInvalid(test_127_sup,test_127_sub); }

		private static final SyntacticType test_128_sup = parse("{!int}");
		private static final SyntacticType test_128_sub = parse("{any}");
		@Test public void test_128() { testInvalid(test_128_sup,test_128_sub); }

		private static final SyntacticType test_129_sup = parse("{!int}");
		private static final SyntacticType test_129_sub = parse("{int}");
		@Test public void test_129() { testInvalid(test_129_sup,test_129_sub); }

		private static final SyntacticType test_130_sup = parse("{!int}");
		private static final SyntacticType test_130_sub = parse("!any");
		@Test public void test_130() { testValid(test_130_sup,test_130_sub); }

		private static final SyntacticType test_131_sup = parse("{!int}");
		private static final SyntacticType test_131_sub = parse("!int");
		@Test public void test_131() { testInvalid(test_131_sup,test_131_sub); }

		private static final SyntacticType test_132_sup = parse("{!int}");
		private static final SyntacticType test_132_sub = parse("{{any}}");
		@Test public void test_132() { testValid(test_132_sup,test_132_sub); }

		private static final SyntacticType test_133_sup = parse("{!int}");
		private static final SyntacticType test_133_sub = parse("{{int}}");
		@Test public void test_133() { testValid(test_133_sup,test_133_sub); }

		private static final SyntacticType test_134_sup = parse("{!int}");
		private static final SyntacticType test_134_sub = parse("{!any}");
		@Test public void test_134() { testValid(test_134_sup,test_134_sub); }

		private static final SyntacticType test_135_sup = parse("{!int}");
		private static final SyntacticType test_135_sub = parse("{!int}");
		@Test public void test_135() { testValid(test_135_sup,test_135_sub); }

		private static final SyntacticType test_136_sup = parse("{!int}");
		private static final SyntacticType test_136_sub = parse("!{any}");
		@Test public void test_136() { testInvalid(test_136_sup,test_136_sub); }

		private static final SyntacticType test_137_sup = parse("{!int}");
		private static final SyntacticType test_137_sub = parse("!{int}");
		@Test public void test_137() { testInvalid(test_137_sup,test_137_sub); }

		private static final SyntacticType test_138_sup = parse("{!int}");
		private static final SyntacticType test_138_sub = parse("!!any");
		@Test public void test_138() { testInvalid(test_138_sup,test_138_sub); }

		private static final SyntacticType test_139_sup = parse("{!int}");
		private static final SyntacticType test_139_sub = parse("!!int");
		@Test public void test_139() { testInvalid(test_139_sup,test_139_sub); }

		private static final SyntacticType test_140_sup = parse("!{any}");
		private static final SyntacticType test_140_sub = parse("any");
		@Test public void test_140() { testInvalid(test_140_sup,test_140_sub); }

		private static final SyntacticType test_141_sup = parse("!{any}");
		private static final SyntacticType test_141_sub = parse("int");
		@Test public void test_141() { testValid(test_141_sup,test_141_sub); }

		private static final SyntacticType test_142_sup = parse("!{any}");
		private static final SyntacticType test_142_sub = parse("{any}");
		@Test public void test_142() { testInvalid(test_142_sup,test_142_sub); }

		private static final SyntacticType test_143_sup = parse("!{any}");
		private static final SyntacticType test_143_sub = parse("{int}");
		@Test public void test_143() { testInvalid(test_143_sup,test_143_sub); }

		private static final SyntacticType test_144_sup = parse("!{any}");
		private static final SyntacticType test_144_sub = parse("!any");
		@Test public void test_144() { testValid(test_144_sup,test_144_sub); }

		private static final SyntacticType test_145_sup = parse("!{any}");
		private static final SyntacticType test_145_sub = parse("!int");
		@Test public void test_145() { testInvalid(test_145_sup,test_145_sub); }

		private static final SyntacticType test_146_sup = parse("!{any}");
		private static final SyntacticType test_146_sub = parse("{{any}}");
		@Test public void test_146() { testInvalid(test_146_sup,test_146_sub); }

		private static final SyntacticType test_147_sup = parse("!{any}");
		private static final SyntacticType test_147_sub = parse("{{int}}");
		@Test public void test_147() { testInvalid(test_147_sup,test_147_sub); }

		private static final SyntacticType test_148_sup = parse("!{any}");
		private static final SyntacticType test_148_sub = parse("{!any}");
		@Test public void test_148() { testValid(test_148_sup,test_148_sub); }

		private static final SyntacticType test_149_sup = parse("!{any}");
		private static final SyntacticType test_149_sub = parse("{!int}");
		@Test public void test_149() { testInvalid(test_149_sup,test_149_sub); }

		private static final SyntacticType test_150_sup = parse("!{any}");
		private static final SyntacticType test_150_sub = parse("!{any}");
		@Test public void test_150() { testValid(test_150_sup,test_150_sub); }

		private static final SyntacticType test_151_sup = parse("!{any}");
		private static final SyntacticType test_151_sub = parse("!{int}");
		@Test public void test_151() { testInvalid(test_151_sup,test_151_sub); }

		private static final SyntacticType test_152_sup = parse("!{any}");
		private static final SyntacticType test_152_sub = parse("!!any");
		@Test public void test_152() { testInvalid(test_152_sup,test_152_sub); }

		private static final SyntacticType test_153_sup = parse("!{any}");
		private static final SyntacticType test_153_sub = parse("!!int");
		@Test public void test_153() { testValid(test_153_sup,test_153_sub); }

		private static final SyntacticType test_154_sup = parse("!{int}");
		private static final SyntacticType test_154_sub = parse("any");
		@Test public void test_154() { testInvalid(test_154_sup,test_154_sub); }

		private static final SyntacticType test_155_sup = parse("!{int}");
		private static final SyntacticType test_155_sub = parse("int");
		@Test public void test_155() { testValid(test_155_sup,test_155_sub); }

		private static final SyntacticType test_156_sup = parse("!{int}");
		private static final SyntacticType test_156_sub = parse("{any}");
		@Test public void test_156() { testInvalid(test_156_sup,test_156_sub); }

		private static final SyntacticType test_157_sup = parse("!{int}");
		private static final SyntacticType test_157_sub = parse("{int}");
		@Test public void test_157() { testInvalid(test_157_sup,test_157_sub); }

		private static final SyntacticType test_158_sup = parse("!{int}");
		private static final SyntacticType test_158_sub = parse("!any");
		@Test public void test_158() { testValid(test_158_sup,test_158_sub); }

		private static final SyntacticType test_159_sup = parse("!{int}");
		private static final SyntacticType test_159_sub = parse("!int");
		@Test public void test_159() { testInvalid(test_159_sup,test_159_sub); }

		private static final SyntacticType test_160_sup = parse("!{int}");
		private static final SyntacticType test_160_sub = parse("{{any}}");
		@Test public void test_160() { testValid(test_160_sup,test_160_sub); }

		private static final SyntacticType test_161_sup = parse("!{int}");
		private static final SyntacticType test_161_sub = parse("{{int}}");
		@Test public void test_161() { testValid(test_161_sup,test_161_sub); }

		private static final SyntacticType test_162_sup = parse("!{int}");
		private static final SyntacticType test_162_sub = parse("{!any}");
		@Test public void test_162() { testValid(test_162_sup,test_162_sub); }

		private static final SyntacticType test_163_sup = parse("!{int}");
		private static final SyntacticType test_163_sub = parse("{!int}");
		@Test public void test_163() { testValid(test_163_sup,test_163_sub); }

		private static final SyntacticType test_164_sup = parse("!{int}");
		private static final SyntacticType test_164_sub = parse("!{any}");
		@Test public void test_164() { testValid(test_164_sup,test_164_sub); }

		private static final SyntacticType test_165_sup = parse("!{int}");
		private static final SyntacticType test_165_sub = parse("!{int}");
		@Test public void test_165() { testValid(test_165_sup,test_165_sub); }

		private static final SyntacticType test_166_sup = parse("!{int}");
		private static final SyntacticType test_166_sub = parse("!!any");
		@Test public void test_166() { testInvalid(test_166_sup,test_166_sub); }

		private static final SyntacticType test_167_sup = parse("!{int}");
		private static final SyntacticType test_167_sub = parse("!!int");
		@Test public void test_167() { testValid(test_167_sup,test_167_sub); }

		private static final SyntacticType test_168_sup = parse("!!any");
		private static final SyntacticType test_168_sub = parse("any");
		@Test public void test_168() { testValid(test_168_sup,test_168_sub); }

		private static final SyntacticType test_169_sup = parse("!!any");
		private static final SyntacticType test_169_sub = parse("int");
		@Test public void test_169() { testValid(test_169_sup,test_169_sub); }

		private static final SyntacticType test_170_sup = parse("!!any");
		private static final SyntacticType test_170_sub = parse("{any}");
		@Test public void test_170() { testValid(test_170_sup,test_170_sub); }

		private static final SyntacticType test_171_sup = parse("!!any");
		private static final SyntacticType test_171_sub = parse("{int}");
		@Test public void test_171() { testValid(test_171_sup,test_171_sub); }

		private static final SyntacticType test_172_sup = parse("!!any");
		private static final SyntacticType test_172_sub = parse("!any");
		@Test public void test_172() { testValid(test_172_sup,test_172_sub); }

		private static final SyntacticType test_173_sup = parse("!!any");
		private static final SyntacticType test_173_sub = parse("!int");
		@Test public void test_173() { testValid(test_173_sup,test_173_sub); }

		private static final SyntacticType test_174_sup = parse("!!any");
		private static final SyntacticType test_174_sub = parse("{{any}}");
		@Test public void test_174() { testValid(test_174_sup,test_174_sub); }

		private static final SyntacticType test_175_sup = parse("!!any");
		private static final SyntacticType test_175_sub = parse("{{int}}");
		@Test public void test_175() { testValid(test_175_sup,test_175_sub); }

		private static final SyntacticType test_176_sup = parse("!!any");
		private static final SyntacticType test_176_sub = parse("{!any}");
		@Test public void test_176() { testValid(test_176_sup,test_176_sub); }

		private static final SyntacticType test_177_sup = parse("!!any");
		private static final SyntacticType test_177_sub = parse("{!int}");
		@Test public void test_177() { testValid(test_177_sup,test_177_sub); }

		private static final SyntacticType test_178_sup = parse("!!any");
		private static final SyntacticType test_178_sub = parse("!{any}");
		@Test public void test_178() { testValid(test_178_sup,test_178_sub); }

		private static final SyntacticType test_179_sup = parse("!!any");
		private static final SyntacticType test_179_sub = parse("!{int}");
		@Test public void test_179() { testValid(test_179_sup,test_179_sub); }

		private static final SyntacticType test_180_sup = parse("!!any");
		private static final SyntacticType test_180_sub = parse("!!any");
		@Test public void test_180() { testValid(test_180_sup,test_180_sub); }

		private static final SyntacticType test_181_sup = parse("!!any");
		private static final SyntacticType test_181_sub = parse("!!int");
		@Test public void test_181() { testValid(test_181_sup,test_181_sub); }

		private static final SyntacticType test_182_sup = parse("!!int");
		private static final SyntacticType test_182_sub = parse("any");
		@Test public void test_182() { testInvalid(test_182_sup,test_182_sub); }

		private static final SyntacticType test_183_sup = parse("!!int");
		private static final SyntacticType test_183_sub = parse("int");
		@Test public void test_183() { testValid(test_183_sup,test_183_sub); }

		private static final SyntacticType test_184_sup = parse("!!int");
		private static final SyntacticType test_184_sub = parse("{any}");
		@Test public void test_184() { testInvalid(test_184_sup,test_184_sub); }

		private static final SyntacticType test_185_sup = parse("!!int");
		private static final SyntacticType test_185_sub = parse("{int}");
		@Test public void test_185() { testInvalid(test_185_sup,test_185_sub); }

		private static final SyntacticType test_186_sup = parse("!!int");
		private static final SyntacticType test_186_sub = parse("!any");
		@Test public void test_186() { testValid(test_186_sup,test_186_sub); }

		private static final SyntacticType test_187_sup = parse("!!int");
		private static final SyntacticType test_187_sub = parse("!int");
		@Test public void test_187() { testInvalid(test_187_sup,test_187_sub); }

		private static final SyntacticType test_188_sup = parse("!!int");
		private static final SyntacticType test_188_sub = parse("{{any}}");
		@Test public void test_188() { testInvalid(test_188_sup,test_188_sub); }

		private static final SyntacticType test_189_sup = parse("!!int");
		private static final SyntacticType test_189_sub = parse("{{int}}");
		@Test public void test_189() { testInvalid(test_189_sup,test_189_sub); }

		private static final SyntacticType test_190_sup = parse("!!int");
		private static final SyntacticType test_190_sub = parse("{!any}");
		@Test public void test_190() { testValid(test_190_sup,test_190_sub); }

		private static final SyntacticType test_191_sup = parse("!!int");
		private static final SyntacticType test_191_sub = parse("{!int}");
		@Test public void test_191() { testInvalid(test_191_sup,test_191_sub); }

		private static final SyntacticType test_192_sup = parse("!!int");
		private static final SyntacticType test_192_sub = parse("!{any}");
		@Test public void test_192() { testInvalid(test_192_sup,test_192_sub); }

		private static final SyntacticType test_193_sup = parse("!!int");
		private static final SyntacticType test_193_sub = parse("!{int}");
		@Test public void test_193() { testInvalid(test_193_sup,test_193_sub); }

		private static final SyntacticType test_194_sup = parse("!!int");
		private static final SyntacticType test_194_sub = parse("!!any");
		@Test public void test_194() { testInvalid(test_194_sup,test_194_sub); }

		private static final SyntacticType test_195_sup = parse("!!int");
		private static final SyntacticType test_195_sub = parse("!!int");
		@Test public void test_195() { testValid(test_195_sup,test_195_sub); }

	}
}
