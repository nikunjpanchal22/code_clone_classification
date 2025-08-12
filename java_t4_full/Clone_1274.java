public static boolean contains (String a, String b) {
    boolean status = true;
    Map < String, Integer > mapA = new HashMap < > ();
    Map < String, Integer > mapB = new HashMap < > ();
    for (char i : a.toCharArray ()) {
        Integer val = mapA.get ("" + i);
        if (val != null) {
            mapA.put ("" + i, val + 1);
        } else {
            mapA.put ("" + i, 1);
        }
    }
    for (char i : b.toCharArray ()) {
        Integer val = mapB.get ("" + i);
        if (val != null) {
            mapB.put ("" + i, val + 1);
        } else {
            mapB.put ("" + i, 1);
        }
    }
    for (Map.Entry < String, Integer > entry : mapA.entrySet ()) {
        if (mapB.get (entry.getKey ()) == null || entry.getValue () > mapB.get (entry.getKey ())) {
            status = false;
        }
    }
    return status;
}


 public static boolean contains(String a, String b) {
    //store characters and occurrences in map
    Map<Character, Integer> charCountA = new HashMap<>();
    for(char c : a.toCharArray()){
        if (charCountA.containsKey(c)) {
            charCountA.put(c, charCountA.get(c) + 1);
        } else {
            charCountA.put(c, 1);
        }
    }

    Map<Character, Integer> charCountB = new HashMap<>();
    for(char c : b.toCharArray()){
        if (charCountB.containsKey(c)) {
            charCountB.put(c, charCountB.get(c) + 1);
        } else {
            charCountB.put(c, 1);
        }
    }

    //check if each character of a is in b 
    boolean status = true;
    for(char c : charCountA.keySet()){
        if (!charCountB.containsKey(c) || charCountB.get(c) < charCountA.get(c)) {
            status = false;
            break;
        }
    }
    return status;
}


