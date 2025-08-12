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



static String removeDuplicates8(String s) {
    return s.codePoints().distinct().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
}


