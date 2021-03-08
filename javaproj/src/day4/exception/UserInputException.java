package day4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		
		try {
			System.out.println("Enter a value");
			int a = scan.nextInt();
			System.out.println("Enter b value");
			int b = scan.nextInt();
			result = a/b;
		} 
		catch(ArithmeticException e) {
			System.out.println("b value cannot be zero");
		} 
		catch(InputMismatchException e) {
			System.out.println("Enter only number");
		}
		catch(Exception e) {
			System.out.println("Any other exception");
		}
		finally {
			System.out.println("Exit statement");
		}
		System.out.println("Result: "+result);

	}

}
