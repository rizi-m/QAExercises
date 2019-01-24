package library.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import library.source.Utils;

public class UtilsTest {

	@Test
	public void test() {
		assertTrue("01/01/1990", Utils.isDateValid("01/01/1990"));
		assertTrue("31/12/1990", Utils.isDateValid("31/12/1990"));
		assertFalse("33/01/1990", Utils.isDateValid("33/01/1990"));
		assertFalse("01/14/1990", Utils.isDateValid("01/14/1990"));
		
	}

}
