package day5.io;

import java.io.File;

public class CreateDemo {

	public static void main(String[] args) {
		File f = new File("movies");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());

	}

}
