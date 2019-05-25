package chapter7;

public class MethodOverloading {
	static void print(String str)
	{
		System.out.println("String "+str);
	}
	
	static void print(float f)
	{
		System.out.println("Float "+f);
	}
	static void print(double d)
	{
		System.out.println("Double "+d);
	}
	static void print(int data)
	{
		System.out.println("Int "+data);
	}
	static void print(long data)
	{
		System.out.println("Long "+data);
	}
	
	public static void main(String[]args)
	{
		print("Hello");
		print(22);
		print(22.1F);
		
		long myLong = 200;
		print(myLong);
	}
}
