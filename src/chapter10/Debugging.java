package chapter10;

public class Debugging {

	static void method1()
	{
		new Throwable().printStackTrace();
	}
	static void method2()
	{
		method1();
	}
	static void method3()
	{
		method1();
	}
	public static void main(String[]args)
	{
		method3();
	}
	
}
