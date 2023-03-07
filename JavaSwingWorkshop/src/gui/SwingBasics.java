package gui;

import javax.swing.JFrame;

public class SwingBasics {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("My First Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(420, 420);
		frame.setVisible(true);

	}

}
