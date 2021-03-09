package day5.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ASUS\\git\\Java_Assignment\\javaproj\\src\\day5\\io\\three.txt"));
		bw.write("hello");
		bw.newLine();
		bw.write("Java");
		bw.newLine();
		bw.flush();
		bw.close();
	}

}
