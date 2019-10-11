package com.java.example;

/*
A number in Roman Numerals is a string of these symbols written in descending order(e.g. M’s first, followed by D’s, etc.). 
However, in a few specific cases, to avoid four characters being repeated in succession (such as IIII or XXXX), subtractive notation is often used as follows:

I placed before V or X indicates one less, so four is IV (one less than 5) and 9 is IX (one less than 10).
X placed before L or C indicates ten less, so forty is XL (10 less than 50) and 90 is XC (ten less than a hundred).
C placed before D or M indicates a hundred less, so four hundred is CD (a hundred less than five hundred) and nine hundred is CM (a hundred less than a thousand).

Algorithm to convert Roman Numerals to Integer Number :

1.Split the Roman Numeral string into Roman Symbols (character).
2.Convert each symbol of Roman Numerals into the value it represents.
3.Take symbol one by one from starting from index 0:
4.If current value of symbol is greater than or equal to the value of next symbol, then add this value to the running total.
else subtract this value by adding the value of next symbol to the running total.

*/

public class RomanNumeralsToDecimal {

	public static void main(String[] args) {
		RomanNumeralsToDecimal romanNumeralsToDecimal = new RomanNumeralsToDecimal();
		System.out.println("Decimal value of Roman Numerals" + 
                " is " + romanNumeralsToDecimal.romanToDecimal("MMXIX"));
	}

	// This function returns value of a Roman symbol
	private int value(char ch) {
		if (ch == 'I')
			return 1;
		if (ch == 'V')
			return 5;
		if (ch == 'X')
			return 10;
		if (ch == 'L')
			return 50;
		if (ch == 'C')
			return 100;
		if (ch == 'D')
			return 500;
		if (ch == 'M')
			return 1000;
		return -1;
	}

	// Finds decimal value of a given romal numeral
	int romanToDecimal(String str) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			int symbol1 = value(str.charAt(i));
			if ((i + 1) < str.length()) {
				int symbol2 = value(str.charAt(i + 1));
				if (symbol1 >= symbol2) {
					result = result + symbol1;
				} else {
					result = result + symbol2 - symbol1;
					i++;
				}

			} else {
				result = result + symbol1;
				i++;
			}

		}
		return result;
	}
}
