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


 public static String numLetters (String s){
    StringBuilder ans = new StringBuilder("");
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        if(map.containsKey(c)){
            map.put(c, map.get(c) + 1);
        }
        else{
            map.put(c, 1);
        }
    }
    for (Map.Entry c : map.entrySet()){
        ans.append(String.valueOf(c.getValue())).append((char) (c.getKey()));
    }
    return ans.toString();
}


