package day5.Strings;

public class StrinfImmutableDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println("s1 = "+s1);
		s1.concat("welcome to java");
		System.out.println("s1 = "+s1);
		s1 = s1.concat("Thank you");
		System.out.println("s1 = "+s1);
	}

}
