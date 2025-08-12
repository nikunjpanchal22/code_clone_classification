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


 

public static boolean isAnagram(String first, String second) {
    String f = first.replaceAll("\\s", "").toLowerCase();
    String s = second.replaceAll("\\s", "").toLowerCase();
    boolean status = true;
    if (f.length() != s.length()) {
        status = false;
    } else {
        char[] ArrayS1 = f.toCharArray();
        char[] ArrayS2 = s.toCharArray();
        Arrays.sort(ArrayS1);
        Arrays.sort(ArrayS2);
        status = Arrays.equals(ArrayS1, ArrayS2);
    }
    return status;
}


