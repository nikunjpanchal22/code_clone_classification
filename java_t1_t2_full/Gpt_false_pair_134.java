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
    int numberInBlock = 1; 
    char prevCharacter = ' ';
    for (int y = 0; y < str.length(); y++) {
        char currentCharacter = str.charAt(y);
        if (prevCharacter == currentCharacter) {
            numberInBlock++;
            if (numberInBlock > maxBlockSize) {
                maxBlockSize = numberInBlock;
            }
        } else { 
            numberInBlock = 1;
            if (numberInBlock > maxBlockSize) {
                maxBlockSize = numberInBlock;
            }
        }
        prevCharacter = currentCharacter;
    }
    return maxBlockSize;
}
