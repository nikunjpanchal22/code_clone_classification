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
    int length = str.length();
	for(int i=0; i<length/2; ++i) {
        if(str.charAt(i) != str.charAt(length-i-1)) {
            return false;
        }
    }
    return true;
}


