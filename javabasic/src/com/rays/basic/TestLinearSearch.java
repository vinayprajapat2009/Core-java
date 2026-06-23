package com.rays.basic;

public class TestLinearSearch {
    
	public static void main(String[] args) {
		
		int[] arr = { 50, 20, 80, 10, 40, 90, 70, 30};
		int element = 70;
		int index = -1;
		 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				index = i;
				System.out.println("element found at index: " + index);
			}
		}
		if (index == -1) {
			System.out.println("element not found");
		}
	}
}
