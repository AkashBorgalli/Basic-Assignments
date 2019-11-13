package com.training.basicassignments;

public class SimpleCompoundInterest {

	public static double simpleInterest(double principle,double years,double rate) {
		double simpleinterest=(principle * years * rate)/100;
		return simpleinterest;
		
		
	}

	public static double compoundInterest(double principle, double years, double rate) {
		double compoundinterest=principle * Math.pow(1.0+rate/100.0,years) - principle;
		return compoundinterest;
	}
	

}
