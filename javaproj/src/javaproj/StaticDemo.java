package javaproj;

public class StaticDemo {
	static {
		System.out.println("This is static block 1");
	}

	public static void main(String[] args) {
		System.out.println("This is main");

	}
	static {
		System.out.println("This is static block 2");
	}

}
