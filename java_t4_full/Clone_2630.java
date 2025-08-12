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
        char target = str.charAt(i);
        int count = 0;
        while(i+count<str.length() && str.charAt(i+count)==target)
        {
            count++;
        }
        if(count>maxCount) maxCount = count;
    }
    return maxCount;
}


