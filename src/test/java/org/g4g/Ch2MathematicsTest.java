package org.g4g;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch2MathematicsTest {

    @Test
    void testNumberOfDigitsIn() {
        assertEquals(3, Ch2Mathematics.numberOfDigitsIn(123));
        assertEquals(2, Ch2Mathematics.numberOfDigitsIn(12));
        assertNotEquals(10, Ch2Mathematics.numberOfDigitsIn(123456789));
    }

    @Test
    void testGcd() {
        assertEquals(5, Ch2Mathematics.gcd(15, 10));
        assertEquals(1, Ch2Mathematics.gcd(9, 10));
        assertEquals(10, Ch2Mathematics.gcd(0, 10));
        assertEquals(0, Ch2Mathematics.gcd(-1, 10));
        assertEquals(0, Ch2Mathematics.gcd(-1, -2));
    }

    @Test
    void testLcm() {
        assertEquals(12, Ch2Mathematics.lcm(4,6));
        assertEquals(8, Ch2Mathematics.lcm(4,8));
        assertEquals(77, Ch2Mathematics.lcm(7,11));
        assertEquals(0, Ch2Mathematics.lcm(-1, -2));

    }
}