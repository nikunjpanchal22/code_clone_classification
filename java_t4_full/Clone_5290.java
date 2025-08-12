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
        Map<Character,Integer> letterCount = new HashMap<>();
        for(char c : a.toCharArray())
            letterCount.merge(c, 1, Integer::sum);
        for(char c : b.toCharArray()){
            if (letterCount.get(c) == null || letterCount.get(c) == 0)
            return false;
            else
            letterCount.merge(c, -1, Integer::sum);
        }
        return true;
}


