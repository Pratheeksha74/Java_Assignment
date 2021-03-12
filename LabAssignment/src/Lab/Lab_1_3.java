package Lab;

import java.util.Scanner;

public class Lab_1_3 {
	static boolean checkNumber(int n) {
		boolean b = false;
		int p = 0, c = 0;
		p = n % 10;
		n = n/10;
		while(n != 0) {
			c = n % 10;
			if(c > p) {
				b = false;
				break;
			}
			n = n/10;
			p = c;
			b = true;
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		System.out.println(checkNumber(n));

	}

}
