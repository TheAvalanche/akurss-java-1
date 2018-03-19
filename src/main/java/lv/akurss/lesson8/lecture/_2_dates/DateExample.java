package lv.akurss.lesson8.lecture._2_dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date date = new Date();

		System.out.println(date);
		System.out.println(date.getTime());
		
		date.setTime(new Date().getTime() + 24*60*60*1000);
		System.out.println(date);
		
		date.setTime(0);
		System.out.println(date);
		
		String dateStr = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS").format(new Date());
		System.out.println(dateStr);
		
		String str = "2018/13/03 12:30";
		try {
			Date d = new SimpleDateFormat("yyyy/dd/MM HH:mm").parse(str);
			System.out.println(d);
		} catch (ParseException e) {
			System.out.println("Invalid date passed");
		}
		
	}
	
}
