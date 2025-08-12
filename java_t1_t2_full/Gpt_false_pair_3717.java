private static boolean isAnagram (String s1, String s2) {
    if (s1.length () != s2.length ()) return false;
    int [] seen = new int [256];
    Arrays.fill (seen, 0);
    s1 = s1.toLowerCase ();
    s2 = s2.toLowerCase ();
    for (int i = 0;
    i < s1.length (); i ++) {
        seen [s1.charAt (i)] = seen [s1.charAt (i)] + 1;
    }
    for (int i = 0;
    i < s2.length (); i ++) {
        if (seen [s2.charAt (i)] == 0) return false;
        seen [s2.charAt (i)] = seen [s2.charAt (i)] - 1;
    }
    for (int i = 0;
    i < 256; i ++) {
        if (seen [i] != 0) return false;
    }
    return true;
}


private static boolean anagramCheck (String firstString, String secondString) {
    if (firstString.length () != secondString.length ()) return false;
    int [] seen = new int [256];
    Arrays.fill (seen, 0);
    firstString = firstString.toLowerCase ();
    secondString = secondString.toLowerCase ();
    for (int i = 0;
    i < firstString.length (); i ++) {
        seen [firstString.charAt (i)] = seen [firstString.charAt (i)] + 1;
    }
    for (int i = 0;
    i < secondString.length (); i ++) {
        if (seen [secondString.charAt (i)] == 0) return false;
        seen [secondString.charAt (i)] = seen [secondString.charAt (i)] - 1;
    }
    for (int i = 0;
    i < 256; i ++) {
        if (seen [i] != 0) return false;
    }
    return true;
}
