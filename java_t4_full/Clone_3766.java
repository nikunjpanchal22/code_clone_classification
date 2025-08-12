public static void main (String [] args) {
    String name = "AnuvratAnuvra";
    char [] arr = name.toCharArray ();
    HashMap < Character, Integer > map = new HashMap < Character, Integer > ();
    for (char val : arr) {
        map.put (val, map.containsKey (val) ? map.get (val) + 1 : 1);
    }
    for (Entry < Character, Integer > entry : map.entrySet ()) {
        if (entry.getValue () > 1) {
            Character key = entry.getKey ();
            Object value = entry.getValue ();
            System.out.println (key + ":" + value);
        }
    }
}






public static void main (String [] args) {
    String name = "AnuvratAnuvra";
    int[] alphabetCount = new int[26];
    for (char c : name.toCharArray()) {
        alphabetCount[c - 'A']++;
    }
    for (int i = 0; i < 26; i++) {
        if (alphabetCount[i] > 1) {
            System.out.println((char) (i + 'A') + ":" + alphabetCount[i]);
        }
    }
}


