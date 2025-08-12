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
    if(a.length() != b.length()) return false;
    char[] mapA = new char[26];
    char[] mapB = new char[26];
    for(int i = 0; i < a.length(); i++){
        mapA[a.charAt(i) - 97]++;
        mapB[b.charAt(i) - 97]++;
    }
    for(int j = 0; j < 26; j++){
        if(mapA[j] != mapB[j]) return false;
    }
    return true;
}


