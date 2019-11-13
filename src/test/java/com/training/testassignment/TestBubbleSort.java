package com.training.testassignment;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.basicassignments.BubbleSort;

public class TestBubbleSort {

	@Test
	public void test() {
		int arr[] = {5, 12, 14, 6, 8, 78, 19,1,23,26,35,37,7,52,86,47};
	    int[] result=BubbleSort.sort(arr);
	    assertEquals(arr, result);
		
	}

}
