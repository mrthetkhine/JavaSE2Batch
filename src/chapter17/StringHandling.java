package chapter17;

public class StringHandling {

	public static void main(String[]args)
	{
		long start = System.currentTimeMillis();
		String str = "Hello World";
		String upperCaseStr = str.toUpperCase();
		
		System.out.println(str);
		System.out.println(upperCaseStr);
		
		StringBuffer buffer = new StringBuffer(str);
		for(int i=0;i < 5000; i++)
		{
			//str+= "Hello World";
			buffer.append("Hello World");
		}
		str = str.replace("World", "NewWorld");
		System.out.println(str);
		
		long end = System.currentTimeMillis();
		long time = end- start;
		System.out.println("Running time "+time +" ms");
	}
}
