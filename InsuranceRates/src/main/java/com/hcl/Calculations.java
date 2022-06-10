package com.hcl;

import org.junit.Assert;

public class Calculations {
	int totalDiscount = 0;
	String name = "";

	public void customerName(String name) {
		this.name = name;
	}

	public void addDiscount(int discount) {
		totalDiscount += discount;
	}
	
	public void verifyDiscount(int expectedDiscount) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~ Calculating total discount ~~~~~~~~~~~~~~~~~~~~");
		
		try {
			Assert.assertEquals(expectedDiscount, totalDiscount);
		} catch (AssertionError e) {
			System.out.println("CALCULATION ERROR: Calculated discount does not match expected discount");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			throw e;
		}
		
		System.out.println("Calculated discount matches expected discount");
	}
	
	public void getFinalDetails() {
		System.out.println("Customer " + name + " received a " + totalDiscount + "% discount");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}
