package chapter5;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[]args)
	{
		int number =(int) (Math.random() * 10)+1;
		int userGuess;
		
		Scanner scanner = new Scanner(System.in);
		int tries = 0;
		do 
		{
			System.out.println("Please enter a number");
			userGuess = scanner.nextInt();
			
			if( userGuess > number)
			{
				System.out.println("Too large");
			}
			else if( userGuess < number)
			{
				System.out.println("Too Small");
			}
			tries ++;
		}while( number != userGuess);
		System.out.println("You correctly guess the number in "+tries);
	}
}
