package day7.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "six");
		System.out.println("values are");
		for(String val : map.values()) {
			System.out.println(val);
		}
		
		for(Integer i : map.keySet()) {
			System.out.println(i);
			System.out.println(map.get(i));
			System.out.println("----");
		}
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
