package chapter18;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[]args)
	{
		try {
			Runtime.getRuntime().exec("mkdir testing");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
