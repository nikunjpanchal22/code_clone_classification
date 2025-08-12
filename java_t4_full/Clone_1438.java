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
    Character f = Character.MAX_VALUE;
    for (int i=0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (seen.contains(c)) {
            if (c < f)
                f = c;
        } else {
            seen.add(c);
        }
    }
    return f == Character.MAX_VALUE ? '_' : f;
} 


