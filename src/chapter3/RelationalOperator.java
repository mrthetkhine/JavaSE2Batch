package chapter3;

public class RelationalOperator {

	static boolean getTrue()
	{
		System.out.println("Get true");
		return true;
	}
	static boolean getFalse()
	{
		System.out.println("Get false");
		return false;
	}
	public static void main(String[]args)
	{
		boolean result = getTrue() | getTrue();
		
		System.out.println(result);
	}
}
