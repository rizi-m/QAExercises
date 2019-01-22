public class BlackJack {
	
	private static boolean isFirstWinner(int firstNumber, int secondNumber) {
		return ((firstNumber <= 21 && 
				secondNumber <= 21 && 
				firstNumber > secondNumber) 
				||
				(firstNumber <= 21 && 
				secondNumber > 21));
	}
	
	private static void checkInput(int firstNumber, int secondNumber) {
		if (firstNumber < 1 || secondNumber < 1) {
			throw new IllegalArgumentException("Values must be greater than 0.");
		}
	}
	
	public static int play(int firstNumber, int secondNumber) {
		checkInput(firstNumber, secondNumber);
		
		if (firstNumber > 21  && secondNumber > 21) {
			return 0;
		}
		
		if (isFirstWinner(firstNumber, secondNumber)) {
			return firstNumber;
		}
		return secondNumber;
	}
	
}
