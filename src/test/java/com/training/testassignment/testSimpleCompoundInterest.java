package com.training.testassignment;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.training.basicassignments.SimpleCompoundInterest;

public class testSimpleCompoundInterest {

	@Test
	public void testSimpleInterest() {
	double result =	SimpleCompoundInterest.simpleInterest(2000,4.5, 6.40);
assertEquals(576.0, result,0.0);
	}
@Test
public void testCompundInterest() {
	
double result =	SimpleCompoundInterest.compoundInterest(2000,4.5, 6.40);
assertEquals(644.0357410616325, result,0.0);
	}

}
