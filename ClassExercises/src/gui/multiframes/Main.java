package gui.multiframes;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		
		CalculationFrame calculationFrame = new CalculationFrame();
		add.addActionListener((e) -> calculationFrame.setOperator("Addition", 		"+", (num1, num2) -> num1+num2));
		sub.addActionListener((e) -> calculationFrame.setOperator("Subtraction", 	"-", (num1, num2) -> num1-num2));
		mul.addActionListener((e) -> calculationFrame.setOperator("Multiplication", "*", (num1, num2) -> num1*num2));
		div.addActionListener((e) -> calculationFrame.setOperator("Division", 		"/", (num1, num2) -> num1/num2));
		
//		Math math = new Math();
//		add.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				math.setOperator("Addition");
//			}
//		});
//		
//		sub.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				math.setOperator("Subtraction");
//			}
//		});
//		
//		mul.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				math.setOperator("Multiplication");
//			}
//		});
//		
//		div.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				math.setOperator("Division");
//			}
//		});
		
		mainFrame.add(add);
		mainFrame.add(sub);
		mainFrame.add(mul);
		mainFrame.add(div);
		
		mainFrame.setSize(200, 600);
		mainFrame.setVisible(true);
	}
	
	
}
