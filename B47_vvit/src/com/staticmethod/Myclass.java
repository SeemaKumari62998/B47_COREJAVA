package com.staticmethod;

public class Myclass {
	private int section;//instance variable
	private static int srNo;//static variable
	
	static{//static block
		System.out.println("inside static  block");
		srNo = 100;
	}
	Myclass(){//default constructor
	System.out.println("Default constructor");
	srNo++;//non static method or constructor can access static variables
	section++;

}
	static void display() {
		System.out.println("serial number"+srNo);
		
		
	}
}
