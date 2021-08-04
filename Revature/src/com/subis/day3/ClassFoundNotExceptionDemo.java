package com.subis.day3;
import java.io.*;

class Demo {
	public void show()throws InterruptedException,FileNotFoundException,ClassNotFoundException
	{
		System.out.println("Super class");
	}
}
class X extends ClassFoundNotExceptionDemo{
	public void show()throws ClassNotFoundException
	
	{//throws InterruptedException,FileNotFoundException{
		System.out.println("Sub2 class");
	}
}


public class ClassFoundNotExceptionDemo extends Demo 
{
	
	public void show()throws InterruptedException,FileNotFoundException,ClassNotFoundException
	{
		Thread.sleep(1000);
		System.out.println("Sub Class");
		FileReader f  =new FileReader("D://fr.tsxt");
		System.out.println(f.getEncoding());
		
		
	}

	public static void main(String[] args)throws InterruptedException,FileNotFoundException,ClassNotFoundException
	 {
		// TODO Auto-generated method stub
		ClassFoundNotExceptionDemo n =new ClassFoundNotExceptionDemo();
		n.show();

	}

}
