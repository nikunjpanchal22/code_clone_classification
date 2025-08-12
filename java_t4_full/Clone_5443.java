private static char findFirstCharacter (String s) {
    HashSet < Character > unique = new LinkedHashSet < > (), seen = new HashSet < > ();
    for (int i = 0;
    i < s.length (); i ++) {
        char c = s.charAt (i);
        if (seen.add (c)) unique.add (c);
        else unique.remove (c);
    }
    return unique.isEmpty () ? '_' : unique.iterator ().next ();
}



private static char findFirstCharacter (String s) {
    List<Character> unique = new ArrayList<>();
    List<Character> seen = new ArrayList<>();
    for (char c : s.toCharArray()) {
        if (seen.contains(c)) unique.remove((Character) c);
        else { seen.add(c); unique.add(c); }
    }
    return unique.isEmpty() ? '_' : unique.get(0);
}


