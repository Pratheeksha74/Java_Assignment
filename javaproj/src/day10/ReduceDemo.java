package day10;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		System.out.println(list);
		System.out.println("==================================================");
		
		System.out.println("reduce method to add the elements in the list: ");
		int r1 = list.stream().reduce((a,b)->a+b).get();
		System.out.println(r1);
		System.out.println("==================================================");
		
		List<String> lstr = Arrays.asList("hello","welcome","java");
		lstr.forEach(s->System.out.println(s));
		
		System.out.println("==================================================");
		System.out.println("Concatinating the string objects:");
		String names = lstr.stream().reduce((a,b)->a+b).get();
		System.out.println(names);
		//Optional<String> = lstr.stream().reduce((a,b)->a.concate(b));


	}

}
