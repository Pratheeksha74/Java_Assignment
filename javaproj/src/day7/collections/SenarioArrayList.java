package day7.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SenarioArrayList {

	public static void main(String[] args) {
		ArrayList<String> proj1 = new ArrayList<String>(4);
		ArrayList<String> proj2 = new ArrayList<String>(5);
		
		proj1.add("sachin");
		proj1.add("rahul");
		proj1.add("amit");
		proj1.add("kumar");
		
		proj2.add("roshan");
		proj2.add("varsha");
		proj2.add("rahul");
		proj2.add("varun");
		proj2.add("ahana");
		
		proj2.removeAll(proj1);
		proj2.addAll(proj1);
		//Collections.sort(proj2);
		
		System.out.println(proj2);

	}

}
