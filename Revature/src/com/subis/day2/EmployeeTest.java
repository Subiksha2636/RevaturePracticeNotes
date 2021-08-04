package com.subis.day2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeTest {

	Employee e;
	Employee2 e2;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		e=new Employee();
		e2=new Employee2();
	}

	@After
	public void tearDown() throws Exception {
		e=null;
		e2=null;
	}

	@Test
	public void test() {
		assertEquals(100,100,e2.Bouns(e));
	}
	@Test
	public void test1() {
		assertEquals(5000,e2.Apprisal(e));
		
	}

}
