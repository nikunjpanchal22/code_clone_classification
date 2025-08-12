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
    char [] chars = name.toCharArray ();
    SortedMap < Character, Integer > sortedMap = new TreeMap < > ();
    for (char c : chars) {
        sortedMap.put (c, sortedMap.getOrDefault(c, 0) + 1);
    }
    sortedMap.entrySet().stream().filter(e -> e.getValue() > 1).forEach(e -> System.out.println(e.getKey()+ ":" +e.getValue()));
}


