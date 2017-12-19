package lv.akurss.lesson12.lecture.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		
		date.setTime(new Date().getTime() + 24*60*60*1000);
		System.out.println(date);
		
		String someDate = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date());
		System.out.println(someDate);
		
		String dateStr = "2017/31/01 12:33";
		Date d = new SimpleDateFormat("yyyy/dd/MM HH:mm").parse(dateStr);
		System.out.println(d);
		
	}
	
}
