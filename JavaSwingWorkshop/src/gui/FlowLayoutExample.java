package gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExample {
	
	JFrame frame;
	
	public FlowLayoutExample() {
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b10 = new JButton("10");
		
		FlowLayout fLayout = new FlowLayout(FlowLayout.RIGHT, 20, 25);
		
		frame = new JFrame();
		frame.setLayout(fLayout);
		frame.add(b1);frame.add(b2);frame.add(b3);frame.add(b4);frame.add(b5);
		frame.add(b6);frame.add(b7);frame.add(b8);frame.add(b9);frame.add(b10);
		frame.setSize(500, 500);
		frame.setTitle("FlowLayout");
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new GrdiLayout();
		//new GridLayout(rows, columns);
		//new GridLayout(r,c,hGap,vGap);
		new FlowLayoutExample();
		

	}

}
