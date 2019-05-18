package chapter5;

public class Pyramid {
	public static void main(String[]args)
	{
		for( int i=0; i < 4 ; i++)
		{
			for(int j=0; j < 3 -i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k < 2*i+1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
