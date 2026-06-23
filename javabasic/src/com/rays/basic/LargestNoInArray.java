package com.rays.basic;

public class LargestNoInArray {

	public static void main(String[] args) {

		int[] intArrey = { 5, 10, 15, 6, 20, 14, 40 };

		int largestNo = intArrey[0];

		for (int i = 0; i < intArrey.length; i++) {
			if (intArrey[i] > largestNo) {
				largestNo = intArrey[i];

			}
		}
		System.out.println("largest no is: " + largestNo);
	}

}
