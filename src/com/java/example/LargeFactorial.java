package com.java.example;

import java.math.BigInteger;

public class LargeFactorial {

	public static void main(String[] args) {
		System.out.println("factorial of 18 = " + factorial(18));
	}
	
	private static BigInteger factorial(int num) {
		BigInteger factorial = BigInteger.ONE;
		for (int i = num; i > 0; i--) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
	}

}
