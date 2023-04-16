package com.syncronisation;

public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender sender=new Sender();
		Message_syn sender1=new Message_syn("hello",sender);
		Message_syn sender2=new Message_syn("welcom",sender);
		sender1.start();
		sender2.start();
		try {
			sender1.join();
			sender2.join();
			
		}
		catch(Exception e) {
			System.out.println("Interrupted");
		}

	}

}
