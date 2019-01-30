package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.BiFunction;

public class Main {
	
//	static TextField textField = new TextField();
	static TextField first = new TextField(5);
	static TextField second = new TextField(5);
	static TextField third = new TextField(5);

	
	public static void main(String[] args) {
		Frame f = new Frame();
		FlowLayout flowLayout = new FlowLayout();
		f.setLayout(flowLayout);

		Button add = new Button("+");
		Button sub = new Button("-");
		Button mul = new Button("*");
		Button div = new Button("/");
		Button mod = new Button("%");
		Button and = new Button("&");

		add.addActionListener((e) -> operateTwoTextFieldsAndAddToThird((num1, num2) -> num1+num2));
		sub.addActionListener((e) -> operateTwoTextFieldsAndAddToThird((num1, num2) -> num1-num2));
		mul.addActionListener((e) -> operateTwoTextFieldsAndAddToThird((num1, num2) -> num1*num2));
		div.addActionListener((e) -> operateTwoTextFieldsAndAddToThird((num1, num2) -> num1/num2));
		mod.addActionListener((e) -> operateTwoTextFieldsAndAddToThird((num1, num2) -> num1%num2));
		and.addActionListener((e) -> operateTwoTextFieldsAndAddToThird((num1, num2) -> num1&num2));
		
//		add.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				try {
//					third.setText((Integer.parseInt(first.getText()) + Integer.parseInt(second.getText())) + "");
//				} catch (Exception e2) {}
//			}
//			
//		});
//		
//		sub.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				try {
//					third.setText((Integer.parseInt(first.getText()) - Integer.parseInt(second.getText())) + "");
//				} catch (Exception e2) {}
//				
//			}
//		});
//		
//		mul.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				try {
//					third.setText((Integer.parseInt(first.getText()) * Integer.parseInt(second.getText())) + "");
//				} catch (Exception e2) {}
//			}
//		});
//
//		div.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				try {
//					third.setText((Integer.parseInt(first.getText()) / Integer.parseInt(second.getText())) + "");
//				} catch (Exception e2) {}
//				
//			}
//		});
		
		f.add(new Label("First:"));
		f.add(first);
		f.add(new Label("Second:"));
		f.add(second);
		f.add(add);
		f.add(sub);
		f.add(mul);
		f.add(div);
		f.add(mod);
		f.add(and);
		f.add(new Label("Answer:"));
		f.add(third);
		f.setSize(600, 400);
		f.setVisible(true);
	}
	
//	public static void addHelloToTextField(ActionEvent e) {
//		textField.setText("Hello from Main");
//	}
	
	public static void sumTwoTextFiedldsToThird(ActionEvent e) {
		try {
			String firstString = first.getText();
			String secondString = second.getText();
			int first = Integer.parseInt(firstString);
			int second = Integer.parseInt(secondString);
			third.setText((first + second) + "");
		} catch (Exception exception) { }
	}
	
	
	public static void operateTwoTextFieldsAndAddToThird(BiFunction<Integer, Integer, Integer> operator) {
		try {
			int answer = operator.apply(Integer.parseInt(first.getText()), Integer.parseInt(second.getText()));
			third.setText(answer+"");
		} catch (Exception e) {
			third.setText("Error");
		}
	}
	
}
