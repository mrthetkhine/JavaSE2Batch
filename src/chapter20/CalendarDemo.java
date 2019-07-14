package chapter20;

import java.util.Date;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[]args)
	{
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Month "+ calendar.get(Calendar.MONTH));
		
		Date date = new Date();
		System.out.println(date.getTime());
		
	}
}
