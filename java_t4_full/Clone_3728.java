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
    String name = "BelieversNeverDie";
    char [] inArray = name.toCharArray();
    
    HashMap <Character, Integer> frequencyOfChar = new HashMap<>();
    for (char element : inArray) {
        frequencyOfChar.put(element, frequencyOfChar.containsKey(element) ? frequencyOfChar.get(element) + 1 : 1);
    }
    
    frequencyOfChar.entrySet().stream()
        .filter(entry -> entry.getValue() > 1)
        .forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
}


