
public class StringDemo {
	
	public static void main(String[]args)
	{
		String str1 = "Hello";
		String str2 ="Hello";
		
		String str3 = new String("Hello");
		
		System.out.println( str1 == str2 );
		System.out.println( str1 == str3 );
		
		System.out.println( str1.equals(str2));
		System.out.println( str2.equals(str3));
		
		str3 = "Hello";
		str3 =  str3.toLowerCase();
		System.out.println(str3);
		System.out.println(str3.length());
	}
}
