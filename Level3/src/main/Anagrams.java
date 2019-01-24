package main;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Anagrams {
	
	public static List<String> readWordsFromFile(String fileName) {
		Path filePath = Paths.get(fileName);
		List<String> words;
		try {
			words = Files.readAllLines(filePath);
			return words.stream().map(String::toLowerCase).collect(Collectors.toList());
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
	
	private static List<String> sortWordsAlphabetically(Collection<String> unsortedWords) {
		return unsortedWords.stream()
			.map(Anagrams::sortString)
			.collect(Collectors.toList());
	}
	
	
	private static int getMaxNumberOfAnagrams(Collection<ArrayList<String>> anagrams) {
		return anagrams.stream()
			.max(Comparator.comparing(ArrayList::size))
			.map(ArrayList::size)
			.get().intValue();
	}
	
	private static List<ArrayList<String>> collectCommonAnagramsOfSize(Collection<ArrayList<String>> anagrams, int size) {
		return anagrams.stream()
			.filter((list) -> list.size() == size)
			.collect(Collectors.toList());
	}
	
	private static int getLengthOfLongestAnagram(Collection<ArrayList<String>> anagrams) {
		return anagrams.stream()
			.mapToInt(list -> list.get(0).length())
			.max().getAsInt();
	}
	
	private static List<ArrayList<String>> collectAnagramsOfSize(Collection<ArrayList<String>> anagrams, int size) {
		return anagrams.stream()
			.filter(list -> list.get(0).length() == size)
			.collect(Collectors.toList());
	}
	
	public static List<ArrayList<String>> findWordWithMostAnagramsFrom(String fileName) {
		List<String> wordsFromFile = readWordsFromFile(fileName);
		List<String> sortedWords = sortWordsAlphabetically(wordsFromFile);
		
		HashMap<String, ArrayList<String>> sortedWordToAnagrams = new HashMap<>();
		sortedWords.forEach(word -> sortedWordToAnagrams.put(word, new ArrayList<>()));
		wordsFromFile.forEach(word -> sortedWordToAnagrams.get(sortString(word)).add(word));
		
		Collection<ArrayList<String>> anagrams = sortedWordToAnagrams.values();
		
		int maxNumberOfAnagrams = getMaxNumberOfAnagrams(anagrams);
		
		List<ArrayList<String>> commonAnagrams = collectCommonAnagramsOfSize(anagrams, maxNumberOfAnagrams);
		
		int longestLengthAnagram = getLengthOfLongestAnagram(commonAnagrams);
		
		List<ArrayList<String>> bestAnagrams = collectAnagramsOfSize(commonAnagrams, longestLengthAnagram);
		
		return bestAnagrams;
	}
}
