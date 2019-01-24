package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.TooHot;

public class TooHotTest {

	@Test
	public void testCold() {
		int temperature = 0;
		boolean isSummer = false;
		boolean tooHot = false;
		boolean isTooHot = TooHot.tooHot(temperature, isSummer);
		assertTrue(tooHot == isTooHot);
	}
	
	@Test
	public void testHot() {
		int temperature = 70;
		boolean isSummer = false;
		boolean tooHot = true;
		boolean isTooHot = TooHot.tooHot(temperature, isSummer);
		assertTrue(tooHot == isTooHot);
	}
	
	
}
