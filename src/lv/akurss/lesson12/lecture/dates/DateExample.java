package lv.akurss.lesson12.lecture.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		
		String dateString = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(date);
		System.out.println(dateString);
		
		String someDate = "2017/02/01 12:33";
		Date date1 = new SimpleDateFormat("yyyy/dd/MM HH:mm").parse(someDate);

		System.out.println(date1);
		
		date.setTime(new Date().getTime() + 24*60*60*1000);
		System.out.println(date);
	}
	
}
