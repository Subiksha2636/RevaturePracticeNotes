package com.subis.day3;
import java.lang.*;

public class ExceptionDemo
{

	public static void main(String[] args) 
		{
		//int i=8;
		try{
			int i=8;
			int j=0;
			int c =i/j;
			System.out.println("Print the value "+ c);
		}
		catch(Exception ae){
			//System.out.println("hello "+ae);
			//System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
		System.out.println("finally");
	}

}
