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
    int i = 0;
    while (i < n/2) {
        if (s.charAt (i) != s.charAt (n - i - 1)) {
            return false;
        }
        i++;
    }
    return true;
}


