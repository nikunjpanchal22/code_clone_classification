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





public static boolean contains(String source, String needle) {
    if (needle == null || needle.isEmpty())
        return true;
    if (source == null || source.isEmpty())
        return false;
      
    Map<Character, Integer> frequency = new HashMap<Character, Integer>();
      
    for (char c : source.toCharArray())
        frequency.put(c, frequency.getOrDefault(c, 0) + 1);
    for (char c : needle.toCharArray()) {
        if (!frequency.containsKey(c) || frequency.get(c) == 0)
            return false;
        frequency.put(c, frequency.get(c) - 1);
    }
    return true;
}


