package main;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Primes2 {

	private static List<Integer> primes = new ArrayList<>();
	private static List<Integer> toLook = IntStream.range(6, 3000000).boxed().collect(Collectors.toList());
//	private static 
	public static List<Integer> getPrimesFrom0To3Million() {
		toLook = toLook.stream().filter(number -> !((number % 2 == 0) || (number % 3 == 0) || (number % 5 == 0))).collect(Collectors.toList());
		primes.add(2);
		primes.add(3);
		primes.add(5);
		boolean done = false;
		while (!done) {
			for(int i = 0; i < toLook.size(); ++i) {
				final Integer number = toLook.get(i);
				if (isPrime(number)) {
					primes.add(number);
					toLook = toLook.parallelStream().filter(x -> !(x % number == 0)).collect(Collectors.toList());
					break;
				}
			}
			if(toLook.size() == 0) {
				break;
			}
		}
		return primes;
	}
	
	private static boolean isPrime(int number) {
//		if (number > 200000000 && !BigInteger.valueOf(number).isProbablePrime(1)) {
//			return false;
//		}
		int upperLimit = (int) Math.sqrt( (double) number);
		if ((double) upperLimit == Math.sqrt( (double) number)) {
			return false;
		}
		for(Integer prime : primes) {
			if (prime > upperLimit) {
				return true;
			}
			if (number % prime == 0) {
				return false;
			}
		}
		return true;
	}
}
