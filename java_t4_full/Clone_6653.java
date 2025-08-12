public static void removeDuplicates (char [] str) {
    int map = 0;
    for (int i = 0;
    i < str.length; i ++) {
        if ((map & (1 << (str [i] - 'a'))) > 0) str [i] = 0;
        else map |= 1 << (str [i] - 'a');
    }
}




public static void removeDuplicates6 (char [] str) {
    int j = 0;
    for (int i = 1; i < str.length; i++) {
        if (str[j] != str[i]) {
            str[++j] = str[i];
        }
    }
    while (++j < str.length) {
        str[j] = 0;
    }
}


