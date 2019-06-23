package chapter15;
interface ConFun
{
	MyClass method(int a);
}
class MyClass
{
	MyClass(int data)
	{
		System.out.println("MyClass contructor "+data);
	}
}
public class ConstructorMethodDemo {
	public static void main(String[]args)
	{
		ConFun fun = MyClass::new;
		MyClass obj = fun.method(10);
		System.out.println(obj);
	}
}
