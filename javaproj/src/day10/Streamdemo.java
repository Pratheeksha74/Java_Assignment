package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streamdemo {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(11,22,33,44,55,66);
		al.stream().limit(3).forEach(s->System.out.println(s));
		
		System.out.println("Skip");
		al.stream().skip(4).forEach(s->System.out.println(s));
		
		System.out.println("distinct");
		al.stream().distinct().forEach(s->System.out.println(s));
		
		boolean b = al.stream().allMatch(s->s>10);
		System.out.println("Are all values greater than 10? "+b);
		
		boolean any = al.stream().anyMatch(s->s>20);
		System.out.println("Is any value greater than 20? "+any);
	}
	
}
