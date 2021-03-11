package day6.wrapper;

public class UnboxingDemo {

	public static void main(String[] args) {
		Integer a = 10;
		int b = a; //Unboxing automatically
		
		//if not automatically, before JDK 5
		int c = a.intValue(); //manually

	}

}
