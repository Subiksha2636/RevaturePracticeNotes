package com.subis.day4;
import java.io.*;

public class DeserilizationDemo {

	public static void main(String[] args)throws IOException,ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("D:\\io1.txt");
		ObjectInputStream od = new ObjectInputStream(f);
		Poject p = (Poject)od.readObject();
		
		System.out.println("Deserization");
		System.out.println(p.i+" "+p.name+" "+p.cost);
		f.close();
		od.close();
		
		

	}

}
