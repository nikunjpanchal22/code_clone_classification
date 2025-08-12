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
    Map<Character, Integer> countMap = new HashMap<>();
    for (int i = 0; i < a.length(); i++) {
        char currChar = a.charAt(i);
        int count = countMap.getOrDefault(currChar, 0);
        countMap.put(currChar, count + 1);
    }
    for (int i = 0; i < b.length(); i++) {
        char currChar = b.charAt(i);
        if (!countMap.containsKey(currChar)) {
            return false;
        } else {
            int count = countMap.get(currChar);
            if (count == 1) {
                countMap.remove(currChar);
            } else {
                countMap.put(currChar, count - 1);
            }
        }
    }
    return countMap.size() == 0;
}


