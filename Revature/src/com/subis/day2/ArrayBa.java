package com.subis.day2;
//import java.io.*;
import java.util.*;
//import java.util.List;
//import java.io.*;

public class ArrayBa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Arr = {2,8,4,9,1};
		//for 
		/*for(int i=0;i<=Arr.length;i++){
			System.out.println(Arr[i]);
		}*/
		
	
		//foreach
		for(int i:Arr){
			System.out.println(i+" ");
			
			
		}
		//sort
		Arrays.sort(Arr);
		for(int i : Arr)
		{
		
			System.out.print(i+" ");
		}
		System.out.println();
		
		//binarySearch
		int i= Arrays.binarySearch(Arr,9);//position value should printed
		System.out.print(i);
		System.out.println();
	
		
		//copy Array = source to destination
		int s[] =new int[5];
		System.arraycopy(Arr, 2, s, 0, 3);
		for(int x:Arr){
			System.out.print(x +" ");
		}
		System.out.println();
		for(int x:s){
			System.out.print(x+" ");
		}
		
		
		
		

	}

}
