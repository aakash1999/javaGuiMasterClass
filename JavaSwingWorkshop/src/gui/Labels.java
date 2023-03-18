package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Labels {

	public static void main(String[] args) {
		
		ImageIcon icon = new ImageIcon("naruto.png");
		
		JLabel label = new JLabel();
		label.setText("Yo Ninjas, you are learning to code??");
		label.setIcon(icon);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0x00FF00));
		label.setFont(new Font("MV Boli", Font.PLAIN, 50));
		label.setIconTextGap(-10);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBounds(100, 100, 500, 500);
		
		
		JFrame frame = new JFrame();
		frame.setTitle("Labels");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		

	}

}
