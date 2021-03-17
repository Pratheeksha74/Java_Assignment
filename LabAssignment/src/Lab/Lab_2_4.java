package Lab;

import java.util.Arrays;
import java.util.Scanner;

/*Create a method which accepts an integer array and removes all the duplicates in the array. 
 * Return the resulting array in descending order
 */

public class Lab_2_4 {
	static int modifyArray(int[] a) {
		int j = 0,n = a.length;
		
		for(int i=0;i<n-1;i++) {
			if(a[i] != a[i+1]) {
				a[j++] = a[i];
			}
		}
		a[j++] = a[n-1];
		return j;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the element of the array");
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		int j = modifyArray(a);
		for(int i=j-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}
