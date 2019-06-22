package chapter14;

class Generic<T>
{
	T obj;
	Generic(T obj)
	{
		this.obj = obj;
	}
	
	T getObj()
	{
		return this.obj;
	}
	public void showType()
	{
		System.out.println("Type "+this.obj.getClass().getName());
	}
}
public class GenericDemo {
	public static void main(String[]args)
	{
		Generic<String> genString = new Generic<String>("Hello");
		
		System.out.println(genString.getObj());
		genString.showType();
		
		Generic<Integer> genInt = new Generic<Integer>(100);
		System.out.println(genInt.getObj());
		genInt.showType();
	}
}
