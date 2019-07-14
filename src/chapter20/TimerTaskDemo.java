package chapter20;

import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask
{

	@Override
	public void run() {
		System.out.println("My Task");
		
	}
}
public class TimerTaskDemo {
	public static void main(String[]ars)
	{
		MyTask task = new MyTask();
		Timer timer = new Timer();
		timer.schedule(task, 1000,500);
	}

}
