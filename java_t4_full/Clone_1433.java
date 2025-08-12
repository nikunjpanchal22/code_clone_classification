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


 private static Character findFirstCharacter (String s) { 
    Set<Character> seen = new HashSet<Character>();
    Set<Character> single = new HashSet<Character>();
    for (int i=0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (seen.contains(c)) {
            single.remove(c);
        } else {
            seen.add(c);
            single.add(c);
        }
    }
    if (!single.isEmpty()) {
        return single.iterator().next();
    }
    return '_';
}


