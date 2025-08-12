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
    boolean status = true;
    Map<Character, Integer> mapA = new HashMap<>();
    Map<Character, Integer> mapB = new HashMap<>();

    // iterate through every character in a and add to mapA
    for (int i = 0; i < a.length(); i++) {
        char currentChar = a.charAt(i);
        
        if (mapA.containsKey(currentChar)) {
            mapA.put(currentChar, mapA.get(currentChar) + 1);
        } else {
            mapA.put(currentChar, 1);
        }
    }

    // iterate through every character in b and add to mapB
    for (int i = 0; i < b.length(); i++) {
        char currentChar = b.charAt(i);

        if (mapB.containsKey(currentChar)) {
            mapB.put(currentChar, mapB.get(currentChar) + 1);
        } else {
            mapB.put(currentChar, 1);
        }
    }

    // iterate through mapA to see if the character exists in mapB
    for (Character character : mapA.keySet()) {
        int countA = mapA.get(character);
        int countB = mapB.getOrDefault(character, 0);

        if (countB < countA) {
            status = false;
        }
    }
    return status;
}


