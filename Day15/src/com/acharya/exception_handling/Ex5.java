package com.acharya.exception_handling;

public class Ex5 {

	public static void main(String[] args) {
		System.out.println("Frist Line");
		System.out.println("Second Line");
		try {
			int[] i= new int[]{1,2,3};
			print(i);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("The array Doesn't have Forth element");
			
		}
		System.out.println("Third Line");
	}

		public static void print(int[] arr ) {
			System.out.println(arr[3]);
		}
}
		
		

	