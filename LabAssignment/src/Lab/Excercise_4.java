package Lab;

import java.util.Scanner;

/*: Write a Java program that prompts the user for an integer and then prints out all the prime numbers up 
 * to that Integer?*/


public class Excercise_4 {
	static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}

	}

}
