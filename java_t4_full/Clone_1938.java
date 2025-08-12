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
    Map<Character, Integer> counts = new HashMap<>();
    for(char c : s.toCharArray()) {
        counts.put(c, counts.getOrDefault(c, 0) + 1);
    }
    StringBuilder sb = new StringBuilder();
    for(Map.Entry<Character, Integer> e : counts.entrySet()) {
        sb.append(e.getValue()).append(e.getKey());
    }
    return sb.toString();
}


