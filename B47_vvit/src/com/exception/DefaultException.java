package com.exception;

public class DefaultException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		try {
			str.length();
		}
		catch(NullPointerException e) {
			System.out.println(e);
			
		}
	}

}
