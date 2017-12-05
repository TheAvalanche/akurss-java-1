package lv.akurss.lesson12.lecture.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		
		LocalDate newDate = date.plusMonths(1);
		newDate = newDate.minusDays(1);

		System.out.println(newDate);

		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		
	}
	
}
