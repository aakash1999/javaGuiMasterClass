package gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		
		this.setTitle("My First Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(420, 420);
		this.setVisible(true);
		
		ImageIcon image = new ImageIcon("thumbnail.png");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(0x123456));
	}

}
