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
    Map <Character, Integer> frequencyMap = new LinkedHashMap <>();
    for (char c: name.toCharArray()) {
        frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
    }
    frequencyMap.entrySet().removeIf(e -> e.getValue()==1);
    frequencyMap.forEach((k, v) -> System.out.println(k + ":" + v));
}


