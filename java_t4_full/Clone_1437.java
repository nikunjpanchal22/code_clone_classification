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
    char firstUnique = '_';
    Set<Character> seenChars = new HashSet<>();

    for (int i = 0; i < s.length (); i++) {
        char character = s.charAt (i);

        if (! seenChars.contains (character)) {
            firstUnique = character;
            seenChars.add (character);
        } else {
            firstUnique = '_';
        }
    }
    return firstUnique;
} 


