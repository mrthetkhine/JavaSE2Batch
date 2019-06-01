package chapter9;

interface Flyable
{
	void fly();
}
interface Driveable
{
	void drive();
}
class Bird implements Flyable
{

	@Override
	public void fly() {
		System.out.println("Bird fly");
	}
}
class Aeroplane implements Flyable,Driveable
{

	@Override
	public void fly() {
		System.out.println("Aeroplane Fly");
		
	}

	@Override
	public void drive() {
		System.out.println("Aeroplane drive");
		
	}
}
class Car implements Driveable
{

	@Override
	public void drive() {
		System.out.println("Car driving");
		
	}
}
public class InterfaceDemo {
	public static void main(String[]args)
	{
		Flyable flyable = new Bird();
		flyable.fly();
		
		flyable = new Aeroplane();
		flyable.fly();
		
		Driveable driveable = new Car();
		driveable.drive();
		
		driveable = new Aeroplane();
		driveable.drive();
	}
}
