package com.agileinnov.dojo;

public class RomanNumeral {

    static int[] ARABIC_VALUES   = {1000,  900, 500,   400, 100,   90,  50,   40,  10,    9,   5,    4,  1  };
    static String[] ROMAN_VALUES = { "M", "CM",  "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public static String of(int arabic) {
        String roman = "";

        for (int position = 0; position < ARABIC_VALUES.length; position++) {
            while (arabic >= ARABIC_VALUES[position]) {
                roman += ROMAN_VALUES[position];
                arabic -= ARABIC_VALUES[position];
            }
        }

        return roman;
    }
}
