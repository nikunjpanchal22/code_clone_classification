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





private static char findFirstCharacter(String s) {
    Set<Character> duplicated = new HashSet<>();
    Set<Character> unique = new LinkedHashSet<>();
    for (char c : s.toCharArray()) {
        if (!unique.contains(c) && !duplicated.contains(c)) unique.add(c);
        else {
            unique.remove(c);
            duplicated.add(c);
        }
    }
    return unique.isEmpty() ? '_' : unique.iterator().next();
}


