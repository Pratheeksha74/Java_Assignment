package day3;

class Parent1 {
	int id;
	Parent1(int id) {
		System.out.println("This is parent constructor of integer type");
		System.out.println("id: "+id);
	}
	Parent1(String name) {
		System.out.println("This is parent constructor of type String");
		System.out.println("Name: "+name);
	}
}

class Child1 extends Parent1 {
	Child1(int id) {
		super(id);
		System.out.println("This is Child class Constructor");
	}
}

public class SuperConstructor {

	public static void main(String[] args) {
		Child1 c1 = new Child1(2);

	}

}
