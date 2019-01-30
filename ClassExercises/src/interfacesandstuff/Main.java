package interfacesandstuff;

public class Main {
	public static void main(String[] args) {
		Circle x = new Circle();
		Line t = new Line();
		drawSomething(t);
		drawSomething(x);
		
	}
	
	public static void drawSomething(Drawing ref) {
		ref.doDrawing();
	}
}
