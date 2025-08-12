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


private static boolean verification (String str1, String str2) {
    if (str1.length () != str2.length ()) return false;
    int [] seen = new int [256];
    Arrays.fill (seen, 0);
    str1 = str1.toLowerCase ();
    str2 = str2.toLowerCase ();
    for (int i = 0;
    i < str1.length (); i ++) {
        seen [str1.charAt (i)] = seen [str1.charAt (i)] + 1;
    }
    for (int i = 0;
    i < str2.length (); i ++) {
        if (seen [str2.charAt (i)] == 0) return false;
        seen [str2.charAt (i)] = seen [str2.charAt (i)] - 1;
    }
    for (int i = 0;
    i < 256; i ++) {
        if (seen [i] != 0) return false;
    }
    return true;
}
