import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import types.testing.AbstractTestSuite;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSuite_1_2 extends AbstractTestSuite {
	public static class Part_0 {
		@Test public void test_0() { testValid("any","any"); }
		@Test public void test_1() { testValid("any","int"); }
		@Test public void test_2() { testValid("any","{any}"); }
		@Test public void test_3() { testValid("any","{int}"); }
		@Test public void test_4() { testValid("any","!any"); }
		@Test public void test_5() { testValid("any","!int"); }
		@Test public void test_6() { testValid("any","{any, any}"); }
		@Test public void test_7() { testValid("any","{int, any}"); }
		@Test public void test_8() { testValid("any","{any, int}"); }
		@Test public void test_9() { testValid("any","{int, int}"); }
		@Test public void test_10() { testValid("any","(any | any)"); }
		@Test public void test_11() { testValid("any","(int | any)"); }
		@Test public void test_12() { testValid("any","(any | int)"); }
		@Test public void test_13() { testValid("any","(int | int)"); }
		@Test public void test_14() { testValid("any","(any & any)"); }
		@Test public void test_15() { testValid("any","(int & any)"); }
		@Test public void test_16() { testValid("any","(any & int)"); }
		@Test public void test_17() { testValid("any","(int & int)"); }
		@Test public void test_18() { testInvalid("int","any"); }
		@Test public void test_19() { testValid("int","int"); }
		@Test public void test_20() { testInvalid("int","{any}"); }
		@Test public void test_21() { testInvalid("int","{int}"); }
		@Test public void test_22() { testValid("int","!any"); }
		@Test public void test_23() { testInvalid("int","!int"); }
		@Test public void test_24() { testInvalid("int","{any, any}"); }
		@Test public void test_25() { testInvalid("int","{int, any}"); }
		@Test public void test_26() { testInvalid("int","{any, int}"); }
		@Test public void test_27() { testInvalid("int","{int, int}"); }
		@Test public void test_28() { testInvalid("int","(any | any)"); }
		@Test public void test_29() { testInvalid("int","(int | any)"); }
		@Test public void test_30() { testInvalid("int","(any | int)"); }
		@Test public void test_31() { testValid("int","(int | int)"); }
		@Test public void test_32() { testInvalid("int","(any & any)"); }
		@Test public void test_33() { testValid("int","(int & any)"); }
		@Test public void test_34() { testValid("int","(any & int)"); }
		@Test public void test_35() { testValid("int","(int & int)"); }
		@Test public void test_36() { testInvalid("{any}","any"); }
		@Test public void test_37() { testInvalid("{any}","int"); }
		@Test public void test_38() { testValid("{any}","{any}"); }
		@Test public void test_39() { testValid("{any}","{int}"); }
		@Test public void test_40() { testValid("{any}","!any"); }
		@Test public void test_41() { testInvalid("{any}","!int"); }
		@Test public void test_42() { testInvalid("{any}","{any, any}"); }
		@Test public void test_43() { testInvalid("{any}","{int, any}"); }
		@Test public void test_44() { testInvalid("{any}","{any, int}"); }
		@Test public void test_45() { testInvalid("{any}","{int, int}"); }
		@Test public void test_46() { testInvalid("{any}","(any | any)"); }
		@Test public void test_47() { testInvalid("{any}","(int | any)"); }
		@Test public void test_48() { testInvalid("{any}","(any | int)"); }
		@Test public void test_49() { testInvalid("{any}","(int | int)"); }
		@Test public void test_50() { testInvalid("{any}","(any & any)"); }
		@Test public void test_51() { testInvalid("{any}","(int & any)"); }
		@Test public void test_52() { testInvalid("{any}","(any & int)"); }
		@Test public void test_53() { testInvalid("{any}","(int & int)"); }
		@Test public void test_54() { testInvalid("{int}","any"); }
		@Test public void test_55() { testInvalid("{int}","int"); }
		@Test public void test_56() { testInvalid("{int}","{any}"); }
		@Test public void test_57() { testValid("{int}","{int}"); }
		@Test public void test_58() { testValid("{int}","!any"); }
		@Test public void test_59() { testInvalid("{int}","!int"); }
		@Test public void test_60() { testInvalid("{int}","{any, any}"); }
		@Test public void test_61() { testInvalid("{int}","{int, any}"); }
		@Test public void test_62() { testInvalid("{int}","{any, int}"); }
		@Test public void test_63() { testInvalid("{int}","{int, int}"); }
		@Test public void test_64() { testInvalid("{int}","(any | any)"); }
		@Test public void test_65() { testInvalid("{int}","(int | any)"); }
		@Test public void test_66() { testInvalid("{int}","(any | int)"); }
		@Test public void test_67() { testInvalid("{int}","(int | int)"); }
		@Test public void test_68() { testInvalid("{int}","(any & any)"); }
		@Test public void test_69() { testInvalid("{int}","(int & any)"); }
		@Test public void test_70() { testInvalid("{int}","(any & int)"); }
		@Test public void test_71() { testInvalid("{int}","(int & int)"); }
		@Test public void test_72() { testInvalid("!any","any"); }
		@Test public void test_73() { testInvalid("!any","int"); }
		@Test public void test_74() { testInvalid("!any","{any}"); }
		@Test public void test_75() { testInvalid("!any","{int}"); }
		@Test public void test_76() { testValid("!any","!any"); }
		@Test public void test_77() { testInvalid("!any","!int"); }
		@Test public void test_78() { testInvalid("!any","{any, any}"); }
		@Test public void test_79() { testInvalid("!any","{int, any}"); }
		@Test public void test_80() { testInvalid("!any","{any, int}"); }
		@Test public void test_81() { testInvalid("!any","{int, int}"); }
		@Test public void test_82() { testInvalid("!any","(any | any)"); }
		@Test public void test_83() { testInvalid("!any","(int | any)"); }
		@Test public void test_84() { testInvalid("!any","(any | int)"); }
		@Test public void test_85() { testInvalid("!any","(int | int)"); }
		@Test public void test_86() { testInvalid("!any","(any & any)"); }
		@Test public void test_87() { testInvalid("!any","(int & any)"); }
		@Test public void test_88() { testInvalid("!any","(any & int)"); }
		@Test public void test_89() { testInvalid("!any","(int & int)"); }
		@Test public void test_90() { testInvalid("!int","any"); }
		@Test public void test_91() { testInvalid("!int","int"); }
		@Test public void test_92() { testValid("!int","{any}"); }
		@Test public void test_93() { testValid("!int","{int}"); }
		@Test public void test_94() { testValid("!int","!any"); }
		@Test public void test_95() { testValid("!int","!int"); }
		@Test public void test_96() { testValid("!int","{any, any}"); }
		@Test public void test_97() { testValid("!int","{int, any}"); }
		@Test public void test_98() { testValid("!int","{any, int}"); }
		@Test public void test_99() { testValid("!int","{int, int}"); }
		@Test public void test_100() { testInvalid("!int","(any | any)"); }
		@Test public void test_101() { testInvalid("!int","(int | any)"); }
		@Test public void test_102() { testInvalid("!int","(any | int)"); }
		@Test public void test_103() { testInvalid("!int","(int | int)"); }
		@Test public void test_104() { testInvalid("!int","(any & any)"); }
		@Test public void test_105() { testInvalid("!int","(int & any)"); }
		@Test public void test_106() { testInvalid("!int","(any & int)"); }
		@Test public void test_107() { testInvalid("!int","(int & int)"); }
		@Test public void test_108() { testInvalid("{any, any}","any"); }
		@Test public void test_109() { testInvalid("{any, any}","int"); }
		@Test public void test_110() { testInvalid("{any, any}","{any}"); }
		@Test public void test_111() { testInvalid("{any, any}","{int}"); }
		@Test public void test_112() { testValid("{any, any}","!any"); }
		@Test public void test_113() { testInvalid("{any, any}","!int"); }
		@Test public void test_114() { testValid("{any, any}","{any, any}"); }
		@Test public void test_115() { testValid("{any, any}","{int, any}"); }
		@Test public void test_116() { testValid("{any, any}","{any, int}"); }
		@Test public void test_117() { testValid("{any, any}","{int, int}"); }
		@Test public void test_118() { testInvalid("{any, any}","(any | any)"); }
		@Test public void test_119() { testInvalid("{any, any}","(int | any)"); }
		@Test public void test_120() { testInvalid("{any, any}","(any | int)"); }
		@Test public void test_121() { testInvalid("{any, any}","(int | int)"); }
		@Test public void test_122() { testInvalid("{any, any}","(any & any)"); }
		@Test public void test_123() { testInvalid("{any, any}","(int & any)"); }
		@Test public void test_124() { testInvalid("{any, any}","(any & int)"); }
		@Test public void test_125() { testInvalid("{any, any}","(int & int)"); }
		@Test public void test_126() { testInvalid("{int, any}","any"); }
		@Test public void test_127() { testInvalid("{int, any}","int"); }
		@Test public void test_128() { testInvalid("{int, any}","{any}"); }
		@Test public void test_129() { testInvalid("{int, any}","{int}"); }
		@Test public void test_130() { testValid("{int, any}","!any"); }
		@Test public void test_131() { testInvalid("{int, any}","!int"); }
		@Test public void test_132() { testInvalid("{int, any}","{any, any}"); }
		@Test public void test_133() { testValid("{int, any}","{int, any}"); }
		@Test public void test_134() { testInvalid("{int, any}","{any, int}"); }
		@Test public void test_135() { testValid("{int, any}","{int, int}"); }
		@Test public void test_136() { testInvalid("{int, any}","(any | any)"); }
		@Test public void test_137() { testInvalid("{int, any}","(int | any)"); }
		@Test public void test_138() { testInvalid("{int, any}","(any | int)"); }
		@Test public void test_139() { testInvalid("{int, any}","(int | int)"); }
		@Test public void test_140() { testInvalid("{int, any}","(any & any)"); }
		@Test public void test_141() { testInvalid("{int, any}","(int & any)"); }
		@Test public void test_142() { testInvalid("{int, any}","(any & int)"); }
		@Test public void test_143() { testInvalid("{int, any}","(int & int)"); }
		@Test public void test_144() { testInvalid("{any, int}","any"); }
		@Test public void test_145() { testInvalid("{any, int}","int"); }
		@Test public void test_146() { testInvalid("{any, int}","{any}"); }
		@Test public void test_147() { testInvalid("{any, int}","{int}"); }
		@Test public void test_148() { testValid("{any, int}","!any"); }
		@Test public void test_149() { testInvalid("{any, int}","!int"); }
		@Test public void test_150() { testInvalid("{any, int}","{any, any}"); }
		@Test public void test_151() { testInvalid("{any, int}","{int, any}"); }
		@Test public void test_152() { testValid("{any, int}","{any, int}"); }
		@Test public void test_153() { testValid("{any, int}","{int, int}"); }
		@Test public void test_154() { testInvalid("{any, int}","(any | any)"); }
		@Test public void test_155() { testInvalid("{any, int}","(int | any)"); }
		@Test public void test_156() { testInvalid("{any, int}","(any | int)"); }
		@Test public void test_157() { testInvalid("{any, int}","(int | int)"); }
		@Test public void test_158() { testInvalid("{any, int}","(any & any)"); }
		@Test public void test_159() { testInvalid("{any, int}","(int & any)"); }
		@Test public void test_160() { testInvalid("{any, int}","(any & int)"); }
		@Test public void test_161() { testInvalid("{any, int}","(int & int)"); }
		@Test public void test_162() { testInvalid("{int, int}","any"); }
		@Test public void test_163() { testInvalid("{int, int}","int"); }
		@Test public void test_164() { testInvalid("{int, int}","{any}"); }
		@Test public void test_165() { testInvalid("{int, int}","{int}"); }
		@Test public void test_166() { testValid("{int, int}","!any"); }
		@Test public void test_167() { testInvalid("{int, int}","!int"); }
		@Test public void test_168() { testInvalid("{int, int}","{any, any}"); }
		@Test public void test_169() { testInvalid("{int, int}","{int, any}"); }
		@Test public void test_170() { testInvalid("{int, int}","{any, int}"); }
		@Test public void test_171() { testValid("{int, int}","{int, int}"); }
		@Test public void test_172() { testInvalid("{int, int}","(any | any)"); }
		@Test public void test_173() { testInvalid("{int, int}","(int | any)"); }
		@Test public void test_174() { testInvalid("{int, int}","(any | int)"); }
		@Test public void test_175() { testInvalid("{int, int}","(int | int)"); }
		@Test public void test_176() { testInvalid("{int, int}","(any & any)"); }
		@Test public void test_177() { testInvalid("{int, int}","(int & any)"); }
		@Test public void test_178() { testInvalid("{int, int}","(any & int)"); }
		@Test public void test_179() { testInvalid("{int, int}","(int & int)"); }
		@Test public void test_180() { testValid("(any | any)","any"); }
		@Test public void test_181() { testValid("(any | any)","int"); }
		@Test public void test_182() { testValid("(any | any)","{any}"); }
		@Test public void test_183() { testValid("(any | any)","{int}"); }
		@Test public void test_184() { testValid("(any | any)","!any"); }
		@Test public void test_185() { testValid("(any | any)","!int"); }
		@Test public void test_186() { testValid("(any | any)","{any, any}"); }
		@Test public void test_187() { testValid("(any | any)","{int, any}"); }
		@Test public void test_188() { testValid("(any | any)","{any, int}"); }
		@Test public void test_189() { testValid("(any | any)","{int, int}"); }
		@Test public void test_190() { testValid("(any | any)","(any | any)"); }
		@Test public void test_191() { testValid("(any | any)","(int | any)"); }
		@Test public void test_192() { testValid("(any | any)","(any | int)"); }
		@Test public void test_193() { testValid("(any | any)","(int | int)"); }
		@Test public void test_194() { testValid("(any | any)","(any & any)"); }
		@Test public void test_195() { testValid("(any | any)","(int & any)"); }
		@Test public void test_196() { testValid("(any | any)","(any & int)"); }
		@Test public void test_197() { testValid("(any | any)","(int & int)"); }
		@Test public void test_198() { testValid("(int | any)","any"); }
		@Test public void test_199() { testValid("(int | any)","int"); }
		@Test public void test_200() { testValid("(int | any)","{any}"); }
		@Test public void test_201() { testValid("(int | any)","{int}"); }
		@Test public void test_202() { testValid("(int | any)","!any"); }
		@Test public void test_203() { testValid("(int | any)","!int"); }
		@Test public void test_204() { testValid("(int | any)","{any, any}"); }
		@Test public void test_205() { testValid("(int | any)","{int, any}"); }
		@Test public void test_206() { testValid("(int | any)","{any, int}"); }
		@Test public void test_207() { testValid("(int | any)","{int, int}"); }
		@Test public void test_208() { testValid("(int | any)","(any | any)"); }
		@Test public void test_209() { testValid("(int | any)","(int | any)"); }
		@Test public void test_210() { testValid("(int | any)","(any | int)"); }
		@Test public void test_211() { testValid("(int | any)","(int | int)"); }
		@Test public void test_212() { testValid("(int | any)","(any & any)"); }
		@Test public void test_213() { testValid("(int | any)","(int & any)"); }
		@Test public void test_214() { testValid("(int | any)","(any & int)"); }
		@Test public void test_215() { testValid("(int | any)","(int & int)"); }
		@Test public void test_216() { testValid("(any | int)","any"); }
		@Test public void test_217() { testValid("(any | int)","int"); }
		@Test public void test_218() { testValid("(any | int)","{any}"); }
		@Test public void test_219() { testValid("(any | int)","{int}"); }
		@Test public void test_220() { testValid("(any | int)","!any"); }
		@Test public void test_221() { testValid("(any | int)","!int"); }
		@Test public void test_222() { testValid("(any | int)","{any, any}"); }
		@Test public void test_223() { testValid("(any | int)","{int, any}"); }
		@Test public void test_224() { testValid("(any | int)","{any, int}"); }
		@Test public void test_225() { testValid("(any | int)","{int, int}"); }
		@Test public void test_226() { testValid("(any | int)","(any | any)"); }
		@Test public void test_227() { testValid("(any | int)","(int | any)"); }
		@Test public void test_228() { testValid("(any | int)","(any | int)"); }
		@Test public void test_229() { testValid("(any | int)","(int | int)"); }
		@Test public void test_230() { testValid("(any | int)","(any & any)"); }
		@Test public void test_231() { testValid("(any | int)","(int & any)"); }
		@Test public void test_232() { testValid("(any | int)","(any & int)"); }
		@Test public void test_233() { testValid("(any | int)","(int & int)"); }
		@Test public void test_234() { testInvalid("(int | int)","any"); }
		@Test public void test_235() { testValid("(int | int)","int"); }
		@Test public void test_236() { testInvalid("(int | int)","{any}"); }
		@Test public void test_237() { testInvalid("(int | int)","{int}"); }
		@Test public void test_238() { testValid("(int | int)","!any"); }
		@Test public void test_239() { testInvalid("(int | int)","!int"); }
		@Test public void test_240() { testInvalid("(int | int)","{any, any}"); }
		@Test public void test_241() { testInvalid("(int | int)","{int, any}"); }
		@Test public void test_242() { testInvalid("(int | int)","{any, int}"); }
		@Test public void test_243() { testInvalid("(int | int)","{int, int}"); }
		@Test public void test_244() { testInvalid("(int | int)","(any | any)"); }
		@Test public void test_245() { testInvalid("(int | int)","(int | any)"); }
		@Test public void test_246() { testInvalid("(int | int)","(any | int)"); }
		@Test public void test_247() { testValid("(int | int)","(int | int)"); }
		@Test public void test_248() { testInvalid("(int | int)","(any & any)"); }
		@Test public void test_249() { testValid("(int | int)","(int & any)"); }
		@Test public void test_250() { testValid("(int | int)","(any & int)"); }
		@Test public void test_251() { testValid("(int | int)","(int & int)"); }
		@Test public void test_252() { testValid("(any & any)","any"); }
		@Test public void test_253() { testValid("(any & any)","int"); }
		@Test public void test_254() { testValid("(any & any)","{any}"); }
		@Test public void test_255() { testValid("(any & any)","{int}"); }
		@Test public void test_256() { testValid("(any & any)","!any"); }
		@Test public void test_257() { testValid("(any & any)","!int"); }
		@Test public void test_258() { testValid("(any & any)","{any, any}"); }
		@Test public void test_259() { testValid("(any & any)","{int, any}"); }
		@Test public void test_260() { testValid("(any & any)","{any, int}"); }
		@Test public void test_261() { testValid("(any & any)","{int, int}"); }
		@Test public void test_262() { testValid("(any & any)","(any | any)"); }
		@Test public void test_263() { testValid("(any & any)","(int | any)"); }
		@Test public void test_264() { testValid("(any & any)","(any | int)"); }
		@Test public void test_265() { testValid("(any & any)","(int | int)"); }
		@Test public void test_266() { testValid("(any & any)","(any & any)"); }
		@Test public void test_267() { testValid("(any & any)","(int & any)"); }
		@Test public void test_268() { testValid("(any & any)","(any & int)"); }
		@Test public void test_269() { testValid("(any & any)","(int & int)"); }
		@Test public void test_270() { testInvalid("(int & any)","any"); }
		@Test public void test_271() { testValid("(int & any)","int"); }
		@Test public void test_272() { testInvalid("(int & any)","{any}"); }
		@Test public void test_273() { testInvalid("(int & any)","{int}"); }
		@Test public void test_274() { testValid("(int & any)","!any"); }
		@Test public void test_275() { testInvalid("(int & any)","!int"); }
		@Test public void test_276() { testInvalid("(int & any)","{any, any}"); }
		@Test public void test_277() { testInvalid("(int & any)","{int, any}"); }
		@Test public void test_278() { testInvalid("(int & any)","{any, int}"); }
		@Test public void test_279() { testInvalid("(int & any)","{int, int}"); }
		@Test public void test_280() { testInvalid("(int & any)","(any | any)"); }
		@Test public void test_281() { testInvalid("(int & any)","(int | any)"); }
		@Test public void test_282() { testInvalid("(int & any)","(any | int)"); }
		@Test public void test_283() { testValid("(int & any)","(int | int)"); }
		@Test public void test_284() { testInvalid("(int & any)","(any & any)"); }
		@Test public void test_285() { testValid("(int & any)","(int & any)"); }
		@Test public void test_286() { testValid("(int & any)","(any & int)"); }
		@Test public void test_287() { testValid("(int & any)","(int & int)"); }
		@Test public void test_288() { testInvalid("(any & int)","any"); }
		@Test public void test_289() { testValid("(any & int)","int"); }
		@Test public void test_290() { testInvalid("(any & int)","{any}"); }
		@Test public void test_291() { testInvalid("(any & int)","{int}"); }
		@Test public void test_292() { testValid("(any & int)","!any"); }
		@Test public void test_293() { testInvalid("(any & int)","!int"); }
		@Test public void test_294() { testInvalid("(any & int)","{any, any}"); }
		@Test public void test_295() { testInvalid("(any & int)","{int, any}"); }
		@Test public void test_296() { testInvalid("(any & int)","{any, int}"); }
		@Test public void test_297() { testInvalid("(any & int)","{int, int}"); }
		@Test public void test_298() { testInvalid("(any & int)","(any | any)"); }
		@Test public void test_299() { testInvalid("(any & int)","(int | any)"); }
		@Test public void test_300() { testInvalid("(any & int)","(any | int)"); }
		@Test public void test_301() { testValid("(any & int)","(int | int)"); }
		@Test public void test_302() { testInvalid("(any & int)","(any & any)"); }
		@Test public void test_303() { testValid("(any & int)","(int & any)"); }
		@Test public void test_304() { testValid("(any & int)","(any & int)"); }
		@Test public void test_305() { testValid("(any & int)","(int & int)"); }
		@Test public void test_306() { testInvalid("(int & int)","any"); }
		@Test public void test_307() { testValid("(int & int)","int"); }
		@Test public void test_308() { testInvalid("(int & int)","{any}"); }
		@Test public void test_309() { testInvalid("(int & int)","{int}"); }
		@Test public void test_310() { testValid("(int & int)","!any"); }
		@Test public void test_311() { testInvalid("(int & int)","!int"); }
		@Test public void test_312() { testInvalid("(int & int)","{any, any}"); }
		@Test public void test_313() { testInvalid("(int & int)","{int, any}"); }
		@Test public void test_314() { testInvalid("(int & int)","{any, int}"); }
		@Test public void test_315() { testInvalid("(int & int)","{int, int}"); }
		@Test public void test_316() { testInvalid("(int & int)","(any | any)"); }
		@Test public void test_317() { testInvalid("(int & int)","(int | any)"); }
		@Test public void test_318() { testInvalid("(int & int)","(any | int)"); }
		@Test public void test_319() { testValid("(int & int)","(int | int)"); }
		@Test public void test_320() { testInvalid("(int & int)","(any & any)"); }
		@Test public void test_321() { testValid("(int & int)","(int & any)"); }
		@Test public void test_322() { testValid("(int & int)","(any & int)"); }
		@Test public void test_323() { testValid("(int & int)","(int & int)"); }
	}
}
