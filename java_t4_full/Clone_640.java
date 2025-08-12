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
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    String name = "AnuvratAnuvra";
    for (int i=0; i<name.length (); i++) {
        char key = name.charAt (i);
        if (map.containsKey(key)){
            map.put (key, map.get(key) + 1);
        }
        else { 
            map.put (key, 1);
        }
    }
    for (Map.Entry<Character, Integer> entry : map.entrySet()){
        if (entry.getValue () > 1) {
            System.out.println (entry.getKey () + " : " + entry.getValue ());
        }
    }
}


