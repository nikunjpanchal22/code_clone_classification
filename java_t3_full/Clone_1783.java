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
    while (n-- > 0) {
        if (s.charAt (n/2) != s.charAt (n-n/2-1)) {
            return false;
        }
    }
    return true;
}


