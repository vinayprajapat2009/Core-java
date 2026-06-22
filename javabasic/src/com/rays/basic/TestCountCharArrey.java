package com.rays.basic;

public class TestCountCharArrey {
	
	public static void main(String[] args) {
		 
		char[] abc = {'a', 'b', 'c', 'd', 'e', 'a', 'a', 'a', 'a', 'a'};
		int count = 0;
		
		for(int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
			if('a' == abc[i]) {
				count++;
				
			}
		}
		System.out.println("a = " + count);
	}

}
