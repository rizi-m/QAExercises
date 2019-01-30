package interfacesandstuff;

import java.util.function.BiFunction;

public class OperationsUser {
	public void doCalculation(int x, int y, BiFunction<Integer, Integer, Integer> operation) {
		int answer = operation.apply(x, y);
		System.out.println(answer);
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int multiply(int xgerg, int y) {
		return xgerg * y;
	}
	
	public static void main(String[] args) {
		OperationsUser user = new OperationsUser();
		user.doCalculation(20, 10, (number1, number2) -> number1 + number2);
		user.doCalculation(20, 10, OperationsUser::multiply);
	}
}
