package chapter5;

import java.util.Scanner;

public class ExamDemo {
	
	public static void main(String[]args)
	{
		int mark;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter mark");
		mark = scanner.nextInt();
		
		if( mark >=  50)
		{
			if( mark >= 80)
			{
				System.out.println("Pass with distinction");
			}
			else 
			{
				System.out.println("Pass");
			}	
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
