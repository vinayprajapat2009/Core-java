package com.rays.test;

public class TestLinearSearch {
	public static void main(String[] args) {
		
	int[] arr = {20, 30, 40, 50, 60, 70, 80, 90};
	int element = 70;
	int index = -1;
	
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] == element) {
			index = i;
			System.out.println("element at found index " + index);
			
		}
	}
	if(index == -1) {
		System.out.println("element not found");
	
	  }
	}
}
