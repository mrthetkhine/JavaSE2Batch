package chapter7;

public class MyData {
	int data;
	String str;
	
	MyData(int data)
	{
		this.data = data;
	}
	
	static void method(int a)
	{
		a = 10;
	}
	static void method(MyData a)
	{
		a.data = 10;
	}
	static void method2(MyData a)
	{
		a = new MyData(300);
	}
	public String toString()
	{
		return this.data+"";
	}
	public static void main(String args[])
	{
		int a = 200;
		method(a);
		
		System.out.println("A is "+a);
		
		MyData myDataA = new MyData(200);
		method(myDataA);
		
		System.out.println("MyData is "+myDataA);
		
		method2(myDataA);
		System.out.println("MyData is "+myDataA);
		
	}
}
