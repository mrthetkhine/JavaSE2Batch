package chapter5;

import java.util.Scanner;

public class DigitWithIf {
	
	public static void main(String[]args)
	{
		int digit;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter digit");
		digit = scanner.nextInt();
		
		if( digit == 0)
		{
			System.out.println("Zero");
		}
		else if(digit == 1)
		{
			System.out.println("One");
		}
		else if(digit == 2)
		{
			System.out.println("Two");
		}
		else if(digit == 3)
		{
			System.out.println("Three");
		}
	}
}
