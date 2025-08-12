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





public int maxBlock(String str) { 
    int max = 0, counter = 0;
    for(int i = 1; i < str.length(); i++) {
        if(str.charAt(i) == str.charAt(i-1)) counter++;
        else {
            max = Math.max(max, counter);
            counter = 1;
        }       
    }
    return Math.max(max, counter);
}


