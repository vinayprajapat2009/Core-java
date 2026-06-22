package com.rays.basic;

public class TestDigitCountArrey {
	public static void main(String[] args) {
		
		int[] abc = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 3, 3, 3, 3};
		int count = 0;
		 for(int i = 0; i < abc.length; i++) {
			 System.out.println(abc[i]);
			 if(3 == abc[i]) {
				 count++;
			 }
		 }
		 System.out.println("3 = " +  count);
		
	}

}
