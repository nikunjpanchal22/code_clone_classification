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
    int[] counterA = new int[26];
    int[] counterB = new int[26];

    for(int i = 0; i < a.length(); i++){
        char currentChar = Character.toLowerCase(a.charAt(i));
        counterA[currentChar - 'a']++;
    }

    for(int i = 0; i < b.length(); i++){
        char currentChar = Character.toLowerCase(b.charAt(i));
        counterB[currentChar - 'a']++;
    }

    boolean status = true;
    for(int i = 0; i < 26; i++){
        if (counterA[i] > counterB[i])
            status = false;
    }
    return status;
}


