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
    if(s.length()==0 || s.length()==1)
        return true;
    if(s.charAt(0)==s.charAt(s.length()-1))
        return isPalindrome(s.substring(1,s.length()-1));
    return false;
}


