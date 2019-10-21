package com.java.example;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String original, reverse = "";
		System.out.println("Enter a string/number to check if it is a palindrome : ");
		try (Scanner in = new Scanner(System.in))
		{
			original = in.nextLine();
			for (int i = original.length() - 1; i >= 0; i--) {
				reverse = reverse + original.charAt(i);
			}
			if (original.equals(reverse)) {
				System.out.println("Entered string/number is a palindrome.");
			} else {
				System.out.println("Entered string/number isn't a palindrome.");
			}
		} catch (Exception ex) {
			System.out.println("An exception is occurred.");
		}
	}
}
