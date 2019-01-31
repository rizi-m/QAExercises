package exceptions;

public class Division {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("Result:"+c);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Please send two numbers");
		} catch (NumberFormatException e) {
			System.out.println("Please send numbers only");
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		} catch (Exception e) {
			System.out.println("Unexpected error");
		}
	}
}
