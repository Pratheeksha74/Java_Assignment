package day7.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(23);
		al.add(45);
		al.add(21);
		al.add(25);
		Iterator<Integer> iter = al.iterator();
		System.out.println(al);
		while(iter.hasNext()) {
			//System.out.println(iter.next());
			int num = iter.next();
			if(num < 3) {
				iter.remove();
				//al.add(5);
				System.out.println(num);
			}
			
		}
		System.out.println(al);
	}

}
