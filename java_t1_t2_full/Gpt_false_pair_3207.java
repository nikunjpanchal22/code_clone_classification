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
    for (int i = 0;
    i < s.length (); i ++) {
        String ch = String.valueOf(s.charAt(i));
        if (noDupes.indexOf (ch) == - 1) {
            noDupes.append (ch);
        }
    }
    return noDupes.toString ();
}
