package chapter17;

public class IOvsCPU {

	public static void main(String[]args)
	{
		long start = System.currentTimeMillis();
		
		int total =0;
		/*
		for(int i=0;i< 10000;i++)
		{ 
			total +=i;
		}*/
		for(int i=0;i< 100;i++)
		{
			System.out.println();
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		
		System.out.println("Hello".charAt(4));
		System.out.println("Time "+time);
	}
}
