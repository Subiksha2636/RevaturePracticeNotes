package com.subis.day2;

 class Final{
	//constant
	final Double i= 3.24;
	final void Display(){
		System.out.println(i);
	}
	
	
}

public class FinalDemo extends Final{

	void Display(){
		System.out.println("subi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final f = new Final();
		//f.i=3.24;
		
		f.Display();

	}

}
