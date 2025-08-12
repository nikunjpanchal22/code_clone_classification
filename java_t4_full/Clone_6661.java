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



static String removeDuplicates9(String s) {
    Set<Character> charSet = new TreeSet<>();
    for (char c : s.toCharArray()) {
        charSet.add(c);
    }
    return charSet.stream().map(String::valueOf).collect(Collectors.joining());
}


