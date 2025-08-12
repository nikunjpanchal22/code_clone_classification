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
    char[] arr = name.toCharArray();
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        char c = arr[i];
        if (map.containsKey(c)) {
            map.put(c, map.get(c) + 1);
        } else {
            map.put(c, 1);
        }
    }
    Iterator<Entry<Character, Integer>> itr = map.entrySet().iterator();
    while (itr.hasNext()) {
        Entry<Character, Integer> entry = itr.next();
        if (entry.getValue() > 1) {
            Character key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}


