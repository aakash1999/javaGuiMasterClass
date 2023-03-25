package gui;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class JColorChooserDemo implements ActionListener{
	
	JButton button;
    JFrame frame;	
	
	public JColorChooserDemo() {
	
		button = new JButton("Color Chooser");
		button.setBounds(30,40,200,100);
		button.addActionListener(this);
		
		frame = new JFrame();
		frame.setTitle("JLIST");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(button);
	}

	public static void main(String[] args) {
		new JColorChooserDemo();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Color initialColor = Color.red;
		Color color = JColorChooser.showDialog(frame, "Select a Color", initialColor);
		//frame.setBackground(color);
		
	}

}
