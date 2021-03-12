package Lab;
//Create a method to find the sum of the cubes of the digits of an n digit number

import java.util.Scanner;

public class Lab_1 {
	static int sumCube(int n) {
		int sum = 0;
		while(n != 0) {
			sum += findCube(n%10);
			n = n/10;
		}
		return sum;
	}
	static int findCube(int n) {
		return n * n * n;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		System.out.println(sumCube(n));

	}

}
