package com.lambda;

public class LambdaWithParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=4;
		Cube c=(int a) -> { return (a*a*a);};
		int res=c.calculate(x);
		System.out.println(res);

	}

}
