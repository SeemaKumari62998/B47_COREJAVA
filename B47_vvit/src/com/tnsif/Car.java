package com.tnsif;
/*
 * program to demonstrate class and object.
 */

public class Car {
	//data members of the class
	int model;
	String colors="red";
	int reg=123;
	int amount=90000;
	//member function for the class
	void forword() {
		System.out.println("Car is moving in forword direction");
	}
	void backword() {
		System.out .println("car is moving in backword direction");
	}
	void stop() {
		System.out.println("Car is not moving");
	}

}
