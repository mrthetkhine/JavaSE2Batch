package chapter20;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[]args)
	{
		Optional<String> opt = Optional.empty();
		
		opt = Optional.of("Hello");
		System.out.println("Is Present "+opt.isPresent());
		System.out.println(opt.orElse("Default"));
	}
}
