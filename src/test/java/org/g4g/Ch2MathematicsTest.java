package org.g4g;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch2MathematicsTest {

    @Test
    void numberOfDigitsIn() {
        assertEquals(3, Ch2Mathematics.numberOfDigitsIn(123));
        assertEquals(2, Ch2Mathematics.numberOfDigitsIn(12));
        assertNotEquals(10, Ch2Mathematics.numberOfDigitsIn(123456789));
    }
}