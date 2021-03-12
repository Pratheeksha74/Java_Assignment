package day7.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(23);
		al.add(45);
		al.add(21);
		al.add(25);
		
		ListIterator<Integer> list = al.listIterator();
		while(list.hasPrevious()) {
			System.out.println(list.previous());
		}

	}

}
