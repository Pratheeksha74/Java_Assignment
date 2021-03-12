package Lab;

import java.util.Scanner;

public class Excercise_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Select \n 1 for red \n 2 for Yellow \n 3 for Green\n");
		int choice = scan.nextInt();
		switch(choice) {
		case 1: System.out.println("Stop");
				break;
		case 2: System.out.println("Ready");
				break;
		case 3: System.out.println("Go");
				break;
		}
	}
}
