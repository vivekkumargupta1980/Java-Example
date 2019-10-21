package com.java.example;

public class PalindromeSentence {

	public static void main(String[] args) {
		String str = "Too hot to hoot.";
		if (palindromeSentence(str))
			System.out.println("Sentence is palindrome");
		else
			System.out.println("Sentence is not" + " " + "palindrome");
	}

	private static boolean palindromeSentence(String str) {
		int l = 0;
		int h = str.length() - 1;

		str = str.toLowerCase();

		while (l <= h) {
			char charAtl = str.charAt(l);
			char charAth = str.charAt(h);

			if (!(charAtl >= 'a' && charAtl <= 'z')) {
				l++;
			} else if (!(charAth >= 'a' && charAth <= 'z')) {
				h--;
			} else if (charAtl == charAth) {
				l++;
				h--;
			} else {
				return false;
			}
		}
		return true;
	}
}
