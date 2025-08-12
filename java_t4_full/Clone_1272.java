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


 public static boolean contains (String a, String b) {
    boolean status = true;
    Map < char, Integer > mapA = new HashMap < > ();
    Map < char, Integer > mapB = new HashMap < > ();
    for (int i = 0; i < a.length(); i++) {
        Integer val = mapA.get (a.charAt(i));
        if (val != null) {
            mapA.put (a.charAt(i), val + 1);
        } else {
            mapA.put (a.charAt(i), 1);
        }
    }
    for (int j = 0; j < b.length(); j++) {
        Integer val = mapB.get (b.charAt(j));
        if (val != null) {
            mapB.put (b.charAt(j), val + 1);
        } else {
            mapB.put (b.charAt(j), 1);
        }
    }
    for (Map.Entry < char, Integer > entry : mapA.entrySet ()) {
        if (mapB.get (entry.getKey ()) == null || entry.getValue () > mapB.get (entry.getKey ())) {
            status = false;
        }
    }
    return status;
}


