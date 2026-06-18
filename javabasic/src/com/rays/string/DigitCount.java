package com.rays.string;

public class DigitCount {
	public static void main(String[] args) {

		String name = "R9ays 2035";
		
		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i))) {
				System.out.println(name.charAt(i));
				count++;
			}
		}
		
		System.out.println("total digits: " + count); 
	}
}
