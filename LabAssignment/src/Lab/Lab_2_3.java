package Lab;

import java.util.Arrays;
import java.util.Scanner;

/*: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting 
 * array in sorted order
 */

public class Lab_2_3 {
	static void reverseFunction(int[] a) {
		int num, rev = 0;
		for(int i=0;i<a.length;i++) {
			num = a[i];
			while(num > 0) {
				rev = rev*10 + num%10;
				num = num/10;
			}
			a[i] = rev;
			rev = 0;
		}
		sort(a);
	}
	static void sort(int[] a) {
		Arrays.sort(a);
		display(a);
	}
	
	static void display(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = scan.nextInt();
		int a[] = new int[n];
		String s[] = new String[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		reverseFunction(a);

	}

}
