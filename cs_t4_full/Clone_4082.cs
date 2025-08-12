private static int IndexOfLongestRun (string str) {
    char [] array1 = str.ToCharArray ();
    Comparer comparer = new Comparer ();
    int counter = 1;
    int maxCount = 0;
    int idenxOf = 0;
    int i;
    for (i = 0; i < array1.Length - 1; i ++) {
        if (comparer.Compare (array1 [i], array1 [i + 1]) == 0) {
            counter ++;
        } else {
            if (maxCount < counter) {
                maxCount = counter;
                idenxOf = i - counter + 1;
            }
            counter = 1;
        }
    }
    if (maxCount < counter) {
        maxCount = counter;
        idenxOf = i - counter + 1;
    }
    return idenxOf;
}


private static int IndexOfLongestRun(string str) 
{ 
    int i, counter, maxLength, beginIndex, endIndex; 
    beginIndex = 0; endIndex = 0; counter = 1; maxLength = 0; 
  
    for (i = 0; i < str.Length; i++) 
    { 
        if (i == 0) 
            counter = 1; 
        else if (str[i] == str[i - 1]) 
            counter++; 
        else
        {  
            if (maxLength < counter) 
            { 
                maxLength = counter; 
                beginIndex = i - maxLength; 
                endIndex = i - 1; 
            } 
            counter = 1; 
        } 
    } 
    if (maxLength < counter) 
    { 
        maxLength = counter; 
        beginIndex = i - maxLength; 
        endIndex = i - 1; 
    } 
    return beginIndex; 
}


