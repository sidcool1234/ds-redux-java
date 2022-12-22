package org.g4g;

public class Ch2Mathematics {

    // count number of digits in an integer
    public static int numberOfDigitsIn(int i) {
        if (i <= 0) return 1;
        if (i / 10 == 0) return 1;
        return 1 + numberOfDigitsIn(i / 10);
    }


    // GCF or HCF or GCD
    public static int gcd(int i, int j){
        if(i < 0 || j < 0) return 0;
        // Euclid's algorithm
        if(j == 0) return i;
        else return gcd(j, i%j);
    }
}
