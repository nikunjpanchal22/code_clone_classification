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

    char[] aLetters = new char[a.length()];
    char[] bLetters = new char[b.length()];

    // store each character of the strings in their respective char arrays
    for (int i = 0; i < a.length(); i++) {
        aLetters[i] = a.charAt(i);
        bLetters[i] = b.charAt(i);
    }

    Arrays.sort(aLetters);
    Arrays.sort(bLetters);

    // need to check each character in the char array to see if they have the same values
    for (int j = 0; j < a.length(); j++) {
        if (aLetters[j] != bLetters[j]) {
            return false;
        }
    }

    return true;
}


