package chapter19;

import java.util.Properties;

//import java.util
public class PropertiesDemo {
	public static void main(String[]args)
	{
		Properties prop = new Properties();
		prop.put("user1", "userone@gmail.com");
		prop.put("pwd", "1233");
		
		System.out.println(prop.get("user1"));
	}
}
