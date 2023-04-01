package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Inet4Address;
import java.net.InetAddress;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class IpFinder implements ActionListener{
	
	JLabel label;
	JTextField textField;
	JButton button;
	JFrame frame;
	
	public IpFinder(){
		
		label = new JLabel("Enter URL : ");
		label.setBounds(50, 70, 150, 20);
		
		textField = new JTextField();
		textField.setBounds(50, 100, 200, 20);
		
		button = new JButton("Find My IP");
		button.setBounds(50,150,120,30);
		button.addActionListener(this);
		
		frame = new JFrame();
		frame.setTitle("IP Finder Application");
		frame.setSize(300,300);;
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.add(button);
		frame.add(textField);
	}

	public static void main(String[] args) {
		new IpFinder();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String url = textField.getText();
		
		try {
			InetAddress ia = InetAddress.getByName(url);
			String ip = ia.getHostAddress();
			JOptionPane.showMessageDialog(frame,ip);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(frame,"Some error occured!!");
		}
		
	}

}
