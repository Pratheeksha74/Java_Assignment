package day7.collections;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.addFirst(10);
		l.addLast(0);
		l.add(4);
		System.out.println(l);

	}

}
