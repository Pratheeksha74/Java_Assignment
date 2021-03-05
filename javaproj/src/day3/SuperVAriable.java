package day3;

class Parent{
	int a = 10;
}

class Child extends Parent {
	int a = 20;
	void Add() {
		int result = a+a;
		int res = a + super.a;
		int res3 = super.a + super.a;
		System.out.println("Result "+result);
		System.out.println("Result 2: "+res);
		System.out.println("Result 3: "+res3);
	}
}

public class SuperVAriable {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.Add();

	}

}
