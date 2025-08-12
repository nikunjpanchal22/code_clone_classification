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



 

public static int maxBlock (String s) {
    int maxCount = 0;
    for(int i = 0; i < s.length(); i++) {
        int count = 1; 
        while(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)) {
            i++;
            count++;
        }
        maxCount = Math.max(maxCount, count);
    }
    return maxCount;
}


