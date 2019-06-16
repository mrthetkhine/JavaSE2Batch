package chapter13;

import java.util.Date;

public class InstanceOfDemo {

	public static void main(String[]args)
	{
		Date d = new Date();
		System.out.println(d instanceof Date);
		System.out.println(d instanceof Object);
		System.out.println(null instanceof Object);
	}
}
