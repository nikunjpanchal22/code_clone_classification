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


 public static Boolean isAnagram(String word, String anagram_word) {
    if (word.length() != anagram_word.length()) {
        return false;
    }

    int[] word_count = new int[128];
    int[] anagram_count = new int[128];

    for (char c : word.toCharArray()) {
        int index = (int)c;
        word_count[index]++;
    }
    for (char c : anagram_word.toCharArray()) {
        int index = (int)c;
        anagram_count[index]++;
    }

    for (int i = 0; i < 128; i++) {
        if (word_count[i] != anagram_count[i]) {
            return false;
        }
    }
    return true;
}


