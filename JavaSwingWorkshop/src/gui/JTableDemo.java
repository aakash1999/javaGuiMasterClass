package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo {
	
	
	
	public JTableDemo(){
		
		
		String data[][] = {{"101", "Aakash", "40000"},
				{"102", "Dinesh", "90000"},
				{"103", "Ramesh", "80000"}
		};
		
		String columnNames[] = {"ID", "NAME", "SALARY"};
		
		JTable table = new JTable(data, columnNames);
		table.setBounds(30, 40, 200, 300);
		
		//JScrollPane sp = new JScrollPane(table);
		
		JFrame frame = new JFrame();
		frame.setTitle("JTable");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.add(table);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		
		new JTableDemo();

	}

}
