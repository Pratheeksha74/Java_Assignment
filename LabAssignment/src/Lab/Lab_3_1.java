package Lab;

import java.util.Scanner;
import java.util.StringTokenizer;

/*  Write a Java program that reads a line of integers and then displays each integer and the sum of all 
 * integers. (Use String Tokenizer class)?
 */

public class Lab_3_1 {

	public static void main(String[] args) {
		int sum = 0,n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers in one line");
		String str = scan.nextLine();
		StringTokenizer stz = new StringTokenizer(str," ");
		while(stz.hasMoreTokens()) {
			String s = stz.nextToken();
			n = Integer.parseInt(s);
			System.out.println(n);
			sum += n;
		}
		System.out.println("Sum is: "+sum);
		scan.close();
	}

}
