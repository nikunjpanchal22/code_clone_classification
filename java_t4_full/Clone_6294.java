public static String numLetters (String s) {
    int [] count = new int [26];
    for (int i = 0;
    i < s.length (); i ++) {
        char c = s.charAt (i);
        count [(int) (c - 'a')] ++;
    }
    String ans = "";
    for (int i = 0;
    i < 26; i ++) {
        if (count [i] != 0) {
            ans += String.valueOf (count [i]) + (char) (i + 'a');
        }
    }
    return ans;
}





public static String numLetters(String s){
    StringBuilder ans = new StringBuilder();
    long freq;
    for(char c='a'; c<='z'; c++){
        freq = s.chars().filter(ch -> ch == c).count();
        if(freq > 0 ) ans.append(freq).append(c);
    }
    return ans.toString();
}


