package com.abstraction;

public class Square extends Shape {
	float side;
	public Square() {
		side=0.8f;
	}
	public Square(float side) {
		this.side=side;
	}
	@Override
	void CalArea() {
		// TODO Auto-generated method stub
		area=side*side;
	}
	
	

}
