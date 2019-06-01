package chapter9;

interface Callback
{
	void callback();
}
class BookStore 
{
	Callback buyer;
	void notifyMeWhenBookArrive(Callback callback)
	{
		this.buyer = callback;
	}
	void bookArrive()
	{
		System.out.println("Book Arrive");
		this.buyer.callback();
	}
}
class Buyer implements Callback
{

	@Override
	public void callback() {
		System.out.println("Book arrived");
	}
}
public class CallbackDemo {

	public static void main(String[]args)
	{
		BookStore bookStore = new BookStore();
		Buyer buyer = new Buyer();
		
		bookStore.notifyMeWhenBookArrive(buyer);
		bookStore.bookArrive();
	}
}
