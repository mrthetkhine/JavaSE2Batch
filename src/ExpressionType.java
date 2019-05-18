
public class ExpressionType {
	public static void main(String args[])
	{
		long myLong = 12;
		float myFloat = 2;
		double myDouble = 13;
		
		myFloat  =  (float) ( myLong * myFloat + myDouble);
		myDouble = myFloat;
		
		int myInt = 3;
		myDouble =  myInt / (float)2;
		
		System.out.println(myDouble);
		
		myDouble = 65;
		char myChar = (char)myDouble;
		System.out.println("My Char is "+myChar);
		
		short myShort = 20;
		myShort = (short) (myShort + myShort);
	}
}
