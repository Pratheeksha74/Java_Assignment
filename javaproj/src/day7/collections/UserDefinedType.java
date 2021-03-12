package day7.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Employee {
	int id;
	String name;
	String dept;
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
}

public class UserDefinedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1,"Sachin","HR"));
		al.add(new Employee(2,"Arjun","Accounts"));
		
		System.out.println("Employee "+al);
		Iterator<Employee> iter = al.iterator();
		while(iter.hasNext()) {
			Employee e = iter.next();
			System.out.println(e.id+" "+e.name+" "+e.dept);
		}
	}

}
