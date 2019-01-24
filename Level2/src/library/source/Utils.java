package library.source;

import java.security.InvalidParameterException;
import java.util.regex.Pattern;

public class Utils {
	
	public static boolean isDateValid(String input) {
		return Pattern.matches("^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$", input);
	}
	
	public static void checkDate(String input) {
		if (!isDateValid(input)) {
			throw new InvalidParameterException("Date entered is not valid");
		}
	}
	
	public static void checkPositive(int input, String entity) {
		if (!(input >= 0)) {
			throw new InvalidParameterException("Number of " + entity + " cannot be negative.");
		}
	}
}
