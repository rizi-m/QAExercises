package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.UniqueSum;

public class UniqueSumTest {

	@Test
	public void testExample1() {
		int firstNumber = 1;
		int secondNumber = 2;
		int thirdNumber = 3;
		int expectedResult = 6;
		int result = UniqueSum.calculate(firstNumber, secondNumber, thirdNumber);
		String message = "Expected " + expectedResult + " Got " + result;
		assertTrue(message, result == expectedResult);
	}
	
	@Test
	public void testExample2() {
		int firstNumber = 3;
		int secondNumber = 3;
		int thirdNumber = 3;
		int expectedResult = 0;
		int result = UniqueSum.calculate(firstNumber, secondNumber, thirdNumber);
		String message = "Expected " + expectedResult + " Got " + result;
		assertTrue(message, result == expectedResult);
	}
	
	@Test
	public void testExample3() {
		int firstNumber = 1;
		int secondNumber = 1;
		int thirdNumber = 2;
		int expectedResult = 2;
		int result = UniqueSum.calculate(firstNumber, secondNumber, thirdNumber);
		String message = "Expected " + expectedResult + " Got " + result;
		assertTrue(message, result == expectedResult);
	}

}
