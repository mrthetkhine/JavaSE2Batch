package chapter12;

import java.util.ArrayList;

public class WrapperDemo {

	public static void main(String[]args)
	{
		Integer a = Integer.valueOf(128);
		Integer b =  Integer.valueOf(128);
		
		System.out.println(a + a );
		
		System.out.println(a.intValue() == b.intValue());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
	}
}
