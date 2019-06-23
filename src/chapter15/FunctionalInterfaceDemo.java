package chapter15;

interface MyFunc
{
	int call(int a);
}
class DemoClass
{
	static int staticMethod(int a)
	{
		System.out.println("Demo static method "+a);
		return a;
	}
	int method(int a)
	{
		System.out.println("Demo instance method "+a);
		return a;
	}
}
public class FunctionalInterfaceDemo {
	
	static void passArgument(MyFunc func)
	{
		System.out.println(func.call(30));
	}
	static MyFunc getFunc()
	{
		return (n)->{
			System.out.println("Funciton body");
			return n*n*n;
		};
	}
	public static void main(String[]args)
	{
		MyFunc func = (n)->n*n;
		System.out.println(func.call(10));
		
		func= (n)->n*2;
		System.out.println(func.call(10));
		
		func = (n)->{
			System.out.println("Triple method for parameter "+n);
			return n*3;
		};
		System.out.println(func.call(10));
		
		DemoClass demo = new DemoClass();
		
		func = DemoClass::staticMethod;
		System.out.println(func.call(10));
		
		func = demo::method;
		System.out.println(func.call(10));
		
		passArgument(demo::method);
		
		System.out.println(getFunc().call(100));
		
	}
}
