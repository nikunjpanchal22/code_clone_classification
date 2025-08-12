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
    long distinct = name.chars().distinct().count();
    long total = name.length();
    if (total > distinct) {
        name.chars().distinct().forEach(c -> System.out.println((char) c + ":" +
                name.length() - name.replaceAll(String.valueOf((char) c), "").length()));
    }
}


