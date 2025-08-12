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
    
    int maxLength = 0; 
    int currentLength = 1; 
    char previous = str[0]; 
    int index = 0;
    for (int i=1; i<str.Length; i++) 
    { 
        char current = str[i]; 
        if (current == previous) 
            currentLength++; 
        else
        { 
            if (currentLength > maxLength) 
            { 
                maxLength = currentLength; 
                index = i-maxLength; 
            } 
            currentLength = 1; 
        } 
        previous = current; 
    } 
  
    if (currentLength > maxLength) 
        index = str.Length - currentLength; 
  
    return index; 
}


