package day9;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			al.add(i);
		}
		System.out.println(al);
		al.forEach(s->System.out.print(s+" "));
		System.out.println();
		
		System.out.println("======================================");
		System.out.println("After filter");
		al.stream().filter(s->s>5).forEach(s->System.out.print(s+" "));
		al.stream().map(m->m+100).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("=======================================");
		
		System.out.println("Print even numbers");
		al.stream().filter(n->n%2==0).forEach(s->System.out.print(s+" "));
		System.out.println();
		System.out.println("=======================================");
		
		System.out.println("All Match");
		boolean b = al.stream().allMatch(n->n>5);
		System.out.println(b);
		System.out.println("=======================================");
		
		System.out.println("Any Match");
		boolean c = al.stream().anyMatch(n->n>5);
		System.out.println(c);
		System.out.println("=======================================");
	}

}
