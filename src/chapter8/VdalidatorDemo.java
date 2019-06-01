package chapter8;

abstract class Validator
{
	abstract boolean validate(String data);
	
}
class EmailValidator extends Validator
{
	boolean validate(String data)
	{
		System.out.println("Email validator");
		return true;
	}
	
}
class PhoneValidator extends Validator
{
	boolean validate(String data)
	{
		System.out.println("Phone validator");
		return true;
	}
}
public class VdalidatorDemo {

	public static void main(String[]args)
	{
		Validator [] validator = new Validator[2];
		validator[0] = new EmailValidator();
		validator[1] = new PhoneValidator();
		
		for(Validator v : validator)
		{
			v.validate("data");
		}
	}
}
