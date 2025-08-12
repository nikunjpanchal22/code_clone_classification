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


public static boolean isAnagram (String s1, String s2) {
    if (s1.length () != s2.length ()) {
        return false;
    }
    String temp1 = s1;
    String temp2 = s2;
    for (int i = 0;
    i < s2.length (); i ++) {
        if (! temp1.contains ("" + s2.charAt (i))) {
            return false;
        }
        temp1 = temp1.replaceFirst ("" + s2.charAt (i), "");
        temp2 = temp2.replaceFirst ("" + s2.charAt (i), "");
    }
    return true;
}
