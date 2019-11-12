package com.training.testassignment;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.basicassignments.ArmstrongNumber;

public class ArmstrongTest {

	@Test
	public void testArmstrong() {
		int result = ArmstrongNumber.ArmStrongOfNumber(153);
		assertEquals(153, result);
	}
		
}
