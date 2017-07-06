import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import types.testing.AbstractTestSuite;
import types.core.SubtypeQuery;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSuite_2_1 extends AbstractTestSuite {
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

		private static final SubtypeQuery test_14_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("any"));
		@Test public void test_14() { testInvalid(test_14_query); }

		private static final SubtypeQuery test_15_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("int"));
		@Test public void test_15() { testValid(test_15_query); }

		private static final SubtypeQuery test_16_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{any}"));
		@Test public void test_16() { testInvalid(test_16_query); }

		private static final SubtypeQuery test_17_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{int}"));
		@Test public void test_17() { testInvalid(test_17_query); }

		private static final SubtypeQuery test_18_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!any"));
		@Test public void test_18() { testValid(test_18_query); }

		private static final SubtypeQuery test_19_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!int"));
		@Test public void test_19() { testInvalid(test_19_query); }

		private static final SubtypeQuery test_20_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{{any}}"));
		@Test public void test_20() { testInvalid(test_20_query); }

		private static final SubtypeQuery test_21_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{{int}}"));
		@Test public void test_21() { testInvalid(test_21_query); }

		private static final SubtypeQuery test_22_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{!any}"));
		@Test public void test_22() { testValid(test_22_query); }

		private static final SubtypeQuery test_23_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("{!int}"));
		@Test public void test_23() { testInvalid(test_23_query); }

		private static final SubtypeQuery test_24_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!{any}"));
		@Test public void test_24() { testInvalid(test_24_query); }

		private static final SubtypeQuery test_25_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!{int}"));
		@Test public void test_25() { testInvalid(test_25_query); }

		private static final SubtypeQuery test_26_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!!any"));
		@Test public void test_26() { testInvalid(test_26_query); }

		private static final SubtypeQuery test_27_query = createSubtypeQuery(parseWhiley("int"),parseWhiley("!!int"));
		@Test public void test_27() { testValid(test_27_query); }

		private static final SubtypeQuery test_28_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("any"));
		@Test public void test_28() { testInvalid(test_28_query); }

		private static final SubtypeQuery test_29_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("int"));
		@Test public void test_29() { testInvalid(test_29_query); }

		private static final SubtypeQuery test_30_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{any}"));
		@Test public void test_30() { testValid(test_30_query); }

		private static final SubtypeQuery test_31_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{int}"));
		@Test public void test_31() { testValid(test_31_query); }

		private static final SubtypeQuery test_32_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!any"));
		@Test public void test_32() { testValid(test_32_query); }

		private static final SubtypeQuery test_33_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!int"));
		@Test public void test_33() { testInvalid(test_33_query); }

		private static final SubtypeQuery test_34_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{{any}}"));
		@Test public void test_34() { testValid(test_34_query); }

		private static final SubtypeQuery test_35_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{{int}}"));
		@Test public void test_35() { testValid(test_35_query); }

		private static final SubtypeQuery test_36_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{!any}"));
		@Test public void test_36() { testValid(test_36_query); }

		private static final SubtypeQuery test_37_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("{!int}"));
		@Test public void test_37() { testValid(test_37_query); }

		private static final SubtypeQuery test_38_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!{any}"));
		@Test public void test_38() { testInvalid(test_38_query); }

		private static final SubtypeQuery test_39_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!{int}"));
		@Test public void test_39() { testInvalid(test_39_query); }

		private static final SubtypeQuery test_40_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!!any"));
		@Test public void test_40() { testInvalid(test_40_query); }

		private static final SubtypeQuery test_41_query = createSubtypeQuery(parseWhiley("{any}"),parseWhiley("!!int"));
		@Test public void test_41() { testInvalid(test_41_query); }

		private static final SubtypeQuery test_42_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("any"));
		@Test public void test_42() { testInvalid(test_42_query); }

		private static final SubtypeQuery test_43_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("int"));
		@Test public void test_43() { testInvalid(test_43_query); }

		private static final SubtypeQuery test_44_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{any}"));
		@Test public void test_44() { testInvalid(test_44_query); }

		private static final SubtypeQuery test_45_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{int}"));
		@Test public void test_45() { testValid(test_45_query); }

		private static final SubtypeQuery test_46_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!any"));
		@Test public void test_46() { testValid(test_46_query); }

		private static final SubtypeQuery test_47_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!int"));
		@Test public void test_47() { testInvalid(test_47_query); }

		private static final SubtypeQuery test_48_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{{any}}"));
		@Test public void test_48() { testInvalid(test_48_query); }

		private static final SubtypeQuery test_49_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{{int}}"));
		@Test public void test_49() { testInvalid(test_49_query); }

		private static final SubtypeQuery test_50_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{!any}"));
		@Test public void test_50() { testValid(test_50_query); }

		private static final SubtypeQuery test_51_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("{!int}"));
		@Test public void test_51() { testInvalid(test_51_query); }

		private static final SubtypeQuery test_52_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!{any}"));
		@Test public void test_52() { testInvalid(test_52_query); }

		private static final SubtypeQuery test_53_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!{int}"));
		@Test public void test_53() { testInvalid(test_53_query); }

		private static final SubtypeQuery test_54_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!!any"));
		@Test public void test_54() { testInvalid(test_54_query); }

		private static final SubtypeQuery test_55_query = createSubtypeQuery(parseWhiley("{int}"),parseWhiley("!!int"));
		@Test public void test_55() { testInvalid(test_55_query); }

		private static final SubtypeQuery test_56_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("any"));
		@Test public void test_56() { testInvalid(test_56_query); }

		private static final SubtypeQuery test_57_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("int"));
		@Test public void test_57() { testInvalid(test_57_query); }

		private static final SubtypeQuery test_58_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{any}"));
		@Test public void test_58() { testInvalid(test_58_query); }

		private static final SubtypeQuery test_59_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{int}"));
		@Test public void test_59() { testInvalid(test_59_query); }

		private static final SubtypeQuery test_60_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!any"));
		@Test public void test_60() { testValid(test_60_query); }

		private static final SubtypeQuery test_61_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!int"));
		@Test public void test_61() { testInvalid(test_61_query); }

		private static final SubtypeQuery test_62_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{{any}}"));
		@Test public void test_62() { testInvalid(test_62_query); }

		private static final SubtypeQuery test_63_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{{int}}"));
		@Test public void test_63() { testInvalid(test_63_query); }

		private static final SubtypeQuery test_64_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{!any}"));
		@Test public void test_64() { testValid(test_64_query); }

		private static final SubtypeQuery test_65_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("{!int}"));
		@Test public void test_65() { testInvalid(test_65_query); }

		private static final SubtypeQuery test_66_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!{any}"));
		@Test public void test_66() { testInvalid(test_66_query); }

		private static final SubtypeQuery test_67_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!{int}"));
		@Test public void test_67() { testInvalid(test_67_query); }

		private static final SubtypeQuery test_68_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!!any"));
		@Test public void test_68() { testInvalid(test_68_query); }

		private static final SubtypeQuery test_69_query = createSubtypeQuery(parseWhiley("!any"),parseWhiley("!!int"));
		@Test public void test_69() { testInvalid(test_69_query); }

		private static final SubtypeQuery test_70_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("any"));
		@Test public void test_70() { testInvalid(test_70_query); }

		private static final SubtypeQuery test_71_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("int"));
		@Test public void test_71() { testInvalid(test_71_query); }

		private static final SubtypeQuery test_72_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{any}"));
		@Test public void test_72() { testValid(test_72_query); }

		private static final SubtypeQuery test_73_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{int}"));
		@Test public void test_73() { testValid(test_73_query); }

		private static final SubtypeQuery test_74_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!any"));
		@Test public void test_74() { testValid(test_74_query); }

		private static final SubtypeQuery test_75_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!int"));
		@Test public void test_75() { testValid(test_75_query); }

		private static final SubtypeQuery test_76_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{{any}}"));
		@Test public void test_76() { testValid(test_76_query); }

		private static final SubtypeQuery test_77_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{{int}}"));
		@Test public void test_77() { testValid(test_77_query); }

		private static final SubtypeQuery test_78_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{!any}"));
		@Test public void test_78() { testValid(test_78_query); }

		private static final SubtypeQuery test_79_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("{!int}"));
		@Test public void test_79() { testValid(test_79_query); }

		private static final SubtypeQuery test_80_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!{any}"));
		@Test public void test_80() { testInvalid(test_80_query); }

		private static final SubtypeQuery test_81_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!{int}"));
		@Test public void test_81() { testInvalid(test_81_query); }

		private static final SubtypeQuery test_82_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!!any"));
		@Test public void test_82() { testInvalid(test_82_query); }

		private static final SubtypeQuery test_83_query = createSubtypeQuery(parseWhiley("!int"),parseWhiley("!!int"));
		@Test public void test_83() { testInvalid(test_83_query); }

		private static final SubtypeQuery test_84_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("any"));
		@Test public void test_84() { testInvalid(test_84_query); }

		private static final SubtypeQuery test_85_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("int"));
		@Test public void test_85() { testInvalid(test_85_query); }

		private static final SubtypeQuery test_86_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{any}"));
		@Test public void test_86() { testInvalid(test_86_query); }

		private static final SubtypeQuery test_87_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{int}"));
		@Test public void test_87() { testInvalid(test_87_query); }

		private static final SubtypeQuery test_88_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!any"));
		@Test public void test_88() { testValid(test_88_query); }

		private static final SubtypeQuery test_89_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!int"));
		@Test public void test_89() { testInvalid(test_89_query); }

		private static final SubtypeQuery test_90_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{{any}}"));
		@Test public void test_90() { testValid(test_90_query); }

		private static final SubtypeQuery test_91_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{{int}}"));
		@Test public void test_91() { testValid(test_91_query); }

		private static final SubtypeQuery test_92_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{!any}"));
		@Test public void test_92() { testValid(test_92_query); }

		private static final SubtypeQuery test_93_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("{!int}"));
		@Test public void test_93() { testInvalid(test_93_query); }

		private static final SubtypeQuery test_94_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!{any}"));
		@Test public void test_94() { testInvalid(test_94_query); }

		private static final SubtypeQuery test_95_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!{int}"));
		@Test public void test_95() { testInvalid(test_95_query); }

		private static final SubtypeQuery test_96_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!!any"));
		@Test public void test_96() { testInvalid(test_96_query); }

		private static final SubtypeQuery test_97_query = createSubtypeQuery(parseWhiley("{{any}}"),parseWhiley("!!int"));
		@Test public void test_97() { testInvalid(test_97_query); }

		private static final SubtypeQuery test_98_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("any"));
		@Test public void test_98() { testInvalid(test_98_query); }

		private static final SubtypeQuery test_99_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("int"));
		@Test public void test_99() { testInvalid(test_99_query); }

		private static final SubtypeQuery test_100_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{any}"));
		@Test public void test_100() { testInvalid(test_100_query); }

		private static final SubtypeQuery test_101_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{int}"));
		@Test public void test_101() { testInvalid(test_101_query); }

		private static final SubtypeQuery test_102_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!any"));
		@Test public void test_102() { testValid(test_102_query); }

		private static final SubtypeQuery test_103_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!int"));
		@Test public void test_103() { testInvalid(test_103_query); }

		private static final SubtypeQuery test_104_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{{any}}"));
		@Test public void test_104() { testInvalid(test_104_query); }

		private static final SubtypeQuery test_105_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{{int}}"));
		@Test public void test_105() { testValid(test_105_query); }

		private static final SubtypeQuery test_106_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{!any}"));
		@Test public void test_106() { testValid(test_106_query); }

		private static final SubtypeQuery test_107_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("{!int}"));
		@Test public void test_107() { testInvalid(test_107_query); }

		private static final SubtypeQuery test_108_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!{any}"));
		@Test public void test_108() { testInvalid(test_108_query); }

		private static final SubtypeQuery test_109_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!{int}"));
		@Test public void test_109() { testInvalid(test_109_query); }

		private static final SubtypeQuery test_110_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!!any"));
		@Test public void test_110() { testInvalid(test_110_query); }

		private static final SubtypeQuery test_111_query = createSubtypeQuery(parseWhiley("{{int}}"),parseWhiley("!!int"));
		@Test public void test_111() { testInvalid(test_111_query); }

		private static final SubtypeQuery test_112_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("any"));
		@Test public void test_112() { testInvalid(test_112_query); }

		private static final SubtypeQuery test_113_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("int"));
		@Test public void test_113() { testInvalid(test_113_query); }

		private static final SubtypeQuery test_114_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{any}"));
		@Test public void test_114() { testInvalid(test_114_query); }

		private static final SubtypeQuery test_115_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{int}"));
		@Test public void test_115() { testInvalid(test_115_query); }

		private static final SubtypeQuery test_116_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!any"));
		@Test public void test_116() { testValid(test_116_query); }

		private static final SubtypeQuery test_117_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!int"));
		@Test public void test_117() { testInvalid(test_117_query); }

		private static final SubtypeQuery test_118_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{{any}}"));
		@Test public void test_118() { testInvalid(test_118_query); }

		private static final SubtypeQuery test_119_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{{int}}"));
		@Test public void test_119() { testInvalid(test_119_query); }

		private static final SubtypeQuery test_120_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{!any}"));
		@Test public void test_120() { testValid(test_120_query); }

		private static final SubtypeQuery test_121_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("{!int}"));
		@Test public void test_121() { testInvalid(test_121_query); }

		private static final SubtypeQuery test_122_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!{any}"));
		@Test public void test_122() { testInvalid(test_122_query); }

		private static final SubtypeQuery test_123_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!{int}"));
		@Test public void test_123() { testInvalid(test_123_query); }

		private static final SubtypeQuery test_124_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!!any"));
		@Test public void test_124() { testInvalid(test_124_query); }

		private static final SubtypeQuery test_125_query = createSubtypeQuery(parseWhiley("{!any}"),parseWhiley("!!int"));
		@Test public void test_125() { testInvalid(test_125_query); }

		private static final SubtypeQuery test_126_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("any"));
		@Test public void test_126() { testInvalid(test_126_query); }

		private static final SubtypeQuery test_127_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("int"));
		@Test public void test_127() { testInvalid(test_127_query); }

		private static final SubtypeQuery test_128_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{any}"));
		@Test public void test_128() { testInvalid(test_128_query); }

		private static final SubtypeQuery test_129_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{int}"));
		@Test public void test_129() { testInvalid(test_129_query); }

		private static final SubtypeQuery test_130_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!any"));
		@Test public void test_130() { testValid(test_130_query); }

		private static final SubtypeQuery test_131_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!int"));
		@Test public void test_131() { testInvalid(test_131_query); }

		private static final SubtypeQuery test_132_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{{any}}"));
		@Test public void test_132() { testValid(test_132_query); }

		private static final SubtypeQuery test_133_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{{int}}"));
		@Test public void test_133() { testValid(test_133_query); }

		private static final SubtypeQuery test_134_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{!any}"));
		@Test public void test_134() { testValid(test_134_query); }

		private static final SubtypeQuery test_135_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("{!int}"));
		@Test public void test_135() { testValid(test_135_query); }

		private static final SubtypeQuery test_136_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!{any}"));
		@Test public void test_136() { testInvalid(test_136_query); }

		private static final SubtypeQuery test_137_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!{int}"));
		@Test public void test_137() { testInvalid(test_137_query); }

		private static final SubtypeQuery test_138_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!!any"));
		@Test public void test_138() { testInvalid(test_138_query); }

		private static final SubtypeQuery test_139_query = createSubtypeQuery(parseWhiley("{!int}"),parseWhiley("!!int"));
		@Test public void test_139() { testInvalid(test_139_query); }

		private static final SubtypeQuery test_140_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("any"));
		@Test public void test_140() { testInvalid(test_140_query); }

		private static final SubtypeQuery test_141_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("int"));
		@Test public void test_141() { testValid(test_141_query); }

		private static final SubtypeQuery test_142_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{any}"));
		@Test public void test_142() { testInvalid(test_142_query); }

		private static final SubtypeQuery test_143_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{int}"));
		@Test public void test_143() { testInvalid(test_143_query); }

		private static final SubtypeQuery test_144_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!any"));
		@Test public void test_144() { testValid(test_144_query); }

		private static final SubtypeQuery test_145_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!int"));
		@Test public void test_145() { testInvalid(test_145_query); }

		private static final SubtypeQuery test_146_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{{any}}"));
		@Test public void test_146() { testInvalid(test_146_query); }

		private static final SubtypeQuery test_147_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{{int}}"));
		@Test public void test_147() { testInvalid(test_147_query); }

		private static final SubtypeQuery test_148_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{!any}"));
		@Test public void test_148() { testValid(test_148_query); }

		private static final SubtypeQuery test_149_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("{!int}"));
		@Test public void test_149() { testInvalid(test_149_query); }

		private static final SubtypeQuery test_150_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!{any}"));
		@Test public void test_150() { testValid(test_150_query); }

		private static final SubtypeQuery test_151_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!{int}"));
		@Test public void test_151() { testInvalid(test_151_query); }

		private static final SubtypeQuery test_152_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!!any"));
		@Test public void test_152() { testInvalid(test_152_query); }

		private static final SubtypeQuery test_153_query = createSubtypeQuery(parseWhiley("!{any}"),parseWhiley("!!int"));
		@Test public void test_153() { testValid(test_153_query); }

		private static final SubtypeQuery test_154_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("any"));
		@Test public void test_154() { testInvalid(test_154_query); }

		private static final SubtypeQuery test_155_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("int"));
		@Test public void test_155() { testValid(test_155_query); }

		private static final SubtypeQuery test_156_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{any}"));
		@Test public void test_156() { testInvalid(test_156_query); }

		private static final SubtypeQuery test_157_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{int}"));
		@Test public void test_157() { testInvalid(test_157_query); }

		private static final SubtypeQuery test_158_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!any"));
		@Test public void test_158() { testValid(test_158_query); }

		private static final SubtypeQuery test_159_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!int"));
		@Test public void test_159() { testInvalid(test_159_query); }

		private static final SubtypeQuery test_160_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{{any}}"));
		@Test public void test_160() { testValid(test_160_query); }

		private static final SubtypeQuery test_161_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{{int}}"));
		@Test public void test_161() { testValid(test_161_query); }

		private static final SubtypeQuery test_162_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{!any}"));
		@Test public void test_162() { testValid(test_162_query); }

		private static final SubtypeQuery test_163_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("{!int}"));
		@Test public void test_163() { testValid(test_163_query); }

		private static final SubtypeQuery test_164_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!{any}"));
		@Test public void test_164() { testValid(test_164_query); }

		private static final SubtypeQuery test_165_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!{int}"));
		@Test public void test_165() { testValid(test_165_query); }

		private static final SubtypeQuery test_166_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!!any"));
		@Test public void test_166() { testInvalid(test_166_query); }

		private static final SubtypeQuery test_167_query = createSubtypeQuery(parseWhiley("!{int}"),parseWhiley("!!int"));
		@Test public void test_167() { testValid(test_167_query); }

		private static final SubtypeQuery test_168_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("any"));
		@Test public void test_168() { testValid(test_168_query); }

		private static final SubtypeQuery test_169_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("int"));
		@Test public void test_169() { testValid(test_169_query); }

		private static final SubtypeQuery test_170_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{any}"));
		@Test public void test_170() { testValid(test_170_query); }

		private static final SubtypeQuery test_171_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{int}"));
		@Test public void test_171() { testValid(test_171_query); }

		private static final SubtypeQuery test_172_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!any"));
		@Test public void test_172() { testValid(test_172_query); }

		private static final SubtypeQuery test_173_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!int"));
		@Test public void test_173() { testValid(test_173_query); }

		private static final SubtypeQuery test_174_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{{any}}"));
		@Test public void test_174() { testValid(test_174_query); }

		private static final SubtypeQuery test_175_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{{int}}"));
		@Test public void test_175() { testValid(test_175_query); }

		private static final SubtypeQuery test_176_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{!any}"));
		@Test public void test_176() { testValid(test_176_query); }

		private static final SubtypeQuery test_177_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("{!int}"));
		@Test public void test_177() { testValid(test_177_query); }

		private static final SubtypeQuery test_178_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!{any}"));
		@Test public void test_178() { testValid(test_178_query); }

		private static final SubtypeQuery test_179_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!{int}"));
		@Test public void test_179() { testValid(test_179_query); }

		private static final SubtypeQuery test_180_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!!any"));
		@Test public void test_180() { testValid(test_180_query); }

		private static final SubtypeQuery test_181_query = createSubtypeQuery(parseWhiley("!!any"),parseWhiley("!!int"));
		@Test public void test_181() { testValid(test_181_query); }

		private static final SubtypeQuery test_182_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("any"));
		@Test public void test_182() { testInvalid(test_182_query); }

		private static final SubtypeQuery test_183_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("int"));
		@Test public void test_183() { testValid(test_183_query); }

		private static final SubtypeQuery test_184_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{any}"));
		@Test public void test_184() { testInvalid(test_184_query); }

		private static final SubtypeQuery test_185_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{int}"));
		@Test public void test_185() { testInvalid(test_185_query); }

		private static final SubtypeQuery test_186_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!any"));
		@Test public void test_186() { testValid(test_186_query); }

		private static final SubtypeQuery test_187_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!int"));
		@Test public void test_187() { testInvalid(test_187_query); }

		private static final SubtypeQuery test_188_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{{any}}"));
		@Test public void test_188() { testInvalid(test_188_query); }

		private static final SubtypeQuery test_189_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{{int}}"));
		@Test public void test_189() { testInvalid(test_189_query); }

		private static final SubtypeQuery test_190_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{!any}"));
		@Test public void test_190() { testValid(test_190_query); }

		private static final SubtypeQuery test_191_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("{!int}"));
		@Test public void test_191() { testInvalid(test_191_query); }

		private static final SubtypeQuery test_192_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!{any}"));
		@Test public void test_192() { testInvalid(test_192_query); }

		private static final SubtypeQuery test_193_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!{int}"));
		@Test public void test_193() { testInvalid(test_193_query); }

		private static final SubtypeQuery test_194_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!!any"));
		@Test public void test_194() { testInvalid(test_194_query); }

		private static final SubtypeQuery test_195_query = createSubtypeQuery(parseWhiley("!!int"),parseWhiley("!!int"));
		@Test public void test_195() { testValid(test_195_query); }

	}
}
