package javaproj;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int balance = 1000;
		int operation = 1;
		while(operation == 1) {
		System.out.println("Press \n 1. Withdraw \n 2. Deposit \n3. Check Balance");
		int choice = scanner.nextInt();
		if(choice == 1) {
			System.out.println("Enter the amount you want to withdraw");
			int amount = scanner.nextInt();
			System.out.println("Your doing withdraw");
			balance = balance - amount;
		} else if(choice == 2) {
			System.out.println("You are depositing the amount");
			System.out.println("Enter the amount you want to deposit");
			int amount = scanner.nextInt();
			balance = amount + balance;
		} else if(choice == 3) {
			System.out.println("Your balance is "+ balance);
		}
		System.out.println("To continue press 1");
		operation = scanner.nextInt();
		}
		System.out.println("Thank you....");
	
	}
}
