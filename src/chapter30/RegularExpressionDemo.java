package chapter30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {
	public static void main(String[]args)
	{
		//Pattern pattern = Pattern.compile("(java)+");
		//Matcher matcher = pattern.matcher("javajava programming in java");
		
		String email = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
		Pattern pattern = Pattern.compile(email);
		Matcher matcher = pattern.matcher("me@gmail.com");
		System.out.println("Match "+matcher.matches());
		while(matcher.find())
		{
			System.out.println(matcher.group() + " Found at "+matcher.start());
			
		}
	}

}
