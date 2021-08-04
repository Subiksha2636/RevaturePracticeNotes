package com.subis.day3;
import java.util.*;

class Example extends Exception
{
	Example(String msg){
		super(msg);
	}
	
}
public class CustemExceptionDemo  {

	public static void main(String[] args)throws Example {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n<1000){
			throw new Example("Custem Exception");
		}
		else{
			System.out.println("Normal Excution");
		}
	}

}
