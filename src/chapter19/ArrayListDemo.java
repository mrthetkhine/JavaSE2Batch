package chapter19;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[]args)
	{
		ArrayList<String> subList = new ArrayList<String>();
		subList.add("One");
		subList.add("Three");
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		//list.remove("Two");
		
		//Collections.sort(list);
		
		list.add(0, "First");
		
		System.out.println("Index of One "+list.indexOf("Three"));
		System.out.println("Sublist "+list.containsAll(subList));
		for(String s : list)
		{
			System.out.println(s);
		}
	}
}
