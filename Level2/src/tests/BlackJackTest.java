package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.BlackJack;

public class BlackJackTest {

	@Test
	public void test21Wins() {
		int firstNumber = 18;
		int secondNumber = 21;
		int result = BlackJack.play(firstNumber, secondNumber);
		assertTrue("21 did not win.", result == 21);
	}
	
	@Test
	public void testLargerNumberWins() {
		int firstNumber = 18;
		int secondNumber = 20;
		int result = BlackJack.play(firstNumber, secondNumber);
		assertTrue("21 did not win.", result == 20);
	}

	@Test
	public void testLargerThan21ResultsIn0() {
		int firstNumber = 22;
		int secondNumber = 23;
		int result = BlackJack.play(firstNumber, secondNumber);
		assertTrue("21 did not win.", result == 0);
	}


}
