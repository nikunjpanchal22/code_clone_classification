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
    StringBuilder sb = new StringBuilder();
    Set<Character> noDupes = new HashSet<>();
    for(char c : s.toCharArray()) {
        if(!noDupes.contains(c)) {
            noDupes.add(c);
            sb.append(c);
        }
    }
    return sb.toString();
}


