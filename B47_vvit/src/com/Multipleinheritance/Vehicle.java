package com.Multipleinheritance;

public class Vehicle implements Vehicleone,Vehicletwo {

	@Override
	public void Speed() {
		// TODO Auto-generated method stub
		int speed = Distance/100;
		System.out.println("speed travelled"+" "+speed);
		
		
		
	}

	@Override
	public void distance() {
		// TODO Auto-generated method stub
		int Distance = speed*100;
		System.out.println("Distance travelled"+" "+Distance);
		
	}
	
	

	}
