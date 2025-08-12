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
    if (a == null || b == null || a.length() != b.length()){
        return false;
    }
    char[] aArr = a.toCharArray();
    int[] charCounter = new int[26];
    for (char c : aArr){
        charCounter[c - 'a']++;
    }
    for (int i = 0; i < b.length(); i++){
        int c = b.charAt(i) - 'a';
        charCounter[c]--;
        if (charCounter[c] < 0){
            return false;
        }
    }
    return true;
}


