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
    int max = 0;
    if( str.length() > 0 ) {
        char last = str.charAt(0);
        for(int i=1; i<=str.length(); i++){
            int run = i;
            while( i<str.length() && str.charAt(i) == last ) i++;
            max = Math.max(max, i-run);
            if(i<str.length()) last = str.charAt(i);
        }
    }
    return max;
}


