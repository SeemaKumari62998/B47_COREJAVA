package com.syncronisation;

public class Sender extends Thread {
	public void sendMessage(String message)
	{
	System.out.println("\nSending"  + message);
	
	try
	{
		Thread.sleep(1000);
	}
	catch(Exception e)
	{
		System.out.println("Thread interrupted.");
	}
	System.out.println("\n" + message+ "sent");

    }
}
