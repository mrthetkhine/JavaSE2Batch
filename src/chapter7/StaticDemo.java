package chapter7;

public class StaticDemo {
	static int classData;
	int instanceData;
	
	static{
		System.out.println("Staic initializer run");
		classData = 1000;
	}
	void method()
	{
		instanceData ++;
		classData ++;
	}
	static void staticMethod()
	{
		System.out.println("Called static method");
	}
	public static void main(String[]args)
	{
		final int data = 1000;
		//data ++;
		StaticDemo obj1 = new StaticDemo();
		//StaticDemo.classData = 200;
		obj1.instanceData = 300;
		
		StaticDemo obj2 = new StaticDemo();
		
		obj2.instanceData = 400;
		obj1.method();
		
		System.out.println("Class Data obj1 "+StaticDemo.classData);
		System.out.println("Instance Data obj1 "+obj1.instanceData);
		
		System.out.println("Class Data obj2 "+StaticDemo.classData);
		System.out.println("Instance Data obj2 "+obj2.instanceData);

		StaticDemo obj3 = null;
		obj3.staticMethod();
	}
}
