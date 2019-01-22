
public class TooHot {
	
	
	@SuppressWarnings("unused")
	private static boolean tooHot(int temperature, boolean isSummer) {
		if (isSummer && temperature >=60 && temperature <= 100) {
			return true;
		}
		if (!isSummer && temperature >= 60 && temperature <= 90) {
			return true;
		}
		return false;
	}
}
