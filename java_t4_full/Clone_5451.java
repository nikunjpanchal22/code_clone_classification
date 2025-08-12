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
    for(char ch: s.toCharArray()){
        if(s.indexOf(ch)==s.lastIndexOf(ch))
            return ch;
    }
    return '_';
}


