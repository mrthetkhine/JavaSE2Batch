package chapter14;
class Bounded<T extends Number>
{
	T obj;
	
	Bounded(T t)
	{
		this.obj = t;
	}
	<T extends Number>double add(T t)
	{
		System.out.println("Type of t "+t.getClass().getName());
		return this.obj.doubleValue()+ t.doubleValue();
	}
	public static void show(Bounded<? extends Double> d)
	{
		System.out.println("D "+d.getClass().getName());
	}
}
public class BoundedTypeDemo {
	public static void main(String[]args)
	{
		Bounded<Integer> myInt = new Bounded<Integer>(23);
		Bounded<Double> d = new Bounded<Double>(10.0);
		
		System.out.println(myInt.add(10.0));
		
		Bounded.show(d);
		//Bounded.show(myInt);
		
		//Bounded<String> myStr = new Bounded<String>("Hello");
	}
}
