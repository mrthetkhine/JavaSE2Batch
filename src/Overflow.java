
public class Overflow {

	public static void main(String[]args)
	{
		byte myByte= 127;
		myByte ++;
		myByte++;
		System.out.println(myByte);
		
		myByte = (byte)3;
		System.out.println( 0.3 - 0.2 );
		
		System.out.println( 3 / 2);
		
		boolean myBool = true;
		
		float myFloat = 0/0.0f;
		System.out.println(myFloat == myFloat);
	}
}
