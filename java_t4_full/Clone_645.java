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
    int[] charSet = new int[128]; 
    String name = "AnuvratAnuvra";
    char [] arr = name.toCharArray ();
    for (char c : arr) {
        int index = (int) c;  
         if (charSet[index] == 0) { 
            charSet[index] += 1; 
        }  
        else {  
            System.out.println(c + " : " + charSet[index] + 1);
        }  
    }
}


