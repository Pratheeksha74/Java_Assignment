package javaproj;
class Empl{
	int id;
	String name;
	
	Empl() {
		System.out.println("This is constructor");
		id = 1;
		name = "Sachin";
	}
	
	void displayEmpDetails() {
		System.out.println("id "+id);
		System.out.println("Name "+name);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		Empl emp1 = new Empl();
		emp1.displayEmpDetails();

	}

}
