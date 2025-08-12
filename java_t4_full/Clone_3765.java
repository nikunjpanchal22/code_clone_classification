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
    Map<Character, Integer> charCountMap = new LinkedHashMap<>();
    for (int i = 0; i < name.length(); i++) {
        char charAt = name.charAt(i);
        charCountMap.put(charAt, charCountMap.getOrDefault(charAt, 0) + 1);
    }
    charCountMap.entrySet().forEach(e -> {
        if(e.getValue() > 1) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    });
}


