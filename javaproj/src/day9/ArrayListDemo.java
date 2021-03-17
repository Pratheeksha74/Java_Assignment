package day9;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			al.add(i);
		}
		System.out.println(al);
		al.forEach(s->System.out.println(s));
		
		System.out.println("After filter");
		al.stream().filter(s->s>5).forEach(s->System.out.println(s));
		al.stream().map(m->m+100).forEach(s->System.out.println(s));
	}

}
