package chapter6;

public class Item {
	int code;
	String name;
	double price;
	int quantity;
	
	Item()
	{
		System.out.println("No Argument Constructor run");
	}
	Item(int code, String name, double price, int quantity)
	{
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		System.out.println("Arguments Constructor run");
	}
	
	public void show()
	{
		System.out.println("Item code:"+code + " name: "+name + " price: "+price+" quantity:"+quantity);
	}
	
	public static void main(String[]args)
	{
		Item itemOne = new Item(1,"Apple",10,20);
		
		Item itemTwo = new Item(2, "Orange", 10,30);
		
		itemOne.show();
		itemTwo.show();
	}
}
