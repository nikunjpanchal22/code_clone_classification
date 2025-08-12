static boolean isAnagram (String s1, String s2) {
    if (s1.length () != s2.length ()) return false;
    int n = s1.length ();
    int [] charMap = new int [256];
    for (int i = 0;
    i < n; i ++) {
        char c1 = s1.charAt (i);
        charMap [c1] ++;
        char c2 = s2.charAt (i);
        charMap [c2] --;
    }
    for (int i = 0;
    i < charMap.length; i ++) {
        if (charMap [i] != 0) return false;
    }
    return true;
}





static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) return false;

    int sum1 = 0;
    int sum2 = 0;
    
    for(int i=0; i<s1.length(); i++) {
        sum1 += s1.charAt(i);
        sum2 += s2.charAt(i);
    }

    return sum1 == sum2;
}


