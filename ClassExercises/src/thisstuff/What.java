package thisstuff;

public class What {
	private int x;
	
	public void one() {
		int x;
		x = 5;
		this.x = 25;
		System.out.println(++x);
	}
	
	public void show() {
		System.out.println(x);
	}
}
