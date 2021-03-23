package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1,"Sachin","HR",45000,32));
		emp.add(new Employee(2,"Ahana","Marketing",45000,23));
		emp.add(new Employee(3,"Aman","Developer",67000,13));
		emp.add(new Employee(4,"Rahul","Developer",34000,33));
		emp.add(new Employee(5,"Anu","Marketing",94000,27));
		
		//emp.forEach(s->System.out.println(s));
		emp.forEach(s->System.out.println(s.getAge()));
		
		emp.forEach(System.out::print);
		
		
		System.out.println("==================================================");
		System.out.println("Print employee count");
		long empCount = emp.stream().count();
		System.out.println("Number of employees are "+empCount);
		
		System.out.println("==================================================");
		System.out.println("Print only developers");
		emp.stream().filter(e->e.getDept().equalsIgnoreCase("Developer")).forEach(s->System.out.println(s));
		
		System.out.println("==================================================");
		System.out.println("Count of developers");
		Long cnt = emp.stream().filter(e->e.getDept().equalsIgnoreCase("Developer")).count();
		System.out.println("Count of developers: "+cnt);
		
		System.out.println("==================================================");
		System.out.println("Length of employee name");
		emp.stream().map(e->e.getName()+" "+e.getName().length()+" "+e.getDept()).forEach(s->System.out.println(s));
		
		System.out.println("==================================================");
		emp.stream().map(e->e.getName()+" "+e.getSalary()+" "+e.getSalary()*1.2).forEach(s->System.out.println(s));
		
		System.out.println("==================================================");
		System.out.println("Total salary");
		int total = emp.stream().mapToInt(s->s.getSalary()).sum();
		System.out.println(total);
		
		System.out.println("==================================================");
		System.out.println("Total developer salary");
		int devTotal = emp.stream().filter(e->e.getDept().equalsIgnoreCase("Developer")).mapToInt(s->s.getSalary()).sum();
		System.out.println(devTotal);
		
		System.out.println("==================================================");
		System.out.println("Developer names");
		emp.stream().filter(e->e.getDept().equalsIgnoreCase("Developer")).forEach(s->System.out.println(s.getName()));
		
		System.out.println("==================================================");
		List<Employee> emplist = emp.stream().filter(e->e.getName().startsWith("R")).collect(Collectors.toList());
		System.out.println(emplist);
		emplist.forEach(s->System.out.println(s));
		
		System.out.println("==================================================");
		System.out.println("Print all employees execpt developers");
		List<Employee> emp1 = emp.stream().filter(e->e.getDept() != "Developer").collect(Collectors.toList());
		emp1.forEach(s->System.out.println(s));
		
		
		System.out.println("==================================================");
		System.out.println("Print all employees except developers without using list");
		emp.stream().filter(e->e.getDept() != "Developer").forEach(s->System.out.println(s));
		
		
		System.out.println("==================================================");
		System.out.println();
		System.out.println("Print no of employees in particular department");
		
		
		System.out.println("==================================================");
		System.out.println("Print the number of employee of age above 30");
		System.out.println(emp.stream().filter(s->s.getAge() > 30).count());
		
		
		System.out.println("==================================================");
		System.out.println("Print the name and length of the name");
		emp.stream().map(e->e.getName()+" "+e.getName().length()).forEach(s->System.out.println(s));
		
		
		System.out.println("==================================================");
		System.out.println("Total Salary");
		System.out.println(emp.stream().mapToInt(e->e.getSalary()).sum());
		
		System.out.println("==================================================");
		System.out.println("Total salary of developers");
		System.out.println(emp.stream().filter(e->e.getDept().equalsIgnoreCase("Developer")).mapToInt(e->e.getSalary()).sum());
		
		System.out.println("==================================================");
		System.out.println("Skip first 3");
		emp.stream().skip(3).forEach(s->System.out.println(s));
		System.out.println("Limit - print 1st 3");
		emp.stream().limit(3).forEach(s->System.out.println(s));
		
		System.out.println("==================================================");
		System.out.println("Reduce");
		
		List<Employee> l = emp.stream().filter(e->e.getDept() != "Developer").collect(Collectors.toList());
		l.forEach(s->System.out.println(s));
	}

}
