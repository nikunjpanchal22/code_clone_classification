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
int blockSize = 0;
    int count = 1;
    char c = ' ';
    for (int i = 0; i < str.length(); i++) {
        char current = str.charAt(i);
        if (c == current) {
            count++;
            if (count > blockSize) {
                blockSize = count;
            } 
        } else {
            count = 1; 
            if (count > blockSize) {
                blockSize = count;
            }
        } 
        c = current;
    }
    return blockSize;
}
