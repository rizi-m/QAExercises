package main;

public class Main {

	public static void main(String[] args) {
//		Anagrams.findWordWithMostAnagramsFrom("words.txt");
		long startTime = System.nanoTime();
		System.out.println(Primes1.getPrimesFrom0To3Million().size());
		long endTime = System.nanoTime();
		long time1 = (long) ((endTime - startTime) * Math.pow(10, -9));
		startTime = System.nanoTime();
		System.out.println(Primes2.getPrimesFrom0To3Million().size());
		endTime = System.nanoTime();
		long time2 = (long) ((endTime - startTime) * Math.pow(10, -9));
		System.out.println("time for first: " + time1);
		System.out.println("time for second: " + time2);
		System.out.println("First faster than second? " + (time1 < time2));
	}

}
