package day7.collections;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(1);
		s.add("Sachin");
		s.add(2);
		s.add(3);
		s.push(4);
		
		Enumeration e = s.elements();
		while(e.hasMoreElements()) {
			System.out.println("Iteration "+e.nextElement());
		}
		
		System.out.println("Elements are "+s);
		System.out.println("Top element "+s.peek());
		System.out.println("Removed element "+s.pop());
		
		System.out.println("=================================");
		
		System.out.println("Elements are "+s);
		System.out.println("Top element "+s.peek());
		System.out.println("Removed element "+s.pop());
		
		System.out.println("=================================");
		
		System.out.println("Elements are "+s);
		System.out.println("Top element "+s.peek());
		System.out.println("Removed element "+s.pop());
		
		System.out.println("Elements are "+s);
		System.out.println("Top element "+s.peek());
		System.out.println("Removed element "+s.pop());
		
		System.out.println("=================================");
		
		System.out.println("Elements are "+s);
		System.out.println("Top element "+s.peek());
		System.out.println("Removed element "+s.pop());
		
		System.out.println("=================================");
		
		System.out.println("Elements are "+s);
		
		
	}

}
