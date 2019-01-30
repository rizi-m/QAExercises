package NumberToEnglish;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Converter {

	private final String FILENAME = "digits-to-words.txt";
	private HashMap<Integer, String> numberToWord = new HashMap<>();

	public Converter() {
		List<String> conversions = readConversionsFromFile();
		processConversions(conversions);
	}

	public void digitsToWorlds(int digits) {
		String word = getWordFrom(digits);
		System.out.println(word);
	}

	private String getWordFrom(int number) {
		if (number == 0) return "zero";
		String answer = "";
		if (number >= 1000) {
			answer += numberToWord.get(number / 1000) + " thousand ";
			number %= 1000;
		}
		if (number >= 100) {
			answer += numberToWord.get(number / 100) + " hundred ";
			number %= 100;
		}
		if (number >= 20) {
			answer += numberToWord.get((number / 10) * 10) + " ";
			number %= 10;
		}
		if (number < 20) {
			answer += numberToWord.get(number);
		}
		return answer;
	}

	private void processConversions(List<String> conversions) {
		conversions.forEach(conversion -> {
			String[] splitConversion = conversion.split(",");
			Integer number = Integer.valueOf(splitConversion[0]);
			String word = splitConversion[1];
			numberToWord.put(number, word);
		});
		numberToWord.put(0, "");
	}

	private List<String> readConversionsFromFile() {
		Path filePath = Paths.get(FILENAME);
		try {
			return Files.readAllLines(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Arrays.asList();
	}

	public static void main(String[] args) {
		Converter conv = new Converter();
		conv.digitsToWorlds(9900);
	}
}
