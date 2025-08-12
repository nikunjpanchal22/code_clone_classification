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
    String name = "CommitStripComic";
    
    IntStream stream = name.chars();
    Map<Character, Long> collect = stream.collect(HashMap::new, 
            (m,c) -> m.put((char)c, m.getOrDefault((char)c, 0L)+1), 
            Map::putAll);

    collect.entrySet().stream()
        .filter(map -> map.getValue() > 1)
        .forEach(entry -> System.out.println(entry.getKey()+": "+entry.getValue()));
}


