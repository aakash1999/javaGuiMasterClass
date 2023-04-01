package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExample {
	
	JFrame frame;
	
	public BorderLayoutExample() {
		
		
		
		JButton b1 = new JButton("NORTH");
		JButton b2 = new JButton("SOUTH");
		JButton b3 = new JButton("EAST");
		JButton b4 = new JButton("WEST");
		JButton b5 = new JButton("CENTER");
		
		BorderLayout bLayout = new BorderLayout(20,15);
		
		frame = new JFrame();
		frame.setLayout(bLayout);
		frame.setTitle("BorderLayout");
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		frame.add(b1, BorderLayout.NORTH); //place b1 in the north direction
		frame.add(b2, BorderLayout.SOUTH); //place b2 in the south direction
		frame.add(b3, BorderLayout.EAST); //place b3 in the east direction
		frame.add(b4, BorderLayout.WEST); //place b4 in the west direction
		frame.add(b5, BorderLayout.CENTER); //place b5 in the center
		
	}

	public static void main(String[] args) {
		new BorderLayoutExample();
	}

}
