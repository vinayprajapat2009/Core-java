package com.rays.exercise;

public class ArmstrongNo {

	public static void main(String[] args) {
      
		int i = 153;
		int arm = 0;
		int r = 0;
		
		while(i > 0) {
			r = i % 10;
			arm = arm + r*r*r;
			i = i / 10;
			
		}
		System.out.println("arm: " + arm);
		if(arm == 153) {
			System.out.println("arm");
			
		}else {
			System.out.println("not arm"); 
		}
	}

}
