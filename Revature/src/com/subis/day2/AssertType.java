package com.subis.day2;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


 
public class AssertType {
	String s1 = "Hello";
	String s2 = "Hello";
	String s3 ="subi";
	String s4 = "subi";
	String s5 =  null;
	
	
	int t=0;
	int t1=0;
	int t2=9;
	int t4=9;
	int t5=6;
	
	int[] arr ={1,2,3,4};
	int[] arr2 ={1,2,3,4};
	

	@Test
	public void test() {
		assertEquals(s1,s2);
		assertNotEquals(s3,s2);
		
	}
	@Test
	public void test1(){
		assertTrue(t==t1);
		assertFalse(t1==t5);
	}
	@Test
	public void test2(){
		assertSame(s1,s2);
		assertNotSame(s2,s4);
		
	}
	@Test
	public void test3(){
		//assertNull(t1);
		assertNotNull(t2);
		assertNotNull(s2);
		assertNotNull(t1);
		assertNull(s5);
		
	}
	@Test
	public void test4(){
		assertArrayEquals(arr,arr2);
		
	}

	




}
