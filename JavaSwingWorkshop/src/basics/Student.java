package basics;

public class Student {
	
	String name;
	String age;
	String dob;
	String rollNo;
	
	Student() {
		System.out.println("I am a constructor");
	}
	
	Student(String name, String age, String dob, String rollNo){
		System.out.println("This is a parameterized constructor!!");
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.rollNo = rollNo;
	}
	
	void study(String subject) {
		System.out.println("I am studying " + subject);
	}
	
	void play(String game) {
		System.out.println("I am playing " + game);
	}
	
	void display() {
		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(rollNo);
		System.out.println(dob);
	}

}
