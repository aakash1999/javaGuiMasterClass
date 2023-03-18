package basics;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Student student = new Student(); // constructor
		
		student.name = "Aakash";
		student.age = "25";
		student.dob = "25 Jan";
		student.rollNo = "1111";
		
		System.out.println(student.name);
		
		student.study("Maths");
		
		student.play("Call Of Duty");
		
		Student student2 = new Student("Aakash", "75", "Feb 2", "2222");
		
		student2.display();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		

	}

}
