package day7.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(10);
		Scanner scan = new Scanner(System.in);
		for(int i =0;i<10;i++) {
			al.add(scan.nextInt());
		}
		Iterator<Integer> iter = al.iterator();
		while(iter.hasNext()) {
			int num = iter.next();
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}
	}

}
