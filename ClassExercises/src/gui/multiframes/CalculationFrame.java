package gui.multiframes;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.util.function.BiFunction;

public class CalculationFrame extends Frame {
	
	private TextField first = new TextField();
	private TextField second = new TextField();
	private TextField third = new TextField();
	
	public CalculationFrame(String title, String buttonText, BiFunction<Integer, Integer, Integer> operator) {
		super(title);
		setLayout(new GridLayout(4, 2));
		
		Button operatorButton = new Button(buttonText);
		operatorButton.addActionListener(e -> operateTwoTextFieldsAndAddToThird(operator));
		
		
		add(new Label("First:"));
		add(first);
		add(new Label("Second:"));
		add(second);
		add(new Label(""));
		add(operatorButton);
		add(new Label("Result:"));
		add(third);
		
		setSize(400, 200);
	}
	
	private void operateTwoTextFieldsAndAddToThird(BiFunction<Integer, Integer, Integer> operator) {
		try {
			int answer = operator.apply(Integer.parseInt(first.getText()), Integer.parseInt(second.getText()));
			third.setText(answer+"");
		} catch (Exception e) {
			third.setText("Error");
		}
	}
}
