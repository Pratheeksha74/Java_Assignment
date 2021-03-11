package day6.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("Before adding "+al.size());
		al.add(1);
		al.add("Sachin");
		al.add('c');
		al.add(10.5);
		al.add(null);
		System.out.println("After adding "+al.size());
		System.out.println("Elements are "+al);
		al.add(2,"hello");
		System.out.println("Elements are "+al);
		
		al.remove("ravi");
		System.out.println("Elements are "+al);
		
		al.set(4,"welcome");
		System.out.println("Elements are "+al);
		
		al.remove(1);
		System.out.println("Elements are "+al);
		
		al.remove(Integer.valueOf(1));
		System.out.println("Elements are "+al);
		
		System.out.println(al.contains("Sachin"));
		
		System.out.println(al.get(1));
		
		al.clear();
		System.out.println("Elements are "+al);
		
	}

}
