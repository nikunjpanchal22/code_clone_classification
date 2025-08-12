private static boolean isPermutation (String a, String b) {
    char [] aArray = a.toCharArray ();
    char [] bArray = b.toCharArray ();
    if (a.length () != b.length ()) {
        return false;
    }
    int found = 0;
    for (int i = 0;
    i < aArray.length; i ++) {
        char eachA = aArray [i];
        for (int k = 0;
        k < bArray.length; k ++) {
            if (eachA == bArray [k]) {
                found ++;
                bArray [k] = '\uFFFF';
                break;
            }
        }
    }
    return found == a.length ();
}


private static boolean permCheck(String x, String y) {
    char [] xChars = x.toCharArray ();
    char [] yChars = y.toCharArray ();
    if (x.length () != y.length ()) {
        return false;
    }
    int foundCount = 0;
    for (int i = 0;
    i < xChars.length; i ++) {
        char currXCh = xChars [i];
        for (int j = 0;
        j < yChars.length; j ++) {
            if (currXCh == yChars [j]) {
                foundCount ++;
                yChars [j] = '\uFFFF';
                break;
            }
        }
    }
    return foundCount == x.length ();
}
