package com.subis.day4;
import java.io.*;

public class ReaderWriterDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//try with resource
		try(FileReader t = new FileReader("D:\\io.txt");
		BufferedReader f =new BufferedReader(t);
		FileWriter t1=new FileWriter("D:\\iori.txt");
		BufferedWriter f1 = new BufferedWriter(t1)){ 
		String i=null;
		while((i=f.readLine())!=null){
			System.out.print(i);
			f1.write(i);
			
		}
		}
		catch(IOException e){
			System.out.println(e);
		}
		
		

	}

}
