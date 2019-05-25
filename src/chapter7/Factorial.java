package chapter7;

public class Factorial {
	static int fact(int n)
	{
		System.out.println("N is "+n);
		if( n==1)
		{
			return 1;
		}
		else
		{
			return n* fact(n-1);
		}
	}
	public static void main(String[]args)
	{
		System.out.println(fact(41111));
	}
}
