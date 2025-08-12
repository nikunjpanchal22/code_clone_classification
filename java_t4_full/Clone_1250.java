public static boolean contains (String a, String b) {
    int diff = a.length () - b.length ();
    while (a.length () > 0) {
        b = b.replace (a.substring (0, 1), "");
        a = a.replace (a.substring (0, 1), "");
        if (diff != a.length () - b.length ()) return false;
    }
    return true;
}


 public static boolean contains (String a, String b) { 
    // Store the frequency of characters in the two strings 
    int[] stringA = new int[26]; 
    int[] stringB = new int[26]; 
  
    if (a.length() != b.length()) 
        return false; 
  
    for (int i = 0; i < a.length(); i++) { 
        int charA = a.charAt(i) - 'A'; 
        int charB = b.charAt(i) - 'A'; 
        stringA[charA]++; 
        stringB[charB]++; 
    } 
    for (int i = 0; i < 26; i++) { 
        if (stringA[i] != stringB[i]) 
            return false; 
    } 
    return true; 
}


