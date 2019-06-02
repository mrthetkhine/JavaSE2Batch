package chapter10;

public class ExceptionDemo {


	public static void main(String[]args)
	{
		int a = 10;
		int b = 10;
		
		String str = null;
		int result = a /b;
		
		try
		{
			System.out.println("Result is "+result);
			System.out.println( str.toLowerCase());	
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		catch(NullPointerException npe)
		{
			System.out.println("Null pointer exception");
			npe.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally run");
		
		}
		System.out.println("After exception");
		
	}
}
