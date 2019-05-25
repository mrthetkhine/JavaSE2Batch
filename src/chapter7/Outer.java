package chapter7;

public class Outer {
	int outer_x =100;
	
	void test()
	{
		for (int i = 0; i < 5; i++) {
			class Inner{
				public void display()
				{
					System.out.println("Outer x "+outer_x);
				}
			}
			Inner inner = new Inner();
			inner.display();
			
		}
		
		
	}
	
	
	
	public static void main(String[]args)
	{
		Outer outer = new Outer();
		outer.test();
		
	}
}
