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
    
    for (int i = 0; i < a.length(); i++) {
        char currentCharacter = a.charAt(i);
        if (mapA.containsKey(currentCharacter)) {
            mapA.put(currentCharacter, mapA.get(currentCharacter) + 1);
        } else {
            mapA.put(currentCharacter, 1);
        }
    }
    
    for (int i = 0; i < b.length(); i++) {
        char currentCharacter = b.charAt(i);
        if (mapB.containsKey(currentCharacter)) {
            mapB.put(currentCharacter, mapB.get(currentCharacter) + 1);
        } else {
            mapB.put(currentCharacter, 1);
        }
    }
    
    for (Character character : mapA.keySet()) {
        int aValue = mapA.get(character);
        int bValue = mapB.get(character);
        if (bValue < aValue) {
            status = false;
        }
    }
    return status;
}


