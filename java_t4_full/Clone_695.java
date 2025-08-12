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
    if (a == null || b == null || a.length() != b.length()) { 
        return false; 
    } 
  
    Map<Character, Integer> countA = new HashMap<>(); 
    Map<Character, Integer> countB = new HashMap<>(); 
  
    // Store the counts of characters in both strings 
    for (char c : a.toCharArray()) { 
        countA.put(c, countA.getOrDefault(c, 0) + 1); 
    } 
    for (char c : b.toCharArray()) { 
        countB.put(c, countB.getOrDefault(c, 0) + 1); 
    } 
  
    // Compare the counts of both strings 
    for (Map.Entry<Character, Integer> entry : countA.entrySet()) { 
        if (!countB.containsKey(entry.getKey())) 
            return false; 
        if (!countB.get(entry.getKey()).equals(entry.getValue())) 
            return false; 
    } 
    return true; 
}


