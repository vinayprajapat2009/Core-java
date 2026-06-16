package com.rays.string;

public class CountAccourance {
	public static void main(String[] args) {
		
		String str = "vaainay";
		int count = 0;
		
		char c = 'a';
		
		for(int i = 0; i < str.length(); i++) {
			if(c == (str.charAt(i))){
				count++;
				
				
			}
			
		} 
		System.out.println(count);
		
	}

}
