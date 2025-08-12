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
    int j = s.length () - 1;
    for (int i = 0; i < s.length ()/2; i++) {
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        j--;
    }
    return true;
}


