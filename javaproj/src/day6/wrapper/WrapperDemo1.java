package day6.wrapper;

public class WrapperDemo1 {

	public static void main(String[] args) {
		int a = 10;
		Integer b =a;  //autoboxing
		System.out.println(a);
		System.out.println(b);
		
		//Before JDK 1.5
		Integer c = Integer.valueOf(a);
		System.out.println(c);
		

	}

}
