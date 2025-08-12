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
    char [] arr = name.toCharArray();
    Map<Character, Integer> charMap=new HashMap<Character, Integer>();
    for (int i = 0; i < arr.length; i++) {
        Character c = arr[i];
        if (charMap.containsKey(c)) {
            int count = charMap.get(c);
            charMap.put(c, ++count);
        } else {
            charMap.put(c, 1);
        }
    }
    Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
    for (Map.Entry<Character, Integer> entry : entrySet) {
        if (entry.getValue() > 1) {
            Character key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + ":" +value);
        }
    }
}


