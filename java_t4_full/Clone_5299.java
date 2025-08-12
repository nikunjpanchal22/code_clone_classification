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
    HashMap<Character, Integer> countCharsA = new HashMap<>();
    for(char c : a.toCharArray())
        countCharsA.put(c, countCharsA.getOrDefault(c, 0) + 1);
    HashMap<Character, Integer> countCharsB = new HashMap<>();
    for(char c : b.toCharArray())
        countCharsB.put(c, countCharsB.getOrDefault(c, 0) + 1);
    return countCharsA.entrySet().stream()
        .allMatch(e -> e.getValue() <= countCharsB.getOrDefault(e.getKey(), 0));
}


