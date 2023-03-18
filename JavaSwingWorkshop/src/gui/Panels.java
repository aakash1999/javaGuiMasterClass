package gui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panels {

	public static void main(String[] args) {
		
		//Flowlayout
		
		JLabel label = new JLabel();
		label.setText("Hi, I am inside a panel");
		label.setBounds(100, 100, 80, 25);
		
		JLabel label1 = new JLabel();
		label.setText("I am another label");
		
		JPanel redPanel = new JPanel();
		redPanel.setBounds(0,0, 250, 250);
		redPanel.setBackground(Color.red);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBounds(250,0, 250, 250);
		bluePanel.setBackground(Color.blue);
		bluePanel.setLayout(null);
		bluePanel.add(label);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBounds(0,250 ,500, 250);
		greenPanel.setBackground(Color.green);
		greenPanel.setLayout(null);
		greenPanel.add(label);
		
		JFrame frame = new JFrame();
		frame.setTitle("Panels");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);

	}

}
