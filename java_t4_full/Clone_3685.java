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
    String name = "AnuvratAnuvrat";
    char [] letters = name.toCharArray ();
    TreeMap < Character, Integer > treeMap = new TreeMap < Character, Integer > ();
    for (char letter : letters) {
        treeMap.put (letter, treeMap.getOrDefault(letter,0)+1);
    }
    treeMap.forEach((k, v) -> { if (v>1) System.out.println(k + ":" + v); });
}


