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
   LinkedHashMap<Character, Integer> chars = new LinkedHashMap<Character, Integer>();
    for (char c : s.toCharArray()) {
        chars.put(c, chars.containsKey(c) ? chars.get(c) + 1 : 1); 
    }
    for (Map.Entry<Character, Integer> charFreq : chars.entrySet()){
        if (charFreq.getValue() == 1){
           return charFreq.getKey();
        }
    }
    return '_';
}


