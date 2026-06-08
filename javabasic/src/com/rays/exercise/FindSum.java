package com.rays.exercise;

public class FindSum {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 101; i <= 199; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
				sum = sum + i;
			} else {
				System.out.println("not div by 7 " + i);
			}
		}
		System.out.println("--------------");
		System.out.println(sum);

	}
}
