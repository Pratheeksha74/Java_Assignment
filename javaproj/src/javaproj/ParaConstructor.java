package javaproj;

class Student{
	int id;
	String name;
	
	Student(int id, String name) { 
		this.id = id;
		this.name = name;
		System.out.println("Parameterised");
	}
	
	void StudentDetails() {
		System.out.println("id "+ id);
		System.out.println("Name "+name);
	}
}

public class ParaConstructor {
	
	public static void main(String[] args) {
		Student s1 = new Student(2,"Sachin");
		s1.StudentDetails();

	}

}
