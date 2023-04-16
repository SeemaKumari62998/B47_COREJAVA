package com.syncronisation;

public class Example_Demo {

	    public static void main(String[] args) {
	        Ticket_example obj = new Ticket_example();
	        Thread t1 = new Thread1(obj);
	        Thread t2 = new Thread2(obj);
	        t1.start();
	        t2.start();
	    }
	}
	


