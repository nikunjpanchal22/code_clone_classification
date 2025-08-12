boolean isPalindrome (String s) {
    int n = s.length ();
    for (int i = 0;
    i < (n / 2); ++ i) {
        if (s.charAt (i) != s.charAt (n - i - 1)) {
            return false;
        }
    }
    return true;
}


 boolean isPalindrome (String s) {
    int n = s.length ();
    for (int i=0; i < (n/2); i++) {
        if (!s.substring (i, i+1).equals (s.substring (n-i-1, n-i))) {
            return false;
        }
    }
    return true;
}


