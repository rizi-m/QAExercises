package gui.multiframes;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.function.BiFunction;

public class Main {
	public static void main(String[] args) {
		Frame mainFrame = new Frame();
		GridLayout gridLayout = new GridLayout(4, 1);
		mainFrame.setLayout(gridLayout);
		
		Button add = new Button("+");
		Button sub = new Button("-");
		Button mul = new Button("*");
		Button div = new Button("/");
		
		add.addActionListener((e) -> showAppropriateFrame("Addition", "+", (num1, num2) -> num1+num2));
		sub.addActionListener((e) -> showAppropriateFrame("Subtraction", "-", (num1, num2) -> num1-num2));
		mul.addActionListener((e) -> showAppropriateFrame("Multiplication", "*", (num1, num2) -> num1*num2));
		div.addActionListener((e) -> showAppropriateFrame("Division", "/", (num1, num2) -> num1/num2));
		
		mainFrame.add(add);
		mainFrame.add(sub);
		mainFrame.add(mul);
		mainFrame.add(div);
		
		mainFrame.setSize(200, 600);
		mainFrame.setVisible(true);
	}
	
	public static void showAppropriateFrame(String title, String buttonText, BiFunction<Integer, Integer, Integer> operator) {
		CalculationFrame calculationFrame = new CalculationFrame(title, buttonText, operator);
		calculationFrame.setVisible(true);
	}
}
