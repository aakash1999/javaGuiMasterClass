package gui;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Jbutton implements ActionListener {
	
	static JTextField textField;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JButton button = new JButton("Click Here!!");
		button.setBounds(50, 50, 150, 20);
		button.addActionListener(new Jbutton());
		
		
		textField = new JTextField();
		textField.setBounds(50,100,95,30);
		
		JFrame frame = new JFrame();
		frame.setTitle("Button Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(button);
		frame.add(textField);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//System.out.println("The button has been clicked");
		textField.setText("Welcome To Careerninja!!");
		//button.setEnabled(false);
		
	}

}
