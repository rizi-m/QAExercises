package staticstuff;

public class Bank {
	
	private static int dollar;
	
	static {
		dollar = 95;
	}
	
	public void setDollar(int amount) {
		dollar = amount;
	}
	
	public int getDollar(int amount) {
		return dollar * amount;
	}
}
