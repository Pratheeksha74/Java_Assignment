package day10;
import java.util.function.Predicate;
import java.util.function.Function;
interface pre {
	
}
public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> p1 = (age)->age>18;
		boolean b = p1.test(3);
		Function<String,Integer> f1 = (name)->name.length();
		int len = f1.apply("Sachin");
		System.out.println("Length is "+len);
		
		Function<String, String> f2 = (name)->name.concat(" mr");
		String msg = f2.apply("Sachin");
		System.out.println(msg);
		
		Predicate<String> s1 = (str)->str.startsWith("a");
		System.out.println("Using Predicate "+s1.test("ahana"));
		
		Function<String, Boolean> s2 = (str1)->str1.startsWith("a");
		System.out.println("Using Function "+s2.apply("ahana"));
	}

}
