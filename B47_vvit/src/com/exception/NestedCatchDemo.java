package com.exception;
//program to demonstrate nested catch
public class NestedCatchDemo {
	int arr[]=new int[5];//Declare an arry
	void nestedCatch() {
		try {
			arr[3]=20/2;//Arithemetic exception occured
			arr[4]=5;//arry outof bound exception
			System.out.println("try block");
			
		}
		catch(ArithmeticException a) {
			System.out.println("number cannot be divided by zero"+a);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Accessing array element outside specific"+e);
		}
		catch(Exception e) {
			System.out.println("No exception match");
		}
	}

}
