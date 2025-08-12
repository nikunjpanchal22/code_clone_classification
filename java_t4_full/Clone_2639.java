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
    int max = 0, count = 0;
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length-1; i++) {
        count = chars[i] == chars[i+1] ? count + 1 : 0;
        if (count > max) max = count;
    }
    return max + 1;
}


