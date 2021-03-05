package day3;

class Person {
	int id;
	String name;
	int age;
}

class Cricketer extends Person {
	String role;
	void displayDetails() {
		System.out.println("id "+id);
		System.out.println("name "+name);
		System.out.println("age "+age);
		System.out.println("role "+role);
	}
}
class Student extends Person {
	String dept;
}
class Manager extends Person {
	int experience;	
}
public class InheritanceDemo {

	public static void main(String[] args) {
		Cricketer ck = new Cricketer();
		ck.id = 1;
		ck.name = "Sachin";
		ck.age = 20;
		ck.role = "Bowler";
		ck.displayDetails();

	}

}
