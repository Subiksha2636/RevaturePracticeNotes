package com.subis.day4;
import java.io.*;
class Poject implements Serializable{
	int i;
	String name;
	Double cost;
	@Override
	public String toString() {
		return "Poject [i=" + i + ", name=" + name + ", cost=" + cost + "]";
	}
	public Poject(int i, String name, Double cost) {
		super();
		this.i = i;
		this.name = name;
		this.cost = cost;
	}
	
}

public class Serialization {

	public static void main(String[] args) throws IOException{
		try{
		Poject p = new Poject(1,"java",90.00);
		System.out.println(p);
		
		//serilization
		FileOutputStream ff = new FileOutputStream("D:\\io1.txt");
		
		ObjectOutputStream a = new ObjectOutputStream(ff);
		a.writeObject(p);
		
				
		
		System.out.println("Successfully");
		ff.close();
		a.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
		
		
		
		
		
		

	}

}
