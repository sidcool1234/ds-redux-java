package org.g4g;

public class Ch2Mathematics {

    // count number of digits in an integer
    public static int numberOfDigitsIn(int i) {
        if (i <= 0) return 1;
        if (i / 10 == 0) return 1;
        return 1 + numberOfDigitsIn(i / 10);
    }


    // GCF or HCF or GCD
    public static int gcd(int i, int j) {
        if (i < 0 || j < 0) return 0;
        // Euclid's algorithm
        if (j == 0) return i;
        else return gcd(j, i % j);
    }

    // LCM
    public static int lcm(int i, int j) {
        if (i < 0 || j < 0) return 0;
        // LCM = (i * j)/gcd(i,j)
        return (i * j) / gcd(i, j); // Complexity = log(min(i,j))
    }
}

class PrimeNumebrAlgorithms {
    public static boolean isPrimeBruteForce(int i) {
        if (i <= 1) return false;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeOptimized(int i) {
        if (i <= 1) return false;
        if(i == 2 || i == 3) return true;
        if(i % 2 == 0 || i % 3 == 0) return false;

        int n = (int) Math.sqrt(i);
        for (int j = 2; j <= n; j+=6) {
            if (i % j == 0) return false;
        }
        return true;
    }
}
