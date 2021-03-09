package day5.io;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		System.out.println(f.exists());
		if(f.exists()) 
			System.out.println("File is present");
		else {
			System.out.println("File is not present");
			System.out.println("Creating new file");
			f.createNewFile();
		}
	}

}
