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


private static boolean isPermutMatch(String c, String d) {
    char [] cArray = c.toCharArray ();
    char [] dArray = d.toCharArray ();
    if (c.length () != d.length ()) {
        return false;
    }
    int totalNumber = 0;
    for (int i = 0;
    i < cArray.length; i ++) {
        char currentC = cArray [i];
        for (int k = 0;
        k < dArray.length; k ++) {
            if (currentC == dArray [k]) {
                totalNumber ++;
                dArray [k] = '\uFFFF';
                break;
            }
        }
    }
    return totalNumber == c.length ();
}
