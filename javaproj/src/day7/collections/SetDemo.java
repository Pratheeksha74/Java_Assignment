package day7.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add(1);
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add("Hello");
		s.add("Hello".hashCode());
		System.out.println(s);
		
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(100);
		ls.add(25);
		ls.add("Hello");
		System.out.println(ls);
		
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(10);
		ts.add(5);
		ts.add(2);
		ts.add(15);
		//ts.add("sachin");
		System.out.println(ts);
		
	}

}
