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
    if(s == null)
        return false;
    return IntStream.range(0, s.length() / 2)
        .noneMatch(p -> s.charAt(p) != s.charAt(s.length() - p - 1));
}


