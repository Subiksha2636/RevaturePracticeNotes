package com.subis.day2;
//import java.lang.*;

public class StringAll {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String - immuable
		
		String str = "Hello World";
		String str2= new String("Welcome Subi");
		//funcation of string
		System.out.println(str.length());
		System.out.println(str.replace("H","W"));
		System.out.println(str.substring(2,5));
		System.out.println(str.startsWith("H"));//return boolean
		System.out.println(str.concat("  Subiksha"));
		System.out.println(str.indexOf("W"));
		System.out.println(str2.endsWith("r"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.contains("H"));//in operator
		
		//StringBuffer - synrozined ,slow , mutable
		StringBuffer str3 = new StringBuffer("Welcome To The World");
		System.out.println(str3.insert(7  ," Subi"));
		System.out.println(str3.length());
		System.out.println(str3.delete(7, 12));
		System.out.println(str3.length());
		System.out.println(str3.append(34545));
		System.out.println(str3.reverse());
		System.out.println(str3);
		System.out.println(str3.capacity());//unpreditiable
		str3.ensureCapacity(100);
		System.out.println(str3.capacity());
		
		//StringBuiler
		StringBuilder str4 = new StringBuilder("Welcome subi cute");
		System.out.println(str4.insert(7  ," Subi"));
		System.out.println(str4.length());
		System.out.println(str4.delete(7, 12));
		System.out.println(str4.length());
		System.out.println(str4.append(34545));
		System.out.println(str4.reverse());
		System.out.println(str4);
		System.out.println(str4.capacity());//unpreditiable
		str4.ensureCapacity(100);
		System.out.println(str4.capacity());
		
		
		
		String s = str3.toString();//stringbuffer to string
		String s1 = str4.toString();//stringbuilder to string
		System.out.println(s);
		System.out.println(s1);
		
		
		//equal
		System.out.println(s==s1);//address equal
		System.out.println(s.equals(s1));//value also compare equal
		
		
		
		
		
		
		

	}

	
}
