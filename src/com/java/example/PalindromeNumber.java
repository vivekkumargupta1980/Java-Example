package com.java.example;

public class PalindromeNumber {

	public static void main(String[] args) {
		int sum = 0, temp, rem;
		int num = 454;
		temp = num;

		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num/10;
		}
		
		if (sum == temp) {
			System.out.println("palindrome number ");    
		} else {
			System.out.println("not palindrome number"); 
		}
	}
}
