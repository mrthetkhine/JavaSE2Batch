package chapter11;

class Counter
{
	int counter = 0;
	
	void inc()
	{
		counter = counter +1;
	}
	void dec()
	{
		counter = counter -1;
	}
	int getCount()
	{
		return counter;
	}
}
class IncThread extends Thread
{
	Counter counter ;
	String name ;
	
	IncThread(String name,Counter counter)
	{
		this.name = name;
		this.counter = counter;
	}
	
	public void run()
	{
		for(int i=0; i< 15;i++)
		{	
			synchronized(counter)
			{
				counter.inc();
			}
			
			try
			{
				Thread.sleep(100);
				//System.out.println("Sleep inc");
			}
			catch(Exception e)
			{
				
			}
			
		}
	}

}
class DecThread extends Thread
{
	Counter counter ;
	String name ;
	
	DecThread(String name,Counter counter)
	{
		this.name = name;
		this.counter = counter;
	}
	
	public void run()
	{
		for(int i=0; i< 15;i++)
		{	
			synchronized(counter)
			{
				counter.dec();
			}
			try
			{
				Thread.sleep(100);
				//System.out.println("Sleep dec");
			}
			catch(Exception e)
			{
				
			}
		}
	}
	
	
}
public class SynchronizedDemo {

	public static void main(String[]args)
	{
		Counter counter = new Counter();
		IncThread t1 = new IncThread("t1",counter);
		DecThread t2 = new DecThread("t2",counter);
		
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Data is "+counter.getCount());
	}
}
