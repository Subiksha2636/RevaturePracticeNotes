package com.subis.day2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sumtest {
	TestUnit a3 ;
	@Test//test logic
	public void test() {
		//fail("Not yet implemented");
		a3 =new TestUnit();
		//10 except output
		//assert used evaluvate the values
		assertEquals(10,a3.sum(5, 5));
		
		assertEquals(18,a3.product(1, 10));
		
	}
	@Test
	public void test1(){
		a3 = new TestUnit();
		assertEquals(10,a3.product(5, 2));
		}
	@Test
	public void test2(){
		a3 = new TestUnit();
		assertEquals("subi",a3.name("subi"));
	
	}

}
