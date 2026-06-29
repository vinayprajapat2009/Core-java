package com.rays.string;

public class Test {

	public static void main(String[] args) {

		String s1 = "Sunrays";
		System.out.println(s1);

		System.out.println("-----------");

		String s2 = "Sunrays";
		System.out.println(s2);

		System.out.println("-----------");

		String s3 = new String("WelCome");
		System.out.println(s3);

		System.out.println("-----------");

		String s4 = new String("WelCome");
		System.out.println(s4);

		System.out.println(s1 == s2);
		System.out.println(s3 == s4);

		System.out.println("------------");

		System.out.println(s3.equals(s4));
	}
}
