package day5.Strings;

public class ReverseDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println("Original String is: "+s1);
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}

	}

}
