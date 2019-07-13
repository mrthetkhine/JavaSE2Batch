package chapter19;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[]args)
	{
		Integer arr[] = new Integer[]{10,120,30};
		Integer arr1[] = new Integer[]{10,20,30};
		
		System.out.println("Array Equal "+Arrays.equals(arr, arr1));
		
		Arrays.sort(arr);
		System.out.println(arr);
		for(Integer a : arr)
		{
			System.out.println(a);
		}
	}
}
