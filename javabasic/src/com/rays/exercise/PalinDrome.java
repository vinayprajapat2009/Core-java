package com.rays.exercise;

public class PalinDrome {
	
	 public static void main(String[] args) {
		
		 int i = 353;
		 int reverse = 0;
		 int r = 0;
		 
		 while(i > 0) {
			 r = i % 10;
			 reverse = (reverse * 10) + r;
			 i = i / 10;
			 
		 }
		 System.out.println("reverse " + reverse);
		 if(reverse ==  353) {
		 System.out.println("palindrome " + reverse);
		 }else {
			 System.out.println("not palindrome " + reverse);
		 }
		 
	}

}
