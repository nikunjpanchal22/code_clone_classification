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
    List<Character> noDupes = new ArrayList<>();
 
    for(Character c : chars) {
        if(!noDupes.contains(c)) {
            noDupes.add(c);
        }
    }
 
    String result = "";
 
    for(Character c : noDupes) {
        result += c;
    }
 
    return result;
}


