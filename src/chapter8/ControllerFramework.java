package chapter8;

abstract class Controller{
	private void processRequest()
	{
		System.out.println("Process request");
	}
	abstract public void businessLogic();
	
	private void processResponse()
	{
		System.out.println("Process response");
	}
	final public void process()
	{
		this.processRequest();
		this.businessLogic();
		this.processResponse();
	}
}

class LoginController extends Controller
{
	
	public void businessLogic()
	{
		System.out.println("Login Business Logic");
	}
	
}
class SaleController extends Controller
{
	public void businessLogic()
	{
		System.out.println("Sale Business Logic");
	}
}
public class ControllerFramework {
	public static void main(String[]args)
	{
		Controller con = new LoginController();
		con.process();
		
		con = new SaleController();
		con.process();
	}

}
