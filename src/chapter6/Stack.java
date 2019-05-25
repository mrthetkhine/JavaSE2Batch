package chapter6;

public class Stack {
	private String[] values;
	private int top = -1;
	
	Stack(int size)
	{
		this.values = new String[size];
	}
	void push(String ele)
	{
		if( top < this.values.length -1)
		{
			this.values[++top] = ele;
		}
		else
		{
			System.out.println("Stack full cannot add "+ele);
		}
		
	}
	String pop()
	{
		if( top >=0)
		{
			return this.values[top--];
		}
		else
		{
			System.out.println("Stack reach to end cannot pop ");
			return null;
		}
	}
	int getSize()
	{
		return this.top+1;
	}
	/*
	public String[] getValues() {
		return values;
	}
	public void setValues(String[] values) {
		this.values = values;
	}
	*/
	public static void main(String[]args)
	{
		Stack myStack = new Stack(5);
		myStack.push("One");
		myStack.push("Two");
		myStack.push("Three");
		myStack.push("Four");
		myStack.push("Five");
		myStack.push("Six");
		
		int sizeOfStack = myStack.getSize();
		
		for(int i=0; i< sizeOfStack; i++)
		{
			System.out.println(myStack.pop());
		}
		
		Stack stackTwo = new Stack(10);
		Integer myInt;
		
	}
}
