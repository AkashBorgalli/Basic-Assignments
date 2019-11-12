package com.training.testassignment;

import static org.junit.Assert.*;
import org.junit.Test;

import com.training.basicassignments.SquareOfNumber;




public class SquareOfNumberTest {

	@Test
	public void squareOfDigit(){
		int result=SquareOfNumber.getSquare(5);
		assertEquals(25, result);
		
	}
	@Test
	public void squareOfDigit2(){
		int result=SquareOfNumber.getSquare(-5);
		assertEquals(25, result);
		
	}
	
	
}
