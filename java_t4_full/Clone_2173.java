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
    Set<Character> noDupes = new TreeSet<>();
    for (int i = 0; i < s.length (); i ++) {
        char c = s.charAt(i);
        noDupes.add(c);
    }
    return new String(noDupes.toString());
}


