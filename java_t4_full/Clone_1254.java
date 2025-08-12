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
    int[] char_countsA = new int[128];
    int[] char_countsB = new int[128]; 
  
    for (int i = 0; i < a.length(); i++) 
        char_countsA[a.charAt(i)]++; 
  
    for (int i = 0; i < b.length(); i++) 
        char_countsB[b.charAt(i)]++; 
  
 
    for (int i = 0; i < 128; i++) 
        if (char_countsA[i] != char_countsB[i]) 
            return false; 

  
    return true;
}


