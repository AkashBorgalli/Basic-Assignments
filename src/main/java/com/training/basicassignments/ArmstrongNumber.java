package com.training.basicassignments;

public class ArmstrongNumber {

	public static int ArmStrongOfNumber(int i){
		int result = 0;
		
		
		int remainder;
		
		while (i != 0)
	        {
	            remainder = i % 10;
	            result += Math.pow(remainder, 3);
	            i /= 10;
	        }
		
		
		
		return result;
		
					}
		
	}

