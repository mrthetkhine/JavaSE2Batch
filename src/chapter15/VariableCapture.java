package chapter15;

interface Capture
{
	int call(int a);
}
public class VariableCapture {
	static void method()
	{
		System.out.println("Static method");
	}
	public static void main(String[]args)
	{
		final int data = 100;
	
		Capture c = (n)->{
			System.out.println("Parameter "+n + " Data "+data);
			method();
			//data++;
			return n*data;
		};
		//data ++;
		System.out.println(c.call(100));
		
	}
}
