package gui;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxExample {
	
	public CheckBoxExample() {
		
		JCheckBox checkBox = new JCheckBox();
		checkBox.setBounds(150, 100, 50, 50);
		
		JFrame frame = new JFrame();
		frame.setTitle("CheckBox Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(checkBox);
		
	}

	public static void main(String[] args) {
		new CheckBoxExample();
	}

}
