package chapter19;

import java.util.HashMap;

public class MapDemo {
	
	public static void main(String[]args)
	{
		HashMap<Integer,String> users = new HashMap<Integer,String>();
		
		users.put(1, "User One");
		users.put(2, "User Two");
		users.put(1, "User Change");
		
		System.out.println("User 1"+users.get(1));
		System.out.println("Contain keys "+ users.containsKey(1));
		
		for(Integer key : users.keySet())
		{
			System.out.println(users.get(key));
		}
		for(String value: users.values())
		{
			System.out.println("Value "+value);
		}
	}
}
