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
    String inputString = "MichaelJackson";
    int[] count = new int[256];
    Arrays.fill(count, 0);
    for (int i=0; i<inputString.length(); i++)
        count[(int)inputString.charAt(i)]++;
    for (int i=0; i<256; i++)
        if (count[i] > 1)
            System.out.printf("%c: %d\n", i, count[i]);
}


