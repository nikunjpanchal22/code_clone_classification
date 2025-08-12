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
    String reversed = "";
    for(int i = s.length()-1; i >= 0; i--)
        reversed += s.charAt(i);
    return s.equals(reversed);
}


