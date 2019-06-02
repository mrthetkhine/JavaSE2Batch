package chapter10;

class UserNameAlreadyExistException extends Exception
{
	String userName;
	
	UserNameAlreadyExistException(String userName)
	{
		this.userName = userName;
	}
	public String toString()
	{
		return "Username Already Existed for "+this.userName;
	}
}
public class CustomException {
	static void controller()
	{
		String userName = "Tk";
		try
		{
			service(userName);
		}
		catch(UserNameAlreadyExistException e)
		{
			e.printStackTrace();
		}
	}
	static void service(String userName)throws UserNameAlreadyExistException
	{
		dao(userName);
		
	}
	static void dao(String userName)throws UserNameAlreadyExistException
	{
		if("Tk".equals(userName))
		{
			throw new UserNameAlreadyExistException(userName);
		}
	}
	public static void main(String args[])
	{
		controller();
	}
}
