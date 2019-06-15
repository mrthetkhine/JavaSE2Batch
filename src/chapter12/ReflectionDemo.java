package chapter12;

import java.lang.reflect.Method;
import java.util.Date;

class DummyClass
{
	public void show()
	{
		System.out.println("Show method in DummyClass");
	}
}
public class ReflectionDemo {

	public void show()
	{
		System.out.println("Show method in ReflectionDemo");
	}
	public static void invokeMethod(Object obj)
	{
		try
		{
			Method method = obj.getClass().getMethod("show", null);
			method.invoke(obj, null);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void printMethod(Object obj)
	{
		Method methods[] = obj.getClass().getMethods();
		for(Method met : methods)
		{
			System.out.println(met.getName());
		}
	}
	public static void printClassName(Object obj)
	{
		Class c = obj.getClass();
		System.out.println(c.getName());
	}
	public static void main(String[]args)
	{
		Date d = new Date();
		printClassName(d);
		
		String str = "Hello";
		printClassName(str);
		
		//printMethod(str);
		ReflectionDemo demo = new ReflectionDemo();
		invokeMethod(demo);
		
		DummyClass dummy = new DummyClass();
		invokeMethod(dummy);
	}
}
