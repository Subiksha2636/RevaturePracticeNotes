package com.subis.day3;
//import java.lang.ArrayIndexOutOfBoundsException;
//import java.lang.ArithmeticException;
import java.io.*;
import java.io.FileNotFoundException;


public class MultipleCatch  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			int i=8;
			int j=2;
			int c=i/j;
			System.out.println("Error "+c);
			int[] arr={1,2,3};
			System.out.println(arr[2]);
			String s =null;
			System.out.println("String length "+ s.length());
			try{
				FileReader f = new FileReader("D:\\fad.txt");
				
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}
		catch (NullPointerException e)
		{
			System.out.println(e.getStackTrace());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			System.out.println(e.hashCode());
			System.out.println(e.fillInStackTrace());
			System.out.println(e.getCause());
			System.out.println(e.toString());
		}
		
		catch(ArithmeticException a){
			System.out.println(a.getMessage());
		}
		
		
		catch(ArrayIndexOutOfBoundsException e){
			//System.out.println(e.getMessage());
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Close to the file");
		}
	}

}
