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
     Map<Character, Integer> countMap = new LinkedHashMap<>();
     for (int i = 0; i < s.length (); i++) {
          char c = s.charAt(i);
          countMap.put(c, countMap.getOrDefault(c, 0) + 1);
     } 
     for (char c : countMap.keySet()) {
          if (countMap.get(c) == 1) return c;
     }
     return '_';
}


