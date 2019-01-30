package strings;

import java.util.Arrays;
import java.util.List;

public class English {
	public static void print1(final String message) {
		final String[] splitMessage = message.split(" ");
		for(int i = splitMessage.length - 1; i >= 0; --i) {
			System.out.println(splitMessage[i]);
		}
	}
	
	public static void find(final String what, final String message) {
		final List<String> splitMessage = Arrays.asList(message.split(" "));
		final long countOfWhatInMessage = splitMessage.stream()
				.filter(word -> word.equals(what))
				.count();
		System.out.println("'"+ what + "'" + " occurs " + countOfWhatInMessage + " time(s) in message.");
	}
	
	public static void findCharacters(final String what, final String message) {
		int answer = 0;
		for(int i = 0; i < message.length(); ++i) {
			try {
				if (message.charAt(i) == what.charAt(0) && message.substring(i, i + what.length()).equals(what)) {	
					answer++;
					i += what.length() - 1;
				}
			} catch (IndexOutOfBoundsException e) {
				break;
			}
		}
		System.out.println("'"+ what + "'" + " occurs " + answer + " time(s) in message.");
	}
	
	public static void findAndReplaceCharacters(final String find, final String replace, final String message) {
		String answer = "";
		for(int i = 0; i < message.length() ; ++i) {
			try {
				if (message.charAt(i) == find.charAt(0) && message.substring(i, i + find.length()).equals(find)) {	
					answer += replace;
					i += find.length() - 1;
				} else {
					answer += message.charAt(i);
				}
			} catch (IndexOutOfBoundsException e) {
				answer += message.substring(i);
				break;
			}
		}
		System.out.println(answer);
	}
	
	public static void findAndReplace(final String find, final String replace, final String message) {
		final List<String> splitMessage = Arrays.asList(message.split(" "));
		final String[] messageWithReplacedWords = splitMessage.stream()
				.map(word -> (word.equals(find)) ? replace : word)
				.toArray(String[]::new);
		final String newMessage = String.join(" ", messageWithReplacedWords);
		System.out.println(newMessage);
	}
}
