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


private static boolean isPermutation(String a, String b) {
    char[] aArray = a.toCharArray();
    char[] bArray = b.toCharArray();
    if (a.length() != b.length()) {
        return false;
    }
    int found = 0;
    for (int i = 0;
        i < aArray.length; i++) {
        char eachA = aArray[i];
        for (int k = bArray.length - 1; // Reversed Loop 
            k > 0; k--) {
            if (eachA == bArray[k]) {
                found++;
                bArray[k] = '\uFFFF';
                break;
            }
        }
    }
    return found == a.length();
}
