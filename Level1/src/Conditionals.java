
public class Conditionals {
	
	public static int sumIfTrueElseMultiply(int firstNumber, int secondNumber, boolean condition) {
		if (condition) {
			return firstNumber + secondNumber;
		}
		return firstNumber * secondNumber;
	}
	
	public static int sumAndCheckForZero(int firstNumber, int secondNumber) {
		if (firstNumber == 0) {
			return secondNumber;
		}
		if (secondNumber == 0) {
			return firstNumber;
		}
		return firstNumber + secondNumber;
	}
	
	
	public static void main(String[] args) {
		int result = sumIfTrueElseMultiply(2, 3, true);
		System.out.println(result);
		result = sumIfTrueElseMultiply(3, 3, false);
		System.out.println(result);
	}
}
