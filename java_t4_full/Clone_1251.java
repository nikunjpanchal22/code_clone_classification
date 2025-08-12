public static boolean contains (String a, String b) {
    int diff = a.length () - b.length ();
    while (a.length () > 0) {
        b = b.replace (a.substring (0, 1), "");
        a = a.replace (a.substring (0, 1), "");
        if (diff != a.length () - b.length ()) return false;
    }
    return true;
}


 public static boolean contains(String a, String b) {
    if (a.length() != b.length())
        return false;
 
    int[] aChars = new int[256];
    int[] bChars = new int[256];
 
    for (int i = 0; i < a.length(); i++) {
        aChars[a.charAt(i)]++;
        bChars[b.charAt(i)]++;
    }
 
    for (int i = 0; i < 256; i++)
        if (aChars[i] != bChars[i])
            return false;
 
    return true;
}


