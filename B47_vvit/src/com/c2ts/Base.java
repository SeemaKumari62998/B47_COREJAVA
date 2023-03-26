package com.c2ts;

public class Base {
	//declaring access specifier for the variables
	
	 int varDefault=10;//default access specifier
	 private int varPrivate=20;
	 public int varPublic=380;
	 protected int varProtected=28;
	 
	 //access specifier foe methods
	 void methodDefault() {
		  System.out.println("default access base class");
	   	  System.out.println("Default variable"+varDefault);
	 }
		 
	 private void methodPrivate() {
		     System.out.println("private access base class");
			 System.out.println("Private variable"+varPrivate);
	 }
			 
	 public void methodPublic() {
			 System.out.println("Public access base class");
			 System.out.println("public variable"+varPublic);
	 }
				 
	 protected void methodProtected() {
			System.out.println("Protected access base class");
			 System.out.println("Protected variable"+varProtected);
	 }
	 

}
