package types.testing;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;

/**
 * A set of hand-written simple tests mainly used during development of the
 * framework itself.
 * 
 * @author David J. Pearce
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManualTestSuite extends AbstractTestSuite {

	// =======================================================
	// Primitives
	// =======================================================
	
	@Test
	public void test_01() {
		testValid("int","int");
	}
	
	@Test
	public void test_02() {
		testValid("any","any");
	}
	
	@Test
	public void test_03() {
		testValid("any","int");
	}
	
	@Test
	public void test_04() {
		testInvalid("int","any");
	}
	
	// =======================================================
	// Tuples
	// =======================================================
	
	@Test
	public void test_05() {
		testInvalid("int","{int}");
	}
	
	@Test
	public void test_06() {
		testInvalid("{int}","int");
	}
	
	@Test
	public void test_07() {
		testValid("any","{int}");
	}
	
	@Test
	public void test_08() {
		testInvalid("{int}","any");
	}
	
	@Test
	public void test_09() {
		testValid("{int}","{int}");
	}
	
	@Test
	public void test_10() {
		testValid("{any}","{any}");
	}
	
	@Test
	public void test_11() {
		testValid("{int,int}","{int,int}");
	}
	
	@Test
	public void test_12() {
		testValid("{any,int}","{any,int}");
	}
	
	@Test
	public void test_13() {
		testValid("{int,any}","{int,any}");
	}
	
	@Test
	public void test_14() {
		testValid("{any,any}","{any,any}");
	}
	
	@Test
	public void test_15() {
		testInvalid("{int,int}","{any,int}");
	}
	
	@Test
	public void test_16() {
		testValid("{any,int}","{int,int}");
	}
	
	@Test
	public void test_17() {
		testInvalid("{int,int}","{int,any}");
	}
	
	@Test
	public void test_18() {
		testValid("{int,any}","{int,int}");
	}
	
	@Test
	public void test_19() {
		testValid("{any,any}","{int,int}");
	}
	
	// =======================================================
	// Negations
	// =======================================================
	
	@Test
	public void test_20() {
		testValid("!int","!int");
	}
	
	@Test
	public void test_21() {
		testInvalid("!any","!int");
	}
	
	@Test
	public void test_22() {
		testValid("!int","!any");
	}
	
	@Test
	public void test_23() {
		testValid("!any","!any");
	}
	
	// =======================================================
	// Unions
	// =======================================================
	@Test
	public void test_24() {
		testValid("int|any","int");
	}
	@Test
	public void test_25() {
		testValid("int|any","any");
	}
	@Test
	public void test_26() {
		testInvalid("int","int|any");
	}
	@Test
	public void test_27() {
		testValid("any","int|any");
	}
	@Test
	public void test_28() {
		testValid("int|{int}","int");
	}
	@Test
	public void test_29() {
		testValid("int|{int}","{int}");
	}
	@Test
	public void test_30() {
		testValid("{int|{int}}","{int}");
	}
	@Test
	public void test_31() {
		testValid("{int|{int}}","{{int}}");
	}
	
	// =======================================================
	// Intersections
	// =======================================================
	@Test
	public void test_32() {
		testValid("int&any","int");
	}
	@Test
	public void test_33() {
		testInvalid("int&any","any");
	}
	@Test
	public void test_34() {
		testValid("int","int&any");
	}
	@Test
	public void test_35() {
		testValid("any","int&any");
	}
	@Test
	public void test_36() {
		testInvalid("int&{int}","int");
	}
	@Test
	public void test_37() {
		testInvalid("int&{int}","{int}");
	}
	@Test
	public void test_38() {
		testInvalid("{int&{int}}","{int}");
	}
	@Test
	public void test_39() {
		testInvalid("{int&{int}}","{{int}}");
	}
	
	@Test
	public void test_40() {
		testValid("int","({any, int} & int & int)");
	}
	
	// =======================================================
	// Misc
	// =======================================================
	
	@Test
	public void test_41() {
		testInvalid("!(int | any)","((int & any) & {any, any})");
	}
}
