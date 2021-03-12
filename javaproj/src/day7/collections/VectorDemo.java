package day7.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> vect = new Vector<Integer>();
		vect.add(1);
		vect.add(2);
		vect.add(3);
		vect.add(4);
		vect.add(5);
		System.out.println(vect);
		System.out.println(vect.capacity());
	}

}
