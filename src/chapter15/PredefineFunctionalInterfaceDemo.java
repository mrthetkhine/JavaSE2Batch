package chapter15;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class PredefineFunctionalInterfaceDemo {
	public static void main(String[]args)
	{
		UnaryOperator<Integer> intOp = (n)->n*n;
		System.out.println(intOp.apply(30));
		
		BinaryOperator<Double> addOp = (a,b)->a+b;
		
		System.out.println(addOp.apply(10.0, 20.0));
	}
}
