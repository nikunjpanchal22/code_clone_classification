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
    String name = "AnuvratAnuvrat";
    char[] chars = name.toCharArray();
    Hashtable<Character, Integer> hashtable = new Hashtable<>();
    for (char c : chars) {
        hashtable.put(c, hashtable.getOrDefault(c, 0) + 1);
    }
    for(Map.Entry<Character, Integer> entry: hashtable.entrySet()) {
        if(entry.getValue() > 1) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}


