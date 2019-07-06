package chapter29;

import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
	public static void main(String[]args)
	{
		List<Customer> customers = Customer.getAllCustomer();
		List<String> customerNames = customers
		.stream()
		.map(cus-> ((cus.gender == Gender.MALE) ? "Mr "+cus.name : "Mrs "+ cus.name))
		.collect(Collectors.toList());
		
		System.out.println(customerNames);
	}
}
