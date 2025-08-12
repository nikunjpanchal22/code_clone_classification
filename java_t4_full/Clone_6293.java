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
    Stream.of(s.split("")).forEach(str -> count[str.charAt(0) - 'a']++);
    StringBuilder ans = new StringBuilder();
    IntStream.range(0, 26).forEach(i -> 
        {if (count[i] != 0) ans.append(count[i]).append((char) (i + 'a'));});
    return ans.toString();
}


