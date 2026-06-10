package com.rays.exercise;

public class PrimeNo {
	public static void main(String[] args) {

		int a = 13;
		int count = 0;

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		System.out.println(count);
		if(count > 0) {
			System.out.println("not prime");
		} else {
			System.out.println("prime");
		}

	}
}
