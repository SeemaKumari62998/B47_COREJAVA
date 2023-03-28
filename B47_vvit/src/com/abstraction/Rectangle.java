package com.abstraction;

public class Rectangle extends Shape {
	float length,width;
	 Rectangle() {
	this.length=0.98f;
	this.width=0.88f;
	}
	Rectangle (float length,float width) {
	this.length=length;
	this.width=width;
	}
	@Override
	void CalArea() {
		// TODO Auto-generated method stub
		area=length*width;
	}
	
	

}
