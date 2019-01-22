import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Anagrams {
	
	public static List<String> readWordsFromFile(String fileName) {
		Path filePath = Paths.get(fileName);
		List<String> words;
		try {
			words = Files.readAllLines(filePath);
			return words;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Arrays.asList();
	}
	
	public static String sortString(String inputString) {
		List<String> inputCharacters = Arrays.asList(inputString.split(""));
		
		List<String> sortedCharacters = inputCharacters.stream()
			.sorted()
			.collect(Collectors.toList());
		
		String output = String.join("", sortedCharacters);
		return output;
	}
	
	private static List<String> sortWordsAlphabetically(List<String> unsortedWords) {
		return unsortedWords.stream()
				.map(Anagrams::sortString)
				.collect(Collectors.toList());
	}
	
	public static String findWordWithMostAnagramsFrom(String fileName) {
		List<String> wordsFromFile = readWordsFromFile(fileName);
		List<String> sortedWords = sortWordsAlphabetically(wordsFromFile);
		
		HashMap<String, Integer> wordCount = new HashMap<>(); 
		

		return "";
	}
}