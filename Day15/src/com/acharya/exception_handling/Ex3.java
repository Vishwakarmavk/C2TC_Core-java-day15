package com.acharya.exception_handling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Ex3 {

	public static void main(String[] args)  {
		FileInputStream fis = null;
		
        try {
			fis = new FileInputStream("E:\\MINI PROJECT");
		} 
        catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
        int k;
        try {
			while((k=fis.read()) !=-1)
			{
				System.out.println((char)k);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
        try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
/*Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Unhandled exception type FileNotFoundException
	Unhandled exception type IOException
	Unhandled exception type IOException

	at com.acharya.exception_handling.Ex3.main(Ex3.java:9)
*/
