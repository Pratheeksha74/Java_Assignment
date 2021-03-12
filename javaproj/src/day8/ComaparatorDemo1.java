package day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}

class IdComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.id == o2.id) {
			return 0;
		} else if(o1.id > o2.id) {
			return 1;
		}
		return -1;
	}
	
}

class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class MarkComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.marks == o2.marks) {
			return 0;
		} else if(o1.marks > o2.marks) {
			return 1;
		}
		return -1;
	}
	
}

public class ComaparatorDemo1 {

	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student(1,"Sachin",23));
		slist.add(new Student(2,"Varun",53));
		slist.add(new Student(3,"Ahana",63));
		slist.add(new Student(4,"Anu",78));
		slist.add(new Student(5,"Vihan",26));
		
		for(Student s : slist) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Compare by Id");
		Collections.sort(slist, new IdComparator());
		for(Student s : slist) {
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		
		System.out.println();
		System.out.println("Compare by Name");
		Collections.sort(slist, new NameComparator());
		for(Student s : slist) {
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		
		System.out.println();
		System.out.println("Sorting by marks");
		Collections.sort(slist, new MarkComparator());
		for(Student s : slist) {
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		
	}

}
