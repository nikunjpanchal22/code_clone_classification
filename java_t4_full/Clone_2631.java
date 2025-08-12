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





public int maxBlock(String str) 
{
    int maxCount = 0;
    for(int i=0; i<str.length(); i++) 
    {
        int count = 1;
        while(i+1<str.length() && str.charAt(i+1)==str.charAt(i))
        {
            count++;
            i++;
        }
        maxCount = Math.max(maxCount, count);
    }
    return maxCount;
}


