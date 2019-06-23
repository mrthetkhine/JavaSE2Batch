package chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamDemo {
	public static void main(String[]args)
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(12);
		list.add(15);
		list.add(17);
		list.add(22);
		
		Stream<Integer> listStream = list.stream();
		List<Integer> square =listStream
								.map(myInt -> myInt*2)
								.collect(Collectors.toList());
		System.out.println(square);
		
		Optional<Integer> sumOfEven = list
									.stream()
									.filter(myInt-> myInt %2==0)
									.reduce((a,b)->a+b);
									
		System.out.println("Even list "+ sumOfEven);
	}
}
