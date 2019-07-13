package chapter19;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[]args)
	{
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("One");
		list.add("Two");
		list.addFirst("First");
		list.addLast("Last");
		
		for(String s :list)
		{
			System.out.println(s);
		}
	}
}
