package chapter29;

import java.util.ArrayList;
import java.util.List;

enum Gender
{
	MALE, FEMALE;
}
public class Customer
{
	int id;
	String name;
	int age;
	Gender gender;
	
	Customer(int id, String name, int age,Gender gender)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void receiveGift()
	{
		System.out.println("You receive gift "+this.name);
	}
	static List<Customer> getAllCustomer()
	{
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1,"One",20,Gender.FEMALE));
		customers.add(new Customer(2,"Two",10,Gender.MALE));
		customers.add(new Customer(3,"Three",25,Gender.FEMALE));
		customers.add(new Customer(4,"Four",35, Gender.FEMALE));
		
		return customers;
	}
}