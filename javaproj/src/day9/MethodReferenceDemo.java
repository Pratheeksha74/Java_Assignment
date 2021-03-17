package day9;

interface Test{
	void display();
}

class MyDemo {
	void method1() {
		System.out.println("This is non-static method1");
	}
}

class MyDemo2 {
	static void method2() {
		System.out.println("This is static method1");
	}
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
		Test t = ()->System.out.println("Hello");
		MyDemo d = new MyDemo();
		Test t2 = d::method1;
		
		Test t3 = MyDemo2::method2;
		
		t.display();
		t2.display();
		t3.display();
	}

}
