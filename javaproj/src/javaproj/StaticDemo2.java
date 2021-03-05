package javaproj;

class Employee {
	String name;
	int id;
	static String company = "ABC";
}

public class StaticDemo2 {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.name = "Sachin";
		emp1.id = 1;
		Employee.company = "TCS";
		emp2.name = "Rahul";
		emp2.id = 2;
		System.out.println(emp1.name +" "+emp1.id+" "+Employee.company);
		System.out.println(emp2.name +" "+emp2.id+" "+Employee.company);
		

	}

}
