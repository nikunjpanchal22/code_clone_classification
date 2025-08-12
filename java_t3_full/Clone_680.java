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
    for (char c : arr) {
        int count = map.getOrDefault(c, 0) + 1;
        map.put(c, count);
    }
    for (Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() > 1) {
            Character key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}


