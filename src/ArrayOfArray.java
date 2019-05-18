
public class ArrayOfArray {

	public static void main(String args[])
	{
		int []arr[] = new int[3][];
		
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[3];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		
		for(int i=0; i < arr.length; i++)
		{
			for(int j=0; j < arr[i].length; j++)
			{
				arr[i][j] = (int)(Math.random()*999);
				System.out.println("arr ["+i+"]["+j+"]"+ arr[i][j]);
			}
		}
	}
}
