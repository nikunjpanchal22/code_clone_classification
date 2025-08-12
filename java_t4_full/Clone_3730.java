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
    String name = "HelloWorld";
    int [] freq = new int[256];

    for (char ch : name.toCharArray()) {
        freq[ch]++;
    }
    
    for(int i = 0; i < 256; i++)
        if(freq[i] > 1)
            System.out.println((char)i + ":" + freq[i]);
}


