package chapter19;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[]args)
	{
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("One");
		hashSet.add("Two");
		hashSet.add("One");
		hashSet.add("Three");
		
		System.out.println("Size "+ hashSet.size());
		
		System.out.println("Contain three "+hashSet.contains("Three"));
		for(String s : hashSet)
		{
			System.out.println(s);
		}
	}

}
