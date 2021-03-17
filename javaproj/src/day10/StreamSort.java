package day10;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamSort {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1,"Sachin","HR",45000,32));
		emp.add(new Employee(2,"Ahana","Marketing",45000,23));
		emp.add(new Employee(3,"Aman","Developer",67000,13));
		emp.add(new Employee(4,"Rahul","Developer",34000,33));
		emp.add(new Employee(5,"Anu","Marketing",94000,27));
		
		emp.forEach(s->System.out.println(s));
		
		//emp.stream().sorted().forEach(s->System.out.println(s)); ClassCastException
		
		System.out.println("After sorting");
		emp.stream().sorted().forEach(s->System.out.println(s));
		
		System.out.println("Sort by names");
		Comparator<Employee> nameComp = (e1,e2)->e1.getName().compareTo(e2.getName());
		emp.stream().sorted(nameComp).forEach(s->System.out.println(s));
		
		
		System.out.println("Sorting by id");
		Comparator<Employee> idComp = (e1,e2)->
		{
			if(e1.getId()==e2.getId())
				return 0;
			else if(e1.getId() > e2.getId())
				return 1;
			return -1;
		};
		emp.stream().sorted(idComp).forEach(s->System.out.println(s));
	}

}

class IDComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getId() == o2.getId()) {
			return 0;
		} else if(o1.getId() > o2.getId()) {
			return 1;
		}
		return -1;
	}
	
}
