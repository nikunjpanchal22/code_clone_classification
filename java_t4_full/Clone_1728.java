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
    int start = 0;
    int end = str.length()-1;
    while (start < end){
        char first = str.charAt(start);
        char last = str.charAt(end);
        if(first != last){
            return false;
        }
        start++;
        end--;
    }
    return true;
}


