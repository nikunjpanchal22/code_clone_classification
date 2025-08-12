public static boolean isAnagram (String s1, String s2) {
    if (s1.length () != s2.length ()) {
        return false;
    }
    for (int i = 0;
    i < s2.length (); i ++) {
        if (! s1.contains ("" + s2.charAt (i))) {
            return false;
        }
        s1 = s1.replaceFirst ("" + s2.charAt (i), "");
        s2 = s2.replaceFirst ("" + s2.charAt (i), "");
    }
    return true;
}



 


public static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) {
        return false;
    }
    int[] charCount = new int[256];
    for (int i=0; i < s1.length(); i++) {
        charCount[s1.charAt(i)]++;
        charCount[s2.charAt(i)]--;
    }
    for (int count : charCount) {
        if (count != 0) {
            return false;
        }
    }
    return true;
}


