package day5;

abstract class Calculate {
	int a = 10;
	void display() {
		System.out.println("This is display");
	}
	abstract int doOperation(int a,int b);
	abstract void Message();
}

class Addition extends Calculate {
	@Override 
	int doOperation(int a, int b) {
		return a+b;
	}
	
	void Message() {
		System.out.println("Hello");
	}
}

class Subtraction extends Calculate {
	@Override
	int doOperation(int a, int b) {
		return a-b;
	}
	
	void Message() {
		System.out.println("Hi");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		Addition a = new Addition();
		System.out.println(a.doOperation(5,6));

	}

}
