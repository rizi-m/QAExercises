package designpatterns;

public class Singleton {
	private static Singleton object;
	
	private int someData;
	
	public int getSomeData() {
		return someData;
	}
	
	public void setSomeData(int data) {
		someData = data;
	}
	
	private Singleton() {};
	
	public static Singleton create() {
		if(object == null) {
			object = new Singleton();
		}
		return object;
	}
}
