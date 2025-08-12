public static void removeDuplicates (char [] str) {
    int map = 0;
    for (int i = 0;
    i < str.length; i ++) {
        if ((map & (1 << (str [i] - 'a'))) > 0) str [i] = 0;
        else map |= 1 << (str [i] - 'a');
    }
}




public static void removeDuplicates8 (char [] str) {
    int n = str.length;
    int j = 0;
    for (int i = 0; i < n; i++)
        if (i == n - 1 || str[i] != str[i + 1])
            str[j++] = str[i];
    Arrays.fill(str, j, n, (char)0);
}


