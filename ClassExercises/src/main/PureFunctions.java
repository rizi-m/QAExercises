package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PureFunctions {
	List<Integer> l = new ArrayList<>();
	int colorValue;
	public PureFunctions() {
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(1);
	}
	
	
	public void pureFunction() {
		System.out.println(l.stream().mapToInt(x -> x.intValue()).sum());
	}
	
	public void purifiedFunction() {
		final List<Integer> x = l.stream().map(y -> y * 2).collect(Collectors.toList());
		System.out.println(x.stream().mapToInt(y -> y).sum());
		int z =0;
		if (z > 30) {
			System.out.println("You are authorised");
		}
	}
	

	
	public static void main(String[] args) {
		PureFunctions f = new PureFunctions();
		f.purifiedFunction();
		f.purifiedFunction();
		f.purifiedFunction();
		f.purifiedFunction();
		f.purifiedFunction();
	}
}
