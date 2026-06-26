package com.rays.test;

public class TestLinearSearch {

    public static void main(String[] args) {
		  
    	int[] arr = { 20, 40, 50, 60, 70, 80, 30};
    	int element = 80;
    	 int index = -1;
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i] == element) {
    			 index = i;
    		
    	
    	System.out.println("element found at index " + index);
    		} 
    	}
	

    if(index == -1) {
    	System.out.println("element not found");
    }
    }
}
