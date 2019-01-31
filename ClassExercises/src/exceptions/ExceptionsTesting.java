package exceptions;

public class ExceptionsTesting {
	public void test1() {
		try {
			int x = 1/0;
			System.out.println(x);
		} 
		catch (ArithmeticException e) {
			System.out.println("Arithmentic Exception");
		}
		catch (Exception e) {
			System.out.println("Something unexpected");
		}
	}
}
