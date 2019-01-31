package calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView extends Frame {
	
	private Panel northPanel = new Panel();
	private Panel centerPanel = new Panel();
	
	private TextField calculatorScreenTextField = new TextField(20);
	
	private Button number1Button = new Button("1");
	private Button number2Button = new Button("2");
	private Button number3Button = new Button("3");
	private Button number4Button = new Button("4");
	private Button number5Button = new Button("5");
	private Button number6Button = new Button("6");
	private Button number7Button = new Button("7");
	private Button number8Button = new Button("8");
	private Button number9Button = new Button("9");
	private Button number0Button = new Button("0");
	
    private Button operatorAddButton = new Button("+");
    private Button operatorSubButton = new Button("-");
    private Button operatorMulButton = new Button("*");     
    private Button operatorClsButton = new Button("C");
    private Button operatorAnsButton = new Button("=");
    private Button operatorDivButton = new Button("/");
	
	public CalculatorView(ActionListener operatorActionListener, ActionListener numberActionListener) {
		setNorthLayout();
		setCenterLayout();
		add(northPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		setNumberActionListeners(numberActionListener);
		setOperatorActionListener(operatorActionListener);
		setSize(500, 400);
		setVisible(true);
	}
	
	private void setNorthLayout() {
		northPanel.add(calculatorScreenTextField);
	}
	
	private void setCenterLayout() {
		centerPanel.setLayout(new GridLayout(4, 4));

        centerPanel.add(number1Button); 
		centerPanel.add(number2Button); 
		centerPanel.add(number3Button); 
		centerPanel.add(operatorAddButton); 
		centerPanel.add(number4Button); 
		centerPanel.add(number5Button); 
		centerPanel.add(number6Button); 
		centerPanel.add(operatorSubButton); 
		centerPanel.add(number7Button); 
		centerPanel.add(number8Button); 
		centerPanel.add(number9Button); 
		centerPanel.add(operatorMulButton); 
		centerPanel.add(number0Button); 
		centerPanel.add(operatorClsButton); 
		centerPanel.add(operatorAnsButton); 
		centerPanel.add(operatorDivButton); 
	}
	
	private void setNumberActionListeners(ActionListener numbersActionListener) {

		number1Button.addActionListener(numbersActionListener);
		number2Button.addActionListener(numbersActionListener);
		number3Button.addActionListener(numbersActionListener);
		number4Button.addActionListener(numbersActionListener);
		number5Button.addActionListener(numbersActionListener);
		number6Button.addActionListener(numbersActionListener);
		number7Button.addActionListener(numbersActionListener);
		number8Button.addActionListener(numbersActionListener);
		number9Button.addActionListener(numbersActionListener);
		number0Button.addActionListener(numbersActionListener);
	}
	
	private void setOperatorActionListener(ActionListener operatorActionListener) {
		operatorAddButton.addActionListener(operatorActionListener);
		operatorSubButton.addActionListener(operatorActionListener);
		operatorMulButton.addActionListener(operatorActionListener);
		operatorClsButton.addActionListener(operatorActionListener);
		operatorAnsButton.addActionListener(operatorActionListener);
		operatorDivButton.addActionListener(operatorActionListener);
	}
	
	public String getCurrentScreenText() {
		return calculatorScreenTextField.getText();
	}
	
	public void displayText(String t) {
		calculatorScreenTextField.setText(t);
	}

}
