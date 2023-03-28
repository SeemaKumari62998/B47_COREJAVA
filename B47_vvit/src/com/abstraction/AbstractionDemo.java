package com.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq=new Square();
		Rectangle r= new Rectangle();
		sq.CalArea();
		sq.show();
		r.CalArea();
		r.show();
		//using the concept of function overloading
		Shape s = new Square(8.9f);
		s.CalArea();
		s.show();
		
		s = new Rectangle(8.4f , 9.8f);
		s.CalArea();
		s.show();
	}


}
