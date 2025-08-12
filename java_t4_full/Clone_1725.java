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
   String revString = "";
    for (int i=s.length()-1;i>=0;i--){
        revString = revString + s.charAt(i);
    }
    if(revString.equals(s)){
        return true;
    }
    else{
        return false;
    }
}


