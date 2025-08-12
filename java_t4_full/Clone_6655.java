public static void removeDuplicates (char [] str) {
    int map = 0;
    for (int i = 0;
    i < str.length; i ++) {
        if ((map & (1 << (str [i] - 'a'))) > 0) str [i] = 0;
        else map |= 1 << (str [i] - 'a');
    }
}




public static void removeDuplicates2 (char [] str) {
    HashSet<Character> set = new HashSet<>();
    int writeIndex = 0;
    for (char c : str) {
        if (set.add(c)) {
            str[writeIndex++] = c;
        }
    }
    Arrays.fill(str, writeIndex, str.length, (char)0);
}


