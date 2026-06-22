package com.rays.date;

public class TestCharArrey {

	public static void main(String[] args) {

		char[] abc = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'a' };
		int count = 0;
		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);
			if ('a' == abc[i]) {
				count++;
			}

		}
		System.out.println("a = " + count);
	}

}
