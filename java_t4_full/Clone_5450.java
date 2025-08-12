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
    int[] freq = new int[256];
    for (char c : s.toCharArray()) freq[c]++;
    for (char c : s.toCharArray()) if (freq[c] == 1) return c;
    return '_';
}


