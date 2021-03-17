package day10;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		int i = list.stream().reduce((a,b)->a+b).get();
		System.out.println(i);
		
		System.out.println("=======================");
		List<String> lstr = Arrays.asList("hello","welcome","java");
		lstr.forEach(s->System.out.println(s));
		//Optional<String> = lstr.stream().reduce((a,b)->a.concate(b));

	}

}
