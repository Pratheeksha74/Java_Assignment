package day6.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo2 {

	public static void main(String[] args) {
		String str = "helloa123@JAVA";
		
		System.out.println("=============m1 [abc]===========");	
		Matcher m1 = Pattern.compile("[abc]").matcher(str);
		while(m1.find()) {
			System.out.println(m1.start()+" "+m1.end()+" "+m1.group());
		}
		
		System.out.println("=============m2 [^abc]===========");
		Matcher m2 = Pattern.compile("[^abc]").matcher(str);
		while(m2.find()) {
			System.out.println(m2.start()+" "+m2.end()+" "+m2.group());
		}
		
		System.out.println("=============m3 [a-z]===========");
		Matcher m3 = Pattern.compile("[a-z]").matcher(str);
		while(m3.find()) {
			System.out.println(m3.start()+" "+m3.end()+" "+m3.group());
		}
		
		System.out.println("=============m4 [\\d]===========");
		Matcher m4 = Pattern.compile("\\d").matcher(str);
		while(m4.find()) {
			System.out.println(m4.start()+" "+m4.end()+" "+m4.group());
		}
		
		System.out.println("=============m5 [\\w]===========");
		Matcher m5 = Pattern.compile("\\w").matcher(str);
		while(m5.find()) {
			System.out.println(m5.start()+" "+m5.end()+" "+m5.group());
		}
		
		System.out.println("=============m6 . ===========");
		Matcher m6 = Pattern.compile(".").matcher(str);
		while(m6.find()) {
			System.out.println(m6.start()+" "+m6.end()+" "+m6.group());
		}
	}

}
