package lv.akurss.lesson8.lecture._2_dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);

		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		
		LocalDate newDate = date.plusMonths(2);
		System.out.println(date);
		System.out.println(newDate);
		
		newDate = newDate.minusDays(60);
		System.out.println(newDate);

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		String dateStr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(dt);
		System.out.println(dateStr);
		
	}
	
}
