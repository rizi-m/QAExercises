import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Gui {
	private JFrame mainFrame = new JFrame("Test");
	private Container mainContainer;
	private JTextArea textArea = new JTextArea();
	private JButton button = new JButton("Click me!");
	
	public void initGui() {
		mainFrame.setSize(300, 300);
		mainFrame.setResizable(false);
		centerWindow();
		mainContainer = mainFrame.getContentPane();
		
		textArea.setText("Test text \nlorem ipsum");
		textArea.setEditable(false);
		
		mainContainer.add(button, BorderLayout.NORTH);
		mainContainer.add(textArea, BorderLayout.SOUTH);

		mainFrame.setVisible(true);
	}
	
	private void centerWindow() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int xPosition = (int) (screenSize.getWidth() / 2) - mainFrame.getWidth() / 2;
		int yPosition = (int) (screenSize.getHeight() / 2) - mainFrame.getHeight() / 2;
		mainFrame.setLocation(xPosition, yPosition);
	}
	
}
