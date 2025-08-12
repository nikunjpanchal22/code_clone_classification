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
int maxRepeated = 0; 
    int repCount = 1; 
    char prevCh = ' '; 
    for (int z = 0; z < str.length(); z++) {
        char ch = str.charAt(z);
        if (prevCh == ch) {
            repCount++;
            if (repCount > maxRepeated) {
                maxRepeated = repCount;
            }
        } else {
            repCount = 1; 
            if (repCount > maxRepeated) {
                maxRepeated = repCount;
            }
        }
        prevCh = ch;
    }
    return maxRepeated;
}
