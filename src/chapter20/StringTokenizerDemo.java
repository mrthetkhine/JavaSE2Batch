package chapter20;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[]args)
	{
		String str ="I !go @to school, How are you";
		StringTokenizer tokenizer =new StringTokenizer(str," ,!@#");
		
		while(tokenizer.hasMoreTokens())
		{
			System.out.println(tokenizer.nextToken());
		}
	}
}
