package day3;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		int childCounter = 0, adultCounter = 0, seniorCount = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total number of Passengers");
		int size = scan.nextInt();
		int passengerAge[] = new int[size];
		
		for(int i=0;i<passengerAge.length;i++) {
			System.out.println("Enter the age for passenger "+(i+1));
			passengerAge[i] = scan.nextInt();
		}
		
		for(int i=0;i<passengerAge.length;i++) {
			if(passengerAge[i] < 18) {
				//System.out.println(passengerAge[i] +" is a Child");
				childCounter++;
			} else if(passengerAge[i] >= 18 && passengerAge[i] < 55) {
				++adultCounter;	
			} else {
				++seniorCount;
			}
		}
		
		System.out.println("Child count "+childCounter);
		System.out.println("Adult count "+adultCounter);
		System.out.println("Senior citizen count "+seniorCount);
		

	}

}
