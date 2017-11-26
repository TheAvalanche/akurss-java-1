package lv.akurss.lesson12.lecture.dates;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.YEAR));
		
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DATE, -1);

		System.out.println(calendar.getTime());
		
		calendar.add(Calendar.DATE, 40);

		System.out.println(calendar.getTime());
	}
	
}
