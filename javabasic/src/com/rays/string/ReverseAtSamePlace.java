package com.rays.string;

import java.util.Iterator;

public class ReverseAtSamePlace {

public static void main(String[] args) {
	   
	   String str = "rays technology indore";
	   String[] abc = str.split(" ");
	    
	   for (int i = 0; i < abc.length; i++) {
		for (int j = abc[i].length()-1; j >= 0 ; j--) {
			System.out.print(abc[i].charAt(j));
			
		}
		System.out.print(" ");
	}
	    
	    	
}
}
