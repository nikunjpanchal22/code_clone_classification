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





public static void main(String[] args) 
{ 
    String str = "AnuvratAnuvra"; 
    int count[] = new int[256]; 
    for (int i = 0; i < str.length(); i++) 
        count[str.charAt(i)]++; 
    for (int i = 0; i < str.length(); i++) { 
        if (count[str.charAt(i)] > 1) { 
            System.out.println(str.charAt(i) + ":" + count[str.charAt(i)]);
            count[str.charAt(i)] = 0; 
        } 
    } 
}


