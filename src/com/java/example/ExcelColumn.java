package com.java.example;

import org.junit.Assert;

public class ExcelColumn {

	public static void main(String[] args) {
		Assert.assertEquals(53, toNumber("BA"));
        Assert.assertEquals("BA", toName(53));

        Assert.assertEquals(703, toNumber("AAA"));
        Assert.assertEquals("AAA", toName(703));

        Assert.assertEquals(26, toNumber("Z"));
        Assert.assertEquals("Z", toName(26));

        Assert.assertEquals(702, toNumber("ZZ"));
        Assert.assertEquals("ZZ", toName(702));
	}
	
	public static int toNumber(String name) {
        int number = 0;
        for (int i = 0; i < name.length(); i++) {
            number = number * 26 + (name.charAt(i) - ('A' - 1));
        }
        return number;
    }
	
	public static String toName(int number) {
        StringBuilder sb = new StringBuilder();
        while (number-- > 0) {
            sb.append((char)('A' + (number % 26)));
            number /= 26;
        }
        return sb.reverse().toString();
    }
}
