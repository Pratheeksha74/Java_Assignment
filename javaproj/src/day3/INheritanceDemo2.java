package day3;

class A {
	void display1() {
		System.out.println("A class");
	}
}
class B extends A{
	void display2() {
		System.out.println("This is class B");
	}
}
public class INheritanceDemo2 {

	public static void main(String[] args) {
		B b = new B();
		b.display1();
		b.display2();

	}

}
