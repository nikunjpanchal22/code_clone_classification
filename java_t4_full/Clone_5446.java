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
    char[] arr = s.toCharArray();
    Map<Character, Integer> map = new HashMap<>();
    for(char c : arr){
        map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for(char c : arr){
        if(map.get(c) == 1) return c;
    }
    return '_';
}


