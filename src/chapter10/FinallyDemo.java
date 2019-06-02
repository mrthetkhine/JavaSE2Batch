package chapter10;

public class FinallyDemo {

	static int noReturn()
	{
		//throw new Error();
		while(true);
	}
	static int method()
	{
		try
		{
			return 1/0;
			//return 1;
		}
		catch(Exception e)
		{
			throw new Exception();
		}
		finally
		{
			return 3;
		}
	}
	public static void main(String[]args)
	{
		int result = method();
		System.out.println("Result "+result);
	}
}
