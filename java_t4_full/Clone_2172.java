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
    List<Character> noDupes = new ArrayList<>();
    for (int i = 0; i < s.length (); i ++) {
        char c = s.charAt(i);
        if (!noDupes.contains(c)) {
            noDupes.add(c);
        } 
    }
    return noDupes.stream().map(String::valueOf).collect(Collectors.joining());
}


