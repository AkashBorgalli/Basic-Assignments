package com.training.testassignment;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.basicassignments.SearchElement;

public class testSearchOfElement {

	@Test
	public void test() {
		int arr[] = {5, 12, 14, 6, 8, 78, 19,1,23,26,35,37,7,52,86,47};
		 int result =	SearchElement.searchingTheElement(arr,1);
		 assertEquals(7, result);
	}   
	@Test
	public void test1() {
		int arr[] = {5, 12, 14, 6, 8, 78, 19,1,23,26,35,37,7,52,86,47};
		 int result =	SearchElement.searchingTheElement(arr,24);
		 assertEquals(-1, result);
	}   

}
