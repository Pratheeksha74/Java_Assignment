package day3;

class Employee2 {
	int id;
	String name;
	String dept;
	Address ad; // Entity reference or object reference
	public Employee2(int id, String name,String dept, Address ad) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.ad = ad;
	}
	void displayEmpDetails() {
		System.out.println("id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Dept: "+dept);
		System.out.println("Door no: "+ad.doorNo);
		System.out.println("Street Name: "+ad.streetName);
		System.out.println("Pin code: "+ad.pinCode);
	}
}

class Address {
	int doorNo;
	String streetName;
	int pinCode;
	Address(int doorNo, String streetName, int pinCode) {
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.pinCode = pinCode;
	}
}

public class HasADemo {

	public static void main(String[] args) {
		Address addr = new Address(123, "BTM", 630064);
		Employee2 e = new Employee2(1, "Sachin", "HR", addr);
		e.displayEmpDetails();
		System.out.println("===============================================================");
		Employee2 e1 = new Employee2(12, "Rahul", "CSE", new Address(1234, "RDC", 876654));
		e1.displayEmpDetails();
	}

}
