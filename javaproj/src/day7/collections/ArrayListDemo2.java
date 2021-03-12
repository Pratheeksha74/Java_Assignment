package day7.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(45);
		al.add(23);
		al.add(24);
		al.add(56);
		al.add(1);
		System.out.println(al);
		System.out.println("min "+Collections.min(al));
		System.out.println("max "+Collections.max(al));
		

	}

}
