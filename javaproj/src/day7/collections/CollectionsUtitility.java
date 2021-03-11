package day7.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtitility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> proj1 = new ArrayList<String>(4);
		proj1.add("sachin");
		proj1.add("rahul");
		proj1.add("amit");
		proj1.add("kumar");
		
		Collections.sort(proj1);
		System.out.println(proj1);
		//Collections.reverse(proj1);
		//System.out.println(proj1);
		
		int index = Collections.binarySearch(proj1, "an");
		System.out.println(index);
	}

}
