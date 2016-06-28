import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import types.testing.AbstractTestSuite;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSuite_1_3 extends AbstractTestSuite {
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
		@Test public void test_18() { testValid("any","{any, any, any}"); }
		@Test public void test_19() { testValid("any","{int, any, any}"); }
		@Test public void test_20() { testValid("any","{any, int, any}"); }
		@Test public void test_21() { testValid("any","{int, int, any}"); }
		@Test public void test_22() { testValid("any","{any, any, int}"); }
		@Test public void test_23() { testValid("any","{int, any, int}"); }
		@Test public void test_24() { testValid("any","{any, int, int}"); }
		@Test public void test_25() { testValid("any","{int, int, int}"); }
		@Test public void test_26() { testValid("any","(any | any | any)"); }
		@Test public void test_27() { testValid("any","(int | any | any)"); }
		@Test public void test_28() { testValid("any","(any | int | any)"); }
		@Test public void test_29() { testValid("any","(int | int | any)"); }
		@Test public void test_30() { testValid("any","(any | any | int)"); }
		@Test public void test_31() { testValid("any","(int | any | int)"); }
		@Test public void test_32() { testValid("any","(any | int | int)"); }
		@Test public void test_33() { testValid("any","(int | int | int)"); }
		@Test public void test_34() { testValid("any","(any & any & any)"); }
		@Test public void test_35() { testValid("any","(int & any & any)"); }
		@Test public void test_36() { testValid("any","(any & int & any)"); }
		@Test public void test_37() { testValid("any","(int & int & any)"); }
		@Test public void test_38() { testValid("any","(any & any & int)"); }
		@Test public void test_39() { testValid("any","(int & any & int)"); }
		@Test public void test_40() { testValid("any","(any & int & int)"); }
		@Test public void test_41() { testValid("any","(int & int & int)"); }
		@Test public void test_42() { testInvalid("int","any"); }
		@Test public void test_43() { testValid("int","int"); }
		@Test public void test_44() { testInvalid("int","{any}"); }
		@Test public void test_45() { testInvalid("int","{int}"); }
		@Test public void test_46() { testValid("int","!any"); }
		@Test public void test_47() { testInvalid("int","!int"); }
		@Test public void test_48() { testInvalid("int","{any, any}"); }
		@Test public void test_49() { testInvalid("int","{int, any}"); }
		@Test public void test_50() { testInvalid("int","{any, int}"); }
		@Test public void test_51() { testInvalid("int","{int, int}"); }
		@Test public void test_52() { testInvalid("int","(any | any)"); }
		@Test public void test_53() { testInvalid("int","(int | any)"); }
		@Test public void test_54() { testInvalid("int","(any | int)"); }
		@Test public void test_55() { testValid("int","(int | int)"); }
		@Test public void test_56() { testInvalid("int","(any & any)"); }
		@Test public void test_57() { testValid("int","(int & any)"); }
		@Test public void test_58() { testValid("int","(any & int)"); }
		@Test public void test_59() { testValid("int","(int & int)"); }
		@Test public void test_60() { testInvalid("int","{any, any, any}"); }
		@Test public void test_61() { testInvalid("int","{int, any, any}"); }
		@Test public void test_62() { testInvalid("int","{any, int, any}"); }
		@Test public void test_63() { testInvalid("int","{int, int, any}"); }
		@Test public void test_64() { testInvalid("int","{any, any, int}"); }
		@Test public void test_65() { testInvalid("int","{int, any, int}"); }
		@Test public void test_66() { testInvalid("int","{any, int, int}"); }
		@Test public void test_67() { testInvalid("int","{int, int, int}"); }
		@Test public void test_68() { testInvalid("int","(any | any | any)"); }
		@Test public void test_69() { testInvalid("int","(int | any | any)"); }
		@Test public void test_70() { testInvalid("int","(any | int | any)"); }
		@Test public void test_71() { testInvalid("int","(int | int | any)"); }
		@Test public void test_72() { testInvalid("int","(any | any | int)"); }
		@Test public void test_73() { testInvalid("int","(int | any | int)"); }
		@Test public void test_74() { testInvalid("int","(any | int | int)"); }
		@Test public void test_75() { testValid("int","(int | int | int)"); }
		@Test public void test_76() { testInvalid("int","(any & any & any)"); }
		@Test public void test_77() { testValid("int","(int & any & any)"); }
		@Test public void test_78() { testValid("int","(any & int & any)"); }
		@Test public void test_79() { testValid("int","(int & int & any)"); }
		@Test public void test_80() { testValid("int","(any & any & int)"); }
		@Test public void test_81() { testValid("int","(int & any & int)"); }
		@Test public void test_82() { testValid("int","(any & int & int)"); }
		@Test public void test_83() { testValid("int","(int & int & int)"); }
		@Test public void test_84() { testInvalid("{any}","any"); }
		@Test public void test_85() { testInvalid("{any}","int"); }
		@Test public void test_86() { testValid("{any}","{any}"); }
		@Test public void test_87() { testValid("{any}","{int}"); }
		@Test public void test_88() { testValid("{any}","!any"); }
		@Test public void test_89() { testInvalid("{any}","!int"); }
		@Test public void test_90() { testInvalid("{any}","{any, any}"); }
		@Test public void test_91() { testInvalid("{any}","{int, any}"); }
		@Test public void test_92() { testInvalid("{any}","{any, int}"); }
		@Test public void test_93() { testInvalid("{any}","{int, int}"); }
		@Test public void test_94() { testInvalid("{any}","(any | any)"); }
		@Test public void test_95() { testInvalid("{any}","(int | any)"); }
		@Test public void test_96() { testInvalid("{any}","(any | int)"); }
		@Test public void test_97() { testInvalid("{any}","(int | int)"); }
		@Test public void test_98() { testInvalid("{any}","(any & any)"); }
		@Test public void test_99() { testInvalid("{any}","(int & any)"); }
		@Test public void test_100() { testInvalid("{any}","(any & int)"); }
		@Test public void test_101() { testInvalid("{any}","(int & int)"); }
		@Test public void test_102() { testInvalid("{any}","{any, any, any}"); }
		@Test public void test_103() { testInvalid("{any}","{int, any, any}"); }
		@Test public void test_104() { testInvalid("{any}","{any, int, any}"); }
		@Test public void test_105() { testInvalid("{any}","{int, int, any}"); }
		@Test public void test_106() { testInvalid("{any}","{any, any, int}"); }
		@Test public void test_107() { testInvalid("{any}","{int, any, int}"); }
		@Test public void test_108() { testInvalid("{any}","{any, int, int}"); }
		@Test public void test_109() { testInvalid("{any}","{int, int, int}"); }
		@Test public void test_110() { testInvalid("{any}","(any | any | any)"); }
		@Test public void test_111() { testInvalid("{any}","(int | any | any)"); }
		@Test public void test_112() { testInvalid("{any}","(any | int | any)"); }
		@Test public void test_113() { testInvalid("{any}","(int | int | any)"); }
		@Test public void test_114() { testInvalid("{any}","(any | any | int)"); }
		@Test public void test_115() { testInvalid("{any}","(int | any | int)"); }
		@Test public void test_116() { testInvalid("{any}","(any | int | int)"); }
		@Test public void test_117() { testInvalid("{any}","(int | int | int)"); }
		@Test public void test_118() { testInvalid("{any}","(any & any & any)"); }
		@Test public void test_119() { testInvalid("{any}","(int & any & any)"); }
		@Test public void test_120() { testInvalid("{any}","(any & int & any)"); }
		@Test public void test_121() { testInvalid("{any}","(int & int & any)"); }
		@Test public void test_122() { testInvalid("{any}","(any & any & int)"); }
		@Test public void test_123() { testInvalid("{any}","(int & any & int)"); }
		@Test public void test_124() { testInvalid("{any}","(any & int & int)"); }
		@Test public void test_125() { testInvalid("{any}","(int & int & int)"); }
		@Test public void test_126() { testInvalid("{int}","any"); }
		@Test public void test_127() { testInvalid("{int}","int"); }
		@Test public void test_128() { testInvalid("{int}","{any}"); }
		@Test public void test_129() { testValid("{int}","{int}"); }
		@Test public void test_130() { testValid("{int}","!any"); }
		@Test public void test_131() { testInvalid("{int}","!int"); }
		@Test public void test_132() { testInvalid("{int}","{any, any}"); }
		@Test public void test_133() { testInvalid("{int}","{int, any}"); }
		@Test public void test_134() { testInvalid("{int}","{any, int}"); }
		@Test public void test_135() { testInvalid("{int}","{int, int}"); }
		@Test public void test_136() { testInvalid("{int}","(any | any)"); }
		@Test public void test_137() { testInvalid("{int}","(int | any)"); }
		@Test public void test_138() { testInvalid("{int}","(any | int)"); }
		@Test public void test_139() { testInvalid("{int}","(int | int)"); }
		@Test public void test_140() { testInvalid("{int}","(any & any)"); }
		@Test public void test_141() { testInvalid("{int}","(int & any)"); }
		@Test public void test_142() { testInvalid("{int}","(any & int)"); }
		@Test public void test_143() { testInvalid("{int}","(int & int)"); }
		@Test public void test_144() { testInvalid("{int}","{any, any, any}"); }
		@Test public void test_145() { testInvalid("{int}","{int, any, any}"); }
		@Test public void test_146() { testInvalid("{int}","{any, int, any}"); }
		@Test public void test_147() { testInvalid("{int}","{int, int, any}"); }
		@Test public void test_148() { testInvalid("{int}","{any, any, int}"); }
		@Test public void test_149() { testInvalid("{int}","{int, any, int}"); }
		@Test public void test_150() { testInvalid("{int}","{any, int, int}"); }
		@Test public void test_151() { testInvalid("{int}","{int, int, int}"); }
		@Test public void test_152() { testInvalid("{int}","(any | any | any)"); }
		@Test public void test_153() { testInvalid("{int}","(int | any | any)"); }
		@Test public void test_154() { testInvalid("{int}","(any | int | any)"); }
		@Test public void test_155() { testInvalid("{int}","(int | int | any)"); }
		@Test public void test_156() { testInvalid("{int}","(any | any | int)"); }
		@Test public void test_157() { testInvalid("{int}","(int | any | int)"); }
		@Test public void test_158() { testInvalid("{int}","(any | int | int)"); }
		@Test public void test_159() { testInvalid("{int}","(int | int | int)"); }
		@Test public void test_160() { testInvalid("{int}","(any & any & any)"); }
		@Test public void test_161() { testInvalid("{int}","(int & any & any)"); }
		@Test public void test_162() { testInvalid("{int}","(any & int & any)"); }
		@Test public void test_163() { testInvalid("{int}","(int & int & any)"); }
		@Test public void test_164() { testInvalid("{int}","(any & any & int)"); }
		@Test public void test_165() { testInvalid("{int}","(int & any & int)"); }
		@Test public void test_166() { testInvalid("{int}","(any & int & int)"); }
		@Test public void test_167() { testInvalid("{int}","(int & int & int)"); }
		@Test public void test_168() { testInvalid("!any","any"); }
		@Test public void test_169() { testInvalid("!any","int"); }
		@Test public void test_170() { testInvalid("!any","{any}"); }
		@Test public void test_171() { testInvalid("!any","{int}"); }
		@Test public void test_172() { testValid("!any","!any"); }
		@Test public void test_173() { testInvalid("!any","!int"); }
		@Test public void test_174() { testInvalid("!any","{any, any}"); }
		@Test public void test_175() { testInvalid("!any","{int, any}"); }
		@Test public void test_176() { testInvalid("!any","{any, int}"); }
		@Test public void test_177() { testInvalid("!any","{int, int}"); }
		@Test public void test_178() { testInvalid("!any","(any | any)"); }
		@Test public void test_179() { testInvalid("!any","(int | any)"); }
		@Test public void test_180() { testInvalid("!any","(any | int)"); }
		@Test public void test_181() { testInvalid("!any","(int | int)"); }
		@Test public void test_182() { testInvalid("!any","(any & any)"); }
		@Test public void test_183() { testInvalid("!any","(int & any)"); }
		@Test public void test_184() { testInvalid("!any","(any & int)"); }
		@Test public void test_185() { testInvalid("!any","(int & int)"); }
		@Test public void test_186() { testInvalid("!any","{any, any, any}"); }
		@Test public void test_187() { testInvalid("!any","{int, any, any}"); }
		@Test public void test_188() { testInvalid("!any","{any, int, any}"); }
		@Test public void test_189() { testInvalid("!any","{int, int, any}"); }
		@Test public void test_190() { testInvalid("!any","{any, any, int}"); }
		@Test public void test_191() { testInvalid("!any","{int, any, int}"); }
		@Test public void test_192() { testInvalid("!any","{any, int, int}"); }
		@Test public void test_193() { testInvalid("!any","{int, int, int}"); }
		@Test public void test_194() { testInvalid("!any","(any | any | any)"); }
		@Test public void test_195() { testInvalid("!any","(int | any | any)"); }
		@Test public void test_196() { testInvalid("!any","(any | int | any)"); }
		@Test public void test_197() { testInvalid("!any","(int | int | any)"); }
		@Test public void test_198() { testInvalid("!any","(any | any | int)"); }
		@Test public void test_199() { testInvalid("!any","(int | any | int)"); }
		@Test public void test_200() { testInvalid("!any","(any | int | int)"); }
		@Test public void test_201() { testInvalid("!any","(int | int | int)"); }
		@Test public void test_202() { testInvalid("!any","(any & any & any)"); }
		@Test public void test_203() { testInvalid("!any","(int & any & any)"); }
		@Test public void test_204() { testInvalid("!any","(any & int & any)"); }
		@Test public void test_205() { testInvalid("!any","(int & int & any)"); }
		@Test public void test_206() { testInvalid("!any","(any & any & int)"); }
		@Test public void test_207() { testInvalid("!any","(int & any & int)"); }
		@Test public void test_208() { testInvalid("!any","(any & int & int)"); }
		@Test public void test_209() { testInvalid("!any","(int & int & int)"); }
		@Test public void test_210() { testInvalid("!int","any"); }
		@Test public void test_211() { testInvalid("!int","int"); }
		@Test public void test_212() { testValid("!int","{any}"); }
		@Test public void test_213() { testValid("!int","{int}"); }
		@Test public void test_214() { testValid("!int","!any"); }
		@Test public void test_215() { testValid("!int","!int"); }
		@Test public void test_216() { testValid("!int","{any, any}"); }
		@Test public void test_217() { testValid("!int","{int, any}"); }
		@Test public void test_218() { testValid("!int","{any, int}"); }
		@Test public void test_219() { testValid("!int","{int, int}"); }
		@Test public void test_220() { testInvalid("!int","(any | any)"); }
		@Test public void test_221() { testInvalid("!int","(int | any)"); }
		@Test public void test_222() { testInvalid("!int","(any | int)"); }
		@Test public void test_223() { testInvalid("!int","(int | int)"); }
		@Test public void test_224() { testInvalid("!int","(any & any)"); }
		@Test public void test_225() { testInvalid("!int","(int & any)"); }
		@Test public void test_226() { testInvalid("!int","(any & int)"); }
		@Test public void test_227() { testInvalid("!int","(int & int)"); }
		@Test public void test_228() { testValid("!int","{any, any, any}"); }
		@Test public void test_229() { testValid("!int","{int, any, any}"); }
		@Test public void test_230() { testValid("!int","{any, int, any}"); }
		@Test public void test_231() { testValid("!int","{int, int, any}"); }
		@Test public void test_232() { testValid("!int","{any, any, int}"); }
		@Test public void test_233() { testValid("!int","{int, any, int}"); }
		@Test public void test_234() { testValid("!int","{any, int, int}"); }
		@Test public void test_235() { testValid("!int","{int, int, int}"); }
		@Test public void test_236() { testInvalid("!int","(any | any | any)"); }
		@Test public void test_237() { testInvalid("!int","(int | any | any)"); }
		@Test public void test_238() { testInvalid("!int","(any | int | any)"); }
		@Test public void test_239() { testInvalid("!int","(int | int | any)"); }
		@Test public void test_240() { testInvalid("!int","(any | any | int)"); }
		@Test public void test_241() { testInvalid("!int","(int | any | int)"); }
		@Test public void test_242() { testInvalid("!int","(any | int | int)"); }
		@Test public void test_243() { testInvalid("!int","(int | int | int)"); }
		@Test public void test_244() { testInvalid("!int","(any & any & any)"); }
		@Test public void test_245() { testInvalid("!int","(int & any & any)"); }
		@Test public void test_246() { testInvalid("!int","(any & int & any)"); }
		@Test public void test_247() { testInvalid("!int","(int & int & any)"); }
		@Test public void test_248() { testInvalid("!int","(any & any & int)"); }
		@Test public void test_249() { testInvalid("!int","(int & any & int)"); }
		@Test public void test_250() { testInvalid("!int","(any & int & int)"); }
		@Test public void test_251() { testInvalid("!int","(int & int & int)"); }
		@Test public void test_252() { testInvalid("{any, any}","any"); }
		@Test public void test_253() { testInvalid("{any, any}","int"); }
		@Test public void test_254() { testInvalid("{any, any}","{any}"); }
		@Test public void test_255() { testInvalid("{any, any}","{int}"); }
		@Test public void test_256() { testValid("{any, any}","!any"); }
		@Test public void test_257() { testInvalid("{any, any}","!int"); }
		@Test public void test_258() { testValid("{any, any}","{any, any}"); }
		@Test public void test_259() { testValid("{any, any}","{int, any}"); }
		@Test public void test_260() { testValid("{any, any}","{any, int}"); }
		@Test public void test_261() { testValid("{any, any}","{int, int}"); }
		@Test public void test_262() { testInvalid("{any, any}","(any | any)"); }
		@Test public void test_263() { testInvalid("{any, any}","(int | any)"); }
		@Test public void test_264() { testInvalid("{any, any}","(any | int)"); }
		@Test public void test_265() { testInvalid("{any, any}","(int | int)"); }
		@Test public void test_266() { testInvalid("{any, any}","(any & any)"); }
		@Test public void test_267() { testInvalid("{any, any}","(int & any)"); }
		@Test public void test_268() { testInvalid("{any, any}","(any & int)"); }
		@Test public void test_269() { testInvalid("{any, any}","(int & int)"); }
		@Test public void test_270() { testInvalid("{any, any}","{any, any, any}"); }
		@Test public void test_271() { testInvalid("{any, any}","{int, any, any}"); }
		@Test public void test_272() { testInvalid("{any, any}","{any, int, any}"); }
		@Test public void test_273() { testInvalid("{any, any}","{int, int, any}"); }
		@Test public void test_274() { testInvalid("{any, any}","{any, any, int}"); }
		@Test public void test_275() { testInvalid("{any, any}","{int, any, int}"); }
		@Test public void test_276() { testInvalid("{any, any}","{any, int, int}"); }
		@Test public void test_277() { testInvalid("{any, any}","{int, int, int}"); }
		@Test public void test_278() { testInvalid("{any, any}","(any | any | any)"); }
		@Test public void test_279() { testInvalid("{any, any}","(int | any | any)"); }
		@Test public void test_280() { testInvalid("{any, any}","(any | int | any)"); }
		@Test public void test_281() { testInvalid("{any, any}","(int | int | any)"); }
		@Test public void test_282() { testInvalid("{any, any}","(any | any | int)"); }
		@Test public void test_283() { testInvalid("{any, any}","(int | any | int)"); }
		@Test public void test_284() { testInvalid("{any, any}","(any | int | int)"); }
		@Test public void test_285() { testInvalid("{any, any}","(int | int | int)"); }
		@Test public void test_286() { testInvalid("{any, any}","(any & any & any)"); }
		@Test public void test_287() { testInvalid("{any, any}","(int & any & any)"); }
		@Test public void test_288() { testInvalid("{any, any}","(any & int & any)"); }
		@Test public void test_289() { testInvalid("{any, any}","(int & int & any)"); }
		@Test public void test_290() { testInvalid("{any, any}","(any & any & int)"); }
		@Test public void test_291() { testInvalid("{any, any}","(int & any & int)"); }
		@Test public void test_292() { testInvalid("{any, any}","(any & int & int)"); }
		@Test public void test_293() { testInvalid("{any, any}","(int & int & int)"); }
		@Test public void test_294() { testInvalid("{int, any}","any"); }
		@Test public void test_295() { testInvalid("{int, any}","int"); }
		@Test public void test_296() { testInvalid("{int, any}","{any}"); }
		@Test public void test_297() { testInvalid("{int, any}","{int}"); }
		@Test public void test_298() { testValid("{int, any}","!any"); }
		@Test public void test_299() { testInvalid("{int, any}","!int"); }
		@Test public void test_300() { testInvalid("{int, any}","{any, any}"); }
		@Test public void test_301() { testValid("{int, any}","{int, any}"); }
		@Test public void test_302() { testInvalid("{int, any}","{any, int}"); }
		@Test public void test_303() { testValid("{int, any}","{int, int}"); }
		@Test public void test_304() { testInvalid("{int, any}","(any | any)"); }
		@Test public void test_305() { testInvalid("{int, any}","(int | any)"); }
		@Test public void test_306() { testInvalid("{int, any}","(any | int)"); }
		@Test public void test_307() { testInvalid("{int, any}","(int | int)"); }
		@Test public void test_308() { testInvalid("{int, any}","(any & any)"); }
		@Test public void test_309() { testInvalid("{int, any}","(int & any)"); }
		@Test public void test_310() { testInvalid("{int, any}","(any & int)"); }
		@Test public void test_311() { testInvalid("{int, any}","(int & int)"); }
		@Test public void test_312() { testInvalid("{int, any}","{any, any, any}"); }
		@Test public void test_313() { testInvalid("{int, any}","{int, any, any}"); }
		@Test public void test_314() { testInvalid("{int, any}","{any, int, any}"); }
		@Test public void test_315() { testInvalid("{int, any}","{int, int, any}"); }
		@Test public void test_316() { testInvalid("{int, any}","{any, any, int}"); }
		@Test public void test_317() { testInvalid("{int, any}","{int, any, int}"); }
		@Test public void test_318() { testInvalid("{int, any}","{any, int, int}"); }
		@Test public void test_319() { testInvalid("{int, any}","{int, int, int}"); }
		@Test public void test_320() { testInvalid("{int, any}","(any | any | any)"); }
		@Test public void test_321() { testInvalid("{int, any}","(int | any | any)"); }
		@Test public void test_322() { testInvalid("{int, any}","(any | int | any)"); }
		@Test public void test_323() { testInvalid("{int, any}","(int | int | any)"); }
		@Test public void test_324() { testInvalid("{int, any}","(any | any | int)"); }
		@Test public void test_325() { testInvalid("{int, any}","(int | any | int)"); }
		@Test public void test_326() { testInvalid("{int, any}","(any | int | int)"); }
		@Test public void test_327() { testInvalid("{int, any}","(int | int | int)"); }
		@Test public void test_328() { testInvalid("{int, any}","(any & any & any)"); }
		@Test public void test_329() { testInvalid("{int, any}","(int & any & any)"); }
		@Test public void test_330() { testInvalid("{int, any}","(any & int & any)"); }
		@Test public void test_331() { testInvalid("{int, any}","(int & int & any)"); }
		@Test public void test_332() { testInvalid("{int, any}","(any & any & int)"); }
		@Test public void test_333() { testInvalid("{int, any}","(int & any & int)"); }
		@Test public void test_334() { testInvalid("{int, any}","(any & int & int)"); }
		@Test public void test_335() { testInvalid("{int, any}","(int & int & int)"); }
		@Test public void test_336() { testInvalid("{any, int}","any"); }
		@Test public void test_337() { testInvalid("{any, int}","int"); }
		@Test public void test_338() { testInvalid("{any, int}","{any}"); }
		@Test public void test_339() { testInvalid("{any, int}","{int}"); }
		@Test public void test_340() { testValid("{any, int}","!any"); }
		@Test public void test_341() { testInvalid("{any, int}","!int"); }
		@Test public void test_342() { testInvalid("{any, int}","{any, any}"); }
		@Test public void test_343() { testInvalid("{any, int}","{int, any}"); }
		@Test public void test_344() { testValid("{any, int}","{any, int}"); }
		@Test public void test_345() { testValid("{any, int}","{int, int}"); }
		@Test public void test_346() { testInvalid("{any, int}","(any | any)"); }
		@Test public void test_347() { testInvalid("{any, int}","(int | any)"); }
		@Test public void test_348() { testInvalid("{any, int}","(any | int)"); }
		@Test public void test_349() { testInvalid("{any, int}","(int | int)"); }
		@Test public void test_350() { testInvalid("{any, int}","(any & any)"); }
		@Test public void test_351() { testInvalid("{any, int}","(int & any)"); }
		@Test public void test_352() { testInvalid("{any, int}","(any & int)"); }
		@Test public void test_353() { testInvalid("{any, int}","(int & int)"); }
		@Test public void test_354() { testInvalid("{any, int}","{any, any, any}"); }
		@Test public void test_355() { testInvalid("{any, int}","{int, any, any}"); }
		@Test public void test_356() { testInvalid("{any, int}","{any, int, any}"); }
		@Test public void test_357() { testInvalid("{any, int}","{int, int, any}"); }
		@Test public void test_358() { testInvalid("{any, int}","{any, any, int}"); }
		@Test public void test_359() { testInvalid("{any, int}","{int, any, int}"); }
		@Test public void test_360() { testInvalid("{any, int}","{any, int, int}"); }
		@Test public void test_361() { testInvalid("{any, int}","{int, int, int}"); }
		@Test public void test_362() { testInvalid("{any, int}","(any | any | any)"); }
		@Test public void test_363() { testInvalid("{any, int}","(int | any | any)"); }
		@Test public void test_364() { testInvalid("{any, int}","(any | int | any)"); }
		@Test public void test_365() { testInvalid("{any, int}","(int | int | any)"); }
		@Test public void test_366() { testInvalid("{any, int}","(any | any | int)"); }
		@Test public void test_367() { testInvalid("{any, int}","(int | any | int)"); }
		@Test public void test_368() { testInvalid("{any, int}","(any | int | int)"); }
		@Test public void test_369() { testInvalid("{any, int}","(int | int | int)"); }
		@Test public void test_370() { testInvalid("{any, int}","(any & any & any)"); }
		@Test public void test_371() { testInvalid("{any, int}","(int & any & any)"); }
		@Test public void test_372() { testInvalid("{any, int}","(any & int & any)"); }
		@Test public void test_373() { testInvalid("{any, int}","(int & int & any)"); }
		@Test public void test_374() { testInvalid("{any, int}","(any & any & int)"); }
		@Test public void test_375() { testInvalid("{any, int}","(int & any & int)"); }
		@Test public void test_376() { testInvalid("{any, int}","(any & int & int)"); }
		@Test public void test_377() { testInvalid("{any, int}","(int & int & int)"); }
		@Test public void test_378() { testInvalid("{int, int}","any"); }
		@Test public void test_379() { testInvalid("{int, int}","int"); }
		@Test public void test_380() { testInvalid("{int, int}","{any}"); }
		@Test public void test_381() { testInvalid("{int, int}","{int}"); }
		@Test public void test_382() { testValid("{int, int}","!any"); }
		@Test public void test_383() { testInvalid("{int, int}","!int"); }
		@Test public void test_384() { testInvalid("{int, int}","{any, any}"); }
		@Test public void test_385() { testInvalid("{int, int}","{int, any}"); }
		@Test public void test_386() { testInvalid("{int, int}","{any, int}"); }
		@Test public void test_387() { testValid("{int, int}","{int, int}"); }
		@Test public void test_388() { testInvalid("{int, int}","(any | any)"); }
		@Test public void test_389() { testInvalid("{int, int}","(int | any)"); }
		@Test public void test_390() { testInvalid("{int, int}","(any | int)"); }
		@Test public void test_391() { testInvalid("{int, int}","(int | int)"); }
		@Test public void test_392() { testInvalid("{int, int}","(any & any)"); }
		@Test public void test_393() { testInvalid("{int, int}","(int & any)"); }
		@Test public void test_394() { testInvalid("{int, int}","(any & int)"); }
		@Test public void test_395() { testInvalid("{int, int}","(int & int)"); }
		@Test public void test_396() { testInvalid("{int, int}","{any, any, any}"); }
		@Test public void test_397() { testInvalid("{int, int}","{int, any, any}"); }
		@Test public void test_398() { testInvalid("{int, int}","{any, int, any}"); }
		@Test public void test_399() { testInvalid("{int, int}","{int, int, any}"); }
		@Test public void test_400() { testInvalid("{int, int}","{any, any, int}"); }
		@Test public void test_401() { testInvalid("{int, int}","{int, any, int}"); }
		@Test public void test_402() { testInvalid("{int, int}","{any, int, int}"); }
		@Test public void test_403() { testInvalid("{int, int}","{int, int, int}"); }
		@Test public void test_404() { testInvalid("{int, int}","(any | any | any)"); }
		@Test public void test_405() { testInvalid("{int, int}","(int | any | any)"); }
		@Test public void test_406() { testInvalid("{int, int}","(any | int | any)"); }
		@Test public void test_407() { testInvalid("{int, int}","(int | int | any)"); }
		@Test public void test_408() { testInvalid("{int, int}","(any | any | int)"); }
		@Test public void test_409() { testInvalid("{int, int}","(int | any | int)"); }
		@Test public void test_410() { testInvalid("{int, int}","(any | int | int)"); }
		@Test public void test_411() { testInvalid("{int, int}","(int | int | int)"); }
		@Test public void test_412() { testInvalid("{int, int}","(any & any & any)"); }
		@Test public void test_413() { testInvalid("{int, int}","(int & any & any)"); }
		@Test public void test_414() { testInvalid("{int, int}","(any & int & any)"); }
		@Test public void test_415() { testInvalid("{int, int}","(int & int & any)"); }
		@Test public void test_416() { testInvalid("{int, int}","(any & any & int)"); }
		@Test public void test_417() { testInvalid("{int, int}","(int & any & int)"); }
		@Test public void test_418() { testInvalid("{int, int}","(any & int & int)"); }
		@Test public void test_419() { testInvalid("{int, int}","(int & int & int)"); }
		@Test public void test_420() { testValid("(any | any)","any"); }
		@Test public void test_421() { testValid("(any | any)","int"); }
		@Test public void test_422() { testValid("(any | any)","{any}"); }
		@Test public void test_423() { testValid("(any | any)","{int}"); }
		@Test public void test_424() { testValid("(any | any)","!any"); }
		@Test public void test_425() { testValid("(any | any)","!int"); }
		@Test public void test_426() { testValid("(any | any)","{any, any}"); }
		@Test public void test_427() { testValid("(any | any)","{int, any}"); }
		@Test public void test_428() { testValid("(any | any)","{any, int}"); }
		@Test public void test_429() { testValid("(any | any)","{int, int}"); }
		@Test public void test_430() { testValid("(any | any)","(any | any)"); }
		@Test public void test_431() { testValid("(any | any)","(int | any)"); }
		@Test public void test_432() { testValid("(any | any)","(any | int)"); }
		@Test public void test_433() { testValid("(any | any)","(int | int)"); }
		@Test public void test_434() { testValid("(any | any)","(any & any)"); }
		@Test public void test_435() { testValid("(any | any)","(int & any)"); }
		@Test public void test_436() { testValid("(any | any)","(any & int)"); }
		@Test public void test_437() { testValid("(any | any)","(int & int)"); }
		@Test public void test_438() { testValid("(any | any)","{any, any, any}"); }
		@Test public void test_439() { testValid("(any | any)","{int, any, any}"); }
		@Test public void test_440() { testValid("(any | any)","{any, int, any}"); }
		@Test public void test_441() { testValid("(any | any)","{int, int, any}"); }
		@Test public void test_442() { testValid("(any | any)","{any, any, int}"); }
		@Test public void test_443() { testValid("(any | any)","{int, any, int}"); }
		@Test public void test_444() { testValid("(any | any)","{any, int, int}"); }
		@Test public void test_445() { testValid("(any | any)","{int, int, int}"); }
		@Test public void test_446() { testValid("(any | any)","(any | any | any)"); }
		@Test public void test_447() { testValid("(any | any)","(int | any | any)"); }
		@Test public void test_448() { testValid("(any | any)","(any | int | any)"); }
		@Test public void test_449() { testValid("(any | any)","(int | int | any)"); }
		@Test public void test_450() { testValid("(any | any)","(any | any | int)"); }
		@Test public void test_451() { testValid("(any | any)","(int | any | int)"); }
		@Test public void test_452() { testValid("(any | any)","(any | int | int)"); }
		@Test public void test_453() { testValid("(any | any)","(int | int | int)"); }
		@Test public void test_454() { testValid("(any | any)","(any & any & any)"); }
		@Test public void test_455() { testValid("(any | any)","(int & any & any)"); }
		@Test public void test_456() { testValid("(any | any)","(any & int & any)"); }
		@Test public void test_457() { testValid("(any | any)","(int & int & any)"); }
		@Test public void test_458() { testValid("(any | any)","(any & any & int)"); }
		@Test public void test_459() { testValid("(any | any)","(int & any & int)"); }
		@Test public void test_460() { testValid("(any | any)","(any & int & int)"); }
		@Test public void test_461() { testValid("(any | any)","(int & int & int)"); }
		@Test public void test_462() { testValid("(int | any)","any"); }
		@Test public void test_463() { testValid("(int | any)","int"); }
		@Test public void test_464() { testValid("(int | any)","{any}"); }
		@Test public void test_465() { testValid("(int | any)","{int}"); }
		@Test public void test_466() { testValid("(int | any)","!any"); }
		@Test public void test_467() { testValid("(int | any)","!int"); }
		@Test public void test_468() { testValid("(int | any)","{any, any}"); }
		@Test public void test_469() { testValid("(int | any)","{int, any}"); }
		@Test public void test_470() { testValid("(int | any)","{any, int}"); }
		@Test public void test_471() { testValid("(int | any)","{int, int}"); }
		@Test public void test_472() { testValid("(int | any)","(any | any)"); }
		@Test public void test_473() { testValid("(int | any)","(int | any)"); }
		@Test public void test_474() { testValid("(int | any)","(any | int)"); }
		@Test public void test_475() { testValid("(int | any)","(int | int)"); }
		@Test public void test_476() { testValid("(int | any)","(any & any)"); }
		@Test public void test_477() { testValid("(int | any)","(int & any)"); }
		@Test public void test_478() { testValid("(int | any)","(any & int)"); }
		@Test public void test_479() { testValid("(int | any)","(int & int)"); }
		@Test public void test_480() { testValid("(int | any)","{any, any, any}"); }
		@Test public void test_481() { testValid("(int | any)","{int, any, any}"); }
		@Test public void test_482() { testValid("(int | any)","{any, int, any}"); }
		@Test public void test_483() { testValid("(int | any)","{int, int, any}"); }
		@Test public void test_484() { testValid("(int | any)","{any, any, int}"); }
		@Test public void test_485() { testValid("(int | any)","{int, any, int}"); }
		@Test public void test_486() { testValid("(int | any)","{any, int, int}"); }
		@Test public void test_487() { testValid("(int | any)","{int, int, int}"); }
		@Test public void test_488() { testValid("(int | any)","(any | any | any)"); }
		@Test public void test_489() { testValid("(int | any)","(int | any | any)"); }
		@Test public void test_490() { testValid("(int | any)","(any | int | any)"); }
		@Test public void test_491() { testValid("(int | any)","(int | int | any)"); }
		@Test public void test_492() { testValid("(int | any)","(any | any | int)"); }
		@Test public void test_493() { testValid("(int | any)","(int | any | int)"); }
		@Test public void test_494() { testValid("(int | any)","(any | int | int)"); }
		@Test public void test_495() { testValid("(int | any)","(int | int | int)"); }
		@Test public void test_496() { testValid("(int | any)","(any & any & any)"); }
		@Test public void test_497() { testValid("(int | any)","(int & any & any)"); }
		@Test public void test_498() { testValid("(int | any)","(any & int & any)"); }
		@Test public void test_499() { testValid("(int | any)","(int & int & any)"); }
		@Test public void test_500() { testValid("(int | any)","(any & any & int)"); }
		@Test public void test_501() { testValid("(int | any)","(int & any & int)"); }
		@Test public void test_502() { testValid("(int | any)","(any & int & int)"); }
		@Test public void test_503() { testValid("(int | any)","(int & int & int)"); }
		@Test public void test_504() { testValid("(any | int)","any"); }
		@Test public void test_505() { testValid("(any | int)","int"); }
		@Test public void test_506() { testValid("(any | int)","{any}"); }
		@Test public void test_507() { testValid("(any | int)","{int}"); }
		@Test public void test_508() { testValid("(any | int)","!any"); }
		@Test public void test_509() { testValid("(any | int)","!int"); }
		@Test public void test_510() { testValid("(any | int)","{any, any}"); }
		@Test public void test_511() { testValid("(any | int)","{int, any}"); }
		@Test public void test_512() { testValid("(any | int)","{any, int}"); }
		@Test public void test_513() { testValid("(any | int)","{int, int}"); }
		@Test public void test_514() { testValid("(any | int)","(any | any)"); }
		@Test public void test_515() { testValid("(any | int)","(int | any)"); }
		@Test public void test_516() { testValid("(any | int)","(any | int)"); }
		@Test public void test_517() { testValid("(any | int)","(int | int)"); }
		@Test public void test_518() { testValid("(any | int)","(any & any)"); }
		@Test public void test_519() { testValid("(any | int)","(int & any)"); }
		@Test public void test_520() { testValid("(any | int)","(any & int)"); }
		@Test public void test_521() { testValid("(any | int)","(int & int)"); }
		@Test public void test_522() { testValid("(any | int)","{any, any, any}"); }
		@Test public void test_523() { testValid("(any | int)","{int, any, any}"); }
		@Test public void test_524() { testValid("(any | int)","{any, int, any}"); }
		@Test public void test_525() { testValid("(any | int)","{int, int, any}"); }
		@Test public void test_526() { testValid("(any | int)","{any, any, int}"); }
		@Test public void test_527() { testValid("(any | int)","{int, any, int}"); }
		@Test public void test_528() { testValid("(any | int)","{any, int, int}"); }
		@Test public void test_529() { testValid("(any | int)","{int, int, int}"); }
		@Test public void test_530() { testValid("(any | int)","(any | any | any)"); }
		@Test public void test_531() { testValid("(any | int)","(int | any | any)"); }
		@Test public void test_532() { testValid("(any | int)","(any | int | any)"); }
		@Test public void test_533() { testValid("(any | int)","(int | int | any)"); }
		@Test public void test_534() { testValid("(any | int)","(any | any | int)"); }
		@Test public void test_535() { testValid("(any | int)","(int | any | int)"); }
		@Test public void test_536() { testValid("(any | int)","(any | int | int)"); }
		@Test public void test_537() { testValid("(any | int)","(int | int | int)"); }
		@Test public void test_538() { testValid("(any | int)","(any & any & any)"); }
		@Test public void test_539() { testValid("(any | int)","(int & any & any)"); }
		@Test public void test_540() { testValid("(any | int)","(any & int & any)"); }
		@Test public void test_541() { testValid("(any | int)","(int & int & any)"); }
		@Test public void test_542() { testValid("(any | int)","(any & any & int)"); }
		@Test public void test_543() { testValid("(any | int)","(int & any & int)"); }
		@Test public void test_544() { testValid("(any | int)","(any & int & int)"); }
		@Test public void test_545() { testValid("(any | int)","(int & int & int)"); }
		@Test public void test_546() { testInvalid("(int | int)","any"); }
		@Test public void test_547() { testValid("(int | int)","int"); }
		@Test public void test_548() { testInvalid("(int | int)","{any}"); }
		@Test public void test_549() { testInvalid("(int | int)","{int}"); }
		@Test public void test_550() { testValid("(int | int)","!any"); }
		@Test public void test_551() { testInvalid("(int | int)","!int"); }
		@Test public void test_552() { testInvalid("(int | int)","{any, any}"); }
		@Test public void test_553() { testInvalid("(int | int)","{int, any}"); }
		@Test public void test_554() { testInvalid("(int | int)","{any, int}"); }
		@Test public void test_555() { testInvalid("(int | int)","{int, int}"); }
		@Test public void test_556() { testInvalid("(int | int)","(any | any)"); }
		@Test public void test_557() { testInvalid("(int | int)","(int | any)"); }
		@Test public void test_558() { testInvalid("(int | int)","(any | int)"); }
		@Test public void test_559() { testValid("(int | int)","(int | int)"); }
		@Test public void test_560() { testInvalid("(int | int)","(any & any)"); }
		@Test public void test_561() { testValid("(int | int)","(int & any)"); }
		@Test public void test_562() { testValid("(int | int)","(any & int)"); }
		@Test public void test_563() { testValid("(int | int)","(int & int)"); }
		@Test public void test_564() { testInvalid("(int | int)","{any, any, any}"); }
		@Test public void test_565() { testInvalid("(int | int)","{int, any, any}"); }
		@Test public void test_566() { testInvalid("(int | int)","{any, int, any}"); }
		@Test public void test_567() { testInvalid("(int | int)","{int, int, any}"); }
		@Test public void test_568() { testInvalid("(int | int)","{any, any, int}"); }
		@Test public void test_569() { testInvalid("(int | int)","{int, any, int}"); }
		@Test public void test_570() { testInvalid("(int | int)","{any, int, int}"); }
		@Test public void test_571() { testInvalid("(int | int)","{int, int, int}"); }
		@Test public void test_572() { testInvalid("(int | int)","(any | any | any)"); }
		@Test public void test_573() { testInvalid("(int | int)","(int | any | any)"); }
		@Test public void test_574() { testInvalid("(int | int)","(any | int | any)"); }
		@Test public void test_575() { testInvalid("(int | int)","(int | int | any)"); }
		@Test public void test_576() { testInvalid("(int | int)","(any | any | int)"); }
		@Test public void test_577() { testInvalid("(int | int)","(int | any | int)"); }
		@Test public void test_578() { testInvalid("(int | int)","(any | int | int)"); }
		@Test public void test_579() { testValid("(int | int)","(int | int | int)"); }
		@Test public void test_580() { testInvalid("(int | int)","(any & any & any)"); }
		@Test public void test_581() { testValid("(int | int)","(int & any & any)"); }
		@Test public void test_582() { testValid("(int | int)","(any & int & any)"); }
		@Test public void test_583() { testValid("(int | int)","(int & int & any)"); }
		@Test public void test_584() { testValid("(int | int)","(any & any & int)"); }
		@Test public void test_585() { testValid("(int | int)","(int & any & int)"); }
		@Test public void test_586() { testValid("(int | int)","(any & int & int)"); }
		@Test public void test_587() { testValid("(int | int)","(int & int & int)"); }
		@Test public void test_588() { testValid("(any & any)","any"); }
		@Test public void test_589() { testValid("(any & any)","int"); }
		@Test public void test_590() { testValid("(any & any)","{any}"); }
		@Test public void test_591() { testValid("(any & any)","{int}"); }
		@Test public void test_592() { testValid("(any & any)","!any"); }
		@Test public void test_593() { testValid("(any & any)","!int"); }
		@Test public void test_594() { testValid("(any & any)","{any, any}"); }
		@Test public void test_595() { testValid("(any & any)","{int, any}"); }
		@Test public void test_596() { testValid("(any & any)","{any, int}"); }
		@Test public void test_597() { testValid("(any & any)","{int, int}"); }
		@Test public void test_598() { testValid("(any & any)","(any | any)"); }
		@Test public void test_599() { testValid("(any & any)","(int | any)"); }
		@Test public void test_600() { testValid("(any & any)","(any | int)"); }
		@Test public void test_601() { testValid("(any & any)","(int | int)"); }
		@Test public void test_602() { testValid("(any & any)","(any & any)"); }
		@Test public void test_603() { testValid("(any & any)","(int & any)"); }
		@Test public void test_604() { testValid("(any & any)","(any & int)"); }
		@Test public void test_605() { testValid("(any & any)","(int & int)"); }
		@Test public void test_606() { testValid("(any & any)","{any, any, any}"); }
		@Test public void test_607() { testValid("(any & any)","{int, any, any}"); }
		@Test public void test_608() { testValid("(any & any)","{any, int, any}"); }
		@Test public void test_609() { testValid("(any & any)","{int, int, any}"); }
		@Test public void test_610() { testValid("(any & any)","{any, any, int}"); }
		@Test public void test_611() { testValid("(any & any)","{int, any, int}"); }
		@Test public void test_612() { testValid("(any & any)","{any, int, int}"); }
		@Test public void test_613() { testValid("(any & any)","{int, int, int}"); }
		@Test public void test_614() { testValid("(any & any)","(any | any | any)"); }
		@Test public void test_615() { testValid("(any & any)","(int | any | any)"); }
		@Test public void test_616() { testValid("(any & any)","(any | int | any)"); }
		@Test public void test_617() { testValid("(any & any)","(int | int | any)"); }
		@Test public void test_618() { testValid("(any & any)","(any | any | int)"); }
		@Test public void test_619() { testValid("(any & any)","(int | any | int)"); }
		@Test public void test_620() { testValid("(any & any)","(any | int | int)"); }
		@Test public void test_621() { testValid("(any & any)","(int | int | int)"); }
		@Test public void test_622() { testValid("(any & any)","(any & any & any)"); }
		@Test public void test_623() { testValid("(any & any)","(int & any & any)"); }
		@Test public void test_624() { testValid("(any & any)","(any & int & any)"); }
		@Test public void test_625() { testValid("(any & any)","(int & int & any)"); }
		@Test public void test_626() { testValid("(any & any)","(any & any & int)"); }
		@Test public void test_627() { testValid("(any & any)","(int & any & int)"); }
		@Test public void test_628() { testValid("(any & any)","(any & int & int)"); }
		@Test public void test_629() { testValid("(any & any)","(int & int & int)"); }
		@Test public void test_630() { testInvalid("(int & any)","any"); }
		@Test public void test_631() { testValid("(int & any)","int"); }
		@Test public void test_632() { testInvalid("(int & any)","{any}"); }
		@Test public void test_633() { testInvalid("(int & any)","{int}"); }
		@Test public void test_634() { testValid("(int & any)","!any"); }
		@Test public void test_635() { testInvalid("(int & any)","!int"); }
		@Test public void test_636() { testInvalid("(int & any)","{any, any}"); }
		@Test public void test_637() { testInvalid("(int & any)","{int, any}"); }
		@Test public void test_638() { testInvalid("(int & any)","{any, int}"); }
		@Test public void test_639() { testInvalid("(int & any)","{int, int}"); }
		@Test public void test_640() { testInvalid("(int & any)","(any | any)"); }
		@Test public void test_641() { testInvalid("(int & any)","(int | any)"); }
		@Test public void test_642() { testInvalid("(int & any)","(any | int)"); }
		@Test public void test_643() { testValid("(int & any)","(int | int)"); }
		@Test public void test_644() { testInvalid("(int & any)","(any & any)"); }
		@Test public void test_645() { testValid("(int & any)","(int & any)"); }
		@Test public void test_646() { testValid("(int & any)","(any & int)"); }
		@Test public void test_647() { testValid("(int & any)","(int & int)"); }
		@Test public void test_648() { testInvalid("(int & any)","{any, any, any}"); }
		@Test public void test_649() { testInvalid("(int & any)","{int, any, any}"); }
		@Test public void test_650() { testInvalid("(int & any)","{any, int, any}"); }
		@Test public void test_651() { testInvalid("(int & any)","{int, int, any}"); }
		@Test public void test_652() { testInvalid("(int & any)","{any, any, int}"); }
		@Test public void test_653() { testInvalid("(int & any)","{int, any, int}"); }
		@Test public void test_654() { testInvalid("(int & any)","{any, int, int}"); }
		@Test public void test_655() { testInvalid("(int & any)","{int, int, int}"); }
		@Test public void test_656() { testInvalid("(int & any)","(any | any | any)"); }
		@Test public void test_657() { testInvalid("(int & any)","(int | any | any)"); }
		@Test public void test_658() { testInvalid("(int & any)","(any | int | any)"); }
		@Test public void test_659() { testInvalid("(int & any)","(int | int | any)"); }
		@Test public void test_660() { testInvalid("(int & any)","(any | any | int)"); }
		@Test public void test_661() { testInvalid("(int & any)","(int | any | int)"); }
		@Test public void test_662() { testInvalid("(int & any)","(any | int | int)"); }
		@Test public void test_663() { testValid("(int & any)","(int | int | int)"); }
		@Test public void test_664() { testInvalid("(int & any)","(any & any & any)"); }
		@Test public void test_665() { testValid("(int & any)","(int & any & any)"); }
		@Test public void test_666() { testValid("(int & any)","(any & int & any)"); }
		@Test public void test_667() { testValid("(int & any)","(int & int & any)"); }
		@Test public void test_668() { testValid("(int & any)","(any & any & int)"); }
		@Test public void test_669() { testValid("(int & any)","(int & any & int)"); }
		@Test public void test_670() { testValid("(int & any)","(any & int & int)"); }
		@Test public void test_671() { testValid("(int & any)","(int & int & int)"); }
		@Test public void test_672() { testInvalid("(any & int)","any"); }
		@Test public void test_673() { testValid("(any & int)","int"); }
		@Test public void test_674() { testInvalid("(any & int)","{any}"); }
		@Test public void test_675() { testInvalid("(any & int)","{int}"); }
		@Test public void test_676() { testValid("(any & int)","!any"); }
		@Test public void test_677() { testInvalid("(any & int)","!int"); }
		@Test public void test_678() { testInvalid("(any & int)","{any, any}"); }
		@Test public void test_679() { testInvalid("(any & int)","{int, any}"); }
		@Test public void test_680() { testInvalid("(any & int)","{any, int}"); }
		@Test public void test_681() { testInvalid("(any & int)","{int, int}"); }
		@Test public void test_682() { testInvalid("(any & int)","(any | any)"); }
		@Test public void test_683() { testInvalid("(any & int)","(int | any)"); }
		@Test public void test_684() { testInvalid("(any & int)","(any | int)"); }
		@Test public void test_685() { testValid("(any & int)","(int | int)"); }
		@Test public void test_686() { testInvalid("(any & int)","(any & any)"); }
		@Test public void test_687() { testValid("(any & int)","(int & any)"); }
		@Test public void test_688() { testValid("(any & int)","(any & int)"); }
		@Test public void test_689() { testValid("(any & int)","(int & int)"); }
		@Test public void test_690() { testInvalid("(any & int)","{any, any, any}"); }
		@Test public void test_691() { testInvalid("(any & int)","{int, any, any}"); }
		@Test public void test_692() { testInvalid("(any & int)","{any, int, any}"); }
		@Test public void test_693() { testInvalid("(any & int)","{int, int, any}"); }
		@Test public void test_694() { testInvalid("(any & int)","{any, any, int}"); }
		@Test public void test_695() { testInvalid("(any & int)","{int, any, int}"); }
		@Test public void test_696() { testInvalid("(any & int)","{any, int, int}"); }
		@Test public void test_697() { testInvalid("(any & int)","{int, int, int}"); }
		@Test public void test_698() { testInvalid("(any & int)","(any | any | any)"); }
		@Test public void test_699() { testInvalid("(any & int)","(int | any | any)"); }
		@Test public void test_700() { testInvalid("(any & int)","(any | int | any)"); }
		@Test public void test_701() { testInvalid("(any & int)","(int | int | any)"); }
		@Test public void test_702() { testInvalid("(any & int)","(any | any | int)"); }
		@Test public void test_703() { testInvalid("(any & int)","(int | any | int)"); }
		@Test public void test_704() { testInvalid("(any & int)","(any | int | int)"); }
		@Test public void test_705() { testValid("(any & int)","(int | int | int)"); }
		@Test public void test_706() { testInvalid("(any & int)","(any & any & any)"); }
		@Test public void test_707() { testValid("(any & int)","(int & any & any)"); }
		@Test public void test_708() { testValid("(any & int)","(any & int & any)"); }
		@Test public void test_709() { testValid("(any & int)","(int & int & any)"); }
		@Test public void test_710() { testValid("(any & int)","(any & any & int)"); }
		@Test public void test_711() { testValid("(any & int)","(int & any & int)"); }
		@Test public void test_712() { testValid("(any & int)","(any & int & int)"); }
		@Test public void test_713() { testValid("(any & int)","(int & int & int)"); }
		@Test public void test_714() { testInvalid("(int & int)","any"); }
		@Test public void test_715() { testValid("(int & int)","int"); }
		@Test public void test_716() { testInvalid("(int & int)","{any}"); }
		@Test public void test_717() { testInvalid("(int & int)","{int}"); }
		@Test public void test_718() { testValid("(int & int)","!any"); }
		@Test public void test_719() { testInvalid("(int & int)","!int"); }
		@Test public void test_720() { testInvalid("(int & int)","{any, any}"); }
		@Test public void test_721() { testInvalid("(int & int)","{int, any}"); }
		@Test public void test_722() { testInvalid("(int & int)","{any, int}"); }
		@Test public void test_723() { testInvalid("(int & int)","{int, int}"); }
		@Test public void test_724() { testInvalid("(int & int)","(any | any)"); }
		@Test public void test_725() { testInvalid("(int & int)","(int | any)"); }
		@Test public void test_726() { testInvalid("(int & int)","(any | int)"); }
		@Test public void test_727() { testValid("(int & int)","(int | int)"); }
		@Test public void test_728() { testInvalid("(int & int)","(any & any)"); }
		@Test public void test_729() { testValid("(int & int)","(int & any)"); }
		@Test public void test_730() { testValid("(int & int)","(any & int)"); }
		@Test public void test_731() { testValid("(int & int)","(int & int)"); }
		@Test public void test_732() { testInvalid("(int & int)","{any, any, any}"); }
		@Test public void test_733() { testInvalid("(int & int)","{int, any, any}"); }
		@Test public void test_734() { testInvalid("(int & int)","{any, int, any}"); }
		@Test public void test_735() { testInvalid("(int & int)","{int, int, any}"); }
		@Test public void test_736() { testInvalid("(int & int)","{any, any, int}"); }
		@Test public void test_737() { testInvalid("(int & int)","{int, any, int}"); }
		@Test public void test_738() { testInvalid("(int & int)","{any, int, int}"); }
		@Test public void test_739() { testInvalid("(int & int)","{int, int, int}"); }
		@Test public void test_740() { testInvalid("(int & int)","(any | any | any)"); }
		@Test public void test_741() { testInvalid("(int & int)","(int | any | any)"); }
		@Test public void test_742() { testInvalid("(int & int)","(any | int | any)"); }
		@Test public void test_743() { testInvalid("(int & int)","(int | int | any)"); }
		@Test public void test_744() { testInvalid("(int & int)","(any | any | int)"); }
		@Test public void test_745() { testInvalid("(int & int)","(int | any | int)"); }
		@Test public void test_746() { testInvalid("(int & int)","(any | int | int)"); }
		@Test public void test_747() { testValid("(int & int)","(int | int | int)"); }
		@Test public void test_748() { testInvalid("(int & int)","(any & any & any)"); }
		@Test public void test_749() { testValid("(int & int)","(int & any & any)"); }
		@Test public void test_750() { testValid("(int & int)","(any & int & any)"); }
		@Test public void test_751() { testValid("(int & int)","(int & int & any)"); }
		@Test public void test_752() { testValid("(int & int)","(any & any & int)"); }
		@Test public void test_753() { testValid("(int & int)","(int & any & int)"); }
		@Test public void test_754() { testValid("(int & int)","(any & int & int)"); }
		@Test public void test_755() { testValid("(int & int)","(int & int & int)"); }
		@Test public void test_756() { testInvalid("{any, any, any}","any"); }
		@Test public void test_757() { testInvalid("{any, any, any}","int"); }
		@Test public void test_758() { testInvalid("{any, any, any}","{any}"); }
		@Test public void test_759() { testInvalid("{any, any, any}","{int}"); }
		@Test public void test_760() { testValid("{any, any, any}","!any"); }
		@Test public void test_761() { testInvalid("{any, any, any}","!int"); }
		@Test public void test_762() { testInvalid("{any, any, any}","{any, any}"); }
		@Test public void test_763() { testInvalid("{any, any, any}","{int, any}"); }
		@Test public void test_764() { testInvalid("{any, any, any}","{any, int}"); }
		@Test public void test_765() { testInvalid("{any, any, any}","{int, int}"); }
		@Test public void test_766() { testInvalid("{any, any, any}","(any | any)"); }
		@Test public void test_767() { testInvalid("{any, any, any}","(int | any)"); }
		@Test public void test_768() { testInvalid("{any, any, any}","(any | int)"); }
		@Test public void test_769() { testInvalid("{any, any, any}","(int | int)"); }
		@Test public void test_770() { testInvalid("{any, any, any}","(any & any)"); }
		@Test public void test_771() { testInvalid("{any, any, any}","(int & any)"); }
		@Test public void test_772() { testInvalid("{any, any, any}","(any & int)"); }
		@Test public void test_773() { testInvalid("{any, any, any}","(int & int)"); }
		@Test public void test_774() { testValid("{any, any, any}","{any, any, any}"); }
		@Test public void test_775() { testValid("{any, any, any}","{int, any, any}"); }
		@Test public void test_776() { testValid("{any, any, any}","{any, int, any}"); }
		@Test public void test_777() { testValid("{any, any, any}","{int, int, any}"); }
		@Test public void test_778() { testValid("{any, any, any}","{any, any, int}"); }
		@Test public void test_779() { testValid("{any, any, any}","{int, any, int}"); }
		@Test public void test_780() { testValid("{any, any, any}","{any, int, int}"); }
		@Test public void test_781() { testValid("{any, any, any}","{int, int, int}"); }
		@Test public void test_782() { testInvalid("{any, any, any}","(any | any | any)"); }
		@Test public void test_783() { testInvalid("{any, any, any}","(int | any | any)"); }
		@Test public void test_784() { testInvalid("{any, any, any}","(any | int | any)"); }
		@Test public void test_785() { testInvalid("{any, any, any}","(int | int | any)"); }
		@Test public void test_786() { testInvalid("{any, any, any}","(any | any | int)"); }
		@Test public void test_787() { testInvalid("{any, any, any}","(int | any | int)"); }
		@Test public void test_788() { testInvalid("{any, any, any}","(any | int | int)"); }
		@Test public void test_789() { testInvalid("{any, any, any}","(int | int | int)"); }
		@Test public void test_790() { testInvalid("{any, any, any}","(any & any & any)"); }
		@Test public void test_791() { testInvalid("{any, any, any}","(int & any & any)"); }
		@Test public void test_792() { testInvalid("{any, any, any}","(any & int & any)"); }
		@Test public void test_793() { testInvalid("{any, any, any}","(int & int & any)"); }
		@Test public void test_794() { testInvalid("{any, any, any}","(any & any & int)"); }
		@Test public void test_795() { testInvalid("{any, any, any}","(int & any & int)"); }
		@Test public void test_796() { testInvalid("{any, any, any}","(any & int & int)"); }
		@Test public void test_797() { testInvalid("{any, any, any}","(int & int & int)"); }
		@Test public void test_798() { testInvalid("{int, any, any}","any"); }
		@Test public void test_799() { testInvalid("{int, any, any}","int"); }
		@Test public void test_800() { testInvalid("{int, any, any}","{any}"); }
		@Test public void test_801() { testInvalid("{int, any, any}","{int}"); }
		@Test public void test_802() { testValid("{int, any, any}","!any"); }
		@Test public void test_803() { testInvalid("{int, any, any}","!int"); }
		@Test public void test_804() { testInvalid("{int, any, any}","{any, any}"); }
		@Test public void test_805() { testInvalid("{int, any, any}","{int, any}"); }
		@Test public void test_806() { testInvalid("{int, any, any}","{any, int}"); }
		@Test public void test_807() { testInvalid("{int, any, any}","{int, int}"); }
		@Test public void test_808() { testInvalid("{int, any, any}","(any | any)"); }
		@Test public void test_809() { testInvalid("{int, any, any}","(int | any)"); }
		@Test public void test_810() { testInvalid("{int, any, any}","(any | int)"); }
		@Test public void test_811() { testInvalid("{int, any, any}","(int | int)"); }
		@Test public void test_812() { testInvalid("{int, any, any}","(any & any)"); }
		@Test public void test_813() { testInvalid("{int, any, any}","(int & any)"); }
		@Test public void test_814() { testInvalid("{int, any, any}","(any & int)"); }
		@Test public void test_815() { testInvalid("{int, any, any}","(int & int)"); }
		@Test public void test_816() { testInvalid("{int, any, any}","{any, any, any}"); }
		@Test public void test_817() { testValid("{int, any, any}","{int, any, any}"); }
		@Test public void test_818() { testInvalid("{int, any, any}","{any, int, any}"); }
		@Test public void test_819() { testValid("{int, any, any}","{int, int, any}"); }
		@Test public void test_820() { testInvalid("{int, any, any}","{any, any, int}"); }
		@Test public void test_821() { testValid("{int, any, any}","{int, any, int}"); }
		@Test public void test_822() { testInvalid("{int, any, any}","{any, int, int}"); }
		@Test public void test_823() { testValid("{int, any, any}","{int, int, int}"); }
		@Test public void test_824() { testInvalid("{int, any, any}","(any | any | any)"); }
		@Test public void test_825() { testInvalid("{int, any, any}","(int | any | any)"); }
		@Test public void test_826() { testInvalid("{int, any, any}","(any | int | any)"); }
		@Test public void test_827() { testInvalid("{int, any, any}","(int | int | any)"); }
		@Test public void test_828() { testInvalid("{int, any, any}","(any | any | int)"); }
		@Test public void test_829() { testInvalid("{int, any, any}","(int | any | int)"); }
		@Test public void test_830() { testInvalid("{int, any, any}","(any | int | int)"); }
		@Test public void test_831() { testInvalid("{int, any, any}","(int | int | int)"); }
		@Test public void test_832() { testInvalid("{int, any, any}","(any & any & any)"); }
		@Test public void test_833() { testInvalid("{int, any, any}","(int & any & any)"); }
		@Test public void test_834() { testInvalid("{int, any, any}","(any & int & any)"); }
		@Test public void test_835() { testInvalid("{int, any, any}","(int & int & any)"); }
		@Test public void test_836() { testInvalid("{int, any, any}","(any & any & int)"); }
		@Test public void test_837() { testInvalid("{int, any, any}","(int & any & int)"); }
		@Test public void test_838() { testInvalid("{int, any, any}","(any & int & int)"); }
		@Test public void test_839() { testInvalid("{int, any, any}","(int & int & int)"); }
		@Test public void test_840() { testInvalid("{any, int, any}","any"); }
		@Test public void test_841() { testInvalid("{any, int, any}","int"); }
		@Test public void test_842() { testInvalid("{any, int, any}","{any}"); }
		@Test public void test_843() { testInvalid("{any, int, any}","{int}"); }
		@Test public void test_844() { testValid("{any, int, any}","!any"); }
		@Test public void test_845() { testInvalid("{any, int, any}","!int"); }
		@Test public void test_846() { testInvalid("{any, int, any}","{any, any}"); }
		@Test public void test_847() { testInvalid("{any, int, any}","{int, any}"); }
		@Test public void test_848() { testInvalid("{any, int, any}","{any, int}"); }
		@Test public void test_849() { testInvalid("{any, int, any}","{int, int}"); }
		@Test public void test_850() { testInvalid("{any, int, any}","(any | any)"); }
		@Test public void test_851() { testInvalid("{any, int, any}","(int | any)"); }
		@Test public void test_852() { testInvalid("{any, int, any}","(any | int)"); }
		@Test public void test_853() { testInvalid("{any, int, any}","(int | int)"); }
		@Test public void test_854() { testInvalid("{any, int, any}","(any & any)"); }
		@Test public void test_855() { testInvalid("{any, int, any}","(int & any)"); }
		@Test public void test_856() { testInvalid("{any, int, any}","(any & int)"); }
		@Test public void test_857() { testInvalid("{any, int, any}","(int & int)"); }
		@Test public void test_858() { testInvalid("{any, int, any}","{any, any, any}"); }
		@Test public void test_859() { testInvalid("{any, int, any}","{int, any, any}"); }
		@Test public void test_860() { testValid("{any, int, any}","{any, int, any}"); }
		@Test public void test_861() { testValid("{any, int, any}","{int, int, any}"); }
		@Test public void test_862() { testInvalid("{any, int, any}","{any, any, int}"); }
		@Test public void test_863() { testInvalid("{any, int, any}","{int, any, int}"); }
		@Test public void test_864() { testValid("{any, int, any}","{any, int, int}"); }
		@Test public void test_865() { testValid("{any, int, any}","{int, int, int}"); }
		@Test public void test_866() { testInvalid("{any, int, any}","(any | any | any)"); }
		@Test public void test_867() { testInvalid("{any, int, any}","(int | any | any)"); }
		@Test public void test_868() { testInvalid("{any, int, any}","(any | int | any)"); }
		@Test public void test_869() { testInvalid("{any, int, any}","(int | int | any)"); }
		@Test public void test_870() { testInvalid("{any, int, any}","(any | any | int)"); }
		@Test public void test_871() { testInvalid("{any, int, any}","(int | any | int)"); }
		@Test public void test_872() { testInvalid("{any, int, any}","(any | int | int)"); }
		@Test public void test_873() { testInvalid("{any, int, any}","(int | int | int)"); }
		@Test public void test_874() { testInvalid("{any, int, any}","(any & any & any)"); }
		@Test public void test_875() { testInvalid("{any, int, any}","(int & any & any)"); }
		@Test public void test_876() { testInvalid("{any, int, any}","(any & int & any)"); }
		@Test public void test_877() { testInvalid("{any, int, any}","(int & int & any)"); }
		@Test public void test_878() { testInvalid("{any, int, any}","(any & any & int)"); }
		@Test public void test_879() { testInvalid("{any, int, any}","(int & any & int)"); }
		@Test public void test_880() { testInvalid("{any, int, any}","(any & int & int)"); }
		@Test public void test_881() { testInvalid("{any, int, any}","(int & int & int)"); }
		@Test public void test_882() { testInvalid("{int, int, any}","any"); }
		@Test public void test_883() { testInvalid("{int, int, any}","int"); }
		@Test public void test_884() { testInvalid("{int, int, any}","{any}"); }
		@Test public void test_885() { testInvalid("{int, int, any}","{int}"); }
		@Test public void test_886() { testValid("{int, int, any}","!any"); }
		@Test public void test_887() { testInvalid("{int, int, any}","!int"); }
		@Test public void test_888() { testInvalid("{int, int, any}","{any, any}"); }
		@Test public void test_889() { testInvalid("{int, int, any}","{int, any}"); }
		@Test public void test_890() { testInvalid("{int, int, any}","{any, int}"); }
		@Test public void test_891() { testInvalid("{int, int, any}","{int, int}"); }
		@Test public void test_892() { testInvalid("{int, int, any}","(any | any)"); }
		@Test public void test_893() { testInvalid("{int, int, any}","(int | any)"); }
		@Test public void test_894() { testInvalid("{int, int, any}","(any | int)"); }
		@Test public void test_895() { testInvalid("{int, int, any}","(int | int)"); }
		@Test public void test_896() { testInvalid("{int, int, any}","(any & any)"); }
		@Test public void test_897() { testInvalid("{int, int, any}","(int & any)"); }
		@Test public void test_898() { testInvalid("{int, int, any}","(any & int)"); }
		@Test public void test_899() { testInvalid("{int, int, any}","(int & int)"); }
		@Test public void test_900() { testInvalid("{int, int, any}","{any, any, any}"); }
		@Test public void test_901() { testInvalid("{int, int, any}","{int, any, any}"); }
		@Test public void test_902() { testInvalid("{int, int, any}","{any, int, any}"); }
		@Test public void test_903() { testValid("{int, int, any}","{int, int, any}"); }
		@Test public void test_904() { testInvalid("{int, int, any}","{any, any, int}"); }
		@Test public void test_905() { testInvalid("{int, int, any}","{int, any, int}"); }
		@Test public void test_906() { testInvalid("{int, int, any}","{any, int, int}"); }
		@Test public void test_907() { testValid("{int, int, any}","{int, int, int}"); }
		@Test public void test_908() { testInvalid("{int, int, any}","(any | any | any)"); }
		@Test public void test_909() { testInvalid("{int, int, any}","(int | any | any)"); }
		@Test public void test_910() { testInvalid("{int, int, any}","(any | int | any)"); }
		@Test public void test_911() { testInvalid("{int, int, any}","(int | int | any)"); }
		@Test public void test_912() { testInvalid("{int, int, any}","(any | any | int)"); }
		@Test public void test_913() { testInvalid("{int, int, any}","(int | any | int)"); }
		@Test public void test_914() { testInvalid("{int, int, any}","(any | int | int)"); }
		@Test public void test_915() { testInvalid("{int, int, any}","(int | int | int)"); }
		@Test public void test_916() { testInvalid("{int, int, any}","(any & any & any)"); }
		@Test public void test_917() { testInvalid("{int, int, any}","(int & any & any)"); }
		@Test public void test_918() { testInvalid("{int, int, any}","(any & int & any)"); }
		@Test public void test_919() { testInvalid("{int, int, any}","(int & int & any)"); }
		@Test public void test_920() { testInvalid("{int, int, any}","(any & any & int)"); }
		@Test public void test_921() { testInvalid("{int, int, any}","(int & any & int)"); }
		@Test public void test_922() { testInvalid("{int, int, any}","(any & int & int)"); }
		@Test public void test_923() { testInvalid("{int, int, any}","(int & int & int)"); }
		@Test public void test_924() { testInvalid("{any, any, int}","any"); }
		@Test public void test_925() { testInvalid("{any, any, int}","int"); }
		@Test public void test_926() { testInvalid("{any, any, int}","{any}"); }
		@Test public void test_927() { testInvalid("{any, any, int}","{int}"); }
		@Test public void test_928() { testValid("{any, any, int}","!any"); }
		@Test public void test_929() { testInvalid("{any, any, int}","!int"); }
		@Test public void test_930() { testInvalid("{any, any, int}","{any, any}"); }
		@Test public void test_931() { testInvalid("{any, any, int}","{int, any}"); }
		@Test public void test_932() { testInvalid("{any, any, int}","{any, int}"); }
		@Test public void test_933() { testInvalid("{any, any, int}","{int, int}"); }
		@Test public void test_934() { testInvalid("{any, any, int}","(any | any)"); }
		@Test public void test_935() { testInvalid("{any, any, int}","(int | any)"); }
		@Test public void test_936() { testInvalid("{any, any, int}","(any | int)"); }
		@Test public void test_937() { testInvalid("{any, any, int}","(int | int)"); }
		@Test public void test_938() { testInvalid("{any, any, int}","(any & any)"); }
		@Test public void test_939() { testInvalid("{any, any, int}","(int & any)"); }
		@Test public void test_940() { testInvalid("{any, any, int}","(any & int)"); }
		@Test public void test_941() { testInvalid("{any, any, int}","(int & int)"); }
		@Test public void test_942() { testInvalid("{any, any, int}","{any, any, any}"); }
		@Test public void test_943() { testInvalid("{any, any, int}","{int, any, any}"); }
		@Test public void test_944() { testInvalid("{any, any, int}","{any, int, any}"); }
		@Test public void test_945() { testInvalid("{any, any, int}","{int, int, any}"); }
		@Test public void test_946() { testValid("{any, any, int}","{any, any, int}"); }
		@Test public void test_947() { testValid("{any, any, int}","{int, any, int}"); }
		@Test public void test_948() { testValid("{any, any, int}","{any, int, int}"); }
		@Test public void test_949() { testValid("{any, any, int}","{int, int, int}"); }
		@Test public void test_950() { testInvalid("{any, any, int}","(any | any | any)"); }
		@Test public void test_951() { testInvalid("{any, any, int}","(int | any | any)"); }
		@Test public void test_952() { testInvalid("{any, any, int}","(any | int | any)"); }
		@Test public void test_953() { testInvalid("{any, any, int}","(int | int | any)"); }
		@Test public void test_954() { testInvalid("{any, any, int}","(any | any | int)"); }
		@Test public void test_955() { testInvalid("{any, any, int}","(int | any | int)"); }
		@Test public void test_956() { testInvalid("{any, any, int}","(any | int | int)"); }
		@Test public void test_957() { testInvalid("{any, any, int}","(int | int | int)"); }
		@Test public void test_958() { testInvalid("{any, any, int}","(any & any & any)"); }
		@Test public void test_959() { testInvalid("{any, any, int}","(int & any & any)"); }
		@Test public void test_960() { testInvalid("{any, any, int}","(any & int & any)"); }
		@Test public void test_961() { testInvalid("{any, any, int}","(int & int & any)"); }
		@Test public void test_962() { testInvalid("{any, any, int}","(any & any & int)"); }
		@Test public void test_963() { testInvalid("{any, any, int}","(int & any & int)"); }
		@Test public void test_964() { testInvalid("{any, any, int}","(any & int & int)"); }
		@Test public void test_965() { testInvalid("{any, any, int}","(int & int & int)"); }
		@Test public void test_966() { testInvalid("{int, any, int}","any"); }
		@Test public void test_967() { testInvalid("{int, any, int}","int"); }
		@Test public void test_968() { testInvalid("{int, any, int}","{any}"); }
		@Test public void test_969() { testInvalid("{int, any, int}","{int}"); }
		@Test public void test_970() { testValid("{int, any, int}","!any"); }
		@Test public void test_971() { testInvalid("{int, any, int}","!int"); }
		@Test public void test_972() { testInvalid("{int, any, int}","{any, any}"); }
		@Test public void test_973() { testInvalid("{int, any, int}","{int, any}"); }
		@Test public void test_974() { testInvalid("{int, any, int}","{any, int}"); }
		@Test public void test_975() { testInvalid("{int, any, int}","{int, int}"); }
		@Test public void test_976() { testInvalid("{int, any, int}","(any | any)"); }
		@Test public void test_977() { testInvalid("{int, any, int}","(int | any)"); }
		@Test public void test_978() { testInvalid("{int, any, int}","(any | int)"); }
		@Test public void test_979() { testInvalid("{int, any, int}","(int | int)"); }
		@Test public void test_980() { testInvalid("{int, any, int}","(any & any)"); }
		@Test public void test_981() { testInvalid("{int, any, int}","(int & any)"); }
		@Test public void test_982() { testInvalid("{int, any, int}","(any & int)"); }
		@Test public void test_983() { testInvalid("{int, any, int}","(int & int)"); }
		@Test public void test_984() { testInvalid("{int, any, int}","{any, any, any}"); }
		@Test public void test_985() { testInvalid("{int, any, int}","{int, any, any}"); }
		@Test public void test_986() { testInvalid("{int, any, int}","{any, int, any}"); }
		@Test public void test_987() { testInvalid("{int, any, int}","{int, int, any}"); }
		@Test public void test_988() { testInvalid("{int, any, int}","{any, any, int}"); }
		@Test public void test_989() { testValid("{int, any, int}","{int, any, int}"); }
		@Test public void test_990() { testInvalid("{int, any, int}","{any, int, int}"); }
		@Test public void test_991() { testValid("{int, any, int}","{int, int, int}"); }
		@Test public void test_992() { testInvalid("{int, any, int}","(any | any | any)"); }
		@Test public void test_993() { testInvalid("{int, any, int}","(int | any | any)"); }
		@Test public void test_994() { testInvalid("{int, any, int}","(any | int | any)"); }
		@Test public void test_995() { testInvalid("{int, any, int}","(int | int | any)"); }
		@Test public void test_996() { testInvalid("{int, any, int}","(any | any | int)"); }
		@Test public void test_997() { testInvalid("{int, any, int}","(int | any | int)"); }
		@Test public void test_998() { testInvalid("{int, any, int}","(any | int | int)"); }
		@Test public void test_999() { testInvalid("{int, any, int}","(int | int | int)"); }
		@Test public void test_1000() { testInvalid("{int, any, int}","(any & any & any)"); }
		@Test public void test_1001() { testInvalid("{int, any, int}","(int & any & any)"); }
		@Test public void test_1002() { testInvalid("{int, any, int}","(any & int & any)"); }
		@Test public void test_1003() { testInvalid("{int, any, int}","(int & int & any)"); }
		@Test public void test_1004() { testInvalid("{int, any, int}","(any & any & int)"); }
		@Test public void test_1005() { testInvalid("{int, any, int}","(int & any & int)"); }
		@Test public void test_1006() { testInvalid("{int, any, int}","(any & int & int)"); }
		@Test public void test_1007() { testInvalid("{int, any, int}","(int & int & int)"); }
		@Test public void test_1008() { testInvalid("{any, int, int}","any"); }
		@Test public void test_1009() { testInvalid("{any, int, int}","int"); }
		@Test public void test_1010() { testInvalid("{any, int, int}","{any}"); }
		@Test public void test_1011() { testInvalid("{any, int, int}","{int}"); }
		@Test public void test_1012() { testValid("{any, int, int}","!any"); }
		@Test public void test_1013() { testInvalid("{any, int, int}","!int"); }
		@Test public void test_1014() { testInvalid("{any, int, int}","{any, any}"); }
		@Test public void test_1015() { testInvalid("{any, int, int}","{int, any}"); }
		@Test public void test_1016() { testInvalid("{any, int, int}","{any, int}"); }
		@Test public void test_1017() { testInvalid("{any, int, int}","{int, int}"); }
		@Test public void test_1018() { testInvalid("{any, int, int}","(any | any)"); }
		@Test public void test_1019() { testInvalid("{any, int, int}","(int | any)"); }
		@Test public void test_1020() { testInvalid("{any, int, int}","(any | int)"); }
		@Test public void test_1021() { testInvalid("{any, int, int}","(int | int)"); }
		@Test public void test_1022() { testInvalid("{any, int, int}","(any & any)"); }
		@Test public void test_1023() { testInvalid("{any, int, int}","(int & any)"); }
		@Test public void test_1024() { testInvalid("{any, int, int}","(any & int)"); }
		@Test public void test_1025() { testInvalid("{any, int, int}","(int & int)"); }
		@Test public void test_1026() { testInvalid("{any, int, int}","{any, any, any}"); }
		@Test public void test_1027() { testInvalid("{any, int, int}","{int, any, any}"); }
		@Test public void test_1028() { testInvalid("{any, int, int}","{any, int, any}"); }
		@Test public void test_1029() { testInvalid("{any, int, int}","{int, int, any}"); }
		@Test public void test_1030() { testInvalid("{any, int, int}","{any, any, int}"); }
		@Test public void test_1031() { testInvalid("{any, int, int}","{int, any, int}"); }
		@Test public void test_1032() { testValid("{any, int, int}","{any, int, int}"); }
		@Test public void test_1033() { testValid("{any, int, int}","{int, int, int}"); }
		@Test public void test_1034() { testInvalid("{any, int, int}","(any | any | any)"); }
		@Test public void test_1035() { testInvalid("{any, int, int}","(int | any | any)"); }
		@Test public void test_1036() { testInvalid("{any, int, int}","(any | int | any)"); }
		@Test public void test_1037() { testInvalid("{any, int, int}","(int | int | any)"); }
		@Test public void test_1038() { testInvalid("{any, int, int}","(any | any | int)"); }
		@Test public void test_1039() { testInvalid("{any, int, int}","(int | any | int)"); }
		@Test public void test_1040() { testInvalid("{any, int, int}","(any | int | int)"); }
		@Test public void test_1041() { testInvalid("{any, int, int}","(int | int | int)"); }
		@Test public void test_1042() { testInvalid("{any, int, int}","(any & any & any)"); }
		@Test public void test_1043() { testInvalid("{any, int, int}","(int & any & any)"); }
		@Test public void test_1044() { testInvalid("{any, int, int}","(any & int & any)"); }
		@Test public void test_1045() { testInvalid("{any, int, int}","(int & int & any)"); }
		@Test public void test_1046() { testInvalid("{any, int, int}","(any & any & int)"); }
		@Test public void test_1047() { testInvalid("{any, int, int}","(int & any & int)"); }
		@Test public void test_1048() { testInvalid("{any, int, int}","(any & int & int)"); }
		@Test public void test_1049() { testInvalid("{any, int, int}","(int & int & int)"); }
		@Test public void test_1050() { testInvalid("{int, int, int}","any"); }
		@Test public void test_1051() { testInvalid("{int, int, int}","int"); }
		@Test public void test_1052() { testInvalid("{int, int, int}","{any}"); }
		@Test public void test_1053() { testInvalid("{int, int, int}","{int}"); }
		@Test public void test_1054() { testValid("{int, int, int}","!any"); }
		@Test public void test_1055() { testInvalid("{int, int, int}","!int"); }
		@Test public void test_1056() { testInvalid("{int, int, int}","{any, any}"); }
		@Test public void test_1057() { testInvalid("{int, int, int}","{int, any}"); }
		@Test public void test_1058() { testInvalid("{int, int, int}","{any, int}"); }
		@Test public void test_1059() { testInvalid("{int, int, int}","{int, int}"); }
		@Test public void test_1060() { testInvalid("{int, int, int}","(any | any)"); }
		@Test public void test_1061() { testInvalid("{int, int, int}","(int | any)"); }
		@Test public void test_1062() { testInvalid("{int, int, int}","(any | int)"); }
		@Test public void test_1063() { testInvalid("{int, int, int}","(int | int)"); }
		@Test public void test_1064() { testInvalid("{int, int, int}","(any & any)"); }
		@Test public void test_1065() { testInvalid("{int, int, int}","(int & any)"); }
		@Test public void test_1066() { testInvalid("{int, int, int}","(any & int)"); }
		@Test public void test_1067() { testInvalid("{int, int, int}","(int & int)"); }
		@Test public void test_1068() { testInvalid("{int, int, int}","{any, any, any}"); }
		@Test public void test_1069() { testInvalid("{int, int, int}","{int, any, any}"); }
		@Test public void test_1070() { testInvalid("{int, int, int}","{any, int, any}"); }
		@Test public void test_1071() { testInvalid("{int, int, int}","{int, int, any}"); }
		@Test public void test_1072() { testInvalid("{int, int, int}","{any, any, int}"); }
		@Test public void test_1073() { testInvalid("{int, int, int}","{int, any, int}"); }
		@Test public void test_1074() { testInvalid("{int, int, int}","{any, int, int}"); }
		@Test public void test_1075() { testValid("{int, int, int}","{int, int, int}"); }
		@Test public void test_1076() { testInvalid("{int, int, int}","(any | any | any)"); }
		@Test public void test_1077() { testInvalid("{int, int, int}","(int | any | any)"); }
		@Test public void test_1078() { testInvalid("{int, int, int}","(any | int | any)"); }
		@Test public void test_1079() { testInvalid("{int, int, int}","(int | int | any)"); }
		@Test public void test_1080() { testInvalid("{int, int, int}","(any | any | int)"); }
		@Test public void test_1081() { testInvalid("{int, int, int}","(int | any | int)"); }
		@Test public void test_1082() { testInvalid("{int, int, int}","(any | int | int)"); }
		@Test public void test_1083() { testInvalid("{int, int, int}","(int | int | int)"); }
		@Test public void test_1084() { testInvalid("{int, int, int}","(any & any & any)"); }
		@Test public void test_1085() { testInvalid("{int, int, int}","(int & any & any)"); }
		@Test public void test_1086() { testInvalid("{int, int, int}","(any & int & any)"); }
		@Test public void test_1087() { testInvalid("{int, int, int}","(int & int & any)"); }
		@Test public void test_1088() { testInvalid("{int, int, int}","(any & any & int)"); }
		@Test public void test_1089() { testInvalid("{int, int, int}","(int & any & int)"); }
		@Test public void test_1090() { testInvalid("{int, int, int}","(any & int & int)"); }
		@Test public void test_1091() { testInvalid("{int, int, int}","(int & int & int)"); }
		@Test public void test_1092() { testValid("(any | any | any)","any"); }
		@Test public void test_1093() { testValid("(any | any | any)","int"); }
		@Test public void test_1094() { testValid("(any | any | any)","{any}"); }
		@Test public void test_1095() { testValid("(any | any | any)","{int}"); }
		@Test public void test_1096() { testValid("(any | any | any)","!any"); }
		@Test public void test_1097() { testValid("(any | any | any)","!int"); }
		@Test public void test_1098() { testValid("(any | any | any)","{any, any}"); }
		@Test public void test_1099() { testValid("(any | any | any)","{int, any}"); }
		@Test public void test_1100() { testValid("(any | any | any)","{any, int}"); }
		@Test public void test_1101() { testValid("(any | any | any)","{int, int}"); }
		@Test public void test_1102() { testValid("(any | any | any)","(any | any)"); }
		@Test public void test_1103() { testValid("(any | any | any)","(int | any)"); }
		@Test public void test_1104() { testValid("(any | any | any)","(any | int)"); }
		@Test public void test_1105() { testValid("(any | any | any)","(int | int)"); }
		@Test public void test_1106() { testValid("(any | any | any)","(any & any)"); }
		@Test public void test_1107() { testValid("(any | any | any)","(int & any)"); }
		@Test public void test_1108() { testValid("(any | any | any)","(any & int)"); }
		@Test public void test_1109() { testValid("(any | any | any)","(int & int)"); }
		@Test public void test_1110() { testValid("(any | any | any)","{any, any, any}"); }
		@Test public void test_1111() { testValid("(any | any | any)","{int, any, any}"); }
		@Test public void test_1112() { testValid("(any | any | any)","{any, int, any}"); }
		@Test public void test_1113() { testValid("(any | any | any)","{int, int, any}"); }
		@Test public void test_1114() { testValid("(any | any | any)","{any, any, int}"); }
		@Test public void test_1115() { testValid("(any | any | any)","{int, any, int}"); }
		@Test public void test_1116() { testValid("(any | any | any)","{any, int, int}"); }
		@Test public void test_1117() { testValid("(any | any | any)","{int, int, int}"); }
		@Test public void test_1118() { testValid("(any | any | any)","(any | any | any)"); }
		@Test public void test_1119() { testValid("(any | any | any)","(int | any | any)"); }
		@Test public void test_1120() { testValid("(any | any | any)","(any | int | any)"); }
		@Test public void test_1121() { testValid("(any | any | any)","(int | int | any)"); }
		@Test public void test_1122() { testValid("(any | any | any)","(any | any | int)"); }
		@Test public void test_1123() { testValid("(any | any | any)","(int | any | int)"); }
		@Test public void test_1124() { testValid("(any | any | any)","(any | int | int)"); }
		@Test public void test_1125() { testValid("(any | any | any)","(int | int | int)"); }
		@Test public void test_1126() { testValid("(any | any | any)","(any & any & any)"); }
		@Test public void test_1127() { testValid("(any | any | any)","(int & any & any)"); }
		@Test public void test_1128() { testValid("(any | any | any)","(any & int & any)"); }
		@Test public void test_1129() { testValid("(any | any | any)","(int & int & any)"); }
		@Test public void test_1130() { testValid("(any | any | any)","(any & any & int)"); }
		@Test public void test_1131() { testValid("(any | any | any)","(int & any & int)"); }
		@Test public void test_1132() { testValid("(any | any | any)","(any & int & int)"); }
		@Test public void test_1133() { testValid("(any | any | any)","(int & int & int)"); }
		@Test public void test_1134() { testValid("(int | any | any)","any"); }
		@Test public void test_1135() { testValid("(int | any | any)","int"); }
		@Test public void test_1136() { testValid("(int | any | any)","{any}"); }
		@Test public void test_1137() { testValid("(int | any | any)","{int}"); }
		@Test public void test_1138() { testValid("(int | any | any)","!any"); }
		@Test public void test_1139() { testValid("(int | any | any)","!int"); }
		@Test public void test_1140() { testValid("(int | any | any)","{any, any}"); }
		@Test public void test_1141() { testValid("(int | any | any)","{int, any}"); }
		@Test public void test_1142() { testValid("(int | any | any)","{any, int}"); }
		@Test public void test_1143() { testValid("(int | any | any)","{int, int}"); }
		@Test public void test_1144() { testValid("(int | any | any)","(any | any)"); }
		@Test public void test_1145() { testValid("(int | any | any)","(int | any)"); }
		@Test public void test_1146() { testValid("(int | any | any)","(any | int)"); }
		@Test public void test_1147() { testValid("(int | any | any)","(int | int)"); }
		@Test public void test_1148() { testValid("(int | any | any)","(any & any)"); }
		@Test public void test_1149() { testValid("(int | any | any)","(int & any)"); }
		@Test public void test_1150() { testValid("(int | any | any)","(any & int)"); }
		@Test public void test_1151() { testValid("(int | any | any)","(int & int)"); }
		@Test public void test_1152() { testValid("(int | any | any)","{any, any, any}"); }
		@Test public void test_1153() { testValid("(int | any | any)","{int, any, any}"); }
		@Test public void test_1154() { testValid("(int | any | any)","{any, int, any}"); }
		@Test public void test_1155() { testValid("(int | any | any)","{int, int, any}"); }
		@Test public void test_1156() { testValid("(int | any | any)","{any, any, int}"); }
		@Test public void test_1157() { testValid("(int | any | any)","{int, any, int}"); }
		@Test public void test_1158() { testValid("(int | any | any)","{any, int, int}"); }
		@Test public void test_1159() { testValid("(int | any | any)","{int, int, int}"); }
		@Test public void test_1160() { testValid("(int | any | any)","(any | any | any)"); }
		@Test public void test_1161() { testValid("(int | any | any)","(int | any | any)"); }
		@Test public void test_1162() { testValid("(int | any | any)","(any | int | any)"); }
		@Test public void test_1163() { testValid("(int | any | any)","(int | int | any)"); }
		@Test public void test_1164() { testValid("(int | any | any)","(any | any | int)"); }
		@Test public void test_1165() { testValid("(int | any | any)","(int | any | int)"); }
		@Test public void test_1166() { testValid("(int | any | any)","(any | int | int)"); }
		@Test public void test_1167() { testValid("(int | any | any)","(int | int | int)"); }
		@Test public void test_1168() { testValid("(int | any | any)","(any & any & any)"); }
		@Test public void test_1169() { testValid("(int | any | any)","(int & any & any)"); }
		@Test public void test_1170() { testValid("(int | any | any)","(any & int & any)"); }
		@Test public void test_1171() { testValid("(int | any | any)","(int & int & any)"); }
		@Test public void test_1172() { testValid("(int | any | any)","(any & any & int)"); }
		@Test public void test_1173() { testValid("(int | any | any)","(int & any & int)"); }
		@Test public void test_1174() { testValid("(int | any | any)","(any & int & int)"); }
		@Test public void test_1175() { testValid("(int | any | any)","(int & int & int)"); }
		@Test public void test_1176() { testValid("(any | int | any)","any"); }
		@Test public void test_1177() { testValid("(any | int | any)","int"); }
		@Test public void test_1178() { testValid("(any | int | any)","{any}"); }
		@Test public void test_1179() { testValid("(any | int | any)","{int}"); }
		@Test public void test_1180() { testValid("(any | int | any)","!any"); }
		@Test public void test_1181() { testValid("(any | int | any)","!int"); }
		@Test public void test_1182() { testValid("(any | int | any)","{any, any}"); }
		@Test public void test_1183() { testValid("(any | int | any)","{int, any}"); }
		@Test public void test_1184() { testValid("(any | int | any)","{any, int}"); }
		@Test public void test_1185() { testValid("(any | int | any)","{int, int}"); }
		@Test public void test_1186() { testValid("(any | int | any)","(any | any)"); }
		@Test public void test_1187() { testValid("(any | int | any)","(int | any)"); }
		@Test public void test_1188() { testValid("(any | int | any)","(any | int)"); }
		@Test public void test_1189() { testValid("(any | int | any)","(int | int)"); }
		@Test public void test_1190() { testValid("(any | int | any)","(any & any)"); }
		@Test public void test_1191() { testValid("(any | int | any)","(int & any)"); }
		@Test public void test_1192() { testValid("(any | int | any)","(any & int)"); }
		@Test public void test_1193() { testValid("(any | int | any)","(int & int)"); }
		@Test public void test_1194() { testValid("(any | int | any)","{any, any, any}"); }
		@Test public void test_1195() { testValid("(any | int | any)","{int, any, any}"); }
		@Test public void test_1196() { testValid("(any | int | any)","{any, int, any}"); }
		@Test public void test_1197() { testValid("(any | int | any)","{int, int, any}"); }
		@Test public void test_1198() { testValid("(any | int | any)","{any, any, int}"); }
		@Test public void test_1199() { testValid("(any | int | any)","{int, any, int}"); }
		@Test public void test_1200() { testValid("(any | int | any)","{any, int, int}"); }
		@Test public void test_1201() { testValid("(any | int | any)","{int, int, int}"); }
		@Test public void test_1202() { testValid("(any | int | any)","(any | any | any)"); }
		@Test public void test_1203() { testValid("(any | int | any)","(int | any | any)"); }
		@Test public void test_1204() { testValid("(any | int | any)","(any | int | any)"); }
		@Test public void test_1205() { testValid("(any | int | any)","(int | int | any)"); }
		@Test public void test_1206() { testValid("(any | int | any)","(any | any | int)"); }
		@Test public void test_1207() { testValid("(any | int | any)","(int | any | int)"); }
		@Test public void test_1208() { testValid("(any | int | any)","(any | int | int)"); }
		@Test public void test_1209() { testValid("(any | int | any)","(int | int | int)"); }
		@Test public void test_1210() { testValid("(any | int | any)","(any & any & any)"); }
		@Test public void test_1211() { testValid("(any | int | any)","(int & any & any)"); }
		@Test public void test_1212() { testValid("(any | int | any)","(any & int & any)"); }
		@Test public void test_1213() { testValid("(any | int | any)","(int & int & any)"); }
		@Test public void test_1214() { testValid("(any | int | any)","(any & any & int)"); }
		@Test public void test_1215() { testValid("(any | int | any)","(int & any & int)"); }
		@Test public void test_1216() { testValid("(any | int | any)","(any & int & int)"); }
		@Test public void test_1217() { testValid("(any | int | any)","(int & int & int)"); }
		@Test public void test_1218() { testValid("(int | int | any)","any"); }
		@Test public void test_1219() { testValid("(int | int | any)","int"); }
		@Test public void test_1220() { testValid("(int | int | any)","{any}"); }
		@Test public void test_1221() { testValid("(int | int | any)","{int}"); }
		@Test public void test_1222() { testValid("(int | int | any)","!any"); }
		@Test public void test_1223() { testValid("(int | int | any)","!int"); }
		@Test public void test_1224() { testValid("(int | int | any)","{any, any}"); }
		@Test public void test_1225() { testValid("(int | int | any)","{int, any}"); }
		@Test public void test_1226() { testValid("(int | int | any)","{any, int}"); }
		@Test public void test_1227() { testValid("(int | int | any)","{int, int}"); }
		@Test public void test_1228() { testValid("(int | int | any)","(any | any)"); }
		@Test public void test_1229() { testValid("(int | int | any)","(int | any)"); }
		@Test public void test_1230() { testValid("(int | int | any)","(any | int)"); }
		@Test public void test_1231() { testValid("(int | int | any)","(int | int)"); }
		@Test public void test_1232() { testValid("(int | int | any)","(any & any)"); }
		@Test public void test_1233() { testValid("(int | int | any)","(int & any)"); }
		@Test public void test_1234() { testValid("(int | int | any)","(any & int)"); }
		@Test public void test_1235() { testValid("(int | int | any)","(int & int)"); }
		@Test public void test_1236() { testValid("(int | int | any)","{any, any, any}"); }
		@Test public void test_1237() { testValid("(int | int | any)","{int, any, any}"); }
		@Test public void test_1238() { testValid("(int | int | any)","{any, int, any}"); }
		@Test public void test_1239() { testValid("(int | int | any)","{int, int, any}"); }
		@Test public void test_1240() { testValid("(int | int | any)","{any, any, int}"); }
		@Test public void test_1241() { testValid("(int | int | any)","{int, any, int}"); }
		@Test public void test_1242() { testValid("(int | int | any)","{any, int, int}"); }
		@Test public void test_1243() { testValid("(int | int | any)","{int, int, int}"); }
		@Test public void test_1244() { testValid("(int | int | any)","(any | any | any)"); }
		@Test public void test_1245() { testValid("(int | int | any)","(int | any | any)"); }
		@Test public void test_1246() { testValid("(int | int | any)","(any | int | any)"); }
		@Test public void test_1247() { testValid("(int | int | any)","(int | int | any)"); }
		@Test public void test_1248() { testValid("(int | int | any)","(any | any | int)"); }
		@Test public void test_1249() { testValid("(int | int | any)","(int | any | int)"); }
		@Test public void test_1250() { testValid("(int | int | any)","(any | int | int)"); }
		@Test public void test_1251() { testValid("(int | int | any)","(int | int | int)"); }
		@Test public void test_1252() { testValid("(int | int | any)","(any & any & any)"); }
		@Test public void test_1253() { testValid("(int | int | any)","(int & any & any)"); }
		@Test public void test_1254() { testValid("(int | int | any)","(any & int & any)"); }
		@Test public void test_1255() { testValid("(int | int | any)","(int & int & any)"); }
		@Test public void test_1256() { testValid("(int | int | any)","(any & any & int)"); }
		@Test public void test_1257() { testValid("(int | int | any)","(int & any & int)"); }
		@Test public void test_1258() { testValid("(int | int | any)","(any & int & int)"); }
		@Test public void test_1259() { testValid("(int | int | any)","(int & int & int)"); }
		@Test public void test_1260() { testValid("(any | any | int)","any"); }
		@Test public void test_1261() { testValid("(any | any | int)","int"); }
		@Test public void test_1262() { testValid("(any | any | int)","{any}"); }
		@Test public void test_1263() { testValid("(any | any | int)","{int}"); }
		@Test public void test_1264() { testValid("(any | any | int)","!any"); }
		@Test public void test_1265() { testValid("(any | any | int)","!int"); }
		@Test public void test_1266() { testValid("(any | any | int)","{any, any}"); }
		@Test public void test_1267() { testValid("(any | any | int)","{int, any}"); }
		@Test public void test_1268() { testValid("(any | any | int)","{any, int}"); }
		@Test public void test_1269() { testValid("(any | any | int)","{int, int}"); }
		@Test public void test_1270() { testValid("(any | any | int)","(any | any)"); }
		@Test public void test_1271() { testValid("(any | any | int)","(int | any)"); }
		@Test public void test_1272() { testValid("(any | any | int)","(any | int)"); }
		@Test public void test_1273() { testValid("(any | any | int)","(int | int)"); }
		@Test public void test_1274() { testValid("(any | any | int)","(any & any)"); }
		@Test public void test_1275() { testValid("(any | any | int)","(int & any)"); }
		@Test public void test_1276() { testValid("(any | any | int)","(any & int)"); }
		@Test public void test_1277() { testValid("(any | any | int)","(int & int)"); }
		@Test public void test_1278() { testValid("(any | any | int)","{any, any, any}"); }
		@Test public void test_1279() { testValid("(any | any | int)","{int, any, any}"); }
		@Test public void test_1280() { testValid("(any | any | int)","{any, int, any}"); }
		@Test public void test_1281() { testValid("(any | any | int)","{int, int, any}"); }
		@Test public void test_1282() { testValid("(any | any | int)","{any, any, int}"); }
		@Test public void test_1283() { testValid("(any | any | int)","{int, any, int}"); }
		@Test public void test_1284() { testValid("(any | any | int)","{any, int, int}"); }
		@Test public void test_1285() { testValid("(any | any | int)","{int, int, int}"); }
		@Test public void test_1286() { testValid("(any | any | int)","(any | any | any)"); }
		@Test public void test_1287() { testValid("(any | any | int)","(int | any | any)"); }
		@Test public void test_1288() { testValid("(any | any | int)","(any | int | any)"); }
		@Test public void test_1289() { testValid("(any | any | int)","(int | int | any)"); }
		@Test public void test_1290() { testValid("(any | any | int)","(any | any | int)"); }
		@Test public void test_1291() { testValid("(any | any | int)","(int | any | int)"); }
		@Test public void test_1292() { testValid("(any | any | int)","(any | int | int)"); }
		@Test public void test_1293() { testValid("(any | any | int)","(int | int | int)"); }
		@Test public void test_1294() { testValid("(any | any | int)","(any & any & any)"); }
		@Test public void test_1295() { testValid("(any | any | int)","(int & any & any)"); }
		@Test public void test_1296() { testValid("(any | any | int)","(any & int & any)"); }
		@Test public void test_1297() { testValid("(any | any | int)","(int & int & any)"); }
		@Test public void test_1298() { testValid("(any | any | int)","(any & any & int)"); }
		@Test public void test_1299() { testValid("(any | any | int)","(int & any & int)"); }
		@Test public void test_1300() { testValid("(any | any | int)","(any & int & int)"); }
		@Test public void test_1301() { testValid("(any | any | int)","(int & int & int)"); }
		@Test public void test_1302() { testValid("(int | any | int)","any"); }
		@Test public void test_1303() { testValid("(int | any | int)","int"); }
		@Test public void test_1304() { testValid("(int | any | int)","{any}"); }
		@Test public void test_1305() { testValid("(int | any | int)","{int}"); }
		@Test public void test_1306() { testValid("(int | any | int)","!any"); }
		@Test public void test_1307() { testValid("(int | any | int)","!int"); }
		@Test public void test_1308() { testValid("(int | any | int)","{any, any}"); }
		@Test public void test_1309() { testValid("(int | any | int)","{int, any}"); }
		@Test public void test_1310() { testValid("(int | any | int)","{any, int}"); }
		@Test public void test_1311() { testValid("(int | any | int)","{int, int}"); }
		@Test public void test_1312() { testValid("(int | any | int)","(any | any)"); }
		@Test public void test_1313() { testValid("(int | any | int)","(int | any)"); }
		@Test public void test_1314() { testValid("(int | any | int)","(any | int)"); }
		@Test public void test_1315() { testValid("(int | any | int)","(int | int)"); }
		@Test public void test_1316() { testValid("(int | any | int)","(any & any)"); }
		@Test public void test_1317() { testValid("(int | any | int)","(int & any)"); }
		@Test public void test_1318() { testValid("(int | any | int)","(any & int)"); }
		@Test public void test_1319() { testValid("(int | any | int)","(int & int)"); }
		@Test public void test_1320() { testValid("(int | any | int)","{any, any, any}"); }
		@Test public void test_1321() { testValid("(int | any | int)","{int, any, any}"); }
		@Test public void test_1322() { testValid("(int | any | int)","{any, int, any}"); }
		@Test public void test_1323() { testValid("(int | any | int)","{int, int, any}"); }
		@Test public void test_1324() { testValid("(int | any | int)","{any, any, int}"); }
		@Test public void test_1325() { testValid("(int | any | int)","{int, any, int}"); }
		@Test public void test_1326() { testValid("(int | any | int)","{any, int, int}"); }
		@Test public void test_1327() { testValid("(int | any | int)","{int, int, int}"); }
		@Test public void test_1328() { testValid("(int | any | int)","(any | any | any)"); }
		@Test public void test_1329() { testValid("(int | any | int)","(int | any | any)"); }
		@Test public void test_1330() { testValid("(int | any | int)","(any | int | any)"); }
		@Test public void test_1331() { testValid("(int | any | int)","(int | int | any)"); }
		@Test public void test_1332() { testValid("(int | any | int)","(any | any | int)"); }
		@Test public void test_1333() { testValid("(int | any | int)","(int | any | int)"); }
		@Test public void test_1334() { testValid("(int | any | int)","(any | int | int)"); }
		@Test public void test_1335() { testValid("(int | any | int)","(int | int | int)"); }
		@Test public void test_1336() { testValid("(int | any | int)","(any & any & any)"); }
		@Test public void test_1337() { testValid("(int | any | int)","(int & any & any)"); }
		@Test public void test_1338() { testValid("(int | any | int)","(any & int & any)"); }
		@Test public void test_1339() { testValid("(int | any | int)","(int & int & any)"); }
		@Test public void test_1340() { testValid("(int | any | int)","(any & any & int)"); }
		@Test public void test_1341() { testValid("(int | any | int)","(int & any & int)"); }
		@Test public void test_1342() { testValid("(int | any | int)","(any & int & int)"); }
		@Test public void test_1343() { testValid("(int | any | int)","(int & int & int)"); }
		@Test public void test_1344() { testValid("(any | int | int)","any"); }
		@Test public void test_1345() { testValid("(any | int | int)","int"); }
		@Test public void test_1346() { testValid("(any | int | int)","{any}"); }
		@Test public void test_1347() { testValid("(any | int | int)","{int}"); }
		@Test public void test_1348() { testValid("(any | int | int)","!any"); }
		@Test public void test_1349() { testValid("(any | int | int)","!int"); }
		@Test public void test_1350() { testValid("(any | int | int)","{any, any}"); }
		@Test public void test_1351() { testValid("(any | int | int)","{int, any}"); }
		@Test public void test_1352() { testValid("(any | int | int)","{any, int}"); }
		@Test public void test_1353() { testValid("(any | int | int)","{int, int}"); }
		@Test public void test_1354() { testValid("(any | int | int)","(any | any)"); }
		@Test public void test_1355() { testValid("(any | int | int)","(int | any)"); }
		@Test public void test_1356() { testValid("(any | int | int)","(any | int)"); }
		@Test public void test_1357() { testValid("(any | int | int)","(int | int)"); }
		@Test public void test_1358() { testValid("(any | int | int)","(any & any)"); }
		@Test public void test_1359() { testValid("(any | int | int)","(int & any)"); }
		@Test public void test_1360() { testValid("(any | int | int)","(any & int)"); }
		@Test public void test_1361() { testValid("(any | int | int)","(int & int)"); }
		@Test public void test_1362() { testValid("(any | int | int)","{any, any, any}"); }
		@Test public void test_1363() { testValid("(any | int | int)","{int, any, any}"); }
		@Test public void test_1364() { testValid("(any | int | int)","{any, int, any}"); }
		@Test public void test_1365() { testValid("(any | int | int)","{int, int, any}"); }
		@Test public void test_1366() { testValid("(any | int | int)","{any, any, int}"); }
		@Test public void test_1367() { testValid("(any | int | int)","{int, any, int}"); }
		@Test public void test_1368() { testValid("(any | int | int)","{any, int, int}"); }
		@Test public void test_1369() { testValid("(any | int | int)","{int, int, int}"); }
		@Test public void test_1370() { testValid("(any | int | int)","(any | any | any)"); }
		@Test public void test_1371() { testValid("(any | int | int)","(int | any | any)"); }
		@Test public void test_1372() { testValid("(any | int | int)","(any | int | any)"); }
		@Test public void test_1373() { testValid("(any | int | int)","(int | int | any)"); }
		@Test public void test_1374() { testValid("(any | int | int)","(any | any | int)"); }
		@Test public void test_1375() { testValid("(any | int | int)","(int | any | int)"); }
		@Test public void test_1376() { testValid("(any | int | int)","(any | int | int)"); }
		@Test public void test_1377() { testValid("(any | int | int)","(int | int | int)"); }
		@Test public void test_1378() { testValid("(any | int | int)","(any & any & any)"); }
		@Test public void test_1379() { testValid("(any | int | int)","(int & any & any)"); }
		@Test public void test_1380() { testValid("(any | int | int)","(any & int & any)"); }
		@Test public void test_1381() { testValid("(any | int | int)","(int & int & any)"); }
		@Test public void test_1382() { testValid("(any | int | int)","(any & any & int)"); }
		@Test public void test_1383() { testValid("(any | int | int)","(int & any & int)"); }
		@Test public void test_1384() { testValid("(any | int | int)","(any & int & int)"); }
		@Test public void test_1385() { testValid("(any | int | int)","(int & int & int)"); }
		@Test public void test_1386() { testInvalid("(int | int | int)","any"); }
		@Test public void test_1387() { testValid("(int | int | int)","int"); }
		@Test public void test_1388() { testInvalid("(int | int | int)","{any}"); }
		@Test public void test_1389() { testInvalid("(int | int | int)","{int}"); }
		@Test public void test_1390() { testValid("(int | int | int)","!any"); }
		@Test public void test_1391() { testInvalid("(int | int | int)","!int"); }
		@Test public void test_1392() { testInvalid("(int | int | int)","{any, any}"); }
		@Test public void test_1393() { testInvalid("(int | int | int)","{int, any}"); }
		@Test public void test_1394() { testInvalid("(int | int | int)","{any, int}"); }
		@Test public void test_1395() { testInvalid("(int | int | int)","{int, int}"); }
		@Test public void test_1396() { testInvalid("(int | int | int)","(any | any)"); }
		@Test public void test_1397() { testInvalid("(int | int | int)","(int | any)"); }
		@Test public void test_1398() { testInvalid("(int | int | int)","(any | int)"); }
		@Test public void test_1399() { testValid("(int | int | int)","(int | int)"); }
		@Test public void test_1400() { testInvalid("(int | int | int)","(any & any)"); }
		@Test public void test_1401() { testValid("(int | int | int)","(int & any)"); }
		@Test public void test_1402() { testValid("(int | int | int)","(any & int)"); }
		@Test public void test_1403() { testValid("(int | int | int)","(int & int)"); }
		@Test public void test_1404() { testInvalid("(int | int | int)","{any, any, any}"); }
		@Test public void test_1405() { testInvalid("(int | int | int)","{int, any, any}"); }
		@Test public void test_1406() { testInvalid("(int | int | int)","{any, int, any}"); }
		@Test public void test_1407() { testInvalid("(int | int | int)","{int, int, any}"); }
		@Test public void test_1408() { testInvalid("(int | int | int)","{any, any, int}"); }
		@Test public void test_1409() { testInvalid("(int | int | int)","{int, any, int}"); }
		@Test public void test_1410() { testInvalid("(int | int | int)","{any, int, int}"); }
		@Test public void test_1411() { testInvalid("(int | int | int)","{int, int, int}"); }
		@Test public void test_1412() { testInvalid("(int | int | int)","(any | any | any)"); }
		@Test public void test_1413() { testInvalid("(int | int | int)","(int | any | any)"); }
		@Test public void test_1414() { testInvalid("(int | int | int)","(any | int | any)"); }
		@Test public void test_1415() { testInvalid("(int | int | int)","(int | int | any)"); }
		@Test public void test_1416() { testInvalid("(int | int | int)","(any | any | int)"); }
		@Test public void test_1417() { testInvalid("(int | int | int)","(int | any | int)"); }
		@Test public void test_1418() { testInvalid("(int | int | int)","(any | int | int)"); }
		@Test public void test_1419() { testValid("(int | int | int)","(int | int | int)"); }
		@Test public void test_1420() { testInvalid("(int | int | int)","(any & any & any)"); }
		@Test public void test_1421() { testValid("(int | int | int)","(int & any & any)"); }
		@Test public void test_1422() { testValid("(int | int | int)","(any & int & any)"); }
		@Test public void test_1423() { testValid("(int | int | int)","(int & int & any)"); }
		@Test public void test_1424() { testValid("(int | int | int)","(any & any & int)"); }
		@Test public void test_1425() { testValid("(int | int | int)","(int & any & int)"); }
		@Test public void test_1426() { testValid("(int | int | int)","(any & int & int)"); }
		@Test public void test_1427() { testValid("(int | int | int)","(int & int & int)"); }
		@Test public void test_1428() { testValid("(any & any & any)","any"); }
		@Test public void test_1429() { testValid("(any & any & any)","int"); }
		@Test public void test_1430() { testValid("(any & any & any)","{any}"); }
		@Test public void test_1431() { testValid("(any & any & any)","{int}"); }
		@Test public void test_1432() { testValid("(any & any & any)","!any"); }
		@Test public void test_1433() { testValid("(any & any & any)","!int"); }
		@Test public void test_1434() { testValid("(any & any & any)","{any, any}"); }
		@Test public void test_1435() { testValid("(any & any & any)","{int, any}"); }
		@Test public void test_1436() { testValid("(any & any & any)","{any, int}"); }
		@Test public void test_1437() { testValid("(any & any & any)","{int, int}"); }
		@Test public void test_1438() { testValid("(any & any & any)","(any | any)"); }
		@Test public void test_1439() { testValid("(any & any & any)","(int | any)"); }
		@Test public void test_1440() { testValid("(any & any & any)","(any | int)"); }
		@Test public void test_1441() { testValid("(any & any & any)","(int | int)"); }
		@Test public void test_1442() { testValid("(any & any & any)","(any & any)"); }
		@Test public void test_1443() { testValid("(any & any & any)","(int & any)"); }
		@Test public void test_1444() { testValid("(any & any & any)","(any & int)"); }
		@Test public void test_1445() { testValid("(any & any & any)","(int & int)"); }
		@Test public void test_1446() { testValid("(any & any & any)","{any, any, any}"); }
		@Test public void test_1447() { testValid("(any & any & any)","{int, any, any}"); }
		@Test public void test_1448() { testValid("(any & any & any)","{any, int, any}"); }
		@Test public void test_1449() { testValid("(any & any & any)","{int, int, any}"); }
		@Test public void test_1450() { testValid("(any & any & any)","{any, any, int}"); }
		@Test public void test_1451() { testValid("(any & any & any)","{int, any, int}"); }
		@Test public void test_1452() { testValid("(any & any & any)","{any, int, int}"); }
		@Test public void test_1453() { testValid("(any & any & any)","{int, int, int}"); }
		@Test public void test_1454() { testValid("(any & any & any)","(any | any | any)"); }
		@Test public void test_1455() { testValid("(any & any & any)","(int | any | any)"); }
		@Test public void test_1456() { testValid("(any & any & any)","(any | int | any)"); }
		@Test public void test_1457() { testValid("(any & any & any)","(int | int | any)"); }
		@Test public void test_1458() { testValid("(any & any & any)","(any | any | int)"); }
		@Test public void test_1459() { testValid("(any & any & any)","(int | any | int)"); }
		@Test public void test_1460() { testValid("(any & any & any)","(any | int | int)"); }
		@Test public void test_1461() { testValid("(any & any & any)","(int | int | int)"); }
		@Test public void test_1462() { testValid("(any & any & any)","(any & any & any)"); }
		@Test public void test_1463() { testValid("(any & any & any)","(int & any & any)"); }
		@Test public void test_1464() { testValid("(any & any & any)","(any & int & any)"); }
		@Test public void test_1465() { testValid("(any & any & any)","(int & int & any)"); }
		@Test public void test_1466() { testValid("(any & any & any)","(any & any & int)"); }
		@Test public void test_1467() { testValid("(any & any & any)","(int & any & int)"); }
		@Test public void test_1468() { testValid("(any & any & any)","(any & int & int)"); }
		@Test public void test_1469() { testValid("(any & any & any)","(int & int & int)"); }
		@Test public void test_1470() { testInvalid("(int & any & any)","any"); }
		@Test public void test_1471() { testValid("(int & any & any)","int"); }
		@Test public void test_1472() { testInvalid("(int & any & any)","{any}"); }
		@Test public void test_1473() { testInvalid("(int & any & any)","{int}"); }
		@Test public void test_1474() { testValid("(int & any & any)","!any"); }
		@Test public void test_1475() { testInvalid("(int & any & any)","!int"); }
		@Test public void test_1476() { testInvalid("(int & any & any)","{any, any}"); }
		@Test public void test_1477() { testInvalid("(int & any & any)","{int, any}"); }
		@Test public void test_1478() { testInvalid("(int & any & any)","{any, int}"); }
		@Test public void test_1479() { testInvalid("(int & any & any)","{int, int}"); }
		@Test public void test_1480() { testInvalid("(int & any & any)","(any | any)"); }
		@Test public void test_1481() { testInvalid("(int & any & any)","(int | any)"); }
		@Test public void test_1482() { testInvalid("(int & any & any)","(any | int)"); }
		@Test public void test_1483() { testValid("(int & any & any)","(int | int)"); }
		@Test public void test_1484() { testInvalid("(int & any & any)","(any & any)"); }
		@Test public void test_1485() { testValid("(int & any & any)","(int & any)"); }
		@Test public void test_1486() { testValid("(int & any & any)","(any & int)"); }
		@Test public void test_1487() { testValid("(int & any & any)","(int & int)"); }
		@Test public void test_1488() { testInvalid("(int & any & any)","{any, any, any}"); }
		@Test public void test_1489() { testInvalid("(int & any & any)","{int, any, any}"); }
		@Test public void test_1490() { testInvalid("(int & any & any)","{any, int, any}"); }
		@Test public void test_1491() { testInvalid("(int & any & any)","{int, int, any}"); }
		@Test public void test_1492() { testInvalid("(int & any & any)","{any, any, int}"); }
		@Test public void test_1493() { testInvalid("(int & any & any)","{int, any, int}"); }
		@Test public void test_1494() { testInvalid("(int & any & any)","{any, int, int}"); }
		@Test public void test_1495() { testInvalid("(int & any & any)","{int, int, int}"); }
		@Test public void test_1496() { testInvalid("(int & any & any)","(any | any | any)"); }
		@Test public void test_1497() { testInvalid("(int & any & any)","(int | any | any)"); }
		@Test public void test_1498() { testInvalid("(int & any & any)","(any | int | any)"); }
		@Test public void test_1499() { testInvalid("(int & any & any)","(int | int | any)"); }
		@Test public void test_1500() { testInvalid("(int & any & any)","(any | any | int)"); }
		@Test public void test_1501() { testInvalid("(int & any & any)","(int | any | int)"); }
		@Test public void test_1502() { testInvalid("(int & any & any)","(any | int | int)"); }
		@Test public void test_1503() { testValid("(int & any & any)","(int | int | int)"); }
		@Test public void test_1504() { testInvalid("(int & any & any)","(any & any & any)"); }
		@Test public void test_1505() { testValid("(int & any & any)","(int & any & any)"); }
		@Test public void test_1506() { testValid("(int & any & any)","(any & int & any)"); }
		@Test public void test_1507() { testValid("(int & any & any)","(int & int & any)"); }
		@Test public void test_1508() { testValid("(int & any & any)","(any & any & int)"); }
		@Test public void test_1509() { testValid("(int & any & any)","(int & any & int)"); }
		@Test public void test_1510() { testValid("(int & any & any)","(any & int & int)"); }
		@Test public void test_1511() { testValid("(int & any & any)","(int & int & int)"); }
		@Test public void test_1512() { testInvalid("(any & int & any)","any"); }
		@Test public void test_1513() { testValid("(any & int & any)","int"); }
		@Test public void test_1514() { testInvalid("(any & int & any)","{any}"); }
		@Test public void test_1515() { testInvalid("(any & int & any)","{int}"); }
		@Test public void test_1516() { testValid("(any & int & any)","!any"); }
		@Test public void test_1517() { testInvalid("(any & int & any)","!int"); }
		@Test public void test_1518() { testInvalid("(any & int & any)","{any, any}"); }
		@Test public void test_1519() { testInvalid("(any & int & any)","{int, any}"); }
		@Test public void test_1520() { testInvalid("(any & int & any)","{any, int}"); }
		@Test public void test_1521() { testInvalid("(any & int & any)","{int, int}"); }
		@Test public void test_1522() { testInvalid("(any & int & any)","(any | any)"); }
		@Test public void test_1523() { testInvalid("(any & int & any)","(int | any)"); }
		@Test public void test_1524() { testInvalid("(any & int & any)","(any | int)"); }
		@Test public void test_1525() { testValid("(any & int & any)","(int | int)"); }
		@Test public void test_1526() { testInvalid("(any & int & any)","(any & any)"); }
		@Test public void test_1527() { testValid("(any & int & any)","(int & any)"); }
		@Test public void test_1528() { testValid("(any & int & any)","(any & int)"); }
		@Test public void test_1529() { testValid("(any & int & any)","(int & int)"); }
		@Test public void test_1530() { testInvalid("(any & int & any)","{any, any, any}"); }
		@Test public void test_1531() { testInvalid("(any & int & any)","{int, any, any}"); }
		@Test public void test_1532() { testInvalid("(any & int & any)","{any, int, any}"); }
		@Test public void test_1533() { testInvalid("(any & int & any)","{int, int, any}"); }
		@Test public void test_1534() { testInvalid("(any & int & any)","{any, any, int}"); }
		@Test public void test_1535() { testInvalid("(any & int & any)","{int, any, int}"); }
		@Test public void test_1536() { testInvalid("(any & int & any)","{any, int, int}"); }
		@Test public void test_1537() { testInvalid("(any & int & any)","{int, int, int}"); }
		@Test public void test_1538() { testInvalid("(any & int & any)","(any | any | any)"); }
		@Test public void test_1539() { testInvalid("(any & int & any)","(int | any | any)"); }
		@Test public void test_1540() { testInvalid("(any & int & any)","(any | int | any)"); }
		@Test public void test_1541() { testInvalid("(any & int & any)","(int | int | any)"); }
		@Test public void test_1542() { testInvalid("(any & int & any)","(any | any | int)"); }
		@Test public void test_1543() { testInvalid("(any & int & any)","(int | any | int)"); }
		@Test public void test_1544() { testInvalid("(any & int & any)","(any | int | int)"); }
		@Test public void test_1545() { testValid("(any & int & any)","(int | int | int)"); }
		@Test public void test_1546() { testInvalid("(any & int & any)","(any & any & any)"); }
		@Test public void test_1547() { testValid("(any & int & any)","(int & any & any)"); }
		@Test public void test_1548() { testValid("(any & int & any)","(any & int & any)"); }
		@Test public void test_1549() { testValid("(any & int & any)","(int & int & any)"); }
		@Test public void test_1550() { testValid("(any & int & any)","(any & any & int)"); }
		@Test public void test_1551() { testValid("(any & int & any)","(int & any & int)"); }
		@Test public void test_1552() { testValid("(any & int & any)","(any & int & int)"); }
		@Test public void test_1553() { testValid("(any & int & any)","(int & int & int)"); }
		@Test public void test_1554() { testInvalid("(int & int & any)","any"); }
		@Test public void test_1555() { testValid("(int & int & any)","int"); }
		@Test public void test_1556() { testInvalid("(int & int & any)","{any}"); }
		@Test public void test_1557() { testInvalid("(int & int & any)","{int}"); }
		@Test public void test_1558() { testValid("(int & int & any)","!any"); }
		@Test public void test_1559() { testInvalid("(int & int & any)","!int"); }
		@Test public void test_1560() { testInvalid("(int & int & any)","{any, any}"); }
		@Test public void test_1561() { testInvalid("(int & int & any)","{int, any}"); }
		@Test public void test_1562() { testInvalid("(int & int & any)","{any, int}"); }
		@Test public void test_1563() { testInvalid("(int & int & any)","{int, int}"); }
		@Test public void test_1564() { testInvalid("(int & int & any)","(any | any)"); }
		@Test public void test_1565() { testInvalid("(int & int & any)","(int | any)"); }
		@Test public void test_1566() { testInvalid("(int & int & any)","(any | int)"); }
		@Test public void test_1567() { testValid("(int & int & any)","(int | int)"); }
		@Test public void test_1568() { testInvalid("(int & int & any)","(any & any)"); }
		@Test public void test_1569() { testValid("(int & int & any)","(int & any)"); }
		@Test public void test_1570() { testValid("(int & int & any)","(any & int)"); }
		@Test public void test_1571() { testValid("(int & int & any)","(int & int)"); }
		@Test public void test_1572() { testInvalid("(int & int & any)","{any, any, any}"); }
		@Test public void test_1573() { testInvalid("(int & int & any)","{int, any, any}"); }
		@Test public void test_1574() { testInvalid("(int & int & any)","{any, int, any}"); }
		@Test public void test_1575() { testInvalid("(int & int & any)","{int, int, any}"); }
		@Test public void test_1576() { testInvalid("(int & int & any)","{any, any, int}"); }
		@Test public void test_1577() { testInvalid("(int & int & any)","{int, any, int}"); }
		@Test public void test_1578() { testInvalid("(int & int & any)","{any, int, int}"); }
		@Test public void test_1579() { testInvalid("(int & int & any)","{int, int, int}"); }
		@Test public void test_1580() { testInvalid("(int & int & any)","(any | any | any)"); }
		@Test public void test_1581() { testInvalid("(int & int & any)","(int | any | any)"); }
		@Test public void test_1582() { testInvalid("(int & int & any)","(any | int | any)"); }
		@Test public void test_1583() { testInvalid("(int & int & any)","(int | int | any)"); }
		@Test public void test_1584() { testInvalid("(int & int & any)","(any | any | int)"); }
		@Test public void test_1585() { testInvalid("(int & int & any)","(int | any | int)"); }
		@Test public void test_1586() { testInvalid("(int & int & any)","(any | int | int)"); }
		@Test public void test_1587() { testValid("(int & int & any)","(int | int | int)"); }
		@Test public void test_1588() { testInvalid("(int & int & any)","(any & any & any)"); }
		@Test public void test_1589() { testValid("(int & int & any)","(int & any & any)"); }
		@Test public void test_1590() { testValid("(int & int & any)","(any & int & any)"); }
		@Test public void test_1591() { testValid("(int & int & any)","(int & int & any)"); }
		@Test public void test_1592() { testValid("(int & int & any)","(any & any & int)"); }
		@Test public void test_1593() { testValid("(int & int & any)","(int & any & int)"); }
		@Test public void test_1594() { testValid("(int & int & any)","(any & int & int)"); }
		@Test public void test_1595() { testValid("(int & int & any)","(int & int & int)"); }
		@Test public void test_1596() { testInvalid("(any & any & int)","any"); }
		@Test public void test_1597() { testValid("(any & any & int)","int"); }
		@Test public void test_1598() { testInvalid("(any & any & int)","{any}"); }
		@Test public void test_1599() { testInvalid("(any & any & int)","{int}"); }
		@Test public void test_1600() { testValid("(any & any & int)","!any"); }
		@Test public void test_1601() { testInvalid("(any & any & int)","!int"); }
		@Test public void test_1602() { testInvalid("(any & any & int)","{any, any}"); }
		@Test public void test_1603() { testInvalid("(any & any & int)","{int, any}"); }
		@Test public void test_1604() { testInvalid("(any & any & int)","{any, int}"); }
		@Test public void test_1605() { testInvalid("(any & any & int)","{int, int}"); }
		@Test public void test_1606() { testInvalid("(any & any & int)","(any | any)"); }
		@Test public void test_1607() { testInvalid("(any & any & int)","(int | any)"); }
		@Test public void test_1608() { testInvalid("(any & any & int)","(any | int)"); }
		@Test public void test_1609() { testValid("(any & any & int)","(int | int)"); }
		@Test public void test_1610() { testInvalid("(any & any & int)","(any & any)"); }
		@Test public void test_1611() { testValid("(any & any & int)","(int & any)"); }
		@Test public void test_1612() { testValid("(any & any & int)","(any & int)"); }
		@Test public void test_1613() { testValid("(any & any & int)","(int & int)"); }
		@Test public void test_1614() { testInvalid("(any & any & int)","{any, any, any}"); }
		@Test public void test_1615() { testInvalid("(any & any & int)","{int, any, any}"); }
		@Test public void test_1616() { testInvalid("(any & any & int)","{any, int, any}"); }
		@Test public void test_1617() { testInvalid("(any & any & int)","{int, int, any}"); }
		@Test public void test_1618() { testInvalid("(any & any & int)","{any, any, int}"); }
		@Test public void test_1619() { testInvalid("(any & any & int)","{int, any, int}"); }
		@Test public void test_1620() { testInvalid("(any & any & int)","{any, int, int}"); }
		@Test public void test_1621() { testInvalid("(any & any & int)","{int, int, int}"); }
		@Test public void test_1622() { testInvalid("(any & any & int)","(any | any | any)"); }
		@Test public void test_1623() { testInvalid("(any & any & int)","(int | any | any)"); }
		@Test public void test_1624() { testInvalid("(any & any & int)","(any | int | any)"); }
		@Test public void test_1625() { testInvalid("(any & any & int)","(int | int | any)"); }
		@Test public void test_1626() { testInvalid("(any & any & int)","(any | any | int)"); }
		@Test public void test_1627() { testInvalid("(any & any & int)","(int | any | int)"); }
		@Test public void test_1628() { testInvalid("(any & any & int)","(any | int | int)"); }
		@Test public void test_1629() { testValid("(any & any & int)","(int | int | int)"); }
		@Test public void test_1630() { testInvalid("(any & any & int)","(any & any & any)"); }
		@Test public void test_1631() { testValid("(any & any & int)","(int & any & any)"); }
		@Test public void test_1632() { testValid("(any & any & int)","(any & int & any)"); }
		@Test public void test_1633() { testValid("(any & any & int)","(int & int & any)"); }
		@Test public void test_1634() { testValid("(any & any & int)","(any & any & int)"); }
		@Test public void test_1635() { testValid("(any & any & int)","(int & any & int)"); }
		@Test public void test_1636() { testValid("(any & any & int)","(any & int & int)"); }
		@Test public void test_1637() { testValid("(any & any & int)","(int & int & int)"); }
		@Test public void test_1638() { testInvalid("(int & any & int)","any"); }
		@Test public void test_1639() { testValid("(int & any & int)","int"); }
		@Test public void test_1640() { testInvalid("(int & any & int)","{any}"); }
		@Test public void test_1641() { testInvalid("(int & any & int)","{int}"); }
		@Test public void test_1642() { testValid("(int & any & int)","!any"); }
		@Test public void test_1643() { testInvalid("(int & any & int)","!int"); }
		@Test public void test_1644() { testInvalid("(int & any & int)","{any, any}"); }
		@Test public void test_1645() { testInvalid("(int & any & int)","{int, any}"); }
		@Test public void test_1646() { testInvalid("(int & any & int)","{any, int}"); }
		@Test public void test_1647() { testInvalid("(int & any & int)","{int, int}"); }
		@Test public void test_1648() { testInvalid("(int & any & int)","(any | any)"); }
		@Test public void test_1649() { testInvalid("(int & any & int)","(int | any)"); }
		@Test public void test_1650() { testInvalid("(int & any & int)","(any | int)"); }
		@Test public void test_1651() { testValid("(int & any & int)","(int | int)"); }
		@Test public void test_1652() { testInvalid("(int & any & int)","(any & any)"); }
		@Test public void test_1653() { testValid("(int & any & int)","(int & any)"); }
		@Test public void test_1654() { testValid("(int & any & int)","(any & int)"); }
		@Test public void test_1655() { testValid("(int & any & int)","(int & int)"); }
		@Test public void test_1656() { testInvalid("(int & any & int)","{any, any, any}"); }
		@Test public void test_1657() { testInvalid("(int & any & int)","{int, any, any}"); }
		@Test public void test_1658() { testInvalid("(int & any & int)","{any, int, any}"); }
		@Test public void test_1659() { testInvalid("(int & any & int)","{int, int, any}"); }
		@Test public void test_1660() { testInvalid("(int & any & int)","{any, any, int}"); }
		@Test public void test_1661() { testInvalid("(int & any & int)","{int, any, int}"); }
		@Test public void test_1662() { testInvalid("(int & any & int)","{any, int, int}"); }
		@Test public void test_1663() { testInvalid("(int & any & int)","{int, int, int}"); }
		@Test public void test_1664() { testInvalid("(int & any & int)","(any | any | any)"); }
		@Test public void test_1665() { testInvalid("(int & any & int)","(int | any | any)"); }
		@Test public void test_1666() { testInvalid("(int & any & int)","(any | int | any)"); }
		@Test public void test_1667() { testInvalid("(int & any & int)","(int | int | any)"); }
		@Test public void test_1668() { testInvalid("(int & any & int)","(any | any | int)"); }
		@Test public void test_1669() { testInvalid("(int & any & int)","(int | any | int)"); }
		@Test public void test_1670() { testInvalid("(int & any & int)","(any | int | int)"); }
		@Test public void test_1671() { testValid("(int & any & int)","(int | int | int)"); }
		@Test public void test_1672() { testInvalid("(int & any & int)","(any & any & any)"); }
		@Test public void test_1673() { testValid("(int & any & int)","(int & any & any)"); }
		@Test public void test_1674() { testValid("(int & any & int)","(any & int & any)"); }
		@Test public void test_1675() { testValid("(int & any & int)","(int & int & any)"); }
		@Test public void test_1676() { testValid("(int & any & int)","(any & any & int)"); }
		@Test public void test_1677() { testValid("(int & any & int)","(int & any & int)"); }
		@Test public void test_1678() { testValid("(int & any & int)","(any & int & int)"); }
		@Test public void test_1679() { testValid("(int & any & int)","(int & int & int)"); }
		@Test public void test_1680() { testInvalid("(any & int & int)","any"); }
		@Test public void test_1681() { testValid("(any & int & int)","int"); }
		@Test public void test_1682() { testInvalid("(any & int & int)","{any}"); }
		@Test public void test_1683() { testInvalid("(any & int & int)","{int}"); }
		@Test public void test_1684() { testValid("(any & int & int)","!any"); }
		@Test public void test_1685() { testInvalid("(any & int & int)","!int"); }
		@Test public void test_1686() { testInvalid("(any & int & int)","{any, any}"); }
		@Test public void test_1687() { testInvalid("(any & int & int)","{int, any}"); }
		@Test public void test_1688() { testInvalid("(any & int & int)","{any, int}"); }
		@Test public void test_1689() { testInvalid("(any & int & int)","{int, int}"); }
		@Test public void test_1690() { testInvalid("(any & int & int)","(any | any)"); }
		@Test public void test_1691() { testInvalid("(any & int & int)","(int | any)"); }
		@Test public void test_1692() { testInvalid("(any & int & int)","(any | int)"); }
		@Test public void test_1693() { testValid("(any & int & int)","(int | int)"); }
		@Test public void test_1694() { testInvalid("(any & int & int)","(any & any)"); }
		@Test public void test_1695() { testValid("(any & int & int)","(int & any)"); }
		@Test public void test_1696() { testValid("(any & int & int)","(any & int)"); }
		@Test public void test_1697() { testValid("(any & int & int)","(int & int)"); }
		@Test public void test_1698() { testInvalid("(any & int & int)","{any, any, any}"); }
		@Test public void test_1699() { testInvalid("(any & int & int)","{int, any, any}"); }
		@Test public void test_1700() { testInvalid("(any & int & int)","{any, int, any}"); }
		@Test public void test_1701() { testInvalid("(any & int & int)","{int, int, any}"); }
		@Test public void test_1702() { testInvalid("(any & int & int)","{any, any, int}"); }
		@Test public void test_1703() { testInvalid("(any & int & int)","{int, any, int}"); }
		@Test public void test_1704() { testInvalid("(any & int & int)","{any, int, int}"); }
		@Test public void test_1705() { testInvalid("(any & int & int)","{int, int, int}"); }
		@Test public void test_1706() { testInvalid("(any & int & int)","(any | any | any)"); }
		@Test public void test_1707() { testInvalid("(any & int & int)","(int | any | any)"); }
		@Test public void test_1708() { testInvalid("(any & int & int)","(any | int | any)"); }
		@Test public void test_1709() { testInvalid("(any & int & int)","(int | int | any)"); }
		@Test public void test_1710() { testInvalid("(any & int & int)","(any | any | int)"); }
		@Test public void test_1711() { testInvalid("(any & int & int)","(int | any | int)"); }
		@Test public void test_1712() { testInvalid("(any & int & int)","(any | int | int)"); }
		@Test public void test_1713() { testValid("(any & int & int)","(int | int | int)"); }
		@Test public void test_1714() { testInvalid("(any & int & int)","(any & any & any)"); }
		@Test public void test_1715() { testValid("(any & int & int)","(int & any & any)"); }
		@Test public void test_1716() { testValid("(any & int & int)","(any & int & any)"); }
		@Test public void test_1717() { testValid("(any & int & int)","(int & int & any)"); }
		@Test public void test_1718() { testValid("(any & int & int)","(any & any & int)"); }
		@Test public void test_1719() { testValid("(any & int & int)","(int & any & int)"); }
		@Test public void test_1720() { testValid("(any & int & int)","(any & int & int)"); }
		@Test public void test_1721() { testValid("(any & int & int)","(int & int & int)"); }
		@Test public void test_1722() { testInvalid("(int & int & int)","any"); }
		@Test public void test_1723() { testValid("(int & int & int)","int"); }
		@Test public void test_1724() { testInvalid("(int & int & int)","{any}"); }
		@Test public void test_1725() { testInvalid("(int & int & int)","{int}"); }
		@Test public void test_1726() { testValid("(int & int & int)","!any"); }
		@Test public void test_1727() { testInvalid("(int & int & int)","!int"); }
		@Test public void test_1728() { testInvalid("(int & int & int)","{any, any}"); }
		@Test public void test_1729() { testInvalid("(int & int & int)","{int, any}"); }
		@Test public void test_1730() { testInvalid("(int & int & int)","{any, int}"); }
		@Test public void test_1731() { testInvalid("(int & int & int)","{int, int}"); }
		@Test public void test_1732() { testInvalid("(int & int & int)","(any | any)"); }
		@Test public void test_1733() { testInvalid("(int & int & int)","(int | any)"); }
		@Test public void test_1734() { testInvalid("(int & int & int)","(any | int)"); }
		@Test public void test_1735() { testValid("(int & int & int)","(int | int)"); }
		@Test public void test_1736() { testInvalid("(int & int & int)","(any & any)"); }
		@Test public void test_1737() { testValid("(int & int & int)","(int & any)"); }
		@Test public void test_1738() { testValid("(int & int & int)","(any & int)"); }
		@Test public void test_1739() { testValid("(int & int & int)","(int & int)"); }
		@Test public void test_1740() { testInvalid("(int & int & int)","{any, any, any}"); }
		@Test public void test_1741() { testInvalid("(int & int & int)","{int, any, any}"); }
		@Test public void test_1742() { testInvalid("(int & int & int)","{any, int, any}"); }
		@Test public void test_1743() { testInvalid("(int & int & int)","{int, int, any}"); }
		@Test public void test_1744() { testInvalid("(int & int & int)","{any, any, int}"); }
		@Test public void test_1745() { testInvalid("(int & int & int)","{int, any, int}"); }
		@Test public void test_1746() { testInvalid("(int & int & int)","{any, int, int}"); }
		@Test public void test_1747() { testInvalid("(int & int & int)","{int, int, int}"); }
		@Test public void test_1748() { testInvalid("(int & int & int)","(any | any | any)"); }
		@Test public void test_1749() { testInvalid("(int & int & int)","(int | any | any)"); }
		@Test public void test_1750() { testInvalid("(int & int & int)","(any | int | any)"); }
		@Test public void test_1751() { testInvalid("(int & int & int)","(int | int | any)"); }
		@Test public void test_1752() { testInvalid("(int & int & int)","(any | any | int)"); }
		@Test public void test_1753() { testInvalid("(int & int & int)","(int | any | int)"); }
		@Test public void test_1754() { testInvalid("(int & int & int)","(any | int | int)"); }
		@Test public void test_1755() { testValid("(int & int & int)","(int | int | int)"); }
		@Test public void test_1756() { testInvalid("(int & int & int)","(any & any & any)"); }
		@Test public void test_1757() { testValid("(int & int & int)","(int & any & any)"); }
		@Test public void test_1758() { testValid("(int & int & int)","(any & int & any)"); }
		@Test public void test_1759() { testValid("(int & int & int)","(int & int & any)"); }
		@Test public void test_1760() { testValid("(int & int & int)","(any & any & int)"); }
		@Test public void test_1761() { testValid("(int & int & int)","(int & any & int)"); }
		@Test public void test_1762() { testValid("(int & int & int)","(any & int & int)"); }
		@Test public void test_1763() { testValid("(int & int & int)","(int & int & int)"); }
	}
}
