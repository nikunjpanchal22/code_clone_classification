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
    if (a.length() != b.length()) {
        return false;
    }
    int[] seen = new int[128];
    for (int i = 0; i < a.length(); i++) {
        seen[a.charAt(i)]++;
    }
    for (int i = 0; i < b.length(); i++) {
        seen[b.charAt(i)]--;
    }
    for (int i : seen) {
        if (i != 0) {
            return false;
        }
    }
    return true;

}


