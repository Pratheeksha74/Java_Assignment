package day5.Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		String text = "hello welcome " 
					+ "java"
				+ "python"
					+"sql" ;
		StringBuffer sb = new StringBuffer(text);
		System.out.println("Length "+sb.length());
		System.out.println("capacity :"+sb.capacity());
		
		sb.append("hello welcome");
		
		System.out.println("Length "+ sb.length());
		System.out.println("Capcity "+sb.capacity());
		
		sb.append("welcome to java");
		System.out.println("Length "+ sb.length());
		System.out.println("Capcity "+sb.capacity());
		System.out.println();
		

	}

}
