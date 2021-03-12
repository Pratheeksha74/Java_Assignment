package Lab;

import java.util.Scanner;

public class Lab_1_2 {
	static int calculateDifference(int n) {
		int diff = 0, tot = 0;
		for(int i=1;i<=n;i++) {
			tot += i*i;
			
		}
		//System.out.println(tot);
		diff = tot - Sum(n);
		return diff;
	}

	static int Sum(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		sum *= sum;
		//System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = scan.nextInt();
		System.out.println(calculateDifference(n));

	}

}
