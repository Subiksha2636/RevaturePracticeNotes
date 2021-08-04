package com.subis.day3;
import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		
		//ArrayList
		List f =new ArrayList();
		f.add(3);
		f.add(4);
		f.add(5);
		f.add(7);
		f.add(8);
		f.add(9);
		f.add(4);
		System.out.println(f);
		
		//set
		Set<Integer> s =new HashSet<Integer>();
		s.add(3);
		s.add(4);
		s.add(3);
		s.add(4);
		System.out.println(s);
		
		//remove - Arraylist
		f.remove(1);//index position value
		System.out.println(f);
		
		//sublist - pathi  -arraylist
		List f1 = f.subList(1, 4);//0 to n-1 //sublist 
		System.out.println(f1);
		
		//LinkedList 
		List l1 = new LinkedList<>();
		l1.add(1);
		l1.add("subi");
		l1.add(45.00);
		System.out.println(l1);
		
		List<Integer> l2 = new LinkedList<>();
		l2.add(9);
		l2.add(3);
		l2.add(6);
		l2.add(9);
		System.out.println("add value "+l2);
		l2.remove(1);//index pos
		System.out.println("delete value "+l2);
		l2.add(2, 4);//index pos , add vlaue
		l2.add(0,1);
		l2.add(5,2);
		System.out.println("middle value add "+l2);
		//size of linkedlist
		System.out.println(l2.size());
		
	}

}
