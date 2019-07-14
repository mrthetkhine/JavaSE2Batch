package chapter30;

public class OurRegDemo {
	
	static int reg(String str)
	{
		int state = 0;
		
		for(int i=0;i < str.length();i++)
		{
			char ch = str.charAt(i);
			switch( state)
			{
				case 0:
					if(ch == 'a')
					{
						state = 1;
					}
					else
					{
						System.out.println("Error ");
						return -1;
					}
				break;
				case 1:
					if(ch=='a')
					{
						state = 1;
					}
					else if(ch=='b')
					{
						state = 2;
					}
					else
					{
						System.out.println("Error ");
						return -1;
					}
					break;
				case 2:
					if(ch=='b')
					{
						state = 2;
					}
					else
					{
						System.out.println("Error ");
						return -1;
					}
					break;
			}
		}
		return state;
	}
	public static void main(String[]args)
	{
		String str ="aaabbb";
		int state= reg(str);
		if(state == 2)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
