package com.subis.day3;
import java.io.*;

public class TryWithResourceDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		try(FileReader f3 = new FileReader("D:\\erer.txt")){
			
		}
		catch(FileNotFoundException e){
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.hashCode());
			System.out.println(e.fillInStackTrace());
			
		}

	}

}
