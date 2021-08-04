package com.subis.day2;

interface Vechile1{
	void light();
	void speed();
	void millage();
	
}
interface Color{
	void color();
	
}
class Bike implements Vechile1,Color{
	public void color(){
		System.out.println("red");
	}
	public void light(){
		System.out.println("light2");
	}
	public void speed(){
		System.out.println("speed2");
		
	}
	public void millage(){
		System.out.println("millage2");
		
	}
}

class Car implements Vechile1{
	public void light(){
		System.out.println("lidgt");
	}
	public void speed(){
		System.out.println("speed");
		
	}
	public void millage(){
		System.out.println("millage");
		
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car k = new Car();
		Bike k1 =new Bike();
		k.light();
		k.millage();
		k.speed();
		k1.color();
		k1.light();
		k1.millage();
		k1.speed();
			
		

	}

}
