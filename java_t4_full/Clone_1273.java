public static boolean contains (String a, String b) {
    boolean status = true;
    Map < String, Integer > mapA = new HashMap < > ();
    Map < String, Integer > mapB = new HashMap < > ();
    for (char i : a.toCharArray ()) {
        Integer val = mapA.get ("" + i);
        if (val != null) {
            mapA.put ("" + i, val + 1);
        } else {
            mapA.put ("" + i, 1);
        }
    }
    for (char i : b.toCharArray ()) {
        Integer val = mapB.get ("" + i);
        if (val != null) {
            mapB.put ("" + i, val + 1);
        } else {
            mapB.put ("" + i, 1);
        }
    }
    for (Map.Entry < String, Integer > entry : mapA.entrySet ()) {
        if (mapB.get (entry.getKey ()) == null || entry.getValue () > mapB.get (entry.getKey ())) {
            status = false;
        }
    }
    return status;
}


  public static boolean contains (String a, String b) {
    
       Map<Character, Integer> mapA = new HashMap<>();
       Map<Character, Integer> mapB = new HashMap<>();
       boolean contains = true;
       
       //iterate through each character in string a and add to a map 
       for (int i = 0; i < a.length(); i++){
          
           char currentChar = a.charAt(i);
           
           //if the character already exists, increase count 
           if (mapA.containsKey(currentChar)){
               mapA.put (currentChar, mapA.get(currentChar) +1);
           }else{
               mapA.put (currentChar, 1);
           }
       }
       
       //iterate through each character in string b and add to a map 
       for (int i = 0; i < b.length(); i++){
          
           char currentChar = b.charAt(i);
           
           //if character already exists, increase count 
           if (mapB.containsKey(currentChar)){
               mapB.put (currentChar, mapB.get(currentChar) +1);
           }else{
               mapB.put (currentChar, 1);
           }
       }
       
       //iterate through the map of a and check if b contains the character 
       for (Map.Entry<Character, Integer> entry : mapA.entrySet()) {
           
          if (mapB.get(entry.getKey()) == null || entry.getValue() > mapB.get(entry.getKey()) ){
              contains = false;
          }
       }
       return contains;
    }

 public static boolean contains(String a, String b) {
    boolean status = true;
    Map<Character, Integer> mapA = new HashMap<>();
    Map<Character, Integer> mapB = new HashMap<>();
  
    for (int i = 0; i < a.length(); i++){
        char c = a.charAt(i);
        if (mapA.containsKey(c)) {
            mapA.put(c, mapA.get(c) + 1);
        } else {
            mapA.put(c, 1);
        }
    }

    for (int i = 0; i < b.length(); i++){
        char c = b.charAt(i);
        if (mapB.containsKey(c)) {
            mapB.put(c, mapB.get(c) + 1);
        } else {
            mapB.put(c, 1);
        }
    }

    for (Character character : mapA.keySet()) {
        int countA = mapA.get(character);
        int countB = mapB.get(character);
        if (countB < countA) {
            status = false;
            break;
        }
    }
    return status;
}


