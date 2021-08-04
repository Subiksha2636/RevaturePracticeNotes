package com.subis.day5;

public class DesetMain {
	
	public static Desert DesertValue(String Desert){
		switch(Desert){
		case "cake": 
			return new Cake();
		case "icecream":
			return new IceCream();
		case "cookie":
			return new Cookie();
		default :
			throw new  DesertNotFound(Desert + " not found!");
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desert d = DesetMain.DesertValue("cake");
		Desert d1= DesetMain.DesertValue("icecream");
		Desert d2 =DesetMain.DesertValue("cookie");
		
		System.out.println(d+" "+d1+ "  "+d2);
		//defalut
		Desert d3 = DesetMain.DesertValue("bread");
		System.out.println(d3);
		
		
	}

}
