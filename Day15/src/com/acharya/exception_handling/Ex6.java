package com.acharya.exception_handling;

public class Ex6 {

	public static void main(String[] args) {
		try {
			int[] arr= new int[] {1,2,3};
			System.out.println(arr[6]);
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
