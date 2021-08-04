package com.subis.day4;
import java.io.*;

public class InoutFile {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileInputStream t = new FileInputStream("D:\\io.txt"); 
		FileOutputStream t1 = new FileOutputStream("D:\\iosi.txt");
		int i;
		while((i=t.read())!=-1)//-1 end of process
		{
			System.out.print((char)i);
			t1.write((char)i);
			
		}
		t.close();
		t1.close();
			

	}

}
