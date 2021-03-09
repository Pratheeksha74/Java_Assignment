package day5.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");
		fw.write("Welcome");
		fw.write(67);
		fw.flush();
		fw.close();
	}
}
