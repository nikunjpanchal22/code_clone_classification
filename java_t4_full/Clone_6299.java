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
    return IntStream.range('a', 'z'+1)
        .filter(i->s.indexOf(i)!=-1)
        .mapToObj(i->String.format("%d%c", s.length()-s.replaceAll(""+(char)i, "").length(), i))
        .collect(Collectors.joining());    
}


