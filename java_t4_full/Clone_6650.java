public static void removeDuplicates (char [] str) {
    int map = 0;
    for (int i = 0;
    i < str.length; i ++) {
        if ((map & (1 << (str [i] - 'a'))) > 0) str [i] = 0;
        else map |= 1 << (str [i] - 'a');
    }
}




public static void removeDuplicates10 (char [] str) {
    int end = 1;
    for (int i = 1; i < str.length; i++) {
        int j;
        for (j = 0; j < end; j++) {
            if (str[i] == str[j])
                break;
        }
        if (j == end) {
            str[end] = str[i];
            end++;
        } else {
            str[i] = 0;
        }
    }
}


