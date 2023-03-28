package com.abstraction;

//abstract class
public  abstract class Shape {
	protected float area;
	
	//abstract method
	abstract void CalArea();
	//concrete method
	void show() {
		System.out.println("Area of shape:"+area);
	}
	
	

}
