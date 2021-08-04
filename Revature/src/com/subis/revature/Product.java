package com.subis.revature;

public class Product {
	//data member or member instance variable
	public int Ram;
	public String Processor;
	public int Storage;
	void Samsung(){
		System.out.println(Ram +"  " +Processor +"   " + Storage);
		
		
	}
	void Nokie(){
		Ram=8;
		Processor="Intel";
		Storage = 32;
		System.out.println(Ram +"  "+ Processor+ "  "+ Storage);
	}
	

	public static void main(String[] args) {
		Product n = new Product();
		n.Ram=4;
		n.Processor="Core";
		n.Storage=64;
		n.Samsung();
		n.Nokie();
		
		Vivo v = new Vivo();
		v.vivo();
		
		
		
		
		
	}

}
