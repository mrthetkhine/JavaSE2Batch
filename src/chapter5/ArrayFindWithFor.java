package chapter5;

import java.util.Scanner;

public class ArrayFindWithFor {

	public static void main(String[]grgs)
	{
		int arr[][] ={
				{10,20,30,40,50,60},
				{70,80,90,100},
				{200,280,290,300},
		};
				
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter key to find");
		int key = scanner.nextInt();
		
		boolean found = false;
		
		outer:for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Outer Loop at "+i);
			for(int j=0;j< arr[i].length; j++)
			{
				System.out.println("Inner j "+ j);
				
				if(arr[i][j] == key)
				{
					System.out.println("Key found at i="+i +" j= "+j);
					found = true;
					break outer;
				}
			}
			
			
			
		}
		if(!found)
		{
			System.out.println("Key not found");
		}
	}
}
