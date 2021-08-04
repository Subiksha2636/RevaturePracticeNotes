package com.subis.day5;
class Singleton{
	private static Singleton s = new Singleton();//early singleton 
	private Singleton(){
		
	}
	static Singleton getInstance(){
		if(s==null){
			//s= new Singleton(); //lazy singleton
		}
		return s;
	}
	
	
}

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1+  "  "+s2);
	}

}
