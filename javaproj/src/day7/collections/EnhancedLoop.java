package day7.collections;

import java.util.ArrayList;

public class EnhancedLoop {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(23);
		al.add(45);
		al.add(21);
		al.add(25);
		for(Integer i:al) {
			System.out.println(i);
		}

	}

}
