package day14.designPattern;

class Employee {
	private static final Employee emp = new Employee();
	
	private Employee() {
		System.out.println("this is employee constructor");
	}
	
	public static Employee getEmpInstance() {
		return emp;
	}
}


public class SingletonPattern {

	public static void main(String[] args) {
		Employee e1 = Employee.getEmpInstance();
		System.out.println(e1.hashCode());
		
		Employee e2 = Employee.getEmpInstance();
		System.out.println(e2.hashCode());

	}

}
