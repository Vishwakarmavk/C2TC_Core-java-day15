package com.acharya.exception_handling;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("First Line");
		System.out.println("Second Line");
		int[] myintarray = new int[] {1,2,3};
		System.out.println(myintarray.length);
		print(myintarray);
		System.out.println("Third line");
	}
	public static void print(int[] arr) {
		System.out.println(arr [3]);
		System.out.println("Forth element successfully displayed");
	}

}
/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
    Index 3 out of bounds for length 3
	at com.acharya.exception_handling.Ex2.print(Ex2.java:14)
	at com.acharya.exception_handling.Ex2.main(Ex2.java:10)*/
