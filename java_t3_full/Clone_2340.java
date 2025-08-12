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
    int count = 0;
    int max = 0;
    char letter = ' ';
    for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == letter) count++;
        else{
            if(count > max){
                max = count;
            }
            letter = str.charAt(i);
            count = 1;
        }
        max = Math.max(max,count);
    }
    return max;
}


