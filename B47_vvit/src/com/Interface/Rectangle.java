package com.Interface;

public class Rectangle implements Shape{
	private float length;
	private float breadth;
	
	public Rectangle (float length,float breadth) {
		this.length=length;
		this.breadth=breadth;
	}

	@Override
	public float calculateArea() {
		// TODO Auto-generated method stub
		float Area=length*breadth;
		return Area;
	}

	@Override
	public float calculatePerimeter() {
		// TODO Auto-generated method stub
		float Perimeter=2*(length*breadth);
		return Perimeter;
	}
	

}
