package chapter12;
enum Size
{
		Small,Medium, Large;
}
enum Coffee
{
	Espresso(10), Lattie(20), Mocha(30), Cappichino(50);
	
	int price;
	
	Coffee(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return this.price;
	}
}
enum Gender
{
	Male, Female;
}
public class EnumDemo {

	public static void main(String[]args)
	{
		Gender gen = Gender.Male;
		
		if(gen == Gender.Male)
		{
			System.out.println("He is a man");
		}
		else
		{
			System.out.println("He is a woman");
		}
		System.out.println(gen);
		
		Coffee[] coffee  = Coffee.values();
		for(Coffee cof : coffee)
		{
			System.out.println(cof +" Price "+ cof.getPrice());
		}
		Coffee mocha = Coffee.valueOf("Mocha");
		System.out.println(mocha);
		
		Size smallSize = Size.Small;
		Size largeSize = Size.Large;
		
		System.out.println("Compare small and large "+ smallSize.compareTo(largeSize));
	}
}
