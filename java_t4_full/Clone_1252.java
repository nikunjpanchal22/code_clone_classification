public static boolean contains (String a, String b) {
    int diff = a.length () - b.length ();
    while (a.length () > 0) {
        b = b.replace (a.substring (0, 1), "");
        a = a.replace (a.substring (0, 1), "");
        if (diff != a.length () - b.length ()) return false;
    }
    return true;
}


 public static boolean contains(String a, String b) {
    if (a.length() != b.length()) 
        return false; 
  
    // Store count of all  
    // characters of second String 
    int count[] = new int[256]; 
    int i; 
    for (i = 0; i < b.length(); i++) 
        count[b.charAt(i)]++; 
  
    // Find count of characters of 
    // first String 
    for (i = 0; i < a.length(); i++) { 
        if (count[a.charAt(i)] == 0) 
            return false; 
  
        count[a.charAt(i)]--; 
    } 
  
    return true;
}


