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
	private Button operatorButton = new Button();
	private BiFunction<Integer, Integer, Integer> operator;
	
	public CalculationFrame() {
		setLayout(new GridLayout(4, 2));
		
		operatorButton.addActionListener((e) -> operateTwoTextFieldsAndAddToThird());
		
		add(new Label("First:"));
		add(first);
		add(new Label("Second:"));
		add(second);
		add(new Label(""));
		add(operatorButton);
		add(new Label("Result:"));
		add(third);
		

	}
	
	public void setOperator(String title, String buttonText, BiFunction<Integer, Integer, Integer> operator) {
		setTitle(title);
		operatorButton.setLabel(buttonText);
		this.operator = operator;
		setSize(400, 200);
		setVisible(true);
	}
	
	private void operateTwoTextFieldsAndAddToThird() {
		try {
			int answer = operator.apply(Integer.parseInt(first.getText()), Integer.parseInt(second.getText()));
			third.setText(answer+"");
		} catch (Exception e) {
			third.setText("Error");
		}
	}
}
