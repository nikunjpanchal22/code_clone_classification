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
    Map<Character, Integer> mapB = new HashMap<>();

    for(int i = 0; i < a.length(); i++){
        char curr = a.charAt(i);
        mapA.merge(curr, 1, Integer::sum);
    }

    for(int i = 0; i < b.length(); i++){
        char curr = b.charAt(i);
        mapB.merge(curr, 1, Integer::sum);
    }

    boolean status = true;
    for(Character key : mapA.keySet()) {
        if (!(mapB.containsKey(key) && (mapA.get(key) <= mapB.get(key))))
            status = false;
    }
    return status;
}


