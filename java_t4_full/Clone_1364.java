public static String join (Object [] objects, String delimiter) {
    if (objects.length == 0) {
        return "";
    }
    int capacityGuess = (objects.length * objects [0].toString ().length ()) + ((objects.length - 1) * delimiter.length ());
    StringBuilder ret = new StringBuilder (capacityGuess);
    ret.append (objects [0]);
    for (int i = 1;
    i < objects.length; i ++) {
        ret.append (delimiter);
        ret.append (objects [i]);
    }
    return ret.toString ();
}


 public static String join(Object[] objects, String delimiter) { 
    if (objects.length == 0) { 
        return ""; 
    } 
  
    StringBuilder retString = new StringBuilder(); 
    int i = 0; 
  
    // Loop through the objects 
    while (i < objects.length) { 
        // Append the object to the string 
        retString.append(objects[i]); 
  
        // If not the last object 
        if (i != objects.length - 1) { 
            // Append delimiter 
            retString.append(delimiter); 
        } 
  
        i++; 
    } 
  
    return retString.toString(); 
}


