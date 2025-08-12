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
      
    while (a.length() != 0 && b.length() != 0) { 
          
        int aFirstChar = a.charAt(0); 
        int bFirstChar = b.charAt(0); 
          
        int aIndex = a.indexOf(bFirstChar); 
        int bIndex = b.indexOf(aFirstChar); 
          
        //assuming both Strings contains only English alphabets 
        if (aIndex == -1 || bIndex == -1 || aIndex != bIndex)  
            return false; 
          
        String aRemaining = a.substring(1); 
        String bRemaining = b.substring(1); 
          
        return isPermutation(aRemaining, bRemaining); 
    } 
      
    return true; 
}


