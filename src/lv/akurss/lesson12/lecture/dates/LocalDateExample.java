package lv.akurss.lesson12.lecture.dates;

import java.time.LocalDate;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		
		date = date.plusMonths(1);
		date = date.minusDays(1);

		System.out.println(date);
		
		date = date.plusDays(40);

		System.out.println(date);
	}
	
}
