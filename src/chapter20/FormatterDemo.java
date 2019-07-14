package chapter20;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class FormatterDemo {
	public static void main(String[]args)
	{
		Calendar calendar = Calendar.getInstance();
		Formatter fmt = new Formatter();
		fmt.format("PI in 2 Digit %1.5f time %tD ", Math.PI, calendar);
		System.out.println(fmt);
	}
}
