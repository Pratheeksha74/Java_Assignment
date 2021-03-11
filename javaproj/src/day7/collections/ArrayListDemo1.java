package day7.collections;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(23);
		al.add(78);
		al.add(56);
		System.out.println("al "+al);
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(45);
		a.add(25);
		a.add(76);
		a.add(53);
		a.add(1);
		a.add(23);
		System.out.println("a "+a);
		
		//a.addAll(al);
		//a.removeAll(al);
		a.retainAll(al);
		
		System.out.println(a);
		
		

	}

}
