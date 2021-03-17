package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
	private int id;
	private String name;
	private double salary;
	private String mgrname;
	private int deptno;
	public Employee1(int id, String name, double salary, String mgrname, int deptno) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.mgrname = mgrname;
		this.deptno = deptno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getMgrname() {
		return mgrname;
	}
	public void setMgrname(String mgrname) {
		this.mgrname = mgrname;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", mgrname=" + mgrname + ", deptno="
				+ deptno + "]";
	}
	
	
}

public class AssignmentStream {

	public static void main(String[] args) {
		ArrayList<Employee1> al = new ArrayList<Employee1>();
		al.add(new Employee1(1,"Jungkook",20000,"nithin",11));
		al.add(new Employee1(2,"Jimin",80000,"mingyue",20));
		al.add(new Employee1(3,"Taehyung",10000,"nithin",11));
		al.add(new Employee1(4,"Namjoon",90000,"Lisa",33));
		al.add(new Employee1(4,"Anu",90000,"Suga",10));
		
		System.out.println("Get the maximum salary");
		System.out.println(al.stream().mapToDouble(e->e.getSalary()).max());
		System.out.println("============================================");
		
		System.out.println("Employee reporting to nithin are: ");
		System.out.println(al.stream().filter(e->e.getMgrname().equalsIgnoreCase("nithin")).count());
		System.out.println("============================================");
		
		System.out.println("Employee with salary less than 50000");
		List<Employee1> emp1 =  al.stream().filter(e->e.getSalary()<50000).collect(Collectors.toList());
		emp1.forEach(s->System.out.println(s));
		System.out.println("============================================");
		
		System.out.println("Employees from deptno 10 are:");
		List<Employee1> emp2 = al.stream().filter(e->e.getDeptno() == 10).collect(Collectors.toList());
		emp2.forEach(s->System.out.println(s));
		System.out.println("============================================");
		
		System.out.print("Employee count in dept 20: ");
		System.out.println(al.stream().filter(e->e.getDeptno() == 20).count());
		System.out.println("============================================");
		
		System.out.println("Employee whose name starts with A are:");
		List<Employee1> emp3 = al.stream().filter(e->e.getName().startsWith("A")).collect(Collectors.toList());
		emp3.forEach(s->System.out.println(s));
		System.out.println("============================================");
	}

}
