package chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class StreamOnCollectionDemo {
	public static void main(String[]args)
	{
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1,"One",20,Gender.FEMALE));
		customers.add(new Customer(2,"Two",10,Gender.MALE));
		customers.add(new Customer(3,"Three",25,Gender.FEMALE));
		customers.add(new Customer(4,"Four",35, Gender.FEMALE));
		
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
		customers
			.stream()
			.forEach(cus->{
				System.out.println("Custom action "+cus.name);
			});
		System.out.println(max.get().name);
	}

}
