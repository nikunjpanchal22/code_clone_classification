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


public static boolean isPalindrome2 (String str) {
    str = str.toUpperCase ();
    char [] strChars = str.toCharArray ();
    Set < Character > word = new HashSet < > ();
    for (char c : strChars) {
        word.add (c);
    }
    while (true) {
        if ((word.size () == 1) || (word.size () == 0)) {
            return true;
        }
        if (word.iterator ().next () == word.stream ().reduce ((x, y)->y).orElse (null)) {
            word.remove (word.iterator ().next ());
            word.remove (word.stream ().reduce ((x, y)->y).orElse (null));
        } else {
            return false;
        }
    }
}
