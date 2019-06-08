package chapter11;

class MyThread implements Runnable
{

	String name;
	
	MyThread(String name)
	{
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0;i < 5; i++)
		{
			System.out.println("Thread  "+name +" i is "+i);
		}
	}
	
}
class SecondThread extends Thread
{

	String name;
	
	SecondThread(String name)
	{
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0;i < 5; i++)
		{
			System.out.println("Thread  "+name +" i is "+i);
		}
	}
	
}
public class ThreadDemo {
	public static void main(String[]args)
	{
		Thread thread = Thread.currentThread();
		System.out.println("Current thread "+ thread.getName());
		
		
		MyThread mt1 = new MyThread("T1");
		MyThread mt2 = new MyThread("T2");
		
		SecondThread sec1 = new SecondThread("s1");
		SecondThread sec2 = new SecondThread("s2");
		
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		
		t1.start();
		t2.start();
		
		sec1.start();
		sec2.start();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		try
		{
			t1.join();
			t2.join();
			sec1.join();
			sec2.join();
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Code in main");
	}
}
