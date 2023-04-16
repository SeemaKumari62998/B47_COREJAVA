package com.syncronisation;

public class Demosync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Without_syn s=new Without_syn();//sync object
		Thread t1=new Thread(s);//pass the object to thread
		Thread t2=new Thread(s);
		Thread t3=new Thread(s);
		t1.setName("First Thread");
		t2.setName("second Thread");
		t3.setName("third Thread");
		t1.start();
		t2.start();
		t3.start();

	}

}
