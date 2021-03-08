package day4.exception;

import java.io.File;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		int a = 10;
		File f = new File("ab.txt");
		try {
			f.createNewFile();
		} catch(IOException e) {
			System.out.println("Exception");
		}

	}

}
