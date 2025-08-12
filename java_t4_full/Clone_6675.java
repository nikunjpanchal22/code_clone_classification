public static void removeDuplicates (char [] str) {
    int map = 0;
    for (int i = 0;
    i < str.length; i ++) {
        if ((map & (1 << (str [i] - 'a'))) > 0) str [i] = 0;
        else map |= 1 << (str [i] - 'a');
    }
}





public static void removeDuplicates(char[] str){
    int map = 0;
    for(int i = 0; i<str.length; i++){
        int current = 1 << (str[i]-'a');
        if((map & current) > 0) str[i] = 0;
        else map = map | current;
    }
}


