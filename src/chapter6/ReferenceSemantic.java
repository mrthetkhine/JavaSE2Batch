package chapter6;

public class ReferenceSemantic {

	public static void main(String[]args)
	{
		MyInteger a = new MyInteger(10);
		MyInteger b = new MyInteger(20);
		
		System.out.println("A is "+a);
		System.out.println("B is "+b);
		
		a = b;
		//a.value = 200;
		
		System.out.println("A is "+a);
		System.out.println("B is "+b);
	}
}
