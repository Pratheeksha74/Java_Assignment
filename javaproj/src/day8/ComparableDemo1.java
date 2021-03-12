package day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	String dept;
	int salary;
	
	public Employee(int id, String name, String dept,int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	//to sort the emplist by id
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(id  == o.id) {
			return 0;
		} else 	if(id > o.id) {
			return 1;
		}
		return -1;
	}
	
	
}

public class ComparableDemo1 {

	
	//to find by deptname
	static ArrayList<Employee> findByDept(String dept, ArrayList<Employee> emp) { 
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		Iterator<Employee> itr = emp.iterator();
		while(itr.hasNext()) {
			Employee e = itr.next();
			if(e.dept.equals("developer")) {
				emplist.add(e);
			}
		}
		return emplist;
		
	}
	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1,"Ravi","hr",65000));
		emplist.add(new Employee(2,"Sachin","developer",43000));
		emplist.add(new Employee(3,"Varun","ui",56000));
		emplist.add(new Employee(4,"Ahana","developer",78000));
		
		//find by deptname
		ArrayList<Employee> e = findByDept("developer", emplist);
		System.out.println(e);
		
		
		//to sort by empid
		Collections.sort(emplist);
		for(Employee ep : emplist) {
			System.out.println(ep.id+" "+ep.name+" "+ep.dept+" "+ep.salary);
		}
		
	}

}
