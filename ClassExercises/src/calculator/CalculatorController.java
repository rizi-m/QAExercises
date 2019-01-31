package calculator;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	
	private CalculatorView calculatorView;
	private CalculatorModel calculatorModel = new CalculatorModel();
	
	private String operator = " ";
	private boolean operatorPressedLast = false;
	private boolean numberPressedLast = false;
	private boolean needToClear = true;
	
	public CalculatorController() {
		setCalculatorView();
	}

	private void setCalculatorView() {
		
		ActionListener numbersActionListener = new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				numberPressed(e);
			}
		};
		
		ActionListener operatorActionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				operatorPressed(e);
			}
		};
		
		calculatorView = new CalculatorView(operatorActionListener, numbersActionListener);
		
	}
	
	private void numberPressed(ActionEvent e) {
		Button source = (Button) e.getSource();
		String number = source.getLabel();
		if(needToClear) {
			calculatorView.displayText("");
			needToClear = false;
		}
		String currentScreenText = calculatorView.getCurrentScreenText();
		calculatorView.displayText(currentScreenText + number);
		numberPressedLast = true;
	}
	
	private void operatorPressed(ActionEvent e) {
		Button source = (Button) e.getSource();
		String buttonPressedOperator = source.getLabel();
		if (buttonPressedOperator.equals("C")) {
			calculatorModel.clear();
			calculatorView.displayText("");
			operatorPressedLast = false;
			numberPressedLast = false;
			needToClear = true;
		}
		if (buttonPressedOperator.equals("=")) {
			equalsPressed(operator);
		}
		if (!operatorPressedLast) {
			if(isBinaryOperator(buttonPressedOperator)) {
				String currentScreenText = calculatorView.getCurrentScreenText();
				int currentNumber = Integer.parseInt(currentScreenText);
				
				calculatorModel.push(currentNumber);
				operatorPressedLast = true;
				needToClear = true;
				operator = buttonPressedOperator;
			}
		}
		else if (operatorPressedLast && isBinaryOperator(buttonPressedOperator)) {
			equalsPressed(operator);
			operatorPressedLast = true;
			needToClear = true;
			operator = buttonPressedOperator;
		}
	}
	
	private void equalsPressed(String operator) {
		String currentScreenText = calculatorView.getCurrentScreenText();
		int currentNumber = Integer.parseInt(currentScreenText);
		System.out.println(currentNumber);
		System.out.println(calculatorModel);
		if (operator.equals("+")) {
			int result = calculatorModel.add(currentNumber);
			calculatorView.displayText(result+"");
		}
		if (operator.equals("-")) {
			int result = calculatorModel.sub(currentNumber);
			calculatorView.displayText(result+"");
		}
		if (operator.equals("*")) {
			int result = calculatorModel.mul(currentNumber);
			calculatorView.displayText(result+"");
		}
		if (operator.equals("/")) {
			int result = calculatorModel.div(currentNumber);
			calculatorView.displayText(result+"");
		}
		operatorPressedLast = false;
		
	}

	private boolean isBinaryOperator(String operator) {
		return operator.equals("/") ||
				operator.equals("*") ||
				operator.equals("+") ||
				operator.equals("-");
	}
	
	private void push() {
		
	}

}
