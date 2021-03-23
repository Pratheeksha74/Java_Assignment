package Lab;

import java.util.Scanner;
//Take a string and add space between each characters of the string using lambda expression.

interface MyLambda {
	void insertSpace(String str);
}

public class Lab_9_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();;
		MyLambda newString = s->System.out.println(s.replace("", " ").trim());
		newString.insertSpace(str);
		scan.close();
	}

}
