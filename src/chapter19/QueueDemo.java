package chapter19;

import java.util.PriorityQueue;
//import java.util.
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[]args)
	{
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("One");
		queue.add("Two");
		queue.add("Three");
		queue.add("Abs");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		
	}
}
