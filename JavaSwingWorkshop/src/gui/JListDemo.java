package gui;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class JListDemo {
	
	public JListDemo() {
		
		DefaultListModel<String> data = new DefaultListModel<String>();
		data.addElement("Aakash");
		data.addElement("Dinesh");
		data.addElement("Vicky");
		data.addElement("Ramnesh");
		data.addElement("Suresh");
		
		JList<String> list = new JList<String>(data);
		list.setBounds(100, 100, 75, 75);
		
		
		
		JFrame frame = new JFrame();
		frame.setTitle("JLIST");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(list);
	}
	
	
	public static void main(String[] args) {
		new JListDemo();
	}

}
