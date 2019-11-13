package com.training.basicassignments;

import java.util.ArrayList;
import java.util.List;

public class RangeOfArmStrongNumbers {
	public static List rangeOfArmStrong(int start,int end) {
		  List<Integer> list = new ArrayList<Integer>();  
		  for (int k = start ; k <= end ; k++)
          {
			    
			  int num = k;
                     int remainder = 0;
                     int result = 0;

                     while (num > 0)
                      {
                                  remainder = num % 10;
                                  result = result + (remainder* remainder* remainder);
                                  num = num / 10;
                      }
                      if (k == result)
                       {
                    	 
                    	  list.add(k);
                      
                        }
                      
		
	}
		return list;
	
		
		

}}
