package chapter18;

public class NaNDemo {
	public static void main(String[]args)
	{
		double d = 1/0.0;
		double k  = 0/0.0;
		System.out.println(d);
		System.out.println("Is infinity "+Double.isInfinite(d));
		
		System.out.println(k == k);
		
		double zero1 = 0.0;
		double zero2 = -0.0;
		
		System.out.println(zero1);
		System.out.println(zero2);
		
		
		System.out.println(zero1 == zero2);
		
		Integer myInt = Integer.parseInt("200");
		System.out.println(myInt);
	}
}
