package chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Customer
{
	int id;
	String name;
	int age;
	Customer(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void receiveGift()
	{
		System.out.println("You receive gift "+this.name);
	}
}
public class StreamOnCollectionDemo {
	public static void main(String[]args)
	{
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1,"One",20));
		customers.add(new Customer(2,"Two",10));
		customers.add(new Customer(3,"Three",25));
		customers.add(new Customer(4,"Four",35));
		
		List<String> customerNames = customers
			.stream()
			.filter(cus->cus.age>20)
			.map(cus->{
				cus.receiveGift();
				return cus;
			})
			.map(cus->cus.name)
			.collect(Collectors.toList());
		
		System.out.println(customerNames);
		Optional<Customer> max = customers
								.stream()
								.reduce((a,b)->{
									return a.age> b.age ? a : b;
								});
		System.out.println(max.get().name);
	}

}
