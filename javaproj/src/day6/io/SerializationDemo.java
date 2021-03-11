package day6.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int id;
	String name;
	transient int age;
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}	
}

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		Employee e1 = new Employee(1, "Sachin",10);
		FileOutputStream fos = new FileOutputStream("four.txt");
		ObjectOutputStream ois = new ObjectOutputStream(fos);
		ois.writeObject(e1);
		ois.flush();
		ois.close();
		System.out.println("Serialization completed");

	}

}
