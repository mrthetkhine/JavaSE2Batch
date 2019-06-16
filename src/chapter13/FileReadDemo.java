package chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadDemo {
	
	public static void main(String[]args)
	{
		int i;
		
		String fileName= "./src/chapter13/FileReadDemo.java";
		String outputFile = "./src/chapter13/FileReadDemoOutput.java";
		try (FileInputStream fin = new FileInputStream(fileName);
				FileOutputStream fout = new FileOutputStream(outputFile))
		{
			do
			{
				i = fin.read();
				if( i != -1)
				{
					System.out.print((char)i);
					fout.write(i);
				}
				
			}while( i != -1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
