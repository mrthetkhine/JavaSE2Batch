
public class DataType {

	public static void main(String []args)
	{
		int myInt = 10;
		long myLong = 20;
		
		float myFloat = 2.3f;
		double myDouble = 1.3;
		
		char myChar = 'A';
		byte myByte = 20;
		
		myInt = ( int) myLong;
		myLong = myInt;
		
		myFloat = myLong;
		
		//myLong = myFloat;
		
		myLong = myChar;
		//myByte = myByte + myByte;
		
		myByte += myLong;
		
	}
}
