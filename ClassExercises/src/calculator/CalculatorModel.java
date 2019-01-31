package calculator;

public class CalculatorModel {
	
	
	private int accumulator = 0;
	
	public void clear() {
		accumulator = 0;
	}
	
	public int add(int number) {
		accumulator += number;
		return accumulator;
	}
	
	public int sub(int number) {
		accumulator -= number;
		return accumulator;
	}
	
	public int mul(int number) {
		accumulator *= number;
		return accumulator;
	}
	
	public int div(int number) {
		accumulator /= number;
		return accumulator;
	}
	
	public void push(int number) {
		accumulator = number;
	}
	
	@Override
	public String toString() {
		return "Current value: " + accumulator;
	}
}
