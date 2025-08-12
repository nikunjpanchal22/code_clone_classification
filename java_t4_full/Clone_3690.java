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
    ConcurrentMap <Character, Integer> frequencyMap = new ConcurrentHashMap <>();
    for (char c : name.toCharArray()) {
        frequencyMap.putIfAbsent(c, 0);
        frequencyMap.put(c, frequencyMap.get(c) + 1);
    }
    frequencyMap.entrySet().stream().filter(x -> x.getValue() > 1).forEach(x -> System.out.println(x.getKey() + ":" + x.getValue()));
}


