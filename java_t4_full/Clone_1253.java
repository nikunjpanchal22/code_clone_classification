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
    int [] lettercountsA = new int[26];
    int [] lettercountsB = new int[26];
   
    // each letter occupies an index, representing a count 0 
    
    for (int i = 0; i < a.length(); i++)
        lettercountsA[a.charAt(i) - 'a']++;
  
    for (int i = 0; i < b.length(); i++)
        lettercountsB[b.charAt(i) - 'a']++;
  
    // loop through and check all the letter counts in A and B
    for (int i = 0; i < 26; i++) 
        if (lettercountsA[i] != lettercountsB[i]) 
            return false; 
   
    return true;
    
}


