package day5.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufReaderDemo1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\ASUS\\\\git\\\\Java_Assignment\\\\javaproj\\\\src\\\\day5\\\\io\\\\myfile.txt"));
		String r = br.readLine();
		while(r != null) {
			System.out.println(r);
			r = br.readLine();
		}
	}

}
