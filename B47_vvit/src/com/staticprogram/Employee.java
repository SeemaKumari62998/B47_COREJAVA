package com.staticprogram;

public class Employee {
	//Declaring instance variable
	private String name;
	//private int id;
	//static int count=0;
	//private int Salary;
	
	//Declaring static variable
	static String companyName="TNS";
	static int id=0;
	
	Employee(){
		id++;
		System.out.println("the id is"+id);
	}
//	{
//		count++;
//		return count;
//	}
	
	Employee (String name, int id ){
		this.name=name; 
		//this.Salary=Salary;
	}
	
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	
	}
}
