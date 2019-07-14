package chapter20;

import java.util.Random;

public class RandomDemo {
	public static void main(String[]args)
	{
		Random random = new Random();
		for(int i=0;i< 10;i++)
		{
			//System.out.println(random.nextDouble());
			System.out.println("Random "+ (random.nextInt(4)+2));
		}
	}
}
