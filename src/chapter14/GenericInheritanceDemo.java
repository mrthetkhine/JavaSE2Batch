package chapter14;

class Parent<T>
{
	T obj;
	String typeName;
	Parent(T obj)
	{
		this.obj = obj;
		this.typeName = this.obj.getClass().getName();
	}
	T getObj()
	{
		return obj;
	}
	String getClassName()
	{
		return super.getClass().getName()+"/"+ this.typeName;
	}
}
class Child<T> extends Parent<T>
{
	Child(T obj)
	{
		super(obj);
	}
}
public class GenericInheritanceDemo {
	public static void main(String[]args)
	{
	
		Child<Integer> intC = new Child<>(3);
		Child<String> str = new Child<>("Hello");
		System.out.println(str.getObj());
		 
		intC = (Child)str;
		
		System.out.println("Class of intC "+intC.getClassName());
		System.out.println("Class of str "+str.getClassName());
		System.out.println("Instance of "+ (intC instanceof Child<?>));
	}
}
