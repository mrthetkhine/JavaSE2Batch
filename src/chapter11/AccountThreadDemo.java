package chapter11;

class Account
{
	int balance ;
	
	synchronized public void deposit(int amount)
	{
		this.balance += amount;
		System.out.println("Deposit balance "+this.balance);
		notify();
	}
	synchronized public void withdraw(int amount)
	{
		while(amount > this.balance )
		{
			System.out.println("Wait");
			try 
			{
				
				wait();
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Ok wakeup or don't need to wait");
		this.balance -= amount;
		System.out.println("Withdaw balance "+this.balance);
	}
}
class DepositThread extends Thread
{
	Account account ; 
	DepositThread(Account acc)
	{
		this.account = acc;
	}
	public void run()
	{
		for(int i=0;i < 5;i ++)
		{
			this.account.deposit(10);
		}
	}
}
class WithdrawThread extends Thread
{
	Account account ; 
	WithdrawThread(Account acc)
	{
		this.account = acc;
	}
	public void run()
	{
		for(int i=0;i < 5;i ++)
		{
			this.account.withdraw(10);
		}
	}
}
public class AccountThreadDemo {

	public static void main(String[]args)
	{
		Account acc = new Account();
		DepositThread depThread = new DepositThread(acc);
		WithdrawThread withdrawThread = new WithdrawThread(acc);
		
		depThread.start();
		withdrawThread.start();
		
		try {
			depThread.join();
			withdrawThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Final total balance "+ acc.balance);
	}
}
