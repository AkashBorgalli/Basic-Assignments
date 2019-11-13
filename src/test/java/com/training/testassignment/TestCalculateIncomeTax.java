package com.training.testassignment;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.basicassignments.CalculateIncomeTax;

public class TestCalculateIncomeTax {

	@Test
	public void testIncomeTax() {
		float result = CalculateIncomeTax.taxCalculator(10000);
		assertEquals(0,result,0.0);
	}
	@Test
	public void testIncomeTax1() {
		float result = CalculateIncomeTax.taxCalculator(181001);
		assertEquals(13100.099609375,result,0.0);
	}
	@Test
	public void testIncomeTax2() {
		float result = CalculateIncomeTax.taxCalculator(300001);
		assertEquals(45000.19921875,result,0.0);
		
	}
	@Test
	public void testIncomeTax3() {
		float result = CalculateIncomeTax.taxCalculator(500001);
		assertEquals(110000.296875,result,0.0);
		
	}
	

}
