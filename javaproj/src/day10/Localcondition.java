package day10;

import java.time.LocalDate;

public class Localcondition {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate bookingdate = LocalDate.of(2021, 3, 2);
		
		boolean b = bookingdate.isAfter(today);
		if(b) 
			System.out.println("Correct booking date");
		else 
			System.out.println("Incorrect booking date");

	}

}
