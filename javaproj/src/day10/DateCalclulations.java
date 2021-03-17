package day10;

import java.time.LocalDate;

public class DateCalclulations {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Tommorow is "+today.plusDays(1));
		System.out.println("Day after tommorow is "+today.plusDays(2));
		System.out.println("Next week "+today.plusWeeks(1));
		System.out.println("Next year "+today.plusYears(1));
		System.out.println("Yesterday "+today.minusDays(1));
		System.out.println("Last week "+today.minusWeeks(1));

	}

}
