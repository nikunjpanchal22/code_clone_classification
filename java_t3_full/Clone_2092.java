static String removeDuplicates (String s) {
    StringBuilder noDupes = new StringBuilder ();
    for (int i = 0;
    i < s.length (); i ++) {
        String si = s.substring (i, i + 1);
        if (noDupes.indexOf (si) == - 1) {
            noDupes.append (si);
        }
    }
    return noDupes.toString ();
}


 static String removeDuplicates (String s) {
    StringBuilder noDupes = new StringBuilder ();
    for (char c : s.toCharArray())
        if (noDupes.indexOf (String.valueOf(c)) == - 1) {
            noDupes.append (c);
        }
    return noDupes.toString ();
}


