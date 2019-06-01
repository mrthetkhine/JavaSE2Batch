package chapter9;

interface DefaultInterface
{
	default void method()
	{
		System.out.println("Default method");
	}
}
class Impl implements DefaultInterface
{
	public void method()
	{
		System.out.println("Override method");
	}
}

public class DefaultMethod {
	public static void main(String[]args)
	{
		DefaultInterface def = new Impl();
		def.method();
	}
}
