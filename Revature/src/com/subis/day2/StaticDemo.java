package com.subis.day2;
class Vechile{
	static Integer i=2;
	static String name ="subi";
	Double d;
	
	Vechile(){
		System.out.println("Super class");
		
	}
	
	Vechile(Double d){
		this.d=d;
	}
	static void show(){
		System.out.println("Welcome static");
	}
	void disp(){
		System.out.println(i +" "+ name +" "+ d);
	}
	
	public void getValue(Double d){
		//this.i=i;
		//this.name=name;
		this.d=d;
	}
	@Override
	public String toString() {
		return "Vechile [d=" + d + "]";
	}
	class Car extends Vechile{
		Car(){
			
		}
		
		void disp(){
			System.out.println(Vechile.i+ " "+Vechile.name);
			System.out.println(d);
			
		}
	}
	
}

public class StaticDemo {
	static void getvalue(){
		System.out.println("Static subclass");
	}

	public static void main(String[] args) {
		Vechile v = new Vechile();
		v.getValue(80.00);
		System.out.println(v);
		
		Vechile v1 =new Vechile(60.00);
		//Vechile.i=7;
		//Vechile.name="vigi";
		v1.disp();
		
		//static method
		Vechile.show();//other class
		getvalue();//same class
		
		Vechile b2 = new Vechile();
		Vechile.i=9;
		Vechile.name ="vhu";
		b2.disp();
		
		
		
		
		
	}

}
