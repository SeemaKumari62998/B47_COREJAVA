package com.tnsif;

public class Executor {

	public static void main(String[] args) {
		Car ob=new Car ();//creation of object
		ob.backword();//calling the member function of the car
		ob.forword();
		ob.stop();
		
		System.out.println("reg is"+" "+ob.reg);
		System.out.println("reg is:"+" "+ ob.colors);
	}
		
}
