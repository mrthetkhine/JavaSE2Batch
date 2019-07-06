package chapter29;

import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
	public static void main(String[]args)
	{
		List<Customer> customers = Customer.getAllCustomer();
		List<String> customerNames = customers
		.stream()
		.filter(cus->cus.age> 20)
		.map(cus-> ((cus.gender == Gender.MALE) ? "Mr "+cus.name : "Mrs "+ cus.name))
		.collect(Collectors.toList());
		
		System.out.println(customerNames);
	}
}
