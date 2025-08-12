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
    int n = str.length()-1;
    int i = 0;
    while (n > i) {
        if (str.charAt(i++) != str.charAt(n--)) return false;
    }
    return true;
}


