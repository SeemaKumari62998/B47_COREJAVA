package com.staticprogram;

public class Staticmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob1 = new Employee();
		System.out.println(Employee.companyName);
		Employee ob2 = new Employee("Seema",1);
		System.out.println(ob2);
		
		
		Employee ob=new Employee();
		System.out.println(Employee.companyName);
		ob2=new Employee("sums",45);
	    System.out.println(ob2);
	    
	   Employee ob4 = new Employee();
	    System.out.println(Employee.companyName);
	    Employee ob3=new Employee("priya",23);
	    System.out.println(ob3);
		

	}

}
