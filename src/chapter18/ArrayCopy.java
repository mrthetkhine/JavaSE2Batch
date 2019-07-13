package chapter18;

public class ArrayCopy {
	public static void main(String[]args)
	{
		int arr[] = {10,20,30,40,50};
		int[] arr2 = new int[arr.length];
		
		System.arraycopy(arr, 0, arr2, 0, 3);
		
		System.out.println(arr2[1]);
		System.out.println(System.getProperty("user.dir"));
	}
}
 