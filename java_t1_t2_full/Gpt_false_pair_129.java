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
	int maxBlockSize = 0;
    int count = 1;
    char current = ' ';
    for (int i = 0; i < str.length(); i++) {
        char next = str.charAt(i); 
        if (current == next) {
            count ++;
            if (count > maxBlockSize) {
                maxBlockSize = count; 
            }
        } else {
            count = 1;
            if (count > maxBlockSize) {
                maxBlockSize = count;
            }
        }
        current = next;
    } 
    return maxBlockSize;
}
