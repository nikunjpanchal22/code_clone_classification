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
int maxLength = 0; 
    int currentLength = 1; 
    char lastChar = ' '; 
    for (int i = 0; i < str.length(); i++) {
        char curr = str.charAt(i);
        if (lastChar == curr) { 
            currentLength++; 
            if (currentLength > maxLength) {
                maxLength = currentLength; 
            } 
        } else { 
            currentLength = 1; 
            if (currentLength > maxLength) {
                maxLength = currentLength; 
            } 
        }
        lastChar = curr; 
    }
    return maxLength;
}
