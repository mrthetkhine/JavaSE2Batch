package chapter19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Customer implements Comparable<Customer>
{
	String name;
	int age;
	Customer(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Customer o) {
		if(this.age == o.age)
		{
			return this.name.compareTo(o.name);
		}
		else
		{
			return this.age - o.age;
		}
		
	}
	public String toString()
	{
		return "Name "+ this.name + " Age "+this.age;
	}
	
}
public class CustomListSort {

	public static void main(String[]args)
	{
		List<Customer> customers = new ArrayList<Customer>();
		
		customers.add(new Customer("Mg Mg",30));
		customers.add(new Customer("Mya Mya",10));
		customers.add(new Customer("Aung Mya",10));
		customers.add(new Customer("Hla Hla",50));
		customers.add(new Customer("Aung Aung",14));
		
		//Collections.sort(customers);
		Collections.shuffle(customers);
		
		for(Customer c : customers)
		{
			System.out.println(c);
		}
		
	}
}
