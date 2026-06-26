package com.rays.test;

public class TestCountDigitArray {
    public static void main(String[] args) {
		
    int[] abc = { 1, 2, 3, 4, 5, 6, 7, 2, 2, 2, 2, 2};
    
    int count = 0; 
     
     for(int i = 0; i < abc.length; i++) {
    	 System.out.println(abc[i]);
    	 if(2 == abc[i]) {
    		 count++;
    	 }
    	 }
     System.out.println("3 = " +count);
    }
    
}
