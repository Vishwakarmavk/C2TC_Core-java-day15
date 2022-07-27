package com.acharya.exception_handling;

public class Ex4 {

	public static void main(String[] args) {
		int x=100,y=0;
		try {
			int z=x/y;
		}
		catch (ArithmeticException e){
			System.out.println(e);
		}

	}

}
