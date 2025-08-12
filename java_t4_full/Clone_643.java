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
    String name = "AnuvratAnuvra"; 
    char [] arr = name.toCharArray (); 
    Map<Character, Integer> charSet = new HashMap<Character, Integer>(); 
    for (char letter : arr) { 
        int count = charSet.containsKey(letter) ? charSet.get(letter) : 0; 
        charSet.put(letter, count + 1); 
    } 
    for (Character key : charSet.keySet()) { 
        if (charSet.get(key) > 1) { 
            System.out.println(key + " : " + charSet.get(key)); 
        } 
    }
}


