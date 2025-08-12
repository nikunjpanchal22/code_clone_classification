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
    for(int i = 0, j = s.length() - 1; i < j; i++, j--)
        if (s.charAt(i) != s.charAt(j))
            return false;
    return true;
}


