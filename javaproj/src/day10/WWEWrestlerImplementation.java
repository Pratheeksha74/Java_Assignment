package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class WWE {
	private String firstname;
	private String Lastname;
	private int weight;
	
	public WWE(String firstname, String lastname, int weight) {
		super();
		this.firstname = firstname;
		Lastname = lastname;
		this.weight = weight;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "WWE [firstname=" + firstname + ", Lastname=" + Lastname + ", weight=" + weight + "]";
	}
	
	
}

public class WWEWrestlerImplementation {
	
	static List<String> printFirstName(ArrayList<WWE> list) {
		System.out.println("Printing the firstname");
		return list.stream().map(s->s.getFirstname()).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		ArrayList<WWE> wwe = new ArrayList<WWE>();
		wwe.add(new WWE("Jungkook","Jeon",67));
		wwe.add(new WWE("Taehyung","Kim",159));
		wwe.add(new WWE("Jimin","Park",250));
		wwe.add(new WWE("Namjoon","Kim",262));
		wwe.add(new WWE("Lisa","Park",362));
		
		System.out.println("Count of wrestlers");
		System.out.println(wwe.stream().count());		
		
		
		System.out.println("Sum of weights above 200");
		int totalWeight = wwe.stream().filter(e->e.getWeight() > 200).mapToInt(s->s.getWeight()).sum();
		System.out.println(totalWeight);
		
		List<String> str = printFirstName(wwe);
		str.forEach(s->System.out.println(s));
		
		
	}

}
