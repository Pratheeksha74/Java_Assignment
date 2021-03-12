package day8;

class A extends Thread {
	public void run() {
		System.out.println("This is my extended task");
	}
}

class B implements Runnable {

	@Override
	public void run() {
		System.out.println("This is my implemented task");
		
	}
	
}

public class CreateThreadDemo1 {

	public static void main(String[] args) {
		A obj = new A();
		obj.start();
		B obj1 = new B();
		Thread t1 = new Thread(obj1);
		t1.start();
	}

}
