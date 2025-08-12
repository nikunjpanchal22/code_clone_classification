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
    if (a.length() != b.length()) return false;

    int length = a.length();
    for(int i=0; i<length; i++) {
        if(b.indexOf(a.charAt(i)) == -1) return false;
        b = b.substring(0, b.indexOf(a.charAt(i))) + b.substring(b.indexOf(a.charAt(i)) + 1);
    }

    return true;
}


