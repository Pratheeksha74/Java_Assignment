package day5.Strings;

public class MutableDemo {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("hello");
		System.out.println("s = "+s);
		s.append(" welcome to java");
		System.out.println("s = "+s);
	}

}
