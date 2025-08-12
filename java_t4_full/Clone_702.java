private static boolean isPermutation (String a, String b) {
    char [] aArray = a.toCharArray ();
    char [] bArray = b.toCharArray ();
    if (a.length () != b.length ()) {
        return false;
    }
    int found = 0;
    for (int i = 0;
    i < aArray.length; i ++) {
        char eachA = aArray [i];
        for (int k = 0;
        k < bArray.length; k ++) {
            if (eachA == bArray [k]) {
                found ++;
                bArray [k] = '\uFFFF';
                break;
            }
        }
    }
    return found == a.length ();
}


  private static boolean isPermutation(String a, String b) {
    if (a == null || b == null || a.length() != b.length()) 
        return false; 
  
    int[] counts = new int[256]; 
    for (int i = 0; i < a.length(); i++)  
        counts[a.charAt(i)]++; 
  
    for (int i = 0; i < b.length(); i++) { 
        counts[b.charAt(i)]--; 
          
        if (counts[b.charAt(i)] < 0) 
            return false; 
    } 
    return true; 
}


