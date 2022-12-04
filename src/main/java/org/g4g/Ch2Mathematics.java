package org.g4g;

public class Ch2Mathematics {

    // count number of digits in an integer
    public static int numberOfDigitsIn(int i) {
        if (i <= 0) return 1;
        if (i / 10 == 0) return 1;
        return 1 + numberOfDigitsIn(i / 10);
    }
}
