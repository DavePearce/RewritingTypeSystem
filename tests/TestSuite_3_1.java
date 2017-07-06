import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import types.testing.AbstractTestSuite;
import types.core.SyntacticType;
import types.core.SubtypeQuery;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSuite_3_1 extends AbstractTestSuite {
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

		private static final SubtypeQuery test_6_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("{{any}}"));
		@Test public void test_6() { testValid(test_6_query); }

		private static final SubtypeQuery test_7_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("{{int}}"));
		@Test public void test_7() { testValid(test_7_query); }

		private static final SubtypeQuery test_8_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("{!any}"));
		@Test public void test_8() { testValid(test_8_query); }

		private static final SubtypeQuery test_9_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("{!int}"));
		@Test public void test_9() { testValid(test_9_query); }

		private static final SubtypeQuery test_10_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("!{any}"));
		@Test public void test_10() { testValid(test_10_query); }

		private static final SubtypeQuery test_11_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("!{int}"));
		@Test public void test_11() { testValid(test_11_query); }

		private static final SubtypeQuery test_12_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("!!any"));
		@Test public void test_12() { testValid(test_12_query); }

		private static final SubtypeQuery test_13_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("!!int"));
		@Test public void test_13() { testValid(test_13_query); }

		private static final SubtypeQuery test_14_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("{{{any}}}"));
		@Test public void test_14() { testValid(test_14_query); }

		private static final SubtypeQuery test_15_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("{{{int}}}"));
		@Test public void test_15() { testValid(test_15_query); }

		private static final SubtypeQuery test_16_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("{{!any}}"));
		@Test public void test_16() { testValid(test_16_query); }

		private static final SubtypeQuery test_17_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("{{!int}}"));
		@Test public void test_17() { testValid(test_17_query); }

		private static final SubtypeQuery test_18_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("{!{any}}"));
		@Test public void test_18() { testValid(test_18_query); }

		private static final SubtypeQuery test_19_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("{!{int}}"));
		@Test public void test_19() { testValid(test_19_query); }

		private static final SubtypeQuery test_20_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("{!!any}"));
		@Test public void test_20() { testValid(test_20_query); }

		private static final SubtypeQuery test_21_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("{!!int}"));
		@Test public void test_21() { testValid(test_21_query); }

		private static final SubtypeQuery test_22_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("!{{any}}"));
		@Test public void test_22() { testValid(test_22_query); }

		private static final SubtypeQuery test_23_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("!{{int}}"));
		@Test public void test_23() { testValid(test_23_query); }

		private static final SubtypeQuery test_24_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("!{!any}"));
		@Test public void test_24() { testValid(test_24_query); }

		private static final SubtypeQuery test_25_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("!{!int}"));
		@Test public void test_25() { testValid(test_25_query); }

		private static final SubtypeQuery test_26_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("!!{any}"));
		@Test public void test_26() { testValid(test_26_query); }

		private static final SubtypeQuery test_27_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("!!{int}"));
		@Test public void test_27() { testValid(test_27_query); }

		private static final SubtypeQuery test_28_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("!!!any"));
		@Test public void test_28() { testValid(test_28_query); }

		private static final SubtypeQuery test_29_query = createSubtypeQuery(parseWhiley("any"),parseWhiley("!!!int"));
		@Test public void test_29() { testValid(test_29_query); }

		private static final SubtypeQuery test_30_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("any"));
		@Test public void test_30() { testInvalid(test_30_query); }

		private static final SubtypeQuery test_31_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("int"));
		@Test public void test_31() { testValid(test_31_query); }

		private static final SubtypeQuery test_32_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{any}"));
		@Test public void test_32() { testInvalid(test_32_query); }

		private static final SubtypeQuery test_33_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{int}"));
		@Test public void test_33() { testInvalid(test_33_query); }

		private static final SubtypeQuery test_34_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!any"));
		@Test public void test_34() { testValid(test_34_query); }

		private static final SubtypeQuery test_35_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!int"));
		@Test public void test_35() { testInvalid(test_35_query); }

		private static final SubtypeQuery test_36_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{{any}}"));
		@Test public void test_36() { testInvalid(test_36_query); }

		private static final SubtypeQuery test_37_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{{int}}"));
		@Test public void test_37() { testInvalid(test_37_query); }

		private static final SubtypeQuery test_38_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{!any}"));
		@Test public void test_38() { testValid(test_38_query); }

		private static final SubtypeQuery test_39_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{!int}"));
		@Test public void test_39() { testInvalid(test_39_query); }

		private static final SubtypeQuery test_40_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!{any}"));
		@Test public void test_40() { testInvalid(test_40_query); }

		private static final SubtypeQuery test_41_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!{int}"));
		@Test public void test_41() { testInvalid(test_41_query); }

		private static final SubtypeQuery test_42_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!!any"));
		@Test public void test_42() { testInvalid(test_42_query); }

		private static final SubtypeQuery test_43_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!!int"));
		@Test public void test_43() { testValid(test_43_query); }

		private static final SubtypeQuery test_44_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{{{any}}}"));
		@Test public void test_44() { testInvalid(test_44_query); }

		private static final SubtypeQuery test_45_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{{{int}}}"));
		@Test public void test_45() { testInvalid(test_45_query); }

		private static final SubtypeQuery test_46_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{{!any}}"));
		@Test public void test_46() { testValid(test_46_query); }

		private static final SubtypeQuery test_47_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{{!int}}"));
		@Test public void test_47() { testInvalid(test_47_query); }

		private static final SubtypeQuery test_48_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{!{any}}"));
		@Test public void test_48() { testInvalid(test_48_query); }

		private static final SubtypeQuery test_49_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{!{int}}"));
		@Test public void test_49() { testInvalid(test_49_query); }

		private static final SubtypeQuery test_50_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{!!any}"));
		@Test public void test_50() { testInvalid(test_50_query); }

		private static final SubtypeQuery test_51_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{!!int}"));
		@Test public void test_51() { testInvalid(test_51_query); }

		private static final SubtypeQuery test_52_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!{{any}}"));
		@Test public void test_52() { testInvalid(test_52_query); }

		private static final SubtypeQuery test_53_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!{{int}}"));
		@Test public void test_53() { testInvalid(test_53_query); }

		private static final SubtypeQuery test_54_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!{!any}"));
		@Test public void test_54() { testInvalid(test_54_query); }

		private static final SubtypeQuery test_55_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!{!int}"));
		@Test public void test_55() { testInvalid(test_55_query); }

		private static final SubtypeQuery test_56_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!!{any}"));
		@Test public void test_56() { testInvalid(test_56_query); }

		private static final SubtypeQuery test_57_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!!{int}"));
		@Test public void test_57() { testInvalid(test_57_query); }

		private static final SubtypeQuery test_58_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!!!any"));
		@Test public void test_58() { testValid(test_58_query); }

		private static final SubtypeQuery test_59_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!!!int"));
		@Test public void test_59() { testInvalid(test_59_query); }

		private static final SubtypeQuery test_60_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("any"));
		@Test public void test_60() { testInvalid(test_60_query); }

		private static final SubtypeQuery test_61_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("int"));
		@Test public void test_61() { testInvalid(test_61_query); }

		private static final SubtypeQuery test_62_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{any}"));
		@Test public void test_62() { testValid(test_62_query); }

		private static final SubtypeQuery test_63_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{int}"));
		@Test public void test_63() { testValid(test_63_query); }

		private static final SubtypeQuery test_64_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!any"));
		@Test public void test_64() { testValid(test_64_query); }

		private static final SubtypeQuery test_65_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!int"));
		@Test public void test_65() { testInvalid(test_65_query); }

		private static final SubtypeQuery test_66_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{{any}}"));
		@Test public void test_66() { testValid(test_66_query); }

		private static final SubtypeQuery test_67_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{{int}}"));
		@Test public void test_67() { testValid(test_67_query); }

		private static final SubtypeQuery test_68_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{!any}"));
		@Test public void test_68() { testValid(test_68_query); }

		private static final SubtypeQuery test_69_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{!int}"));
		@Test public void test_69() { testValid(test_69_query); }

		private static final SubtypeQuery test_70_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!{any}"));
		@Test public void test_70() { testInvalid(test_70_query); }

		private static final SubtypeQuery test_71_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!{int}"));
		@Test public void test_71() { testInvalid(test_71_query); }

		private static final SubtypeQuery test_72_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!!any"));
		@Test public void test_72() { testInvalid(test_72_query); }

		private static final SubtypeQuery test_73_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!!int"));
		@Test public void test_73() { testInvalid(test_73_query); }

		private static final SubtypeQuery test_74_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{{{any}}}"));
		@Test public void test_74() { testValid(test_74_query); }

		private static final SubtypeQuery test_75_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{{{int}}}"));
		@Test public void test_75() { testValid(test_75_query); }

		private static final SubtypeQuery test_76_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{{!any}}"));
		@Test public void test_76() { testValid(test_76_query); }

		private static final SubtypeQuery test_77_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{{!int}}"));
		@Test public void test_77() { testValid(test_77_query); }

		private static final SubtypeQuery test_78_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{!{any}}"));
		@Test public void test_78() { testValid(test_78_query); }

		private static final SubtypeQuery test_79_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{!{int}}"));
		@Test public void test_79() { testValid(test_79_query); }

		private static final SubtypeQuery test_80_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{!!any}"));
		@Test public void test_80() { testValid(test_80_query); }

		private static final SubtypeQuery test_81_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{!!int}"));
		@Test public void test_81() { testValid(test_81_query); }

		private static final SubtypeQuery test_82_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!{{any}}"));
		@Test public void test_82() { testInvalid(test_82_query); }

		private static final SubtypeQuery test_83_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!{{int}}"));
		@Test public void test_83() { testInvalid(test_83_query); }

		private static final SubtypeQuery test_84_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!{!any}"));
		@Test public void test_84() { testInvalid(test_84_query); }

		private static final SubtypeQuery test_85_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!{!int}"));
		@Test public void test_85() { testInvalid(test_85_query); }

		private static final SubtypeQuery test_86_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!!{any}"));
		@Test public void test_86() { testValid(test_86_query); }

		private static final SubtypeQuery test_87_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!!{int}"));
		@Test public void test_87() { testValid(test_87_query); }

		private static final SubtypeQuery test_88_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!!!any"));
		@Test public void test_88() { testValid(test_88_query); }

		private static final SubtypeQuery test_89_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!!!int"));
		@Test public void test_89() { testInvalid(test_89_query); }

		private static final SubtypeQuery test_90_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("any"));
		@Test public void test_90() { testInvalid(test_90_query); }

		private static final SubtypeQuery test_91_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("int"));
		@Test public void test_91() { testInvalid(test_91_query); }

		private static final SubtypeQuery test_92_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{any}"));
		@Test public void test_92() { testInvalid(test_92_query); }

		private static final SubtypeQuery test_93_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{int}"));
		@Test public void test_93() { testValid(test_93_query); }

		private static final SubtypeQuery test_94_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!any"));
		@Test public void test_94() { testValid(test_94_query); }

		private static final SubtypeQuery test_95_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!int"));
		@Test public void test_95() { testInvalid(test_95_query); }

		private static final SubtypeQuery test_96_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{{any}}"));
		@Test public void test_96() { testInvalid(test_96_query); }

		private static final SubtypeQuery test_97_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{{int}}"));
		@Test public void test_97() { testInvalid(test_97_query); }

		private static final SubtypeQuery test_98_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{!any}"));
		@Test public void test_98() { testValid(test_98_query); }

		private static final SubtypeQuery test_99_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{!int}"));
		@Test public void test_99() { testInvalid(test_99_query); }

		private static final SubtypeQuery test_100_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!{any}"));
		@Test public void test_100() { testInvalid(test_100_query); }

		private static final SubtypeQuery test_101_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!{int}"));
		@Test public void test_101() { testInvalid(test_101_query); }

		private static final SubtypeQuery test_102_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!!any"));
		@Test public void test_102() { testInvalid(test_102_query); }

		private static final SubtypeQuery test_103_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!!int"));
		@Test public void test_103() { testInvalid(test_103_query); }

		private static final SubtypeQuery test_104_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{{{any}}}"));
		@Test public void test_104() { testInvalid(test_104_query); }

		private static final SubtypeQuery test_105_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{{{int}}}"));
		@Test public void test_105() { testInvalid(test_105_query); }

		private static final SubtypeQuery test_106_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{{!any}}"));
		@Test public void test_106() { testValid(test_106_query); }

		private static final SubtypeQuery test_107_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{{!int}}"));
		@Test public void test_107() { testInvalid(test_107_query); }

		private static final SubtypeQuery test_108_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{!{any}}"));
		@Test public void test_108() { testInvalid(test_108_query); }

		private static final SubtypeQuery test_109_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{!{int}}"));
		@Test public void test_109() { testInvalid(test_109_query); }

		private static final SubtypeQuery test_110_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{!!any}"));
		@Test public void test_110() { testInvalid(test_110_query); }

		private static final SubtypeQuery test_111_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{!!int}"));
		@Test public void test_111() { testValid(test_111_query); }

		private static final SubtypeQuery test_112_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!{{any}}"));
		@Test public void test_112() { testInvalid(test_112_query); }

		private static final SubtypeQuery test_113_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!{{int}}"));
		@Test public void test_113() { testInvalid(test_113_query); }

		private static final SubtypeQuery test_114_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!{!any}"));
		@Test public void test_114() { testInvalid(test_114_query); }

		private static final SubtypeQuery test_115_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!{!int}"));
		@Test public void test_115() { testInvalid(test_115_query); }

		private static final SubtypeQuery test_116_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!!{any}"));
		@Test public void test_116() { testInvalid(test_116_query); }

		private static final SubtypeQuery test_117_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!!{int}"));
		@Test public void test_117() { testValid(test_117_query); }

		private static final SubtypeQuery test_118_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!!!any"));
		@Test public void test_118() { testValid(test_118_query); }

		private static final SubtypeQuery test_119_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!!!int"));
		@Test public void test_119() { testInvalid(test_119_query); }

		private static final SubtypeQuery test_120_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("any"));
		@Test public void test_120() { testInvalid(test_120_query); }

		private static final SubtypeQuery test_121_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("int"));
		@Test public void test_121() { testInvalid(test_121_query); }

		private static final SubtypeQuery test_122_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{any}"));
		@Test public void test_122() { testInvalid(test_122_query); }

		private static final SubtypeQuery test_123_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{int}"));
		@Test public void test_123() { testInvalid(test_123_query); }

		private static final SubtypeQuery test_124_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!any"));
		@Test public void test_124() { testValid(test_124_query); }

		private static final SubtypeQuery test_125_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!int"));
		@Test public void test_125() { testInvalid(test_125_query); }

		private static final SubtypeQuery test_126_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{{any}}"));
		@Test public void test_126() { testInvalid(test_126_query); }

		private static final SubtypeQuery test_127_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{{int}}"));
		@Test public void test_127() { testInvalid(test_127_query); }

		private static final SubtypeQuery test_128_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{!any}"));
		@Test public void test_128() { testValid(test_128_query); }

		private static final SubtypeQuery test_129_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{!int}"));
		@Test public void test_129() { testInvalid(test_129_query); }

		private static final SubtypeQuery test_130_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!{any}"));
		@Test public void test_130() { testInvalid(test_130_query); }

		private static final SubtypeQuery test_131_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!{int}"));
		@Test public void test_131() { testInvalid(test_131_query); }

		private static final SubtypeQuery test_132_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!!any"));
		@Test public void test_132() { testInvalid(test_132_query); }

		private static final SubtypeQuery test_133_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!!int"));
		@Test public void test_133() { testInvalid(test_133_query); }

		private static final SubtypeQuery test_134_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{{{any}}}"));
		@Test public void test_134() { testInvalid(test_134_query); }

		private static final SubtypeQuery test_135_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{{{int}}}"));
		@Test public void test_135() { testInvalid(test_135_query); }

		private static final SubtypeQuery test_136_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{{!any}}"));
		@Test public void test_136() { testValid(test_136_query); }

		private static final SubtypeQuery test_137_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{{!int}}"));
		@Test public void test_137() { testInvalid(test_137_query); }

		private static final SubtypeQuery test_138_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{!{any}}"));
		@Test public void test_138() { testInvalid(test_138_query); }

		private static final SubtypeQuery test_139_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{!{int}}"));
		@Test public void test_139() { testInvalid(test_139_query); }

		private static final SubtypeQuery test_140_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{!!any}"));
		@Test public void test_140() { testInvalid(test_140_query); }

		private static final SubtypeQuery test_141_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{!!int}"));
		@Test public void test_141() { testInvalid(test_141_query); }

		private static final SubtypeQuery test_142_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!{{any}}"));
		@Test public void test_142() { testInvalid(test_142_query); }

		private static final SubtypeQuery test_143_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!{{int}}"));
		@Test public void test_143() { testInvalid(test_143_query); }

		private static final SubtypeQuery test_144_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!{!any}"));
		@Test public void test_144() { testInvalid(test_144_query); }

		private static final SubtypeQuery test_145_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!{!int}"));
		@Test public void test_145() { testInvalid(test_145_query); }

		private static final SubtypeQuery test_146_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!!{any}"));
		@Test public void test_146() { testInvalid(test_146_query); }

		private static final SubtypeQuery test_147_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!!{int}"));
		@Test public void test_147() { testInvalid(test_147_query); }

		private static final SubtypeQuery test_148_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!!!any"));
		@Test public void test_148() { testValid(test_148_query); }

		private static final SubtypeQuery test_149_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!!!int"));
		@Test public void test_149() { testInvalid(test_149_query); }

		private static final SubtypeQuery test_150_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("any"));
		@Test public void test_150() { testInvalid(test_150_query); }

		private static final SubtypeQuery test_151_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("int"));
		@Test public void test_151() { testInvalid(test_151_query); }

		private static final SubtypeQuery test_152_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{any}"));
		@Test public void test_152() { testValid(test_152_query); }

		private static final SubtypeQuery test_153_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{int}"));
		@Test public void test_153() { testValid(test_153_query); }

		private static final SubtypeQuery test_154_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!any"));
		@Test public void test_154() { testValid(test_154_query); }

		private static final SubtypeQuery test_155_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!int"));
		@Test public void test_155() { testValid(test_155_query); }

		private static final SubtypeQuery test_156_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{{any}}"));
		@Test public void test_156() { testValid(test_156_query); }

		private static final SubtypeQuery test_157_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{{int}}"));
		@Test public void test_157() { testValid(test_157_query); }

		private static final SubtypeQuery test_158_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{!any}"));
		@Test public void test_158() { testValid(test_158_query); }

		private static final SubtypeQuery test_159_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{!int}"));
		@Test public void test_159() { testValid(test_159_query); }

		private static final SubtypeQuery test_160_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!{any}"));
		@Test public void test_160() { testInvalid(test_160_query); }

		private static final SubtypeQuery test_161_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!{int}"));
		@Test public void test_161() { testInvalid(test_161_query); }

		private static final SubtypeQuery test_162_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!!any"));
		@Test public void test_162() { testInvalid(test_162_query); }

		private static final SubtypeQuery test_163_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!!int"));
		@Test public void test_163() { testInvalid(test_163_query); }

		private static final SubtypeQuery test_164_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{{{any}}}"));
		@Test public void test_164() { testValid(test_164_query); }

		private static final SubtypeQuery test_165_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{{{int}}}"));
		@Test public void test_165() { testValid(test_165_query); }

		private static final SubtypeQuery test_166_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{{!any}}"));
		@Test public void test_166() { testValid(test_166_query); }

		private static final SubtypeQuery test_167_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{{!int}}"));
		@Test public void test_167() { testValid(test_167_query); }

		private static final SubtypeQuery test_168_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{!{any}}"));
		@Test public void test_168() { testValid(test_168_query); }

		private static final SubtypeQuery test_169_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{!{int}}"));
		@Test public void test_169() { testValid(test_169_query); }

		private static final SubtypeQuery test_170_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{!!any}"));
		@Test public void test_170() { testValid(test_170_query); }

		private static final SubtypeQuery test_171_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{!!int}"));
		@Test public void test_171() { testValid(test_171_query); }

		private static final SubtypeQuery test_172_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!{{any}}"));
		@Test public void test_172() { testInvalid(test_172_query); }

		private static final SubtypeQuery test_173_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!{{int}}"));
		@Test public void test_173() { testInvalid(test_173_query); }

		private static final SubtypeQuery test_174_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!{!any}"));
		@Test public void test_174() { testInvalid(test_174_query); }

		private static final SubtypeQuery test_175_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!{!int}"));
		@Test public void test_175() { testInvalid(test_175_query); }

		private static final SubtypeQuery test_176_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!!{any}"));
		@Test public void test_176() { testValid(test_176_query); }

		private static final SubtypeQuery test_177_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!!{int}"));
		@Test public void test_177() { testValid(test_177_query); }

		private static final SubtypeQuery test_178_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!!!any"));
		@Test public void test_178() { testValid(test_178_query); }

		private static final SubtypeQuery test_179_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!!!int"));
		@Test public void test_179() { testValid(test_179_query); }

		private static final SubtypeQuery test_180_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("any"));
		@Test public void test_180() { testInvalid(test_180_query); }

		private static final SubtypeQuery test_181_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("int"));
		@Test public void test_181() { testInvalid(test_181_query); }

		private static final SubtypeQuery test_182_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{any}"));
		@Test public void test_182() { testInvalid(test_182_query); }

		private static final SubtypeQuery test_183_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{int}"));
		@Test public void test_183() { testInvalid(test_183_query); }

		private static final SubtypeQuery test_184_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!any"));
		@Test public void test_184() { testValid(test_184_query); }

		private static final SubtypeQuery test_185_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!int"));
		@Test public void test_185() { testInvalid(test_185_query); }

		private static final SubtypeQuery test_186_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{{any}}"));
		@Test public void test_186() { testValid(test_186_query); }

		private static final SubtypeQuery test_187_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{{int}}"));
		@Test public void test_187() { testValid(test_187_query); }

		private static final SubtypeQuery test_188_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{!any}"));
		@Test public void test_188() { testValid(test_188_query); }

		private static final SubtypeQuery test_189_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{!int}"));
		@Test public void test_189() { testInvalid(test_189_query); }

		private static final SubtypeQuery test_190_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!{any}"));
		@Test public void test_190() { testInvalid(test_190_query); }

		private static final SubtypeQuery test_191_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!{int}"));
		@Test public void test_191() { testInvalid(test_191_query); }

		private static final SubtypeQuery test_192_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!!any"));
		@Test public void test_192() { testInvalid(test_192_query); }

		private static final SubtypeQuery test_193_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!!int"));
		@Test public void test_193() { testInvalid(test_193_query); }

		private static final SubtypeQuery test_194_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{{{any}}}"));
		@Test public void test_194() { testValid(test_194_query); }

		private static final SubtypeQuery test_195_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{{{int}}}"));
		@Test public void test_195() { testValid(test_195_query); }

		private static final SubtypeQuery test_196_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{{!any}}"));
		@Test public void test_196() { testValid(test_196_query); }

		private static final SubtypeQuery test_197_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{{!int}}"));
		@Test public void test_197() { testValid(test_197_query); }

		private static final SubtypeQuery test_198_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{!{any}}"));
		@Test public void test_198() { testInvalid(test_198_query); }

		private static final SubtypeQuery test_199_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{!{int}}"));
		@Test public void test_199() { testInvalid(test_199_query); }

		private static final SubtypeQuery test_200_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{!!any}"));
		@Test public void test_200() { testInvalid(test_200_query); }

		private static final SubtypeQuery test_201_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{!!int}"));
		@Test public void test_201() { testInvalid(test_201_query); }

		private static final SubtypeQuery test_202_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!{{any}}"));
		@Test public void test_202() { testInvalid(test_202_query); }

		private static final SubtypeQuery test_203_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!{{int}}"));
		@Test public void test_203() { testInvalid(test_203_query); }

		private static final SubtypeQuery test_204_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!{!any}"));
		@Test public void test_204() { testInvalid(test_204_query); }

		private static final SubtypeQuery test_205_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!{!int}"));
		@Test public void test_205() { testInvalid(test_205_query); }

		private static final SubtypeQuery test_206_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!!{any}"));
		@Test public void test_206() { testInvalid(test_206_query); }

		private static final SubtypeQuery test_207_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!!{int}"));
		@Test public void test_207() { testInvalid(test_207_query); }

		private static final SubtypeQuery test_208_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!!!any"));
		@Test public void test_208() { testValid(test_208_query); }

		private static final SubtypeQuery test_209_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!!!int"));
		@Test public void test_209() { testInvalid(test_209_query); }

		private static final SubtypeQuery test_210_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("any"));
		@Test public void test_210() { testInvalid(test_210_query); }

		private static final SubtypeQuery test_211_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("int"));
		@Test public void test_211() { testInvalid(test_211_query); }

		private static final SubtypeQuery test_212_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{any}"));
		@Test public void test_212() { testInvalid(test_212_query); }

		private static final SubtypeQuery test_213_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{int}"));
		@Test public void test_213() { testInvalid(test_213_query); }

		private static final SubtypeQuery test_214_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!any"));
		@Test public void test_214() { testValid(test_214_query); }

		private static final SubtypeQuery test_215_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!int"));
		@Test public void test_215() { testInvalid(test_215_query); }

		private static final SubtypeQuery test_216_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{{any}}"));
		@Test public void test_216() { testInvalid(test_216_query); }

		private static final SubtypeQuery test_217_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{{int}}"));
		@Test public void test_217() { testValid(test_217_query); }

		private static final SubtypeQuery test_218_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{!any}"));
		@Test public void test_218() { testValid(test_218_query); }

		private static final SubtypeQuery test_219_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{!int}"));
		@Test public void test_219() { testInvalid(test_219_query); }

		private static final SubtypeQuery test_220_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!{any}"));
		@Test public void test_220() { testInvalid(test_220_query); }

		private static final SubtypeQuery test_221_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!{int}"));
		@Test public void test_221() { testInvalid(test_221_query); }

		private static final SubtypeQuery test_222_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!!any"));
		@Test public void test_222() { testInvalid(test_222_query); }

		private static final SubtypeQuery test_223_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!!int"));
		@Test public void test_223() { testInvalid(test_223_query); }

		private static final SubtypeQuery test_224_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{{{any}}}"));
		@Test public void test_224() { testInvalid(test_224_query); }

		private static final SubtypeQuery test_225_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{{{int}}}"));
		@Test public void test_225() { testInvalid(test_225_query); }

		private static final SubtypeQuery test_226_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{{!any}}"));
		@Test public void test_226() { testValid(test_226_query); }

		private static final SubtypeQuery test_227_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{{!int}}"));
		@Test public void test_227() { testInvalid(test_227_query); }

		private static final SubtypeQuery test_228_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{!{any}}"));
		@Test public void test_228() { testInvalid(test_228_query); }

		private static final SubtypeQuery test_229_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{!{int}}"));
		@Test public void test_229() { testInvalid(test_229_query); }

		private static final SubtypeQuery test_230_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{!!any}"));
		@Test public void test_230() { testInvalid(test_230_query); }

		private static final SubtypeQuery test_231_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{!!int}"));
		@Test public void test_231() { testInvalid(test_231_query); }

		private static final SubtypeQuery test_232_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!{{any}}"));
		@Test public void test_232() { testInvalid(test_232_query); }

		private static final SubtypeQuery test_233_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!{{int}}"));
		@Test public void test_233() { testInvalid(test_233_query); }

		private static final SubtypeQuery test_234_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!{!any}"));
		@Test public void test_234() { testInvalid(test_234_query); }

		private static final SubtypeQuery test_235_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!{!int}"));
		@Test public void test_235() { testInvalid(test_235_query); }

		private static final SubtypeQuery test_236_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!!{any}"));
		@Test public void test_236() { testInvalid(test_236_query); }

		private static final SubtypeQuery test_237_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!!{int}"));
		@Test public void test_237() { testInvalid(test_237_query); }

		private static final SubtypeQuery test_238_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!!!any"));
		@Test public void test_238() { testValid(test_238_query); }

		private static final SubtypeQuery test_239_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!!!int"));
		@Test public void test_239() { testInvalid(test_239_query); }

		private static final SubtypeQuery test_240_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("any"));
		@Test public void test_240() { testInvalid(test_240_query); }

		private static final SubtypeQuery test_241_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("int"));
		@Test public void test_241() { testInvalid(test_241_query); }

		private static final SubtypeQuery test_242_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{any}"));
		@Test public void test_242() { testInvalid(test_242_query); }

		private static final SubtypeQuery test_243_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{int}"));
		@Test public void test_243() { testInvalid(test_243_query); }

		private static final SubtypeQuery test_244_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!any"));
		@Test public void test_244() { testValid(test_244_query); }

		private static final SubtypeQuery test_245_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!int"));
		@Test public void test_245() { testInvalid(test_245_query); }

		private static final SubtypeQuery test_246_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{{any}}"));
		@Test public void test_246() { testInvalid(test_246_query); }

		private static final SubtypeQuery test_247_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{{int}}"));
		@Test public void test_247() { testInvalid(test_247_query); }

		private static final SubtypeQuery test_248_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{!any}"));
		@Test public void test_248() { testValid(test_248_query); }

		private static final SubtypeQuery test_249_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{!int}"));
		@Test public void test_249() { testInvalid(test_249_query); }

		private static final SubtypeQuery test_250_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!{any}"));
		@Test public void test_250() { testInvalid(test_250_query); }

		private static final SubtypeQuery test_251_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!{int}"));
		@Test public void test_251() { testInvalid(test_251_query); }

		private static final SubtypeQuery test_252_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!!any"));
		@Test public void test_252() { testInvalid(test_252_query); }

		private static final SubtypeQuery test_253_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!!int"));
		@Test public void test_253() { testInvalid(test_253_query); }

		private static final SubtypeQuery test_254_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{{{any}}}"));
		@Test public void test_254() { testInvalid(test_254_query); }

		private static final SubtypeQuery test_255_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{{{int}}}"));
		@Test public void test_255() { testInvalid(test_255_query); }

		private static final SubtypeQuery test_256_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{{!any}}"));
		@Test public void test_256() { testValid(test_256_query); }

		private static final SubtypeQuery test_257_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{{!int}}"));
		@Test public void test_257() { testInvalid(test_257_query); }

		private static final SubtypeQuery test_258_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{!{any}}"));
		@Test public void test_258() { testInvalid(test_258_query); }

		private static final SubtypeQuery test_259_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{!{int}}"));
		@Test public void test_259() { testInvalid(test_259_query); }

		private static final SubtypeQuery test_260_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{!!any}"));
		@Test public void test_260() { testInvalid(test_260_query); }

		private static final SubtypeQuery test_261_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{!!int}"));
		@Test public void test_261() { testInvalid(test_261_query); }

		private static final SubtypeQuery test_262_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!{{any}}"));
		@Test public void test_262() { testInvalid(test_262_query); }

		private static final SubtypeQuery test_263_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!{{int}}"));
		@Test public void test_263() { testInvalid(test_263_query); }

		private static final SubtypeQuery test_264_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!{!any}"));
		@Test public void test_264() { testInvalid(test_264_query); }

		private static final SubtypeQuery test_265_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!{!int}"));
		@Test public void test_265() { testInvalid(test_265_query); }

		private static final SubtypeQuery test_266_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!!{any}"));
		@Test public void test_266() { testInvalid(test_266_query); }

		private static final SubtypeQuery test_267_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!!{int}"));
		@Test public void test_267() { testInvalid(test_267_query); }

		private static final SubtypeQuery test_268_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!!!any"));
		@Test public void test_268() { testValid(test_268_query); }

		private static final SubtypeQuery test_269_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!!!int"));
		@Test public void test_269() { testInvalid(test_269_query); }

		private static final SubtypeQuery test_270_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("any"));
		@Test public void test_270() { testInvalid(test_270_query); }

		private static final SubtypeQuery test_271_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("int"));
		@Test public void test_271() { testInvalid(test_271_query); }

		private static final SubtypeQuery test_272_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{any}"));
		@Test public void test_272() { testInvalid(test_272_query); }

		private static final SubtypeQuery test_273_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{int}"));
		@Test public void test_273() { testInvalid(test_273_query); }

		private static final SubtypeQuery test_274_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!any"));
		@Test public void test_274() { testValid(test_274_query); }

		private static final SubtypeQuery test_275_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!int"));
		@Test public void test_275() { testInvalid(test_275_query); }

		private static final SubtypeQuery test_276_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{{any}}"));
		@Test public void test_276() { testValid(test_276_query); }

		private static final SubtypeQuery test_277_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{{int}}"));
		@Test public void test_277() { testValid(test_277_query); }

		private static final SubtypeQuery test_278_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{!any}"));
		@Test public void test_278() { testValid(test_278_query); }

		private static final SubtypeQuery test_279_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{!int}"));
		@Test public void test_279() { testValid(test_279_query); }

		private static final SubtypeQuery test_280_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!{any}"));
		@Test public void test_280() { testInvalid(test_280_query); }

		private static final SubtypeQuery test_281_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!{int}"));
		@Test public void test_281() { testInvalid(test_281_query); }

		private static final SubtypeQuery test_282_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!!any"));
		@Test public void test_282() { testInvalid(test_282_query); }

		private static final SubtypeQuery test_283_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!!int"));
		@Test public void test_283() { testInvalid(test_283_query); }

		private static final SubtypeQuery test_284_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{{{any}}}"));
		@Test public void test_284() { testValid(test_284_query); }

		private static final SubtypeQuery test_285_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{{{int}}}"));
		@Test public void test_285() { testValid(test_285_query); }

		private static final SubtypeQuery test_286_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{{!any}}"));
		@Test public void test_286() { testValid(test_286_query); }

		private static final SubtypeQuery test_287_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{{!int}}"));
		@Test public void test_287() { testValid(test_287_query); }

		private static final SubtypeQuery test_288_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{!{any}}"));
		@Test public void test_288() { testInvalid(test_288_query); }

		private static final SubtypeQuery test_289_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{!{int}}"));
		@Test public void test_289() { testInvalid(test_289_query); }

		private static final SubtypeQuery test_290_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{!!any}"));
		@Test public void test_290() { testInvalid(test_290_query); }

		private static final SubtypeQuery test_291_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{!!int}"));
		@Test public void test_291() { testInvalid(test_291_query); }

		private static final SubtypeQuery test_292_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!{{any}}"));
		@Test public void test_292() { testInvalid(test_292_query); }

		private static final SubtypeQuery test_293_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!{{int}}"));
		@Test public void test_293() { testInvalid(test_293_query); }

		private static final SubtypeQuery test_294_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!{!any}"));
		@Test public void test_294() { testInvalid(test_294_query); }

		private static final SubtypeQuery test_295_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!{!int}"));
		@Test public void test_295() { testInvalid(test_295_query); }

		private static final SubtypeQuery test_296_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!!{any}"));
		@Test public void test_296() { testInvalid(test_296_query); }

		private static final SubtypeQuery test_297_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!!{int}"));
		@Test public void test_297() { testInvalid(test_297_query); }

		private static final SubtypeQuery test_298_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!!!any"));
		@Test public void test_298() { testValid(test_298_query); }

		private static final SubtypeQuery test_299_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!!!int"));
		@Test public void test_299() { testInvalid(test_299_query); }

		private static final SubtypeQuery test_300_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("any"));
		@Test public void test_300() { testInvalid(test_300_query); }

		private static final SubtypeQuery test_301_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("int"));
		@Test public void test_301() { testValid(test_301_query); }

		private static final SubtypeQuery test_302_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{any}"));
		@Test public void test_302() { testInvalid(test_302_query); }

		private static final SubtypeQuery test_303_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{int}"));
		@Test public void test_303() { testInvalid(test_303_query); }

		private static final SubtypeQuery test_304_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!any"));
		@Test public void test_304() { testValid(test_304_query); }

		private static final SubtypeQuery test_305_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!int"));
		@Test public void test_305() { testInvalid(test_305_query); }

		private static final SubtypeQuery test_306_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{{any}}"));
		@Test public void test_306() { testInvalid(test_306_query); }

		private static final SubtypeQuery test_307_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{{int}}"));
		@Test public void test_307() { testInvalid(test_307_query); }

		private static final SubtypeQuery test_308_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{!any}"));
		@Test public void test_308() { testValid(test_308_query); }

		private static final SubtypeQuery test_309_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{!int}"));
		@Test public void test_309() { testInvalid(test_309_query); }

		private static final SubtypeQuery test_310_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!{any}"));
		@Test public void test_310() { testValid(test_310_query); }

		private static final SubtypeQuery test_311_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!{int}"));
		@Test public void test_311() { testInvalid(test_311_query); }

		private static final SubtypeQuery test_312_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!!any"));
		@Test public void test_312() { testInvalid(test_312_query); }

		private static final SubtypeQuery test_313_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!!int"));
		@Test public void test_313() { testValid(test_313_query); }

		private static final SubtypeQuery test_314_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{{{any}}}"));
		@Test public void test_314() { testInvalid(test_314_query); }

		private static final SubtypeQuery test_315_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{{{int}}}"));
		@Test public void test_315() { testInvalid(test_315_query); }

		private static final SubtypeQuery test_316_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{{!any}}"));
		@Test public void test_316() { testValid(test_316_query); }

		private static final SubtypeQuery test_317_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{{!int}}"));
		@Test public void test_317() { testInvalid(test_317_query); }

		private static final SubtypeQuery test_318_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{!{any}}"));
		@Test public void test_318() { testInvalid(test_318_query); }

		private static final SubtypeQuery test_319_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{!{int}}"));
		@Test public void test_319() { testInvalid(test_319_query); }

		private static final SubtypeQuery test_320_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{!!any}"));
		@Test public void test_320() { testInvalid(test_320_query); }

		private static final SubtypeQuery test_321_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{!!int}"));
		@Test public void test_321() { testInvalid(test_321_query); }

		private static final SubtypeQuery test_322_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!{{any}}"));
		@Test public void test_322() { testInvalid(test_322_query); }

		private static final SubtypeQuery test_323_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!{{int}}"));
		@Test public void test_323() { testInvalid(test_323_query); }

		private static final SubtypeQuery test_324_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!{!any}"));
		@Test public void test_324() { testInvalid(test_324_query); }

		private static final SubtypeQuery test_325_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!{!int}"));
		@Test public void test_325() { testInvalid(test_325_query); }

		private static final SubtypeQuery test_326_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!!{any}"));
		@Test public void test_326() { testInvalid(test_326_query); }

		private static final SubtypeQuery test_327_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!!{int}"));
		@Test public void test_327() { testInvalid(test_327_query); }

		private static final SubtypeQuery test_328_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!!!any"));
		@Test public void test_328() { testValid(test_328_query); }

		private static final SubtypeQuery test_329_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!!!int"));
		@Test public void test_329() { testInvalid(test_329_query); }

		private static final SubtypeQuery test_330_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("any"));
		@Test public void test_330() { testInvalid(test_330_query); }

		private static final SubtypeQuery test_331_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("int"));
		@Test public void test_331() { testValid(test_331_query); }

		private static final SubtypeQuery test_332_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{any}"));
		@Test public void test_332() { testInvalid(test_332_query); }

		private static final SubtypeQuery test_333_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{int}"));
		@Test public void test_333() { testInvalid(test_333_query); }

		private static final SubtypeQuery test_334_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!any"));
		@Test public void test_334() { testValid(test_334_query); }

		private static final SubtypeQuery test_335_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!int"));
		@Test public void test_335() { testInvalid(test_335_query); }

		private static final SubtypeQuery test_336_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{{any}}"));
		@Test public void test_336() { testValid(test_336_query); }

		private static final SubtypeQuery test_337_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{{int}}"));
		@Test public void test_337() { testValid(test_337_query); }

		private static final SubtypeQuery test_338_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{!any}"));
		@Test public void test_338() { testValid(test_338_query); }

		private static final SubtypeQuery test_339_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{!int}"));
		@Test public void test_339() { testValid(test_339_query); }

		private static final SubtypeQuery test_340_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!{any}"));
		@Test public void test_340() { testValid(test_340_query); }

		private static final SubtypeQuery test_341_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!{int}"));
		@Test public void test_341() { testValid(test_341_query); }

		private static final SubtypeQuery test_342_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!!any"));
		@Test public void test_342() { testInvalid(test_342_query); }

		private static final SubtypeQuery test_343_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!!int"));
		@Test public void test_343() { testValid(test_343_query); }

		private static final SubtypeQuery test_344_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{{{any}}}"));
		@Test public void test_344() { testValid(test_344_query); }

		private static final SubtypeQuery test_345_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{{{int}}}"));
		@Test public void test_345() { testValid(test_345_query); }

		private static final SubtypeQuery test_346_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{{!any}}"));
		@Test public void test_346() { testValid(test_346_query); }

		private static final SubtypeQuery test_347_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{{!int}}"));
		@Test public void test_347() { testValid(test_347_query); }

		private static final SubtypeQuery test_348_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{!{any}}"));
		@Test public void test_348() { testInvalid(test_348_query); }

		private static final SubtypeQuery test_349_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{!{int}}"));
		@Test public void test_349() { testInvalid(test_349_query); }

		private static final SubtypeQuery test_350_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{!!any}"));
		@Test public void test_350() { testInvalid(test_350_query); }

		private static final SubtypeQuery test_351_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{!!int}"));
		@Test public void test_351() { testInvalid(test_351_query); }

		private static final SubtypeQuery test_352_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!{{any}}"));
		@Test public void test_352() { testInvalid(test_352_query); }

		private static final SubtypeQuery test_353_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!{{int}}"));
		@Test public void test_353() { testInvalid(test_353_query); }

		private static final SubtypeQuery test_354_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!{!any}"));
		@Test public void test_354() { testInvalid(test_354_query); }

		private static final SubtypeQuery test_355_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!{!int}"));
		@Test public void test_355() { testInvalid(test_355_query); }

		private static final SubtypeQuery test_356_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!!{any}"));
		@Test public void test_356() { testInvalid(test_356_query); }

		private static final SubtypeQuery test_357_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!!{int}"));
		@Test public void test_357() { testInvalid(test_357_query); }

		private static final SubtypeQuery test_358_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!!!any"));
		@Test public void test_358() { testValid(test_358_query); }

		private static final SubtypeQuery test_359_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!!!int"));
		@Test public void test_359() { testInvalid(test_359_query); }

		private static final SubtypeQuery test_360_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("any"));
		@Test public void test_360() { testValid(test_360_query); }

		private static final SubtypeQuery test_361_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("int"));
		@Test public void test_361() { testValid(test_361_query); }

		private static final SubtypeQuery test_362_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{any}"));
		@Test public void test_362() { testValid(test_362_query); }

		private static final SubtypeQuery test_363_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{int}"));
		@Test public void test_363() { testValid(test_363_query); }

		private static final SubtypeQuery test_364_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!any"));
		@Test public void test_364() { testValid(test_364_query); }

		private static final SubtypeQuery test_365_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!int"));
		@Test public void test_365() { testValid(test_365_query); }

		private static final SubtypeQuery test_366_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{{any}}"));
		@Test public void test_366() { testValid(test_366_query); }

		private static final SubtypeQuery test_367_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{{int}}"));
		@Test public void test_367() { testValid(test_367_query); }

		private static final SubtypeQuery test_368_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{!any}"));
		@Test public void test_368() { testValid(test_368_query); }

		private static final SubtypeQuery test_369_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{!int}"));
		@Test public void test_369() { testValid(test_369_query); }

		private static final SubtypeQuery test_370_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!{any}"));
		@Test public void test_370() { testValid(test_370_query); }

		private static final SubtypeQuery test_371_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!{int}"));
		@Test public void test_371() { testValid(test_371_query); }

		private static final SubtypeQuery test_372_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!!any"));
		@Test public void test_372() { testValid(test_372_query); }

		private static final SubtypeQuery test_373_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!!int"));
		@Test public void test_373() { testValid(test_373_query); }

		private static final SubtypeQuery test_374_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{{{any}}}"));
		@Test public void test_374() { testValid(test_374_query); }

		private static final SubtypeQuery test_375_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{{{int}}}"));
		@Test public void test_375() { testValid(test_375_query); }

		private static final SubtypeQuery test_376_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{{!any}}"));
		@Test public void test_376() { testValid(test_376_query); }

		private static final SubtypeQuery test_377_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{{!int}}"));
		@Test public void test_377() { testValid(test_377_query); }

		private static final SubtypeQuery test_378_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{!{any}}"));
		@Test public void test_378() { testValid(test_378_query); }

		private static final SubtypeQuery test_379_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{!{int}}"));
		@Test public void test_379() { testValid(test_379_query); }

		private static final SubtypeQuery test_380_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{!!any}"));
		@Test public void test_380() { testValid(test_380_query); }

		private static final SubtypeQuery test_381_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{!!int}"));
		@Test public void test_381() { testValid(test_381_query); }

		private static final SubtypeQuery test_382_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!{{any}}"));
		@Test public void test_382() { testValid(test_382_query); }

		private static final SubtypeQuery test_383_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!{{int}}"));
		@Test public void test_383() { testValid(test_383_query); }

		private static final SubtypeQuery test_384_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!{!any}"));
		@Test public void test_384() { testValid(test_384_query); }

		private static final SubtypeQuery test_385_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!{!int}"));
		@Test public void test_385() { testValid(test_385_query); }

		private static final SubtypeQuery test_386_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!!{any}"));
		@Test public void test_386() { testValid(test_386_query); }

		private static final SubtypeQuery test_387_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!!{int}"));
		@Test public void test_387() { testValid(test_387_query); }

		private static final SubtypeQuery test_388_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!!!any"));
		@Test public void test_388() { testValid(test_388_query); }

		private static final SubtypeQuery test_389_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!!!int"));
		@Test public void test_389() { testValid(test_389_query); }

		private static final SubtypeQuery test_390_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("any"));
		@Test public void test_390() { testInvalid(test_390_query); }

		private static final SubtypeQuery test_391_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("int"));
		@Test public void test_391() { testValid(test_391_query); }

		private static final SubtypeQuery test_392_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{any}"));
		@Test public void test_392() { testInvalid(test_392_query); }

		private static final SubtypeQuery test_393_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{int}"));
		@Test public void test_393() { testInvalid(test_393_query); }

		private static final SubtypeQuery test_394_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!any"));
		@Test public void test_394() { testValid(test_394_query); }

		private static final SubtypeQuery test_395_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!int"));
		@Test public void test_395() { testInvalid(test_395_query); }

		private static final SubtypeQuery test_396_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{{any}}"));
		@Test public void test_396() { testInvalid(test_396_query); }

		private static final SubtypeQuery test_397_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{{int}}"));
		@Test public void test_397() { testInvalid(test_397_query); }

		private static final SubtypeQuery test_398_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{!any}"));
		@Test public void test_398() { testValid(test_398_query); }

		private static final SubtypeQuery test_399_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{!int}"));
		@Test public void test_399() { testInvalid(test_399_query); }

		private static final SubtypeQuery test_400_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!{any}"));
		@Test public void test_400() { testInvalid(test_400_query); }

		private static final SubtypeQuery test_401_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!{int}"));
		@Test public void test_401() { testInvalid(test_401_query); }

		private static final SubtypeQuery test_402_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!!any"));
		@Test public void test_402() { testInvalid(test_402_query); }

		private static final SubtypeQuery test_403_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!!int"));
		@Test public void test_403() { testValid(test_403_query); }

		private static final SubtypeQuery test_404_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{{{any}}}"));
		@Test public void test_404() { testInvalid(test_404_query); }

		private static final SubtypeQuery test_405_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{{{int}}}"));
		@Test public void test_405() { testInvalid(test_405_query); }

		private static final SubtypeQuery test_406_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{{!any}}"));
		@Test public void test_406() { testValid(test_406_query); }

		private static final SubtypeQuery test_407_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{{!int}}"));
		@Test public void test_407() { testInvalid(test_407_query); }

		private static final SubtypeQuery test_408_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{!{any}}"));
		@Test public void test_408() { testInvalid(test_408_query); }

		private static final SubtypeQuery test_409_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{!{int}}"));
		@Test public void test_409() { testInvalid(test_409_query); }

		private static final SubtypeQuery test_410_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{!!any}"));
		@Test public void test_410() { testInvalid(test_410_query); }

		private static final SubtypeQuery test_411_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{!!int}"));
		@Test public void test_411() { testInvalid(test_411_query); }

		private static final SubtypeQuery test_412_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!{{any}}"));
		@Test public void test_412() { testInvalid(test_412_query); }

		private static final SubtypeQuery test_413_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!{{int}}"));
		@Test public void test_413() { testInvalid(test_413_query); }

		private static final SubtypeQuery test_414_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!{!any}"));
		@Test public void test_414() { testInvalid(test_414_query); }

		private static final SubtypeQuery test_415_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!{!int}"));
		@Test public void test_415() { testInvalid(test_415_query); }

		private static final SubtypeQuery test_416_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!!{any}"));
		@Test public void test_416() { testInvalid(test_416_query); }

		private static final SubtypeQuery test_417_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!!{int}"));
		@Test public void test_417() { testInvalid(test_417_query); }

		private static final SubtypeQuery test_418_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!!!any"));
		@Test public void test_418() { testValid(test_418_query); }

		private static final SubtypeQuery test_419_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!!!int"));
		@Test public void test_419() { testInvalid(test_419_query); }

		private static final SubtypeQuery test_420_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("any"));
		@Test public void test_420() { testInvalid(test_420_query); }

		private static final SubtypeQuery test_421_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("int"));
		@Test public void test_421() { testInvalid(test_421_query); }

		private static final SubtypeQuery test_422_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("{any}"));
		@Test public void test_422() { testInvalid(test_422_query); }

		private static final SubtypeQuery test_423_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("{int}"));
		@Test public void test_423() { testInvalid(test_423_query); }

		private static final SubtypeQuery test_424_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("!any"));
		@Test public void test_424() { testValid(test_424_query); }

		private static final SubtypeQuery test_425_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("!int"));
		@Test public void test_425() { testInvalid(test_425_query); }

		private static final SubtypeQuery test_426_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("{{any}}"));
		@Test public void test_426() { testInvalid(test_426_query); }

		private static final SubtypeQuery test_427_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("{{int}}"));
		@Test public void test_427() { testInvalid(test_427_query); }

		private static final SubtypeQuery test_428_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("{!any}"));
		@Test public void test_428() { testValid(test_428_query); }

		private static final SubtypeQuery test_429_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("{!int}"));
		@Test public void test_429() { testInvalid(test_429_query); }

		private static final SubtypeQuery test_430_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("!{any}"));
		@Test public void test_430() { testInvalid(test_430_query); }

		private static final SubtypeQuery test_431_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("!{int}"));
		@Test public void test_431() { testInvalid(test_431_query); }

		private static final SubtypeQuery test_432_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("!!any"));
		@Test public void test_432() { testInvalid(test_432_query); }

		private static final SubtypeQuery test_433_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("!!int"));
		@Test public void test_433() { testInvalid(test_433_query); }

		private static final SubtypeQuery test_434_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("{{{any}}}"));
		@Test public void test_434() { testValid(test_434_query); }

		private static final SubtypeQuery test_435_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("{{{int}}}"));
		@Test public void test_435() { testValid(test_435_query); }

		private static final SubtypeQuery test_436_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("{{!any}}"));
		@Test public void test_436() { testValid(test_436_query); }

		private static final SubtypeQuery test_437_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("{{!int}}"));
		@Test public void test_437() { testInvalid(test_437_query); }

		private static final SubtypeQuery test_438_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("{!{any}}"));
		@Test public void test_438() { testInvalid(test_438_query); }

		private static final SubtypeQuery test_439_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("{!{int}}"));
		@Test public void test_439() { testInvalid(test_439_query); }

		private static final SubtypeQuery test_440_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("{!!any}"));
		@Test public void test_440() { testInvalid(test_440_query); }

		private static final SubtypeQuery test_441_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("{!!int}"));
		@Test public void test_441() { testInvalid(test_441_query); }

		private static final SubtypeQuery test_442_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("!{{any}}"));
		@Test public void test_442() { testInvalid(test_442_query); }

		private static final SubtypeQuery test_443_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("!{{int}}"));
		@Test public void test_443() { testInvalid(test_443_query); }

		private static final SubtypeQuery test_444_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("!{!any}"));
		@Test public void test_444() { testInvalid(test_444_query); }

		private static final SubtypeQuery test_445_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("!{!int}"));
		@Test public void test_445() { testInvalid(test_445_query); }

		private static final SubtypeQuery test_446_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("!!{any}"));
		@Test public void test_446() { testInvalid(test_446_query); }

		private static final SubtypeQuery test_447_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("!!{int}"));
		@Test public void test_447() { testInvalid(test_447_query); }

		private static final SubtypeQuery test_448_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("!!!any"));
		@Test public void test_448() { testValid(test_448_query); }

		private static final SubtypeQuery test_449_query = createSubtypeQuery(parseWhiley("{{{any}}}"),parseWhiley("!!!int"));
		@Test public void test_449() { testInvalid(test_449_query); }

		private static final SubtypeQuery test_450_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("any"));
		@Test public void test_450() { testInvalid(test_450_query); }

		private static final SubtypeQuery test_451_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("int"));
		@Test public void test_451() { testInvalid(test_451_query); }

		private static final SubtypeQuery test_452_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("{any}"));
		@Test public void test_452() { testInvalid(test_452_query); }

		private static final SubtypeQuery test_453_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("{int}"));
		@Test public void test_453() { testInvalid(test_453_query); }

		private static final SubtypeQuery test_454_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("!any"));
		@Test public void test_454() { testValid(test_454_query); }

		private static final SubtypeQuery test_455_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("!int"));
		@Test public void test_455() { testInvalid(test_455_query); }

		private static final SubtypeQuery test_456_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("{{any}}"));
		@Test public void test_456() { testInvalid(test_456_query); }

		private static final SubtypeQuery test_457_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("{{int}}"));
		@Test public void test_457() { testInvalid(test_457_query); }

		private static final SubtypeQuery test_458_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("{!any}"));
		@Test public void test_458() { testValid(test_458_query); }

		private static final SubtypeQuery test_459_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("{!int}"));
		@Test public void test_459() { testInvalid(test_459_query); }

		private static final SubtypeQuery test_460_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("!{any}"));
		@Test public void test_460() { testInvalid(test_460_query); }

		private static final SubtypeQuery test_461_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("!{int}"));
		@Test public void test_461() { testInvalid(test_461_query); }

		private static final SubtypeQuery test_462_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("!!any"));
		@Test public void test_462() { testInvalid(test_462_query); }

		private static final SubtypeQuery test_463_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("!!int"));
		@Test public void test_463() { testInvalid(test_463_query); }

		private static final SubtypeQuery test_464_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("{{{any}}}"));
		@Test public void test_464() { testInvalid(test_464_query); }

		private static final SubtypeQuery test_465_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("{{{int}}}"));
		@Test public void test_465() { testValid(test_465_query); }

		private static final SubtypeQuery test_466_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("{{!any}}"));
		@Test public void test_466() { testValid(test_466_query); }

		private static final SubtypeQuery test_467_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("{{!int}}"));
		@Test public void test_467() { testInvalid(test_467_query); }

		private static final SubtypeQuery test_468_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("{!{any}}"));
		@Test public void test_468() { testInvalid(test_468_query); }

		private static final SubtypeQuery test_469_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("{!{int}}"));
		@Test public void test_469() { testInvalid(test_469_query); }

		private static final SubtypeQuery test_470_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("{!!any}"));
		@Test public void test_470() { testInvalid(test_470_query); }

		private static final SubtypeQuery test_471_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("{!!int}"));
		@Test public void test_471() { testInvalid(test_471_query); }

		private static final SubtypeQuery test_472_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("!{{any}}"));
		@Test public void test_472() { testInvalid(test_472_query); }

		private static final SubtypeQuery test_473_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("!{{int}}"));
		@Test public void test_473() { testInvalid(test_473_query); }

		private static final SubtypeQuery test_474_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("!{!any}"));
		@Test public void test_474() { testInvalid(test_474_query); }

		private static final SubtypeQuery test_475_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("!{!int}"));
		@Test public void test_475() { testInvalid(test_475_query); }

		private static final SubtypeQuery test_476_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("!!{any}"));
		@Test public void test_476() { testInvalid(test_476_query); }

		private static final SubtypeQuery test_477_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("!!{int}"));
		@Test public void test_477() { testInvalid(test_477_query); }

		private static final SubtypeQuery test_478_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("!!!any"));
		@Test public void test_478() { testValid(test_478_query); }

		private static final SubtypeQuery test_479_query = createSubtypeQuery(parseWhiley("{{{int}}}"),parseWhiley("!!!int"));
		@Test public void test_479() { testInvalid(test_479_query); }

		private static final SubtypeQuery test_480_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("any"));
		@Test public void test_480() { testInvalid(test_480_query); }

		private static final SubtypeQuery test_481_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("int"));
		@Test public void test_481() { testInvalid(test_481_query); }

		private static final SubtypeQuery test_482_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("{any}"));
		@Test public void test_482() { testInvalid(test_482_query); }

		private static final SubtypeQuery test_483_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("{int}"));
		@Test public void test_483() { testInvalid(test_483_query); }

		private static final SubtypeQuery test_484_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("!any"));
		@Test public void test_484() { testValid(test_484_query); }

		private static final SubtypeQuery test_485_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("!int"));
		@Test public void test_485() { testInvalid(test_485_query); }

		private static final SubtypeQuery test_486_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("{{any}}"));
		@Test public void test_486() { testInvalid(test_486_query); }

		private static final SubtypeQuery test_487_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("{{int}}"));
		@Test public void test_487() { testInvalid(test_487_query); }

		private static final SubtypeQuery test_488_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("{!any}"));
		@Test public void test_488() { testValid(test_488_query); }

		private static final SubtypeQuery test_489_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("{!int}"));
		@Test public void test_489() { testInvalid(test_489_query); }

		private static final SubtypeQuery test_490_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("!{any}"));
		@Test public void test_490() { testInvalid(test_490_query); }

		private static final SubtypeQuery test_491_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("!{int}"));
		@Test public void test_491() { testInvalid(test_491_query); }

		private static final SubtypeQuery test_492_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("!!any"));
		@Test public void test_492() { testInvalid(test_492_query); }

		private static final SubtypeQuery test_493_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("!!int"));
		@Test public void test_493() { testInvalid(test_493_query); }

		private static final SubtypeQuery test_494_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("{{{any}}}"));
		@Test public void test_494() { testInvalid(test_494_query); }

		private static final SubtypeQuery test_495_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("{{{int}}}"));
		@Test public void test_495() { testInvalid(test_495_query); }

		private static final SubtypeQuery test_496_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("{{!any}}"));
		@Test public void test_496() { testValid(test_496_query); }

		private static final SubtypeQuery test_497_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("{{!int}}"));
		@Test public void test_497() { testInvalid(test_497_query); }

		private static final SubtypeQuery test_498_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("{!{any}}"));
		@Test public void test_498() { testInvalid(test_498_query); }

		private static final SubtypeQuery test_499_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("{!{int}}"));
		@Test public void test_499() { testInvalid(test_499_query); }

		private static final SubtypeQuery test_500_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("{!!any}"));
		@Test public void test_500() { testInvalid(test_500_query); }

		private static final SubtypeQuery test_501_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("{!!int}"));
		@Test public void test_501() { testInvalid(test_501_query); }

		private static final SubtypeQuery test_502_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("!{{any}}"));
		@Test public void test_502() { testInvalid(test_502_query); }

		private static final SubtypeQuery test_503_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("!{{int}}"));
		@Test public void test_503() { testInvalid(test_503_query); }

		private static final SubtypeQuery test_504_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("!{!any}"));
		@Test public void test_504() { testInvalid(test_504_query); }

		private static final SubtypeQuery test_505_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("!{!int}"));
		@Test public void test_505() { testInvalid(test_505_query); }

		private static final SubtypeQuery test_506_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("!!{any}"));
		@Test public void test_506() { testInvalid(test_506_query); }

		private static final SubtypeQuery test_507_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("!!{int}"));
		@Test public void test_507() { testInvalid(test_507_query); }

		private static final SubtypeQuery test_508_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("!!!any"));
		@Test public void test_508() { testValid(test_508_query); }

		private static final SubtypeQuery test_509_query = createSubtypeQuery(parseWhiley("{{!any}}"),parseWhiley("!!!int"));
		@Test public void test_509() { testInvalid(test_509_query); }

		private static final SubtypeQuery test_510_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("any"));
		@Test public void test_510() { testInvalid(test_510_query); }

		private static final SubtypeQuery test_511_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("int"));
		@Test public void test_511() { testInvalid(test_511_query); }

		private static final SubtypeQuery test_512_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("{any}"));
		@Test public void test_512() { testInvalid(test_512_query); }

		private static final SubtypeQuery test_513_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("{int}"));
		@Test public void test_513() { testInvalid(test_513_query); }

		private static final SubtypeQuery test_514_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("!any"));
		@Test public void test_514() { testValid(test_514_query); }

		private static final SubtypeQuery test_515_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("!int"));
		@Test public void test_515() { testInvalid(test_515_query); }

		private static final SubtypeQuery test_516_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("{{any}}"));
		@Test public void test_516() { testInvalid(test_516_query); }

		private static final SubtypeQuery test_517_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("{{int}}"));
		@Test public void test_517() { testInvalid(test_517_query); }

		private static final SubtypeQuery test_518_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("{!any}"));
		@Test public void test_518() { testValid(test_518_query); }

		private static final SubtypeQuery test_519_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("{!int}"));
		@Test public void test_519() { testInvalid(test_519_query); }

		private static final SubtypeQuery test_520_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("!{any}"));
		@Test public void test_520() { testInvalid(test_520_query); }

		private static final SubtypeQuery test_521_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("!{int}"));
		@Test public void test_521() { testInvalid(test_521_query); }

		private static final SubtypeQuery test_522_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("!!any"));
		@Test public void test_522() { testInvalid(test_522_query); }

		private static final SubtypeQuery test_523_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("!!int"));
		@Test public void test_523() { testInvalid(test_523_query); }

		private static final SubtypeQuery test_524_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("{{{any}}}"));
		@Test public void test_524() { testValid(test_524_query); }

		private static final SubtypeQuery test_525_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("{{{int}}}"));
		@Test public void test_525() { testValid(test_525_query); }

		private static final SubtypeQuery test_526_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("{{!any}}"));
		@Test public void test_526() { testValid(test_526_query); }

		private static final SubtypeQuery test_527_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("{{!int}}"));
		@Test public void test_527() { testValid(test_527_query); }

		private static final SubtypeQuery test_528_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("{!{any}}"));
		@Test public void test_528() { testInvalid(test_528_query); }

		private static final SubtypeQuery test_529_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("{!{int}}"));
		@Test public void test_529() { testInvalid(test_529_query); }

		private static final SubtypeQuery test_530_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("{!!any}"));
		@Test public void test_530() { testInvalid(test_530_query); }

		private static final SubtypeQuery test_531_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("{!!int}"));
		@Test public void test_531() { testInvalid(test_531_query); }

		private static final SubtypeQuery test_532_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("!{{any}}"));
		@Test public void test_532() { testInvalid(test_532_query); }

		private static final SubtypeQuery test_533_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("!{{int}}"));
		@Test public void test_533() { testInvalid(test_533_query); }

		private static final SubtypeQuery test_534_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("!{!any}"));
		@Test public void test_534() { testInvalid(test_534_query); }

		private static final SubtypeQuery test_535_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("!{!int}"));
		@Test public void test_535() { testInvalid(test_535_query); }

		private static final SubtypeQuery test_536_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("!!{any}"));
		@Test public void test_536() { testInvalid(test_536_query); }

		private static final SubtypeQuery test_537_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("!!{int}"));
		@Test public void test_537() { testInvalid(test_537_query); }

		private static final SubtypeQuery test_538_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("!!!any"));
		@Test public void test_538() { testValid(test_538_query); }

		private static final SubtypeQuery test_539_query = createSubtypeQuery(parseWhiley("{{!int}}"),parseWhiley("!!!int"));
		@Test public void test_539() { testInvalid(test_539_query); }

		private static final SubtypeQuery test_540_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("any"));
		@Test public void test_540() { testInvalid(test_540_query); }

		private static final SubtypeQuery test_541_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("int"));
		@Test public void test_541() { testInvalid(test_541_query); }

		private static final SubtypeQuery test_542_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("{any}"));
		@Test public void test_542() { testInvalid(test_542_query); }

		private static final SubtypeQuery test_543_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("{int}"));
		@Test public void test_543() { testValid(test_543_query); }

		private static final SubtypeQuery test_544_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("!any"));
		@Test public void test_544() { testValid(test_544_query); }

		private static final SubtypeQuery test_545_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("!int"));
		@Test public void test_545() { testInvalid(test_545_query); }

		private static final SubtypeQuery test_546_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("{{any}}"));
		@Test public void test_546() { testInvalid(test_546_query); }

		private static final SubtypeQuery test_547_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("{{int}}"));
		@Test public void test_547() { testInvalid(test_547_query); }

		private static final SubtypeQuery test_548_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("{!any}"));
		@Test public void test_548() { testValid(test_548_query); }

		private static final SubtypeQuery test_549_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("{!int}"));
		@Test public void test_549() { testInvalid(test_549_query); }

		private static final SubtypeQuery test_550_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("!{any}"));
		@Test public void test_550() { testInvalid(test_550_query); }

		private static final SubtypeQuery test_551_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("!{int}"));
		@Test public void test_551() { testInvalid(test_551_query); }

		private static final SubtypeQuery test_552_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("!!any"));
		@Test public void test_552() { testInvalid(test_552_query); }

		private static final SubtypeQuery test_553_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("!!int"));
		@Test public void test_553() { testInvalid(test_553_query); }

		private static final SubtypeQuery test_554_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("{{{any}}}"));
		@Test public void test_554() { testInvalid(test_554_query); }

		private static final SubtypeQuery test_555_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("{{{int}}}"));
		@Test public void test_555() { testInvalid(test_555_query); }

		private static final SubtypeQuery test_556_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("{{!any}}"));
		@Test public void test_556() { testValid(test_556_query); }

		private static final SubtypeQuery test_557_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("{{!int}}"));
		@Test public void test_557() { testInvalid(test_557_query); }

		private static final SubtypeQuery test_558_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("{!{any}}"));
		@Test public void test_558() { testValid(test_558_query); }

		private static final SubtypeQuery test_559_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("{!{int}}"));
		@Test public void test_559() { testInvalid(test_559_query); }

		private static final SubtypeQuery test_560_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("{!!any}"));
		@Test public void test_560() { testInvalid(test_560_query); }

		private static final SubtypeQuery test_561_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("{!!int}"));
		@Test public void test_561() { testValid(test_561_query); }

		private static final SubtypeQuery test_562_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("!{{any}}"));
		@Test public void test_562() { testInvalid(test_562_query); }

		private static final SubtypeQuery test_563_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("!{{int}}"));
		@Test public void test_563() { testInvalid(test_563_query); }

		private static final SubtypeQuery test_564_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("!{!any}"));
		@Test public void test_564() { testInvalid(test_564_query); }

		private static final SubtypeQuery test_565_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("!{!int}"));
		@Test public void test_565() { testInvalid(test_565_query); }

		private static final SubtypeQuery test_566_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("!!{any}"));
		@Test public void test_566() { testInvalid(test_566_query); }

		private static final SubtypeQuery test_567_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("!!{int}"));
		@Test public void test_567() { testValid(test_567_query); }

		private static final SubtypeQuery test_568_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("!!!any"));
		@Test public void test_568() { testValid(test_568_query); }

		private static final SubtypeQuery test_569_query = createSubtypeQuery(parseWhiley("{!{any}}"),parseWhiley("!!!int"));
		@Test public void test_569() { testInvalid(test_569_query); }

		private static final SubtypeQuery test_570_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("any"));
		@Test public void test_570() { testInvalid(test_570_query); }

		private static final SubtypeQuery test_571_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("int"));
		@Test public void test_571() { testInvalid(test_571_query); }

		private static final SubtypeQuery test_572_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("{any}"));
		@Test public void test_572() { testInvalid(test_572_query); }

		private static final SubtypeQuery test_573_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("{int}"));
		@Test public void test_573() { testValid(test_573_query); }

		private static final SubtypeQuery test_574_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("!any"));
		@Test public void test_574() { testValid(test_574_query); }

		private static final SubtypeQuery test_575_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("!int"));
		@Test public void test_575() { testInvalid(test_575_query); }

		private static final SubtypeQuery test_576_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("{{any}}"));
		@Test public void test_576() { testInvalid(test_576_query); }

		private static final SubtypeQuery test_577_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("{{int}}"));
		@Test public void test_577() { testInvalid(test_577_query); }

		private static final SubtypeQuery test_578_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("{!any}"));
		@Test public void test_578() { testValid(test_578_query); }

		private static final SubtypeQuery test_579_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("{!int}"));
		@Test public void test_579() { testInvalid(test_579_query); }

		private static final SubtypeQuery test_580_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("!{any}"));
		@Test public void test_580() { testInvalid(test_580_query); }

		private static final SubtypeQuery test_581_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("!{int}"));
		@Test public void test_581() { testInvalid(test_581_query); }

		private static final SubtypeQuery test_582_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("!!any"));
		@Test public void test_582() { testInvalid(test_582_query); }

		private static final SubtypeQuery test_583_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("!!int"));
		@Test public void test_583() { testInvalid(test_583_query); }

		private static final SubtypeQuery test_584_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("{{{any}}}"));
		@Test public void test_584() { testValid(test_584_query); }

		private static final SubtypeQuery test_585_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("{{{int}}}"));
		@Test public void test_585() { testValid(test_585_query); }

		private static final SubtypeQuery test_586_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("{{!any}}"));
		@Test public void test_586() { testValid(test_586_query); }

		private static final SubtypeQuery test_587_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("{{!int}}"));
		@Test public void test_587() { testValid(test_587_query); }

		private static final SubtypeQuery test_588_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("{!{any}}"));
		@Test public void test_588() { testValid(test_588_query); }

		private static final SubtypeQuery test_589_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("{!{int}}"));
		@Test public void test_589() { testValid(test_589_query); }

		private static final SubtypeQuery test_590_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("{!!any}"));
		@Test public void test_590() { testInvalid(test_590_query); }

		private static final SubtypeQuery test_591_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("{!!int}"));
		@Test public void test_591() { testValid(test_591_query); }

		private static final SubtypeQuery test_592_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("!{{any}}"));
		@Test public void test_592() { testInvalid(test_592_query); }

		private static final SubtypeQuery test_593_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("!{{int}}"));
		@Test public void test_593() { testInvalid(test_593_query); }

		private static final SubtypeQuery test_594_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("!{!any}"));
		@Test public void test_594() { testInvalid(test_594_query); }

		private static final SubtypeQuery test_595_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("!{!int}"));
		@Test public void test_595() { testInvalid(test_595_query); }

		private static final SubtypeQuery test_596_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("!!{any}"));
		@Test public void test_596() { testInvalid(test_596_query); }

		private static final SubtypeQuery test_597_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("!!{int}"));
		@Test public void test_597() { testValid(test_597_query); }

		private static final SubtypeQuery test_598_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("!!!any"));
		@Test public void test_598() { testValid(test_598_query); }

		private static final SubtypeQuery test_599_query = createSubtypeQuery(parseWhiley("{!{int}}"),parseWhiley("!!!int"));
		@Test public void test_599() { testInvalid(test_599_query); }

		private static final SubtypeQuery test_600_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("any"));
		@Test public void test_600() { testInvalid(test_600_query); }

		private static final SubtypeQuery test_601_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("int"));
		@Test public void test_601() { testInvalid(test_601_query); }

		private static final SubtypeQuery test_602_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("{any}"));
		@Test public void test_602() { testValid(test_602_query); }

		private static final SubtypeQuery test_603_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("{int}"));
		@Test public void test_603() { testValid(test_603_query); }

		private static final SubtypeQuery test_604_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("!any"));
		@Test public void test_604() { testValid(test_604_query); }

		private static final SubtypeQuery test_605_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("!int"));
		@Test public void test_605() { testInvalid(test_605_query); }

		private static final SubtypeQuery test_606_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("{{any}}"));
		@Test public void test_606() { testValid(test_606_query); }

		private static final SubtypeQuery test_607_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("{{int}}"));
		@Test public void test_607() { testValid(test_607_query); }

		private static final SubtypeQuery test_608_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("{!any}"));
		@Test public void test_608() { testValid(test_608_query); }

		private static final SubtypeQuery test_609_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("{!int}"));
		@Test public void test_609() { testValid(test_609_query); }

		private static final SubtypeQuery test_610_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("!{any}"));
		@Test public void test_610() { testInvalid(test_610_query); }

		private static final SubtypeQuery test_611_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("!{int}"));
		@Test public void test_611() { testInvalid(test_611_query); }

		private static final SubtypeQuery test_612_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("!!any"));
		@Test public void test_612() { testInvalid(test_612_query); }

		private static final SubtypeQuery test_613_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("!!int"));
		@Test public void test_613() { testInvalid(test_613_query); }

		private static final SubtypeQuery test_614_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("{{{any}}}"));
		@Test public void test_614() { testValid(test_614_query); }

		private static final SubtypeQuery test_615_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("{{{int}}}"));
		@Test public void test_615() { testValid(test_615_query); }

		private static final SubtypeQuery test_616_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("{{!any}}"));
		@Test public void test_616() { testValid(test_616_query); }

		private static final SubtypeQuery test_617_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("{{!int}}"));
		@Test public void test_617() { testValid(test_617_query); }

		private static final SubtypeQuery test_618_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("{!{any}}"));
		@Test public void test_618() { testValid(test_618_query); }

		private static final SubtypeQuery test_619_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("{!{int}}"));
		@Test public void test_619() { testValid(test_619_query); }

		private static final SubtypeQuery test_620_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("{!!any}"));
		@Test public void test_620() { testValid(test_620_query); }

		private static final SubtypeQuery test_621_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("{!!int}"));
		@Test public void test_621() { testValid(test_621_query); }

		private static final SubtypeQuery test_622_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("!{{any}}"));
		@Test public void test_622() { testInvalid(test_622_query); }

		private static final SubtypeQuery test_623_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("!{{int}}"));
		@Test public void test_623() { testInvalid(test_623_query); }

		private static final SubtypeQuery test_624_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("!{!any}"));
		@Test public void test_624() { testInvalid(test_624_query); }

		private static final SubtypeQuery test_625_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("!{!int}"));
		@Test public void test_625() { testInvalid(test_625_query); }

		private static final SubtypeQuery test_626_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("!!{any}"));
		@Test public void test_626() { testValid(test_626_query); }

		private static final SubtypeQuery test_627_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("!!{int}"));
		@Test public void test_627() { testValid(test_627_query); }

		private static final SubtypeQuery test_628_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("!!!any"));
		@Test public void test_628() { testValid(test_628_query); }

		private static final SubtypeQuery test_629_query = createSubtypeQuery(parseWhiley("{!!any}"),parseWhiley("!!!int"));
		@Test public void test_629() { testInvalid(test_629_query); }

		private static final SubtypeQuery test_630_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("any"));
		@Test public void test_630() { testInvalid(test_630_query); }

		private static final SubtypeQuery test_631_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("int"));
		@Test public void test_631() { testInvalid(test_631_query); }

		private static final SubtypeQuery test_632_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("{any}"));
		@Test public void test_632() { testInvalid(test_632_query); }

		private static final SubtypeQuery test_633_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("{int}"));
		@Test public void test_633() { testValid(test_633_query); }

		private static final SubtypeQuery test_634_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("!any"));
		@Test public void test_634() { testValid(test_634_query); }

		private static final SubtypeQuery test_635_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("!int"));
		@Test public void test_635() { testInvalid(test_635_query); }

		private static final SubtypeQuery test_636_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("{{any}}"));
		@Test public void test_636() { testInvalid(test_636_query); }

		private static final SubtypeQuery test_637_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("{{int}}"));
		@Test public void test_637() { testInvalid(test_637_query); }

		private static final SubtypeQuery test_638_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("{!any}"));
		@Test public void test_638() { testValid(test_638_query); }

		private static final SubtypeQuery test_639_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("{!int}"));
		@Test public void test_639() { testInvalid(test_639_query); }

		private static final SubtypeQuery test_640_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("!{any}"));
		@Test public void test_640() { testInvalid(test_640_query); }

		private static final SubtypeQuery test_641_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("!{int}"));
		@Test public void test_641() { testInvalid(test_641_query); }

		private static final SubtypeQuery test_642_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("!!any"));
		@Test public void test_642() { testInvalid(test_642_query); }

		private static final SubtypeQuery test_643_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("!!int"));
		@Test public void test_643() { testInvalid(test_643_query); }

		private static final SubtypeQuery test_644_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("{{{any}}}"));
		@Test public void test_644() { testInvalid(test_644_query); }

		private static final SubtypeQuery test_645_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("{{{int}}}"));
		@Test public void test_645() { testInvalid(test_645_query); }

		private static final SubtypeQuery test_646_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("{{!any}}"));
		@Test public void test_646() { testValid(test_646_query); }

		private static final SubtypeQuery test_647_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("{{!int}}"));
		@Test public void test_647() { testInvalid(test_647_query); }

		private static final SubtypeQuery test_648_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("{!{any}}"));
		@Test public void test_648() { testInvalid(test_648_query); }

		private static final SubtypeQuery test_649_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("{!{int}}"));
		@Test public void test_649() { testInvalid(test_649_query); }

		private static final SubtypeQuery test_650_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("{!!any}"));
		@Test public void test_650() { testInvalid(test_650_query); }

		private static final SubtypeQuery test_651_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("{!!int}"));
		@Test public void test_651() { testValid(test_651_query); }

		private static final SubtypeQuery test_652_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("!{{any}}"));
		@Test public void test_652() { testInvalid(test_652_query); }

		private static final SubtypeQuery test_653_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("!{{int}}"));
		@Test public void test_653() { testInvalid(test_653_query); }

		private static final SubtypeQuery test_654_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("!{!any}"));
		@Test public void test_654() { testInvalid(test_654_query); }

		private static final SubtypeQuery test_655_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("!{!int}"));
		@Test public void test_655() { testInvalid(test_655_query); }

		private static final SubtypeQuery test_656_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("!!{any}"));
		@Test public void test_656() { testInvalid(test_656_query); }

		private static final SubtypeQuery test_657_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("!!{int}"));
		@Test public void test_657() { testValid(test_657_query); }

		private static final SubtypeQuery test_658_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("!!!any"));
		@Test public void test_658() { testValid(test_658_query); }

		private static final SubtypeQuery test_659_query = createSubtypeQuery(parseWhiley("{!!int}"),parseWhiley("!!!int"));
		@Test public void test_659() { testInvalid(test_659_query); }

		private static final SubtypeQuery test_660_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("any"));
		@Test public void test_660() { testInvalid(test_660_query); }

		private static final SubtypeQuery test_661_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("int"));
		@Test public void test_661() { testValid(test_661_query); }

		private static final SubtypeQuery test_662_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("{any}"));
		@Test public void test_662() { testInvalid(test_662_query); }

		private static final SubtypeQuery test_663_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("{int}"));
		@Test public void test_663() { testValid(test_663_query); }

		private static final SubtypeQuery test_664_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("!any"));
		@Test public void test_664() { testValid(test_664_query); }

		private static final SubtypeQuery test_665_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("!int"));
		@Test public void test_665() { testInvalid(test_665_query); }

		private static final SubtypeQuery test_666_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("{{any}}"));
		@Test public void test_666() { testInvalid(test_666_query); }

		private static final SubtypeQuery test_667_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("{{int}}"));
		@Test public void test_667() { testInvalid(test_667_query); }

		private static final SubtypeQuery test_668_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("{!any}"));
		@Test public void test_668() { testValid(test_668_query); }

		private static final SubtypeQuery test_669_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("{!int}"));
		@Test public void test_669() { testInvalid(test_669_query); }

		private static final SubtypeQuery test_670_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("!{any}"));
		@Test public void test_670() { testValid(test_670_query); }

		private static final SubtypeQuery test_671_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("!{int}"));
		@Test public void test_671() { testInvalid(test_671_query); }

		private static final SubtypeQuery test_672_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("!!any"));
		@Test public void test_672() { testInvalid(test_672_query); }

		private static final SubtypeQuery test_673_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("!!int"));
		@Test public void test_673() { testValid(test_673_query); }

		private static final SubtypeQuery test_674_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("{{{any}}}"));
		@Test public void test_674() { testInvalid(test_674_query); }

		private static final SubtypeQuery test_675_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("{{{int}}}"));
		@Test public void test_675() { testInvalid(test_675_query); }

		private static final SubtypeQuery test_676_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("{{!any}}"));
		@Test public void test_676() { testValid(test_676_query); }

		private static final SubtypeQuery test_677_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("{{!int}}"));
		@Test public void test_677() { testInvalid(test_677_query); }

		private static final SubtypeQuery test_678_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("{!{any}}"));
		@Test public void test_678() { testValid(test_678_query); }

		private static final SubtypeQuery test_679_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("{!{int}}"));
		@Test public void test_679() { testInvalid(test_679_query); }

		private static final SubtypeQuery test_680_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("{!!any}"));
		@Test public void test_680() { testInvalid(test_680_query); }

		private static final SubtypeQuery test_681_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("{!!int}"));
		@Test public void test_681() { testValid(test_681_query); }

		private static final SubtypeQuery test_682_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("!{{any}}"));
		@Test public void test_682() { testValid(test_682_query); }

		private static final SubtypeQuery test_683_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("!{{int}}"));
		@Test public void test_683() { testInvalid(test_683_query); }

		private static final SubtypeQuery test_684_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("!{!any}"));
		@Test public void test_684() { testInvalid(test_684_query); }

		private static final SubtypeQuery test_685_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("!{!int}"));
		@Test public void test_685() { testValid(test_685_query); }

		private static final SubtypeQuery test_686_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("!!{any}"));
		@Test public void test_686() { testInvalid(test_686_query); }

		private static final SubtypeQuery test_687_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("!!{int}"));
		@Test public void test_687() { testValid(test_687_query); }

		private static final SubtypeQuery test_688_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("!!!any"));
		@Test public void test_688() { testValid(test_688_query); }

		private static final SubtypeQuery test_689_query = createSubtypeQuery(parseWhiley("!{{any}}"),parseWhiley("!!!int"));
		@Test public void test_689() { testInvalid(test_689_query); }

		private static final SubtypeQuery test_690_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("any"));
		@Test public void test_690() { testInvalid(test_690_query); }

		private static final SubtypeQuery test_691_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("int"));
		@Test public void test_691() { testValid(test_691_query); }

		private static final SubtypeQuery test_692_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("{any}"));
		@Test public void test_692() { testInvalid(test_692_query); }

		private static final SubtypeQuery test_693_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("{int}"));
		@Test public void test_693() { testValid(test_693_query); }

		private static final SubtypeQuery test_694_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("!any"));
		@Test public void test_694() { testValid(test_694_query); }

		private static final SubtypeQuery test_695_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("!int"));
		@Test public void test_695() { testInvalid(test_695_query); }

		private static final SubtypeQuery test_696_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("{{any}}"));
		@Test public void test_696() { testInvalid(test_696_query); }

		private static final SubtypeQuery test_697_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("{{int}}"));
		@Test public void test_697() { testInvalid(test_697_query); }

		private static final SubtypeQuery test_698_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("{!any}"));
		@Test public void test_698() { testValid(test_698_query); }

		private static final SubtypeQuery test_699_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("{!int}"));
		@Test public void test_699() { testInvalid(test_699_query); }

		private static final SubtypeQuery test_700_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("!{any}"));
		@Test public void test_700() { testValid(test_700_query); }

		private static final SubtypeQuery test_701_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("!{int}"));
		@Test public void test_701() { testInvalid(test_701_query); }

		private static final SubtypeQuery test_702_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("!!any"));
		@Test public void test_702() { testInvalid(test_702_query); }

		private static final SubtypeQuery test_703_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("!!int"));
		@Test public void test_703() { testValid(test_703_query); }

		private static final SubtypeQuery test_704_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("{{{any}}}"));
		@Test public void test_704() { testValid(test_704_query); }

		private static final SubtypeQuery test_705_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("{{{int}}}"));
		@Test public void test_705() { testValid(test_705_query); }

		private static final SubtypeQuery test_706_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("{{!any}}"));
		@Test public void test_706() { testValid(test_706_query); }

		private static final SubtypeQuery test_707_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("{{!int}}"));
		@Test public void test_707() { testValid(test_707_query); }

		private static final SubtypeQuery test_708_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("{!{any}}"));
		@Test public void test_708() { testValid(test_708_query); }

		private static final SubtypeQuery test_709_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("{!{int}}"));
		@Test public void test_709() { testValid(test_709_query); }

		private static final SubtypeQuery test_710_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("{!!any}"));
		@Test public void test_710() { testInvalid(test_710_query); }

		private static final SubtypeQuery test_711_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("{!!int}"));
		@Test public void test_711() { testValid(test_711_query); }

		private static final SubtypeQuery test_712_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("!{{any}}"));
		@Test public void test_712() { testValid(test_712_query); }

		private static final SubtypeQuery test_713_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("!{{int}}"));
		@Test public void test_713() { testValid(test_713_query); }

		private static final SubtypeQuery test_714_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("!{!any}"));
		@Test public void test_714() { testInvalid(test_714_query); }

		private static final SubtypeQuery test_715_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("!{!int}"));
		@Test public void test_715() { testValid(test_715_query); }

		private static final SubtypeQuery test_716_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("!!{any}"));
		@Test public void test_716() { testInvalid(test_716_query); }

		private static final SubtypeQuery test_717_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("!!{int}"));
		@Test public void test_717() { testValid(test_717_query); }

		private static final SubtypeQuery test_718_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("!!!any"));
		@Test public void test_718() { testValid(test_718_query); }

		private static final SubtypeQuery test_719_query = createSubtypeQuery(parseWhiley("!{{int}}"),parseWhiley("!!!int"));
		@Test public void test_719() { testInvalid(test_719_query); }

		private static final SubtypeQuery test_720_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("any"));
		@Test public void test_720() { testValid(test_720_query); }

		private static final SubtypeQuery test_721_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("int"));
		@Test public void test_721() { testValid(test_721_query); }

		private static final SubtypeQuery test_722_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("{any}"));
		@Test public void test_722() { testValid(test_722_query); }

		private static final SubtypeQuery test_723_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("{int}"));
		@Test public void test_723() { testValid(test_723_query); }

		private static final SubtypeQuery test_724_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("!any"));
		@Test public void test_724() { testValid(test_724_query); }

		private static final SubtypeQuery test_725_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("!int"));
		@Test public void test_725() { testValid(test_725_query); }

		private static final SubtypeQuery test_726_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("{{any}}"));
		@Test public void test_726() { testValid(test_726_query); }

		private static final SubtypeQuery test_727_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("{{int}}"));
		@Test public void test_727() { testValid(test_727_query); }

		private static final SubtypeQuery test_728_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("{!any}"));
		@Test public void test_728() { testValid(test_728_query); }

		private static final SubtypeQuery test_729_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("{!int}"));
		@Test public void test_729() { testValid(test_729_query); }

		private static final SubtypeQuery test_730_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("!{any}"));
		@Test public void test_730() { testValid(test_730_query); }

		private static final SubtypeQuery test_731_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("!{int}"));
		@Test public void test_731() { testValid(test_731_query); }

		private static final SubtypeQuery test_732_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("!!any"));
		@Test public void test_732() { testValid(test_732_query); }

		private static final SubtypeQuery test_733_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("!!int"));
		@Test public void test_733() { testValid(test_733_query); }

		private static final SubtypeQuery test_734_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("{{{any}}}"));
		@Test public void test_734() { testValid(test_734_query); }

		private static final SubtypeQuery test_735_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("{{{int}}}"));
		@Test public void test_735() { testValid(test_735_query); }

		private static final SubtypeQuery test_736_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("{{!any}}"));
		@Test public void test_736() { testValid(test_736_query); }

		private static final SubtypeQuery test_737_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("{{!int}}"));
		@Test public void test_737() { testValid(test_737_query); }

		private static final SubtypeQuery test_738_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("{!{any}}"));
		@Test public void test_738() { testValid(test_738_query); }

		private static final SubtypeQuery test_739_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("{!{int}}"));
		@Test public void test_739() { testValid(test_739_query); }

		private static final SubtypeQuery test_740_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("{!!any}"));
		@Test public void test_740() { testValid(test_740_query); }

		private static final SubtypeQuery test_741_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("{!!int}"));
		@Test public void test_741() { testValid(test_741_query); }

		private static final SubtypeQuery test_742_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("!{{any}}"));
		@Test public void test_742() { testValid(test_742_query); }

		private static final SubtypeQuery test_743_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("!{{int}}"));
		@Test public void test_743() { testValid(test_743_query); }

		private static final SubtypeQuery test_744_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("!{!any}"));
		@Test public void test_744() { testValid(test_744_query); }

		private static final SubtypeQuery test_745_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("!{!int}"));
		@Test public void test_745() { testValid(test_745_query); }

		private static final SubtypeQuery test_746_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("!!{any}"));
		@Test public void test_746() { testValid(test_746_query); }

		private static final SubtypeQuery test_747_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("!!{int}"));
		@Test public void test_747() { testValid(test_747_query); }

		private static final SubtypeQuery test_748_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("!!!any"));
		@Test public void test_748() { testValid(test_748_query); }

		private static final SubtypeQuery test_749_query = createSubtypeQuery(parseWhiley("!{!any}"),parseWhiley("!!!int"));
		@Test public void test_749() { testValid(test_749_query); }

		private static final SubtypeQuery test_750_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("any"));
		@Test public void test_750() { testInvalid(test_750_query); }

		private static final SubtypeQuery test_751_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("int"));
		@Test public void test_751() { testValid(test_751_query); }

		private static final SubtypeQuery test_752_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("{any}"));
		@Test public void test_752() { testInvalid(test_752_query); }

		private static final SubtypeQuery test_753_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("{int}"));
		@Test public void test_753() { testValid(test_753_query); }

		private static final SubtypeQuery test_754_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("!any"));
		@Test public void test_754() { testValid(test_754_query); }

		private static final SubtypeQuery test_755_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("!int"));
		@Test public void test_755() { testInvalid(test_755_query); }

		private static final SubtypeQuery test_756_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("{{any}}"));
		@Test public void test_756() { testInvalid(test_756_query); }

		private static final SubtypeQuery test_757_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("{{int}}"));
		@Test public void test_757() { testInvalid(test_757_query); }

		private static final SubtypeQuery test_758_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("{!any}"));
		@Test public void test_758() { testValid(test_758_query); }

		private static final SubtypeQuery test_759_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("{!int}"));
		@Test public void test_759() { testInvalid(test_759_query); }

		private static final SubtypeQuery test_760_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("!{any}"));
		@Test public void test_760() { testValid(test_760_query); }

		private static final SubtypeQuery test_761_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("!{int}"));
		@Test public void test_761() { testInvalid(test_761_query); }

		private static final SubtypeQuery test_762_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("!!any"));
		@Test public void test_762() { testInvalid(test_762_query); }

		private static final SubtypeQuery test_763_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("!!int"));
		@Test public void test_763() { testValid(test_763_query); }

		private static final SubtypeQuery test_764_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("{{{any}}}"));
		@Test public void test_764() { testInvalid(test_764_query); }

		private static final SubtypeQuery test_765_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("{{{int}}}"));
		@Test public void test_765() { testInvalid(test_765_query); }

		private static final SubtypeQuery test_766_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("{{!any}}"));
		@Test public void test_766() { testValid(test_766_query); }

		private static final SubtypeQuery test_767_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("{{!int}}"));
		@Test public void test_767() { testInvalid(test_767_query); }

		private static final SubtypeQuery test_768_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("{!{any}}"));
		@Test public void test_768() { testInvalid(test_768_query); }

		private static final SubtypeQuery test_769_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("{!{int}}"));
		@Test public void test_769() { testInvalid(test_769_query); }

		private static final SubtypeQuery test_770_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("{!!any}"));
		@Test public void test_770() { testInvalid(test_770_query); }

		private static final SubtypeQuery test_771_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("{!!int}"));
		@Test public void test_771() { testValid(test_771_query); }

		private static final SubtypeQuery test_772_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("!{{any}}"));
		@Test public void test_772() { testInvalid(test_772_query); }

		private static final SubtypeQuery test_773_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("!{{int}}"));
		@Test public void test_773() { testInvalid(test_773_query); }

		private static final SubtypeQuery test_774_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("!{!any}"));
		@Test public void test_774() { testInvalid(test_774_query); }

		private static final SubtypeQuery test_775_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("!{!int}"));
		@Test public void test_775() { testValid(test_775_query); }

		private static final SubtypeQuery test_776_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("!!{any}"));
		@Test public void test_776() { testInvalid(test_776_query); }

		private static final SubtypeQuery test_777_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("!!{int}"));
		@Test public void test_777() { testValid(test_777_query); }

		private static final SubtypeQuery test_778_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("!!!any"));
		@Test public void test_778() { testValid(test_778_query); }

		private static final SubtypeQuery test_779_query = createSubtypeQuery(parseWhiley("!{!int}"),parseWhiley("!!!int"));
		@Test public void test_779() { testInvalid(test_779_query); }

		private static final SubtypeQuery test_780_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("any"));
		@Test public void test_780() { testInvalid(test_780_query); }

		private static final SubtypeQuery test_781_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("int"));
		@Test public void test_781() { testInvalid(test_781_query); }

		private static final SubtypeQuery test_782_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("{any}"));
		@Test public void test_782() { testValid(test_782_query); }

		private static final SubtypeQuery test_783_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("{int}"));
		@Test public void test_783() { testValid(test_783_query); }

		private static final SubtypeQuery test_784_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("!any"));
		@Test public void test_784() { testValid(test_784_query); }

		private static final SubtypeQuery test_785_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("!int"));
		@Test public void test_785() { testInvalid(test_785_query); }

		private static final SubtypeQuery test_786_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("{{any}}"));
		@Test public void test_786() { testValid(test_786_query); }

		private static final SubtypeQuery test_787_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("{{int}}"));
		@Test public void test_787() { testValid(test_787_query); }

		private static final SubtypeQuery test_788_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("{!any}"));
		@Test public void test_788() { testValid(test_788_query); }

		private static final SubtypeQuery test_789_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("{!int}"));
		@Test public void test_789() { testValid(test_789_query); }

		private static final SubtypeQuery test_790_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("!{any}"));
		@Test public void test_790() { testInvalid(test_790_query); }

		private static final SubtypeQuery test_791_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("!{int}"));
		@Test public void test_791() { testInvalid(test_791_query); }

		private static final SubtypeQuery test_792_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("!!any"));
		@Test public void test_792() { testInvalid(test_792_query); }

		private static final SubtypeQuery test_793_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("!!int"));
		@Test public void test_793() { testInvalid(test_793_query); }

		private static final SubtypeQuery test_794_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("{{{any}}}"));
		@Test public void test_794() { testValid(test_794_query); }

		private static final SubtypeQuery test_795_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("{{{int}}}"));
		@Test public void test_795() { testValid(test_795_query); }

		private static final SubtypeQuery test_796_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("{{!any}}"));
		@Test public void test_796() { testValid(test_796_query); }

		private static final SubtypeQuery test_797_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("{{!int}}"));
		@Test public void test_797() { testValid(test_797_query); }

		private static final SubtypeQuery test_798_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("{!{any}}"));
		@Test public void test_798() { testValid(test_798_query); }

		private static final SubtypeQuery test_799_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("{!{int}}"));
		@Test public void test_799() { testValid(test_799_query); }

		private static final SubtypeQuery test_800_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("{!!any}"));
		@Test public void test_800() { testValid(test_800_query); }

		private static final SubtypeQuery test_801_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("{!!int}"));
		@Test public void test_801() { testValid(test_801_query); }

		private static final SubtypeQuery test_802_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("!{{any}}"));
		@Test public void test_802() { testInvalid(test_802_query); }

		private static final SubtypeQuery test_803_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("!{{int}}"));
		@Test public void test_803() { testInvalid(test_803_query); }

		private static final SubtypeQuery test_804_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("!{!any}"));
		@Test public void test_804() { testInvalid(test_804_query); }

		private static final SubtypeQuery test_805_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("!{!int}"));
		@Test public void test_805() { testInvalid(test_805_query); }

		private static final SubtypeQuery test_806_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("!!{any}"));
		@Test public void test_806() { testValid(test_806_query); }

		private static final SubtypeQuery test_807_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("!!{int}"));
		@Test public void test_807() { testValid(test_807_query); }

		private static final SubtypeQuery test_808_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("!!!any"));
		@Test public void test_808() { testValid(test_808_query); }

		private static final SubtypeQuery test_809_query = createSubtypeQuery(parseWhiley("!!{any}"),parseWhiley("!!!int"));
		@Test public void test_809() { testInvalid(test_809_query); }

		private static final SubtypeQuery test_810_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("any"));
		@Test public void test_810() { testInvalid(test_810_query); }

		private static final SubtypeQuery test_811_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("int"));
		@Test public void test_811() { testInvalid(test_811_query); }

		private static final SubtypeQuery test_812_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("{any}"));
		@Test public void test_812() { testInvalid(test_812_query); }

		private static final SubtypeQuery test_813_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("{int}"));
		@Test public void test_813() { testValid(test_813_query); }

		private static final SubtypeQuery test_814_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("!any"));
		@Test public void test_814() { testValid(test_814_query); }

		private static final SubtypeQuery test_815_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("!int"));
		@Test public void test_815() { testInvalid(test_815_query); }

		private static final SubtypeQuery test_816_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("{{any}}"));
		@Test public void test_816() { testInvalid(test_816_query); }

		private static final SubtypeQuery test_817_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("{{int}}"));
		@Test public void test_817() { testInvalid(test_817_query); }

		private static final SubtypeQuery test_818_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("{!any}"));
		@Test public void test_818() { testValid(test_818_query); }

		private static final SubtypeQuery test_819_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("{!int}"));
		@Test public void test_819() { testInvalid(test_819_query); }

		private static final SubtypeQuery test_820_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("!{any}"));
		@Test public void test_820() { testInvalid(test_820_query); }

		private static final SubtypeQuery test_821_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("!{int}"));
		@Test public void test_821() { testInvalid(test_821_query); }

		private static final SubtypeQuery test_822_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("!!any"));
		@Test public void test_822() { testInvalid(test_822_query); }

		private static final SubtypeQuery test_823_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("!!int"));
		@Test public void test_823() { testInvalid(test_823_query); }

		private static final SubtypeQuery test_824_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("{{{any}}}"));
		@Test public void test_824() { testInvalid(test_824_query); }

		private static final SubtypeQuery test_825_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("{{{int}}}"));
		@Test public void test_825() { testInvalid(test_825_query); }

		private static final SubtypeQuery test_826_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("{{!any}}"));
		@Test public void test_826() { testValid(test_826_query); }

		private static final SubtypeQuery test_827_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("{{!int}}"));
		@Test public void test_827() { testInvalid(test_827_query); }

		private static final SubtypeQuery test_828_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("{!{any}}"));
		@Test public void test_828() { testInvalid(test_828_query); }

		private static final SubtypeQuery test_829_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("{!{int}}"));
		@Test public void test_829() { testInvalid(test_829_query); }

		private static final SubtypeQuery test_830_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("{!!any}"));
		@Test public void test_830() { testInvalid(test_830_query); }

		private static final SubtypeQuery test_831_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("{!!int}"));
		@Test public void test_831() { testValid(test_831_query); }

		private static final SubtypeQuery test_832_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("!{{any}}"));
		@Test public void test_832() { testInvalid(test_832_query); }

		private static final SubtypeQuery test_833_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("!{{int}}"));
		@Test public void test_833() { testInvalid(test_833_query); }

		private static final SubtypeQuery test_834_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("!{!any}"));
		@Test public void test_834() { testInvalid(test_834_query); }

		private static final SubtypeQuery test_835_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("!{!int}"));
		@Test public void test_835() { testInvalid(test_835_query); }

		private static final SubtypeQuery test_836_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("!!{any}"));
		@Test public void test_836() { testInvalid(test_836_query); }

		private static final SubtypeQuery test_837_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("!!{int}"));
		@Test public void test_837() { testValid(test_837_query); }

		private static final SubtypeQuery test_838_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("!!!any"));
		@Test public void test_838() { testValid(test_838_query); }

		private static final SubtypeQuery test_839_query = createSubtypeQuery(parseWhiley("!!{int}"),parseWhiley("!!!int"));
		@Test public void test_839() { testInvalid(test_839_query); }

		private static final SubtypeQuery test_840_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("any"));
		@Test public void test_840() { testInvalid(test_840_query); }

		private static final SubtypeQuery test_841_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("int"));
		@Test public void test_841() { testInvalid(test_841_query); }

		private static final SubtypeQuery test_842_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("{any}"));
		@Test public void test_842() { testInvalid(test_842_query); }

		private static final SubtypeQuery test_843_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("{int}"));
		@Test public void test_843() { testInvalid(test_843_query); }

		private static final SubtypeQuery test_844_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("!any"));
		@Test public void test_844() { testValid(test_844_query); }

		private static final SubtypeQuery test_845_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("!int"));
		@Test public void test_845() { testInvalid(test_845_query); }

		private static final SubtypeQuery test_846_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("{{any}}"));
		@Test public void test_846() { testInvalid(test_846_query); }

		private static final SubtypeQuery test_847_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("{{int}}"));
		@Test public void test_847() { testInvalid(test_847_query); }

		private static final SubtypeQuery test_848_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("{!any}"));
		@Test public void test_848() { testValid(test_848_query); }

		private static final SubtypeQuery test_849_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("{!int}"));
		@Test public void test_849() { testInvalid(test_849_query); }

		private static final SubtypeQuery test_850_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("!{any}"));
		@Test public void test_850() { testInvalid(test_850_query); }

		private static final SubtypeQuery test_851_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("!{int}"));
		@Test public void test_851() { testInvalid(test_851_query); }

		private static final SubtypeQuery test_852_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("!!any"));
		@Test public void test_852() { testInvalid(test_852_query); }

		private static final SubtypeQuery test_853_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("!!int"));
		@Test public void test_853() { testInvalid(test_853_query); }

		private static final SubtypeQuery test_854_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("{{{any}}}"));
		@Test public void test_854() { testInvalid(test_854_query); }

		private static final SubtypeQuery test_855_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("{{{int}}}"));
		@Test public void test_855() { testInvalid(test_855_query); }

		private static final SubtypeQuery test_856_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("{{!any}}"));
		@Test public void test_856() { testValid(test_856_query); }

		private static final SubtypeQuery test_857_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("{{!int}}"));
		@Test public void test_857() { testInvalid(test_857_query); }

		private static final SubtypeQuery test_858_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("{!{any}}"));
		@Test public void test_858() { testInvalid(test_858_query); }

		private static final SubtypeQuery test_859_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("{!{int}}"));
		@Test public void test_859() { testInvalid(test_859_query); }

		private static final SubtypeQuery test_860_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("{!!any}"));
		@Test public void test_860() { testInvalid(test_860_query); }

		private static final SubtypeQuery test_861_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("{!!int}"));
		@Test public void test_861() { testInvalid(test_861_query); }

		private static final SubtypeQuery test_862_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("!{{any}}"));
		@Test public void test_862() { testInvalid(test_862_query); }

		private static final SubtypeQuery test_863_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("!{{int}}"));
		@Test public void test_863() { testInvalid(test_863_query); }

		private static final SubtypeQuery test_864_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("!{!any}"));
		@Test public void test_864() { testInvalid(test_864_query); }

		private static final SubtypeQuery test_865_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("!{!int}"));
		@Test public void test_865() { testInvalid(test_865_query); }

		private static final SubtypeQuery test_866_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("!!{any}"));
		@Test public void test_866() { testInvalid(test_866_query); }

		private static final SubtypeQuery test_867_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("!!{int}"));
		@Test public void test_867() { testInvalid(test_867_query); }

		private static final SubtypeQuery test_868_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("!!!any"));
		@Test public void test_868() { testValid(test_868_query); }

		private static final SubtypeQuery test_869_query = createSubtypeQuery(parseWhiley("!!!any"),parseWhiley("!!!int"));
		@Test public void test_869() { testInvalid(test_869_query); }

		private static final SubtypeQuery test_870_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("any"));
		@Test public void test_870() { testInvalid(test_870_query); }

		private static final SubtypeQuery test_871_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("int"));
		@Test public void test_871() { testInvalid(test_871_query); }

		private static final SubtypeQuery test_872_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("{any}"));
		@Test public void test_872() { testValid(test_872_query); }

		private static final SubtypeQuery test_873_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("{int}"));
		@Test public void test_873() { testValid(test_873_query); }

		private static final SubtypeQuery test_874_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("!any"));
		@Test public void test_874() { testValid(test_874_query); }

		private static final SubtypeQuery test_875_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("!int"));
		@Test public void test_875() { testValid(test_875_query); }

		private static final SubtypeQuery test_876_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("{{any}}"));
		@Test public void test_876() { testValid(test_876_query); }

		private static final SubtypeQuery test_877_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("{{int}}"));
		@Test public void test_877() { testValid(test_877_query); }

		private static final SubtypeQuery test_878_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("{!any}"));
		@Test public void test_878() { testValid(test_878_query); }

		private static final SubtypeQuery test_879_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("{!int}"));
		@Test public void test_879() { testValid(test_879_query); }

		private static final SubtypeQuery test_880_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("!{any}"));
		@Test public void test_880() { testInvalid(test_880_query); }

		private static final SubtypeQuery test_881_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("!{int}"));
		@Test public void test_881() { testInvalid(test_881_query); }

		private static final SubtypeQuery test_882_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("!!any"));
		@Test public void test_882() { testInvalid(test_882_query); }

		private static final SubtypeQuery test_883_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("!!int"));
		@Test public void test_883() { testInvalid(test_883_query); }

		private static final SubtypeQuery test_884_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("{{{any}}}"));
		@Test public void test_884() { testValid(test_884_query); }

		private static final SubtypeQuery test_885_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("{{{int}}}"));
		@Test public void test_885() { testValid(test_885_query); }

		private static final SubtypeQuery test_886_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("{{!any}}"));
		@Test public void test_886() { testValid(test_886_query); }

		private static final SubtypeQuery test_887_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("{{!int}}"));
		@Test public void test_887() { testValid(test_887_query); }

		private static final SubtypeQuery test_888_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("{!{any}}"));
		@Test public void test_888() { testValid(test_888_query); }

		private static final SubtypeQuery test_889_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("{!{int}}"));
		@Test public void test_889() { testValid(test_889_query); }

		private static final SubtypeQuery test_890_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("{!!any}"));
		@Test public void test_890() { testValid(test_890_query); }

		private static final SubtypeQuery test_891_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("{!!int}"));
		@Test public void test_891() { testValid(test_891_query); }

		private static final SubtypeQuery test_892_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("!{{any}}"));
		@Test public void test_892() { testInvalid(test_892_query); }

		private static final SubtypeQuery test_893_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("!{{int}}"));
		@Test public void test_893() { testInvalid(test_893_query); }

		private static final SubtypeQuery test_894_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("!{!any}"));
		@Test public void test_894() { testInvalid(test_894_query); }

		private static final SubtypeQuery test_895_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("!{!int}"));
		@Test public void test_895() { testInvalid(test_895_query); }

		private static final SubtypeQuery test_896_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("!!{any}"));
		@Test public void test_896() { testValid(test_896_query); }

		private static final SubtypeQuery test_897_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("!!{int}"));
		@Test public void test_897() { testValid(test_897_query); }

		private static final SubtypeQuery test_898_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("!!!any"));
		@Test public void test_898() { testValid(test_898_query); }

		private static final SubtypeQuery test_899_query = createSubtypeQuery(parseWhiley("!!!int"),parseWhiley("!!!int"));
		@Test public void test_899() { testValid(test_899_query); }

	}
}
