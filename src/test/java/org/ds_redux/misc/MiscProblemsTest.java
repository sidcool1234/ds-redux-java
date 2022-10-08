package org.ds_redux.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiscProblemsTest {

    @Test
    public void shouldAddNaturalNumbersTill(){
        assertEquals(MiscProblems.addNaturalNumbersTill(5), 15);
        assertEquals(MiscProblems.addNaturalNumbersTill(10), 55);
        assertEquals(MiscProblems.addNaturalNumbersTill(-1), -1);
        assertEquals(MiscProblems.addNaturalNumbersTill(-100), -1);

        assertNotEquals(MiscProblems.addNaturalNumbersTill(7), 100);
    }

}