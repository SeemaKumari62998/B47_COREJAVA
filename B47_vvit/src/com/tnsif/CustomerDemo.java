package com.tnsif;

import java.util.Scanner;
public class CustomerDemo {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String name,city;
//		int id;
//		System.out.println("Enter customer name");
//		name=sc.nextLine();
//		System.out.println("Enter customer city");
//		city=sc.nextLine();
//		System.out.println("Enter Customer id");
//		id=sc.nextInt();
//		
		
		Customer ob=new Customer();
		ob.setCustomerName("Seema Kumari");
		ob.setCustomerCity("Bangalore");
		ob.setCustomerId(26);
		System.out.println(ob.getCustomerName()+" "+ob.getCustomerCity()+" "+ob.getCustomerId());
   }

}
