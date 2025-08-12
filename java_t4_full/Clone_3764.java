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
        String name = "AnuvratAnuvra";
        int lng = name.length();
        Map<String, Integer> charMap = new HashMap<>();
        for (int i = 0; i < lng; i++) {
            String ch = String.valueOf(name.charAt(i));
            if (charMap.containsKey(ch)) {
            charMap.put(ch, charMap.get(ch) + 1);
            } 
            else {
            charMap.put(ch, 1);
            }     
        }
        for (Map.Entry<String, Integer> e : charMap.entrySet()) {
            if(e.getValue() > 1) 
            {
            System.out.println(e.getKey() + " : " + e.getValue());
            }
        }
}


