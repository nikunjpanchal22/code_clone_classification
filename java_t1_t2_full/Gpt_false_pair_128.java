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


 public int maxBlock (String str) {
int maxBlock = 0;
    int count = 1;
    char last = ' ';
    for (int i = 0; i < str.length(); i++) {
        char character = str.charAt(i);
        if (last == character) {
            count++;
            if (count > maxBlock) {
                maxBlock = count;
            }
        } else {
            count = 1;
            if (count > maxBlock) {
                maxBlock = count;
            }
        }
        last = character;
    }
    return maxBlock;
}
