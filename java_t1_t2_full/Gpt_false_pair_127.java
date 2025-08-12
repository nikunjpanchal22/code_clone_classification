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
int highestLength = 0;
    int count = 1;
    char earlier = ' ';
    for (int i = 0; i < str.length(); i++) {
        char latter = str.charAt(i);
        if (earlier == latter) {
            count++;
            if (count > highestLength) {
                highestLength = count;
            }
        } else {
            count = 1;
            if (count > highestLength) {
                highestLength = count;
            }
        }
        earlier = latter;
    }
    return highestLength;
}
