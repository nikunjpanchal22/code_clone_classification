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
    Map<Character, Integer> mapA = new HashMap<>();

    for(int i=0; i<a.length(); i++) {
        char currChar = a.charAt(i);
        if (!mapA.containsKey(currChar))
            mapA.put(currChar, 1);
        else 
            mapA.put(currChar, mapA.get(currChar)+1);
    }

    for(int i=0; i<b.length(); i++) {
        char currChar = b.charAt(i);
        if (!mapA.containsKey(currChar))
            return false;
    }

    return true;
}


