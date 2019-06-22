package chapter14;

public class GenericMethod {
	
	public static <T extends Number> double add(T t1, T t2)
	{
		return t1.doubleValue()+ t2.doubleValue();
	}
	public static void main(String[]args)
	{
	
		System.out.println(add(10,20));
		System.out.println(add(10.2,20.8));
		//System.out.println(add(10,"Hello"));
	}
 
}
