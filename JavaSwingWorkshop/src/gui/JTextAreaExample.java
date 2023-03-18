package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class JTextAreaExample implements ActionListener{
	
	JLabel l1, l2;
	JTextArea area;
	JButton button;
	JPasswordField passwordField;
	
	public JTextAreaExample() {
		
		l1 = new JLabel();
		l1.setBounds(50, 25, 100,30);
		
		l2 = new JLabel();
		l2.setBounds(160, 25, 200,30);
		
		area = new JTextArea();
		area.setBounds(20,75,250,200);
		
//		passwordField = new JPasswordField();
//		passwordField.setBounds(20, 280, 100, 100);
		
		button = new JButton("Count Words");
		button.setBounds(100, 300, 120, 30);
		button.addActionListener(this);
		
		JFrame frame = new JFrame();
		frame.setTitle("Labels");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(area);
		frame.add(l1);
		frame.add(l2);
		frame.add(button);
		//frame.add(passwordField);
		
		
	}
	
	public static void main(String[] args) {
		new JTextAreaExample();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String text = area.getText();
		
		String words[] = text.split(" ");
		l1.setText("Words Count : " + words.length);
		l2.setText("Character Count : " + text.length());
		
	}

}
