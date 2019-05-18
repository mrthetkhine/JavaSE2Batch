package chapter5;

public class ContinueDemo {
	public static void main(String[]args)
	{
		
		for (int i = 0; i <6; i++) {
			
			if( i==3)
			{
				continue;
			}
			System.out.println(" Loop i"+i);
		}
		
	}
}
