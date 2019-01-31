package gui.multiframes;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Math extends Frame {
	
	TextField t1, t2, t3;
	Label l1, l2, l3, l4;
	Button b1;
	
	public Math() {
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		l1 = new Label("First");
		l2 = new Label("Second");
		l3 = new Label();
		l4 = new Label("Result");
		b1 = new Button("");
		
		GridLayout gridLayout = new GridLayout(4, 2);
		setLayout(gridLayout);
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(b1);
		add(l4);
		add(t3);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String t = getTitle();
				
				if(t.equals("Addition")) {
					t3.setText(( Integer.parseInt( t1.getText() ) + Integer.parseInt( t2.getText() )) + "");
				}
				if(t.equals("Subtraction")) {
					t3.setText(( Integer.parseInt( t1.getText() ) - Integer.parseInt( t2.getText() )) + "");
				}
				if(t.equals("Mutiplication")) {
					t3.setText(( Integer.parseInt( t1.getText() ) * Integer.parseInt( t2.getText() )) + "");
				}
				if(t.equals("Division")) {
					t3.setText(( Integer.parseInt( t1.getText() ) / Integer.parseInt( t2.getText() )) + "");
				}
			}
		});
	}
	
	public void setOperator(String s) {
		setTitle(s);
		if(s.equals("Addition")) {
			b1.setLabel("+");
		}
		if(s.equals("Subtraction")) {
			b1.setLabel("-");
		}
		if(s.equals("Mutiplication")) {
			b1.setLabel("*");
		}
		if(s.equals("Division")) {
			b1.setLabel("/");
		}
		setSize(400, 200);
		setVisible(true);
	}
	
}
