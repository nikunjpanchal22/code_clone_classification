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
    int max = 0, count=0;
    char currChar =' ';
    int len = str.length();
    for(int i = 0; i < len; i++)
    {
        if(currChar == str.charAt(i))
        {
            count++;
            max = Math.max(count, max);
        }
        else
        {
            count = 1;
            currChar = str.charAt(i);
        }
    }
    return max;
}


