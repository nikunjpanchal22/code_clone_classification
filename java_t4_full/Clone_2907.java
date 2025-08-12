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
    if (s1.length() != s2.length()){
        return false;
    }

    int[] alphabet = new int[26];
    for (int i = 0; i < s1.length(); i++) {
        alphabet[s1.charAt(i)-'a']++;
        alphabet[s2.charAt(i)-'a']--;
    }

    for (int i: alphabet){
        if(i!=0){
            return false;
        } 
    }
    return true;
}


