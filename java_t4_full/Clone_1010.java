public static Boolean isAnagram (String word, String anagram_word) {
    if (word.length () != anagram_word.length ()) {
        return false;
    }
    char [] words_char = word.toCharArray ();
    char [] anagram_word_char = anagram_word.toCharArray ();
    int words_char_num = 1;
    int anagram_word_num = 1;
    Map < Character, Integer > wordPrimeMap = wordPrimeMap ();
    for (int i = 0;
    i < words_char.length; i ++) {
        words_char_num *= wordPrimeMap.get (words_char [i]);
    }
    for (int i = 0;
    i < anagram_word_char.length; i ++) {
        anagram_word_num *= wordPrimeMap.get (anagram_word_char [i]);
    }
    return anagram_word_num == words_char_num;
}


 public static Boolean isAnagram (String word, String anagram_word) {
    if (word.length() != anagram_word.length()) {
        return false;
    }
    HashMap<Character, Integer> word_map = new HashMap<>();
    for (char c : word.toCharArray()) {
        word_map.put(c, word_map.getOrDefault(c, 0) + 1);
    }
    for (char c : anagram_word.toCharArray()) {
        if (!word_map.containsKey(c)) {
            return false;
        }
        word_map.put(c, word_map.get(c) - 1);
    }
    for (char c : word_map.keySet()) {
        if (word_map.get(c) != 0) {
            return false;
        }
    }
    return true;
}


