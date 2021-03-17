package day10;

import java.time.LocalDate;
import java.time.LocalDateTime;
public class DateDemo1 {

	public static void main(String[] args) {
		System.out.println("Today date is: "+LocalDate.now());
		System.out.println("Joinin date is: "+LocalDate.of(2019, 4, 7));
		
		System.out.println("Date with time: "+LocalDateTime.now());
		System.out.println("Date with time: "+LocalDateTime.of(2019, 5, 6, 6, 45));
		
		System.out.println("======================");
		LocalDate ld = LocalDate.now();
		System.out.println("Todays date is "+ ld);
		System.out.println("Day of the month "+ld.getDayOfMonth());
		System.out.println("Day of the month "+ld.getDayOfYear());
		System.out.println("Day of the month "+ld.getDayOfWeek());
		
		System.out.println(ld.getMonthValue());
		System.out.println(ld.getMonth());
	}

	

}
