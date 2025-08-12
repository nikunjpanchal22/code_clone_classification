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
    char[] letters = name.toCharArray();
    Map<Character,Integer> map = new LinkedHashMap<>();
    for (char letter: letters) {
        map.merge(letter, 1, Integer::sum);
    }
    map.entrySet().stream().filter((k) -> k.getValue()>1).forEach((k) -> System.out.println(k.getKey() + ":" + k.getValue()));
}


