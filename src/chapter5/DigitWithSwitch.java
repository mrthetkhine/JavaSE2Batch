package chapter5;

import java.util.Scanner;

public class DigitWithSwitch {
	
	public static void main(String[]args)
	{
		String[] digitStr = {"Zero","One","Two","Three","Four"};
		int digit;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter digit");
		digit = scanner.nextInt();
		
		System.out.println(digitStr[ digit]);
		
	}
}
