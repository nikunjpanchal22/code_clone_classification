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


 

boolean isPalindrome(String s) {
    int left = 0, right = s.length() - 1;
    while(left < right) {
        if (s.charAt(left++) != s.charAt(right--))
            return false;
    }
    return true;
}


