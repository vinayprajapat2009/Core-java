package com.rays.test;

public class LinerSearch {
         
	public static void main(String[] args) {
		 
		int[] arr = { 20, 50, 60, 80, 90, 30, 40, 70};
		int element = 40;
		int index = -1;
		 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				index = i;
				System.out.println("element at found index " + index);
			}
		}
		if(index == 1) {
			System.out.println("element not found");
		}
		
	}
}
