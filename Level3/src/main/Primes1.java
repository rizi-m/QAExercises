package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Primes1 {

	private static List<Integer> primes = new ArrayList<>();
	
	public static List<Integer> getPrimesFrom0To3Million() {
		primes.add(2);
		primes.add(3);
		primes.add(5);
		for(int i = 7; i < 3000000; i += 2) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}
	
	private static boolean isPrime(int number) {
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
