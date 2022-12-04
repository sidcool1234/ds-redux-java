package org.leetcode;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {
    private static final Map<Character, Integer> romanToIntMap = new HashMap<>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };


    public int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;

        int sum = 0;
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (i < charArray.length - 1) { // This is to check if the character is the last one.
                if (romanToIntMap.get(charArray[i]) < romanToIntMap.get(charArray[i + 1])) { // If character is not the last one, then check if next character is lesser.
                    sum += romanToIntMap.get(charArray[i + 1]) - romanToIntMap.get(charArray[i]); // If lesser, than take difference, else take sum simply
                    i++;
                } else {
                    sum += romanToIntMap.get(charArray[i]);
                }
            } else {
                sum += romanToIntMap.get(charArray[i]);
            }
        }

        return sum;
    }
}
