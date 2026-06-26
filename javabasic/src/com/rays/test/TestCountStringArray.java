package com.rays.test;

public class TestCountStringArray {
    
	 public static void main(String[] args) {
		
	
		  
		 String[] abc = { "vinay", "prajapat", "indore","vinay", "prajapat", "indore"};
		 int count = 0; 
		 for(char i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
			if("vinay" == abc[i]) {
			count++;
		 }
	}
	  System.out.println("vinay = " + count);
	 }
}
