package com.rays.basic;

public class TestStringCountArrey {
	
	public static void main(String[] args) {
		
		String[] str = {"vinay", "prajapat", "indore", "vinay", "prajapat", "indore"};
		int count = 0;
		 for(int i = 0; i < str.length; i++) {
			 System.out.println(str[i]);
			 if("vinay" == str[i]) {
				 count++;
				 
			 }
		 }
		 System.out.println("viany = " + count);
				}
}
