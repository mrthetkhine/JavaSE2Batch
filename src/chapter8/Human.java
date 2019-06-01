package chapter8;

public class Human {
	
	void work()
	{
		System.out.println("Human work");
	}
	public static void main(String[]args)
	{
		Human h = new Doctor();
		h.work();
		
		h = new Teacher();
		h.work();
	}
}
class Doctor extends Human
{
	void work()
	{
		System.out.println("Doctor work");
	}
}
class Teacher extends Human
{
	void work()
	{
		System.out.println("Teacher work");
	}
}
