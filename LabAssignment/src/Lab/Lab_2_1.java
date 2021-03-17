package Lab;

import java.util.Scanner;

//Create a method which accepts an array of integer elements 
//and return the second smallest element in the array

public class Lab_2_1 {
	static int getSecondSmallest(int[] array) {
		if(array.length < 2) {
			System.out.println("There is no second smallest element");
			return 0;
		}
		int smallest = array[0];
		int secondSmallest = array[1];
		for(int i=1;i<array.length;i++) {
			if(array[i] < smallest) {
				secondSmallest = smallest;
				smallest = array[i];
			} else if(array[i] < secondSmallest && array[i] != smallest) {
				secondSmallest = array[i];
			}
		}
		return secondSmallest;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = scan.nextInt();
		System.out.println("Enter the elements of the array");
		int array[] = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = scan.nextInt();
		}
		System.out.println(getSecondSmallest(array));
	}

}
