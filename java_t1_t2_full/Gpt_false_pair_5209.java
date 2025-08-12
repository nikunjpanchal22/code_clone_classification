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


boolean isPalindrome (String parameter) {
    int size = parameter.length ();
    for (int i = 0;
    i < (size / 2); ++ i) {
        if (parameter.charAt (i) != parameter.charAt (size - i - 1)) {
            return false;
        }
    }
    return true;
}
