package day4.exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("50km covered");
		try {
			System.out.println(8/0);
		} catch(Exception e) {
			System.out.println("Do not divide by 0");
		}
		System.out.println("Reached Chennai");

	}

}
