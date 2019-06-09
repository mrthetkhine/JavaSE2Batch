package chapter11;
class Q
{
	int n;
	boolean valueSet = false;
	synchronized int get()
	{
		while(!valueSet)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.valueSet = false;
		System.out.println("Get "+n);
		notify();
		return n;
	}
	synchronized public void put(int n) 
	{
		while( valueSet)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.valueSet = true;
		this.n =  n;
		notify();
		System.out.println("Put "+n);
	}
}
class Producer extends Thread
{
	Q q;
	Producer(Q q)
	{
		this.q = q;
	}
	public void run()
	{
		
		for(int i=0;i< 10;i++)
		{
			q.put(i);
		}
	}
}
class Consumer extends Thread
{
	Q q;
	Consumer(Q q)
	{
		this.q = q;
	}
	public void run()
	{
		
		for(int i=0;i< 10;i++)
		{
			q.get();
		}
	}
}
public class ProducerConsumer {
	public static void main(String[]args)
	{
		Q q = new Q();
		Producer pro = new Producer(q);
		Consumer con = new Consumer(q);
		
		pro.start();
		con.start();
		
		
	}

}
