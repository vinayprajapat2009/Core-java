package com.rays.string;

public class TestString {
	
	public static void main(String[] args) {
		
		String name = "vinay prajapat";
		
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(6));
		System.out.println(name.indexOf('a'));
		System.out.println(name.lastIndexOf('a'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase()); 
		System.out.println(name.startsWith("vin"));
		System.out.println(name.endsWith("pat"));
		System.out.println(name.substring(1, 7));
	}

}
