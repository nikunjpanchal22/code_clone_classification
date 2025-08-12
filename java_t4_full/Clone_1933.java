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
    TreeMap<Character, Integer> tree = new TreeMap<>();
    String ans = "";

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (tree.containsKey(c))
            tree.put(c, tree.get(c) + 1);
        else
            tree.put(c, 1);
    }

    for (Map.Entry<Character, Integer> set : tree.entrySet()) {
        ans += set.getValue() + Character.toString(set.getKey());
    }

    return ans;
}


