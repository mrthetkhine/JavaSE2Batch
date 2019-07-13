package chapter19;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;

public class PerformanceDemo {
	
	static int iteration = 100000;
	static void testArrayList()
	{
		long start = System.currentTimeMillis();
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i< iteration; i++)
		{
			list.add("User"+i);
		}
		int index = list.indexOf("User1");
		System.out.println("User 1 index "+index);
		
		System.out.println(list.indexOf("Nothing"));
		//list.add(0, "Start");
		
		long end = System.currentTimeMillis();
		
		long time = end - start;
		
		System.out.println("ArrayList time "+ time + "ms");
	}
	static void testLinkedList()
	{
		long start = System.currentTimeMillis();
		
		LinkedList<String> list = new LinkedList<String>();
		
		for(int i=0;i< iteration; i++)
		{
			list.add("User"+i);
		}
		int index = list.indexOf("User1");
		System.out.println("User 1 index "+index);
		
		System.out.println(list.indexOf("Nothing"));
		
		//list.addFirst("First");
		long end = System.currentTimeMillis();
		long time = end - start;
		
		System.out.println("LinkedList time "+ time + "ms");
	}
	static void testHastable()
	{
		long start = System.currentTimeMillis();
		
		Hashtable<Integer,String> list = new Hashtable<Integer,String>();
		
		for(int i=0;i< iteration; i++)
		{
			list.put(i,"User"+i);
		}
		boolean index = list.containsKey(1);
		System.out.println("User 1 index "+index);
		
		System.out.println(list.containsKey(iteration+1));
		
		//list.addFirst("First");
		long end = System.currentTimeMillis();
		long time = end - start;
		
		System.out.println("Hashtable time "+ time + "ms");
	}
	public static void main(String[]args)
	{
		testHastable();
		testArrayList();
		testLinkedList();
		
	}
}
