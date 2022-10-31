package org.ds_redux.misc;

public class MiscProblems {

    public static int addNaturalNumbersTill(int i) {
        if (i < 0) return -1;
        if (i == 0) return 0;
        return i + addNaturalNumbersTill(i - 1);
    }

    public static FIZZ_BUZZ_RETURN_VALUES fizzBuzz(int i) {
        if (i % 15 == 0) return FIZZ_BUZZ_RETURN_VALUES.FIZZ_BUZZ;
        else if (i % 5 == 0) return FIZZ_BUZZ_RETURN_VALUES.BUZZ;
        else if (i % 3 == 0) return FIZZ_BUZZ_RETURN_VALUES.FIZZ;
        else return FIZZ_BUZZ_RETURN_VALUES.NONE;
    }

    public static boolean searchWithinString(String input, String searchTerm, boolean caseSensitive) {
        if (input == null || searchTerm == null) return false;
        var finalInput = caseSensitive ? input : input.toLowerCase();
        var finalSearchString = caseSensitive ? searchTerm : searchTerm.toLowerCase();

        return finalInput.contains(finalSearchString);
    }
}

enum FIZZ_BUZZ_RETURN_VALUES {
    FIZZ, BUZZ, FIZZ_BUZZ, NONE
}
