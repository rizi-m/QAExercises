package main;

import java.util.Arrays;

public class Results {
	private int phy = -1;
	private int che = -1;
	private int mat = -1;
	
	public void showResults() {
		if (areMarksValid()) {
			int numberOfSubjetsFailed = numberOfSubjectsFailed();
			switch (numberOfSubjetsFailed) {
				case 0: { 
					int total = phy + che + mat;
					int percentage = total * 100/450;
					System.out.println("Results:" + total);
					System.out.println("Percentage:"+percentage);
					break;
				}
				case 1: System.out.println("Retake the exam"); break;
				case 2: System.out.println("Repeat the course"); break;
				default: System.out.println("Go home");
			}
		} 
		else {
			System.out.println("Invalid entry");
		}
	}
	
	private boolean areMarksValid() {
		return (phy >= 0 &&
				che >= 0 &&
				mat >= 0);
	}
	
	public void physics(int mark) {
		if (mark >= 0 && mark <= 150) {
			phy = mark;
		}
		else {
			System.out.println("Invalid physics marks");
		}
	}
	
	public void chemistry(int mark) {
		if (mark >= 0 && mark <= 150) {
			che = mark;
		}
		else {
			System.out.println("Invalid chemistry marks");
		}
	}
	
	public void math(int mark) {
		if (mark >= 0 && mark <= 150) {
			mat = mark;
		}
		else {
			System.out.println("Invalid math marks");
		}
	}
	
	public int numberOfSubjectsFailed() {
		return (int) Arrays.asList(new Integer[] { mat, che, phy }).stream()
				.filter(mark -> mark < 60)
				.count();
	}
}
