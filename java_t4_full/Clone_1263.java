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

    for(int i = 0; i < a.length(); i++) {
        char c = a.charAt(i);
        mapA.putIfAbsent(c, 0);
        mapA.put(c, mapA.get(c) + 1);
    }

    for(int i = 0; i < b.length(); i++) {
        char c = b.charAt(i);
        if(!mapA.containsKey(c))
            return false;
    }

    return true;
}


