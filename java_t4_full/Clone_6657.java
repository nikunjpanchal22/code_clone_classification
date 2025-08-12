public static void removeDuplicates (char [] str) {
    int map = 0;
    for (int i = 0;
    i < str.length; i ++) {
        if ((map & (1 << (str [i] - 'a'))) > 0) str [i] = 0;
        else map |= 1 << (str [i] - 'a');
    }
}




public static void removeDuplicates7 (char [] str) {
    int j = 0;
    Arrays.sort(str);
    for (int i = 0; i < str.length - 1; i++)
        if (str[i] != str[i + 1])
            str[j++] = str[i];
    str[j] = str[str.length - 1];
}


