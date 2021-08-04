package com.subis.day2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitClass {
	TestUnit t ;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		t = new TestUnit();//initization
	}

	@After
	public void tearDown() throws Exception {
		t=null;//destroy
	}

	@Test
	public void test() {
		assertEquals(4,t.sum(2, 2));
		assertNotEquals(5,t.sum(3,5));
		
	}
	@Test
	public void test2() {
		assertEquals(10,t.loan(1000));
		assertNotEquals(5,t.sum(3,5));
		
	}

}
