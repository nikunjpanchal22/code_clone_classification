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
    int a_length = a.length();
    int b_length = b.length();
    int[][] char_counts = new int[a_length][b_length];
    boolean status = true;

    for (int i = 0; i < a_length; i++) {
        for (int j = 0; j < b_length; j++) {
            if (a.charAt(i) == b.charAt(j)) {
                char_counts[i][j] = 1;
            }
        }
    }

    for (int i = 0; i < a_length; i++) {
        int count = 0;
        for (int j = 0; j < b_length; j++) {
            count += char_counts[i][j];
        }
        if (count == 0) {
            status = false;
            break;
        }
    }

    return status;
}


