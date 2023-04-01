package com.exception;

public class NormalException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8,b;
		try {
			b=a/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
;        int c[]=new int[6];
         try {
        	 c[7]=25;
         }
         catch(ArrayIndexOutOfBoundsException ai) {
        	 System.out.println(ai);
         }
         
	}

}
