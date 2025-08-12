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


// Implementation 10
public static boolean isAnagram10(String first, String second) {
    if (first.length() == second.length()) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : first.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : second.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    } 
    return false;
}


