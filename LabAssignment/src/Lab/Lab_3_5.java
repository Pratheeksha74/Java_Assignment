package Lab;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Lab_3_5 {

	public static void main(String[] args) throws IOException {
		int line = 0, word = 0;
		char ch;
		String str = "C:\\\\Users\\\\ASUS\\\\git\\\\Java_Assignment\\\\javaproj\\\\src\\\\day5\\\\io\\\\myfile1.txt";
		FileInputStream f = new FileInputStream(str);
		int n = f.available();
		for(int i=0;i<n;i++) {
			ch = (char)f.read();
			if(ch == '\n')
				line++;
			else if(ch == ' ')
				word++;
		}
		System.out.println("\nNumber of lines : "+line);
		System.out.println("\nNumber of words : "+(line+word));
		System.out.println("\nNumber of character : "+n);
	}

}
