package Lab;

import java.util.Scanner;
//write a lambda expression which excepts x and y numbers and returns x to the raised to y.

interface LambdaExp {
	double calPow(int x,int y);
}

public class Lab_9_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		LambdaExp pow = (x,y)->Math.pow(x, y);
		System.out.println(pow.calPow(num1, num2));
		scan.close();
	}

}
