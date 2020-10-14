package com.spark.test;

import org.junit.Test;

public class MyTest {

	public static void main(String[] args) {
		int a = -7;
		int b = 4;
		System.out.println("a/b=" + a/b);
		System.out.println("a%b=" + a%b);
	}
	@Test
	public void test() {
		int a = 3;
		int b = -3;
		System.out.println(Integer.MAX_VALUE + "\t" + Integer.toBinaryString(Integer.MAX_VALUE ));
		System.out.println((b & Integer.MAX_VALUE) + "\t" + Integer.toBinaryString(b));
		System.out.println((-9999 & Integer.MAX_VALUE) + "\t" + Integer.toBinaryString(-9999));
//		System.out.println(Math.abs(a));
	}
}
