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
    char [] arr = name.toCharArray ();
    HashMap < Character, Integer > map = new HashMap < Character, Integer > ();
    for (int i = 0; i < arr.length; i++){
        if (map.containsKey(arr[i])){
            int currentValue = map.get(arr[i]);
            map.put(arr[i], ++currentValue);
        } else {
            map.put(arr[i], 1);
        }
    }
    for (Character key : map.keySet()){
        if (map.get(key) > 1){
            System.out.println(key + ":" + map.get(key));
        }
    }
}


