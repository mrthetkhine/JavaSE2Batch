package chapter10;

public class ThrowDemo {
	
	static void controller()
	{
		String userName = "Tk";
		try
		{
			service(userName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void service(String userName)throws Exception
	{
		try
		{
			dao(userName);
		}
		catch(Exception e)
		{
			throw e;
		}
		
	}
	static void dao(String userName)throws Exception
	{
		if("Tk".equals(userName))
		{
			throw new Exception("Username TK already existed");
		}
	}
	public static void main(String args[])
	{
		controller();
	}

}
