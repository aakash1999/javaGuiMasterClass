package gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuDemo {
	
	JMenu menu, subMenu;
	JMenuItem i1, i2, i3, i4, i5;
	
	public JMenuDemo() {
		
		JMenuBar menuBar = new JMenuBar();
		menu = new JMenu("Menu");
		subMenu = new JMenu("Sub Menu");
		
		i1 = new JMenuItem("Iphone");
		i2 = new JMenuItem("Samsung");
		i3 = new JMenuItem("MI");
		i4 = new JMenuItem("Oneplus");
		i5 = new JMenuItem("ASUS");
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		
		subMenu.add(i4);
		subMenu.add(i5);
		
		menu.add(subMenu);
		menuBar.add(menu);
		
		JFrame frame = new JFrame();
		frame.setTitle("JMenu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setJMenuBar(menuBar);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JMenuDemo();
	}

}
