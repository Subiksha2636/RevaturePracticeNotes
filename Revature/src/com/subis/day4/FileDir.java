package com.subis.day4;
import java.io.*;


public class FileDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "D:\\C AND C++";
		File f = new File(str);
		System.out.println("Dirctort "+str);
		if(f.isDirectory()){
			String s[] = f.list();
			
			for(int i=0;i<s.length;i++){
				
			
			File f1 = new File(str);
			if(f1.isDirectory()){
				System.out.println(s[i] +" Directory ");
				
			}
			else{
				System.out.println(s[i] +" File");
			}
			}
			
			
		}
		else{
			System.out.println( str+ "is not Directory");
		}
		
		

	}

}
