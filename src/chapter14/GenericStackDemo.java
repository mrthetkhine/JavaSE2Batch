package chapter14;
class Stack<T>
{
	int top = -1;
	T[] elements;
	
	Stack()
	{
		this.elements =(T[]) new Object[10];
	}
	public void push(T ele)
	{
		this.elements[++top] = ele;
	}
	public T pop()
	{
		return this.elements[top--];
	} 
}
public class GenericStackDemo {
	public static void main(String[]args)
	{
		Stack<String> strStack = new Stack<String>();
		strStack.push("One");
		strStack.push("Two");
		strStack.push("Three");
		
		System.out.println(strStack.pop());
		System.out.println(strStack.pop());
		System.out.println(strStack.pop());
		
		Stack<Integer> intStack = new Stack<Integer>();
		intStack.push(10);
		intStack.push(20);
		intStack.push(30);
		
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		
		///strStack = intStack;
		
		System.out.println("Same class "+strStack.getClass().equals(intStack.getClass()));
		
		Stack booleanStack = new Stack();
		booleanStack.push("String");
		booleanStack.push(1223);
	}
}
