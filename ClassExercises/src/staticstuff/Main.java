package staticstuff;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println("1 amount of dollar is valued at: " + bank.getDollar(1));
		System.out.println("Dollar value is now 100");
		bank.setDollar(100);
		System.out.println("1 amount of dollar is valued at: " + bank.getDollar(1));
	}
}
