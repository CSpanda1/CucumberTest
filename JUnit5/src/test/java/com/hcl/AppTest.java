package com.hcl;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AppTest {
	
	@BeforeAll
	static void setUp() {
		System.out.println("@BeforeAll is executed");
	}
	
	@BeforeEach
	public void setUpThis() {
		System.out.println("@BeforeEach is executed");
	}
	
	@AfterAll
	static void tearDown() {
		System.out.println("@AfterAll is executed");
	}
	
	@AfterEach
	public void tearDownThis() {
		System.out.println("@AfterEach is executed");
	}
	
    @Test
	public void calculateTest1() {
    	System.out.println("Calling from Test1");
    	
		Calculate c = new Calculate();
		
		System.out.println("assertEquals = 26");
		assertEquals(26,c.add(12,14));
		
		System.out.println("assertNotEquals = 25");
		assertNotEquals(25,c.add(12,14));
	}
    
    @Test
	public void calculateTest2() {
    	System.out.println("Calling from Test2");
    	
		Calculate c = new Calculate();
		
		System.out.println("assertEquals = 26");
		assertEquals(26,c.add(12,14));
		
		System.out.println("assertNotEquals = 25");
		assertNotEquals(25,c.add(12,14));
	}
    
    @Test
    @Disabled
	public void calculateTest3() {
    	System.out.println("Calling from Test3");
    	
		Calculate c = new Calculate();
		
		System.out.println("assertEquals = 26");
		assertEquals(26,c.add(12,14));
		
		System.out.println("assertNotEquals = 25");
		assertNotEquals(25,c.add(12,14));
	}
    
    @Test
	public void calculateTest4() {
    	System.out.println("Calling from Test4");
    	
    	String st1="abc";
    	String st2="def";
    	String st3="xyz";
    	assertAll("numbers",()->assertEquals(st1,"abc"),()->assertEquals(st2,"def"),()->assertEquals(st3,"xyz"));
	}
	
}