package com.rays.string;

public class CountMissingChar {
	public static void main(String[] args) {
		
		String str =  "vinay";
		
		for(char c = 'a'; c <= 'z'; c++) {
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == c) {
					count++;
					
				}
			}
			if(count == 0) {
				System.out.println(c);
			}
		}
				
	}
}
