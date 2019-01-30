package gui;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {

	TextField first;
	TextField second;
	TextField third;
	
	public EventHandler(TextField first, TextField second, TextField third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int first = Integer.parseInt(this.first.getText());
			int second = Integer.parseInt(this.second.getText());
			third.setText((first + second) + "");
		} catch (Exception exception) {
			
		}
	}

	
}
