package day10;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(4);
		num.add(5);
		num.add(1);
		num.add(8);
		num.add(28);
		num.forEach(s->System.out.println(s));
		
		System.out.println("After Sorting");
		
		num.stream().sorted().forEach(s->System.out.println(s));
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sachin");
		names.add("Anu");
		names.add("Zayn");
		names.add("Jungkook");
		
		names.stream().sorted().forEach(s->System.out.println(s));
	}

}
