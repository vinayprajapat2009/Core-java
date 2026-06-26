package com.rays.test;

public class TestCountCharArray {
    public static void main(String[] args) {
		 
    	char[] abc = {'a', 'b', 'c', 'd', 'e', 'b', 'b', 'b', 'b'};
    	int count = 0;
    	
    	for(int i = 0; i < abc.length; i++) {
    	System.out.println(abc[i]);
    	if('b' == abc[i]) {
    		count++;
    		
    	}
    	}
    	System.out.println('b' + " = " + count);
	}
}
