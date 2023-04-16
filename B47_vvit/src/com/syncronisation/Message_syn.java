package com.syncronisation;

public class Message_syn extends Thread {
	private String message;
	Sender sender;
	
	//Receives a message object and send a string message
	Message_syn(String message, Sender object)
	{
		message= message;
		sender= object;
	}
	public void run() 
	{	
		//sync block
		//this will ensure that only one thread sends message at a tm
	synchronized(sender)
	{
		sender.sendMessage(message);
	}
	

}
}
