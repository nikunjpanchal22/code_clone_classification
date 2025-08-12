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
    Map<Character, Integer> uniqueChar = new HashMap<Character, Integer>(); 
    for (int i = 0; i < arr.length; i++) { 
        if (uniqueChar.containsKey(arr[i])) { 
            int count = uniqueChar.get(arr[i]); 
            uniqueChar.put(arr[i], count + 1); 
        } 
        else { 
            uniqueChar.put(arr[i], 1); 
        } 
    } 
    for (Map.Entry<Character, Integer> entr: uniqueChar.entrySet()) { 
        if (entr.getValue() > 1) 
            System.out.println(entr.getKey() + " : " + entr.getValue()); 
    } 
}


