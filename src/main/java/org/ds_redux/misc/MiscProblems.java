package org.ds_redux.misc;

public class MiscProblems {

    public static int addNaturalNumbersTill(int i) {
        if (i < 0) return -1;
        if (i == 0) return 0;
        return i + addNaturalNumbersTill(i - 1);
    }
}
