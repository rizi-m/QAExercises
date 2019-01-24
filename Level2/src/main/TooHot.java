package main;

public class TooHot {
	
	public static boolean tooHot(int temperature, boolean isSummer) {
		return (isSummer && temperature >=60 && temperature <= 100) ||
				(!isSummer && temperature >= 60 && temperature <= 90);
	}
}
