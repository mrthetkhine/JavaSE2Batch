package chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;

public class ReduceDemo {

	public static void main(String[]args)
	{
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		
		/*
		Optional<Integer> total = numbers
		.stream()
		.reduce((a,b)->{
			System.out.println("A "+a + " B "+b);
			return a+b;
		});
		System.out.println(total.get());
		
		numbers.stream().forEach(num->{
			System.out.println("Number is "+num);
		});
		Optional<Integer> max = numbers.stream().max(Integer::compare);
		System.out.println("Max "+max.get());
		*/
		
		Integer result = numbers.parallelStream().reduce(1,(a,b)->{
			System.out.println("Acumulator A "+ a +" B "+b);
			return a*b;
		}, (a,b)->{
			System.out.println("Combiner A "+ a +" B "+b);
			return a*b;
		});
		
		Iterator<Integer> iterator = numbers.stream().iterator();
		while( iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		Spliterator<Integer> spliterator = numbers.stream().spliterator();
		while(spliterator.tryAdvance(n->{
			System.out.println("N "+n);
		}));
	}
}
