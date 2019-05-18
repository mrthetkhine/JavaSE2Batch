package chapter5;

public class ForDemo {
	public static void main(String[]args)
	{
		String[] arr = {"One","Two","Three"};
		for(int i=0; i < 5; i++)
		{
			System.out.println("Hello World "+i);
			
		}
		//System.out.println("i is "+ i);
		
		for(String str : arr)
		{
			System.out.println(str);
		}
	}
}
