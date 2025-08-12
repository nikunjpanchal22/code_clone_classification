public int maxBlock (String str) {
    int max = 0;
    int count = 1;
    char o = ' ';
    for (int i = 0;
    i < str.length (); i ++) {
        char c = str.charAt (i);
        if (c == o) {
            count ++;
            if (count > max) {
                max = count;
            }
        } else {
            count = 1;
            if (count > max) {
                max = count;
            }
        }
        o = c;
    }
    return max;
}





public int maxBlock(String str) {
    int max = 0, count = 0;
    for(int i = 0; i < str.length(); i++) {
        int j = i;
        while(j < str.length() && str.charAt(j) == str.charAt(i)) {
            j++; count++;
        }
        if (count > max) max = count;
        i = j;
        count = 0;
    }
    return max;
}


