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
    char[] chars = s.toCharArray();
    String reverseWord = "";
    for(int i= chars.length-1; i>=0; i--){
        reverseWord = reverseWord+chars[i];
    }
    return s.equals(reverseWord);
}


