package Lab;

/* The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1.
 *  Every subsequent value is the sum of the 2 values preceding it. Write a Java program that uses both 
 *  recursive and non-recursive functions to print the nth value of the Fibonacci sequence?
 */

import java.util.Scanner;

public class Excercise_3 {
	public void iterativeMethod(int n) {
		int n1 = 0, n2 = 1,n3;
		for(int i=0;i<n;i++) {
			System.out.print(n1+" ");
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
		}
	}
	
	public int recursiveMethod(int n) {
		if(n <= 1) {
			return n;
		}
		return recursiveMethod(n-1) + recursiveMethod(n-2);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = scan.nextInt();
		Excercise_3 e3 = new Excercise_3();
		System.out.println("Fibonacci numbers using iterative method");
		e3.iterativeMethod(n);
		System.out.println();
		System.out.println("Fibonacci numbers using recursive method");
		for(int i=0;i<n;i++) {
			System.out.print(e3.recursiveMethod(i)+" ");
		}
	}

}
