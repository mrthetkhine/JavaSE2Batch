package chapter5;

import java.util.Scanner;

public class ArrayFind {

	public static void main(String[]grgs)
	{
		int arr[] ={10,20,30,40,50,60};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter key to find");
		int key = scanner.nextInt();
		
		boolean found = false;
		int i = 0;
		
		while ( !found && i < arr.length)
		{
			if(arr[i] == key)
			{
				System.out.println("Key "+key+ " Found at "+i);
				found = true;
			}
			i++;
		}
		if( !found)
		{
			System.out.println("Key not found");
		}
	}
}
