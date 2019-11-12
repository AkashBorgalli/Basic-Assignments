package com.training.testassignment;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.training.basicassignments.RangeOfArmStrongNumbers;

public class TestRangeOfArmStrongNumbers {

	@Test
	public void testRange() {
	List<Integer> result =  RangeOfArmStrongNumbers.rangeOfArmStrong(100,999);
	List<Integer> list2 = new ArrayList<Integer>(4);
	list2.add(153);
	list2.add(370);
	list2.add(371);
	list2.add(407);
	 
	 assertEquals(list2, result);
	 
	  
	}

}
