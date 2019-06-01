package chapter9;

import java.util.ArrayList;
import java.util.List;

interface MessageCallback
{
	void messageArrived(String msg);
}
class Messenger
{
	List<MessageCallback> users = new ArrayList<MessageCallback>();
	
	public void registerChatroom(MessageCallback callback)
	{
		this.users.add(callback);
	}
	public void newMessage(String msg)
	{
		for(MessageCallback user : this.users)
		{
			user.messageArrived(msg);
		}
	}
}
class User implements MessageCallback
{
	String name;

	User(String name)
	{
		this.name = name;
	}
	
	@Override
	public void messageArrived(String msg) {
		System.out.println("Name "+this.name +" "+msg);
		
	}
	
}
public class MessengerDemo {

	public static void main(String[]args)
	{
		Messenger messenger = new Messenger();
		User user1 = new User("user1");
		User user2 = new User("user2");
		User user3 = new User("user3");
		
		messenger.registerChatroom(user1);
		messenger.registerChatroom(user2);
		messenger.registerChatroom(user3);
		
		messenger.newMessage("Hello");
		messenger.newMessage("How are you");
	}
	
}
