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
    String s = "JavaScript";
    Map<Character, Integer> frequencyRef = new TreeMap<>();
    
    for(int i = 0 ; i < s.length(); i++){
        char key = s.charAt(i);
        if(frequencyRef.containsKey(key)) {
            frequencyRef.put(key, frequencyRef.get(key) + 1);
        } else {
            frequencyRef.put(key, 1);
        }
    }
    
    frequencyRef.forEach((k, v) -> {
        if(v > 1) {
            System.out.println(k + " : " + v);
        }
    });
}


