package com.subis.revature;
import java.util.*;
//import java.lang.*;

//abstract class
abstract class Ab{
	abstract void name();
	abstract void address();
	abstract void education();
	
}
class Tcs extends Ab{
	
	void name(){
		System.out.println("Its name");
		
	}
	void address(){
		System.out.println("its address");
		
	}
	void education(){
		System.out.println(" its Education");
		
	}
	void CV(){
		System.out.println("Its Cv");
		
	}
	
}
class Infosys extends Ab{
	void name(){
		System.out.println("Subi");
		
	}
	void address(){
		System.out.println("vellore");
	}
	void education(){
		System.out.println("B.tech");
		
	}
	
}


public class FirstDay {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ab n = new Ab();
		//n.name();
		Tcs n1 = new Tcs();
		n1.name();
		n1.address();
		n1.education();
		n1.CV();
		System.out.println(" ");
		
		Infosys n3 = new Infosys();
		n3.name();
		n3.address();
		n3.education();

	}

}
