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





public static String numLetters (String s) {
    int [] count = new int [26];
    s.chars().forEach(c -> count[c - 'a']++);
    StringBuilder ans = new StringBuilder();
    IntStream.rangeClosed('a', 'z').filter(i -> count[i-'a']>0)
        .forEach(i -> ans.append(count[i - 'a']).append((char)i));
    return ans.toString();
}


