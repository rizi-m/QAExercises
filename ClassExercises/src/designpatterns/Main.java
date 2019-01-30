package designpatterns;

public class Main {
	public static void main(String[] args) {
		Singleton a = Singleton.create();
		Singleton b = Singleton.create();
		Singleton c = Singleton.create();
		
		System.out.println("a setting data to -89");
		a.setSomeData(-89);
		System.out.println("Data at a: " + a.getSomeData());
		System.out.println("b setting data to 10");
		b.setSomeData(10);
		System.out.println("Data at a: " + a.getSomeData());
		System.out.println("c setting data to 999");
		c.setSomeData(999);
		System.out.println("Data at a: " + a.getSomeData());
		
	}
}
