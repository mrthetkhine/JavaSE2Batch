package chapter18;

public class MemoryManagement {
	public static void main(String[]args)
	{
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Total Memory "+runtime.totalMemory());
		System.out.println("Free Memory "+runtime.freeMemory());
		
		Integer [] arr = new Integer[100000];
		System.out.println("Total Memory "+runtime.totalMemory());
		System.out.println("Free Memory "+runtime.freeMemory());
		
		
		arr = null;
		System.gc();
		System.out.println("Total Memory "+runtime.totalMemory());
		System.out.println("Free Memory "+runtime.freeMemory());
	}
}
