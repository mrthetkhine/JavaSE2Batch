package chapter6;

public class MyInteger {
	int value;
	
	MyInteger(int value)
	{
		this.value = value;
	}
	MyInteger add(MyInteger b)
	{
		int sum = this.value + b.value;
		return new MyInteger(sum);
	}
	MyInteger sub(MyInteger b)
	{
		int sub = this.value - b.value;
		return new MyInteger(sub);
	}
	MyInteger mult(MyInteger b)
	{
		int result = this.value *b.value;
		return new MyInteger(result);
	}
	MyInteger div(MyInteger b)
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
