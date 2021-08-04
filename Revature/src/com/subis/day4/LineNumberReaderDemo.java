package com.subis.day4;
import java.io.*;

public class LineNumberReaderDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileReader f1 = null;
		LineNumberReader l1 =null;
		try{
			f1 = new FileReader("D:\\Subi.txt");
			l1 = new LineNumberReader(f1);
			String line =null;
			while((line=l1.readLine())!=null){
				System.out.println("line:  " + l1.getLineNumber() + ": " + line);
			}
		}
		finally{
			//l1.close();
			f1.close();
			l1.close();
		}
		

	}

}

