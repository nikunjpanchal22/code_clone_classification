public static int maxBlock (String str) {
    int maxCounter = 1;
    int counter = 1;
    if (str.length () == 0) {
        return 0;
    }
    for (int i = 1;
    i < str.length (); i ++) {
        if (str.charAt (i - 1) == str.charAt (i)) {
            counter ++;
        } else {
            if (counter > maxCounter) {
                maxCounter = counter;
            }
            counter = 1;
        }
    }
    return Math.max (maxCounter, counter);
}





public static int maxBlock(String str) {
    if (str.length() == 0) {
        return 0;
    }
    int maxBlock = 1;
    int count = 1;
    for (int i = 1; i < str.length(); i++) {
        count = (str.charAt(i - 1) == str.charAt(i)) ? count + 1 : 1;
        maxBlock = Math.max(maxBlock, count);
    }
    return maxBlock;
}


