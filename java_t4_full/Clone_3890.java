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
    Map<Character, Integer> occurrencesMap = new HashMap<>();

    for (int i = 0; i < a.length(); i++) {
        char charA = a.charAt(i);
        int prevValue = occurrencesMap.getOrDefault(charA, 0);
        occurrencesMap.put(charA, prevValue + 1);
    }

    for (int i = 0; i < b.length(); i++) {
        char charB = b.charAt(i);
        if (!occurrencesMap.containsKey(charB)) {
            return false;
        }
        int count = occurrencesMap.get(charB);
        if (count == 0) return false;
        else occurrencesMap.put(charB, count - 1);
     }

     return true;
}


