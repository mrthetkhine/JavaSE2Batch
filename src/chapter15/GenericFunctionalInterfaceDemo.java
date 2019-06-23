package chapter15;
interface Generic<T>
{
	T call(T t);
}
interface Invoker
{
	void call();
}
public class GenericFunctionalInterfaceDemo {
	public static void main(String[]args)
	{
		Generic<Integer> genInt = (n)->n*n;
		System.out.println(genInt.call(20));
		
		Generic<Double> genDouble = (n)->n*n;
		System.out.println(genDouble.call(20.0));
		
		Invoker invoker = ()->{
			System.out.println("Method body");
		};
		invoker.call();
	}
}
