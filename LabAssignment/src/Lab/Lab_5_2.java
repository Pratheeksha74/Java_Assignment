package Lab;

import java.util.Scanner;

class NameException extends RuntimeException {
	public NameException(String msg) {
		super(msg);
	}
}

public class Lab_5_2 {
	
	public void checkName(String firstname, String lastname) {
		if(firstname.equals("") || lastname.equals("")) {
			throw new NameException("First name and Last name field cannot be null");
		} else {
			System.out.println("First name: "+firstname+ "\nLast name: "+lastname);
		}
	}
	
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your name");
//		String s = scan.nextLine();
//		str = s.split("\\s+");
		String firstName = "Pratheeksha";
		String LastName = "";
		Lab_5_2 check = new Lab_5_2();
		check.checkName(firstName,LastName);
		
	}

}
