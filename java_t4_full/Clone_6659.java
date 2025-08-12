public static void removeDuplicates (char [] str) {
    int map = 0;
    for (int i = 0;
    i < str.length; i ++) {
        if ((map & (1 << (str [i] - 'a'))) > 0) str [i] = 0;
        else map |= 1 << (str [i] - 'a');
    }
}





public static void removeDuplicates1 (char [] str) {
    HashSet<Character> set = new HashSet<>();
    for (int i = 0; i < str.length; i++) {
        if (!set.add(str[i])) {
            str[i] = 0;
        }
    }
}


