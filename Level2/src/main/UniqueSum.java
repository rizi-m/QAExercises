package main;

public class UniqueSum {
	
	public static int calculate(int firstNumber, int secondNumber, int thirdNumber) {
		if (firstNumber == secondNumber && firstNumber == thirdNumber) {
			return 0;			
		}
		if (firstNumber == secondNumber) {
			return thirdNumber;
		}
		if (firstNumber == thirdNumber) {
			return secondNumber;
		}
		if (firstNumber != secondNumber &&
				firstNumber != thirdNumber && 
				thirdNumber != secondNumber) {
			return firstNumber + secondNumber + thirdNumber;
		}
		return firstNumber;
	}
	
}
