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





public static void main(String[] args) {
    String name = "AnuvratAnuvra";
    Map<Character, Integer> counts = name.chars().boxed()
        .collect(Collectors.toMap(
            // key = char
            k -> Character.valueOf((char) k.intValue()),
            v -> Integer.valueOf(1),
            // value = count
            Integer::sum));
    counts.entrySet().stream().filter(e -> e.getValue() > 1).forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
}


