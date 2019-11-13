package com.training.testassignment;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.basicassignments.CUIApplication;

public class TestCUIApplication {

	@Test
	public void test() {
		String result = CUIApplication.login("Akash", "Capgemini");
		assertEquals("Welcome,Akash", result);
	}

	@Test
	public void testinvaliddetails() {
		String result = CUIApplication.login("Akashk", "Capgemini");
		assertEquals("Contact Admin", result);
	}

}
