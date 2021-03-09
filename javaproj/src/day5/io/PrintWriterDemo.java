package day5.io;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("C:\\Users\\ASUS\\two.txt");
		pw.write(97);
		pw.write("a");
		pw.flush();
		pw.close();
	}
}
