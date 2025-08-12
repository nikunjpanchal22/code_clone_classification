static String removeDuplicates (String s) {
    StringBuilder noDupes = new StringBuilder ();
    for (int i = 0;
    i < s.length (); i ++) {
        String si = s.substring (i, i + 1);
        if (noDupes.indexOf (si) == - 1) {
            noDupes.append (si);
        }
    }
    return noDupes.toString ();
}


 static String removeDuplicates(String s) { 
    char[] chars = s.toCharArray(); 
    Set<Character> set = new LinkedHashSet<Character>(); 
    for (char c : chars) { 
        set.add(c); 
    } 
  
    StringBuilder sb = new StringBuilder(); 
    for (Character c : set) { 
        sb.append(c); 
    } 
    return sb.toString(); 
}


