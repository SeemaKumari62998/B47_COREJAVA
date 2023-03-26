package com.c2ts;

public class Acessclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Base();
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		//b.methodPrivate();//private method cannot be access in other class
		

	}

}
