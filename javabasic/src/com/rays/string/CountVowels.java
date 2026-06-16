package com.rays.string;

public class CountVowels {

	public static void main(String[] args) {
		 
	 String name = "vinay prajapat";
	 int count = 0;
	 
	 for(int i = 0; i < name.length(); i++) {
		 if(name.charAt(i) == 'a') {
			count++;
		 }
	 }
	 System.out.println(count);
     
	}

}
