package day6.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexDemo {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a");
		Pattern p1 = Pattern.compile("[abc]");
		
		Matcher m1 = p1.matcher("Sachin");
		while(m1.find()) {
			System.out.println(m1.start()+" "+m1.end()+" "+m1.group());
		}
	}

}
