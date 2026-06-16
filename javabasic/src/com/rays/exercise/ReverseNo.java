package com.rays.exercise;

public class ReverseNo {

	public static void main(String[] args) {

	 int i = 121;
	 int reveres = 0;
	 int r = 0;
	 
	  while(i > 0) {
		  r = i % 10;
		  reveres =(reveres * 10) +r;
		 i = i / 10;	  
	  }
    System.out.println("reverse " + reveres);
    
	}

}