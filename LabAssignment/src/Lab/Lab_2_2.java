package Lab;

import java.util.Arrays;
import java.util.Scanner;

/* Create a method that can accept an array of String objects and sort in alphabetical order. 
 * The elements in the left half should be completely in uppercase and the elements in the right
 *  half should be completely in lower case. Return the resulting array.
 */

public class Lab_3_2 {
	static String[] sortStrings(String[] s) {
		//Arrays.sort(s);
		for(int i=0;i<s.length-1;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].compareTo(s[j]) > 0) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the string");
		int n = scan.nextInt();
		String s[] = new String[n];
		System.out.println("Enter the strings");
		for(int i=0;i<s.length;i++) {
			s[i] = scan.nextLine();
		}
		for(int i=0;i<s.length;i++) {
			s[i] = s[i].toLowerCase();
		}
		sortStrings(s);
		int i=0;
		while(i != n) {
			if(i <= Math.ceil(n/2)) {
				System.out.println(s[i].toUpperCase());
				i++;
			} else {
				System.out.println(s[i]);
				i++;
			}
		}
	}

}
