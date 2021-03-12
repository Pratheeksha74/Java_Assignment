package Lab;

import java.util.Scanner;

public class Lab_1_4 {
	static boolean checkNumber(int n) {
		if(n == 0) {
			return false;
		}
		while(n != 1) {
			if(n % 2 != 0)
				return false;
			n /= 2;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		System.out.println(checkNumber(n));
	}

}
