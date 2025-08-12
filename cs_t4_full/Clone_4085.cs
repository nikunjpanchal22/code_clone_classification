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


 private static int IndexOfLongestRun (string str) 
{ 
    int i, finalIndex, currSize, maxSize; 
    maxSize = 1; finalIndex = 0; currSize = 1; 
   
    for (i=1; i<str.Length; i++) 
    { 
        if (str[i] == str[i-1]) 
            currSize++; 
        else 
        { 
            if (currSize > maxSize) 
            { 
                maxSize = currSize; 
                finalIndex = i - maxSize; 
            } 
            currSize = 1; 
        } 
    } 
      
    if (currSize > maxSize) 
    { 
        maxSize = currSize; 
        finalIndex = i - maxSize; 
    }     
  
    return finalIndex; 
}


