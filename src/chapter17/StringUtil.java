package chapter17;

public class StringUtil {
	public static void main(String[]args)
	{
		String str = "hello how are you hello";
		
		System.out.println("Hello".equalsIgnoreCase(str));
		
		System.out.println("Compare A to B "+ "A".compareTo("B"));
		System.out.println(str.indexOf("helloo"));
		System.out.println(str.lastIndexOf("hello"));
		System.out.println("Substring 1,3 "+ str.substring(1,3));
		
		String joinResult = String.join(":", "Apple","Orange","Banana");
		System.out.println(joinResult);
		
	}
}
