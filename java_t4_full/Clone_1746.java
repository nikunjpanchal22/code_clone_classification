public static boolean isPalindrome (String str) {
    str = str.toUpperCase ();
    char [] strChars = str.toCharArray ();
    List < Character > word = new ArrayList < > ();
    for (char c : strChars) {
        word.add (c);
    }
    while (true) {
        if ((word.size () == 1) || (word.size () == 0)) {
            return true;
        }
        if (word.get (0) == word.get (word.size () - 1)) {
            word.remove (0);
            word.remove (word.size () - 1);
        } else {
            return false;
        }
    }
}


 public static boolean isPalindrome (String str) {
    str = str.toUpperCase ();
    char [] strChars = str.toCharArray ();

    int j = strChars.length-1;
    for (int i = 0; i < strChars.length / 2;i ++) {
        if (strChars[i] != strChars[j--]) {
            return false;
        }
    }
    return true;       
}


