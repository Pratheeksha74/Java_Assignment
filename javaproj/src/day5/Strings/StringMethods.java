package day5.Strings;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println(s1.length());
		System.out.println("charAt 1 "+s1.charAt(1));
		System.out.println("charAt 4 "+ s1.charAt(4));
		System.out.println("Index of e: "+ s1.indexOf('e'));
		System.out.println("equals "+s1.equals("hello"));
		System.out.println("equals ignore case "+ s1.equalsIgnoreCase("hello"));
		System.out.println("replace "+s1.replace('l','p'));
		System.out.println("sub string "+s1.substring(1,4));
	}

}
