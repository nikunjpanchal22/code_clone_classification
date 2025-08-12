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
        char currentChar = a.charAt(i);
        if (mapA.containsKey(currentChar)) {
            int count = mapA.get(currentChar);
            mapA.put(currentChar, count + 1);
        } else {
            mapA.put(currentChar, 1);
        }
    }

    for (int i = 0; i < b.length(); i++) {
        char currentChar = b.charAt(i);
        if (mapB.containsKey(currentChar)) {
            int count = mapB.get(currentChar);
            mapB.put(currentChar, count + 1);
        } else {
            mapB.put(currentChar, 1);
        }
    }

    for (Character character : mapA.keySet()) {
        int countA = mapA.get(character);
        int countB = mapB.getOrDefault(character, 0);
        if (countB < countA) {
            status = false;
            break;
        }
    }
    return status;
}


