package com.tnsif;

public class Customer {
	private String CustomerName;
	private String CustomerCity;
	private int CustomerId;
	//default constructor
	Customer() {
	
	}
	//parameterized constructor
	Customer(String CustomerName,String CustomerCity,int CustomerId){
		this.CustomerName=CustomerName;
		this.CustomerCity=CustomerCity;
		this.CustomerId=CustomerId;
	}
	
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerCity() {
		return CustomerCity;
	}
	public void setCustomerCity(String customerCity) {
		CustomerCity = customerCity;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	

}
 