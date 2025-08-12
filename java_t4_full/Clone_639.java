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
    LinkedHashMap < Character, Integer > hmap = new LinkedHashMap < Character, Integer > (); 
    for (char key : arr) {
        if (hmap.containsKey (key)) {
            int value = hmap.get (key);
            hmap.put (key, value + 1); 
        }  
        else {
            hmap.put (key, 1); 
        }
    } 
    for (Map.Entry < Character, Integer > val : hmap.entrySet ()) {
        if (val.getValue () > 1) 
            System.out.println(val.getKey () + " : " + val.getValue ()); 
    }
}


