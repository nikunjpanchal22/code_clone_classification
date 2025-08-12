public static void removeDuplicates (char [] str) {
    int map = 0;
    for (int i = 0;
    i < str.length; i ++) {
        if ((map & (1 << (str [i] - 'a'))) > 0) str [i] = 0;
        else map |= 1 << (str [i] - 'a');
    }
}




public static void removeDuplicates4 (char [] str) {
    BitSet bits = new BitSet();
    for (int i = 0; i < str.length; i++) {
        if (!bits.get(str[i])) {
            bits.set(str[i]);
        } else {
            str[i] = 0;
        }
    }
}


