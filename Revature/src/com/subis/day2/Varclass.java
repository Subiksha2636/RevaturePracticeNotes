package com.subis.day2;

public class Varclass {
	
	static void var(int...a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Varclass v = new Varclass();
		var(2,5,6,7);
		var(4,7,3,4,2,7,2);
		var(6,7,5,4);
		
	}

}
