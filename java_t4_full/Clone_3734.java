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
    String name = "RammsteinRocks";
    
    Map<Character, Integer> characterCountMap = name.chars()
        .boxed()
        .collect(Collectors.toMap(
        // key = char
        k -> Character.valueOf((char) k.intValue()),
        v -> 1, // 1 occurence
        Integer::sum)); // counting
        
    characterCountMap.entrySet().stream()
        .filter(p -> p.getValue() > 1)
        .forEach(p -> System.out.println(p.getKey() + " : " + p.getValue()));
}


