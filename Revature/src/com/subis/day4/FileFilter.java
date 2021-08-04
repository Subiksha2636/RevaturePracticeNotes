package com.subis.day4;
import java.io.*;

class Get implements FilenameFilter{
	String msg;
	public Get(String msg){
		this.msg="."+msg;
		
	}
	public boolean accept(File dir, String name)
	{
		return name.endsWith(msg); 
	}
	
}

public class FileFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "D:\\C AND C++";
		File f = new File(str);
		FilenameFilter f1 = new Get("sort");
		
		String s[] =f.list(f1);
		
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
		

	}

}
