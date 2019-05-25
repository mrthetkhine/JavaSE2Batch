package chapter6;

public class MyInteger {
	private int value;
	
	public MyInteger(int value)
	{
		this.value = value;
	}
	public MyInteger add(MyInteger b)
	{
		int sum = this.value + b.value;
		return new MyInteger(sum);
	}
	public MyInteger sub(MyInteger b)
	{
		int sub = this.value - b.value;
		return new MyInteger(sub);
	}
	public MyInteger mult(MyInteger b)
	{
		int result = this.value *b.value;
		return new MyInteger(result);
	}
	public MyInteger div(MyInteger b)
	{
		int result = this.value / b.value;
		return new MyInteger(result);
	}
	public String toString()
	{
		return ""+this.value;
	}
	public static void main(String[]args)
	{
		MyInteger a = new MyInteger(20);
		MyInteger b = new MyInteger(30);
		
		MyInteger result = a.add(b);
		
		System.out.println("Sum is "+result);
		System.out.println("Sub is "+a.sub(b));
		System.out.println("Div is "+a.div(b));
	}
}
