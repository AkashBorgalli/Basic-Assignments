package com.training.basicassignments;

public class CalculateIncomeTax {
	public static float taxCalculator(float income ) {
		float tax;
		if (income>=0 && income<=80000) {
		tax=0;}
		else if (income>=181001 && income<=300000) {
		tax=(income-50000.00F)*10/100;}
		else if (income >= 300001 && income<=500000 ) {
		tax=(income-100000.00F)*20/100+5000;}
		else {
		tax=(income-250000.00F)*30/100+5000+30000;
		}
		return tax;
		
		
		
	}
}
