package main;

public class Bank {
	static int dollar;
	
	public void amount(int a) {
		System.out.println("Amount:"+a*dollar);
	}
	
	public void setDollar(int a) {
		dollar = a;
	}
}
