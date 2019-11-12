package com.training.testassignment;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.basicassignments.ResultEvaluator;

public class TestResult {

	@Test
	public void testResult() {
		String result = ResultEvaluator.declareResult(60,30,40);
		 assertEquals("Failed", result);
	}
	@Test
	public void testResult1() {
		String result = ResultEvaluator.declareResult(20,30,40);
		 assertEquals("Failed", result);
	}
	@Test
	public void testResult2() {
		String result = ResultEvaluator.declareResult(70,70,40);
		 assertEquals("Promoted", result);
	}
	@Test
	public void testResult3() {
		String result = ResultEvaluator.declareResult(70,80,90);
		 assertEquals("Passed", result);
	}

}
