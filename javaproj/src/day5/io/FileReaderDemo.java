package day5.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("C:\\Users\\ASUS\\git\\Java_Assignment\\javaproj\\src\\day5\\io\\myfile.txt");
		int r = fr.read();
		while(r != -1) {
			System.out.println((char)r);
			r = fr.read();
		}
		fr.close();//keep this in finally block
	}

}
