package lv.akurss.lesson8.lecture._2_dates;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.YEAR));
		
		c.add(Calendar.MONTH, 2);
		System.out.println(c.getTime());
		
		c.add(Calendar.DATE, -60);
		System.out.println(c.getTime());
	}
	
}
