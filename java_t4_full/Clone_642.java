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
    Map<Character, Integer> count = new HashMap<Character, Integer>(); 
    for (int i = 0; i < arr.length; i++) { 
        if (count.containsKey(arr[i])) { 
            int val = count.get(arr[i]); 
            count.put(arr[i], val + 1); 
        } 
        else { 
            count.put(arr[i], 1); 
        } 
    } 
    for (Map.Entry<Character, Integer> entry : count.entrySet()) { 
        if (entry.getValue() > 1) 
            System.out.println(entry.getKey() + " : " + entry.getValue()); 
    } 
}


