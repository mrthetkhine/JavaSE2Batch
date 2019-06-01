package chapter8;

class Parent
{
	int parentData;
	int data = 200;
	Parent()
	{
		System.out.println("Parent Constructor");
	}
	Parent(int data)
	{
		this.parentData = data;
		System.out.println("Parent 1 Arg constructor");
	}
	void parentMethod()
	{
		System.out.println("Parent method");
	}
	
	void display()
	{
		System.out.println("Parent display");
	}
}
class Child extends Parent
{
	int childData;
	int data =500;
	Child()
	{
		super(200);
		System.out.println("Child constructor");
	}
	
	void childMethod()
	{
		System.out.println("Child method "+super.data);
	}
	void display()
	{
		System.out.println("Child display "+ this.data);
	}
}
public class InheritanceDemo {
	
	public static void main(String[]args)
	{
		Parent c  =new Child();
		c.display();
		c.data = 400;
		
		c.display();
	}

}
