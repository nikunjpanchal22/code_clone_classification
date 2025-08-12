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
    int count = 0, result = 0, max = 0; 

    // Start traversing the string 
    for (int i = 0; i < str.Length; i++) { 

        // If current character is equal to previous then 
        // increase count, otherwise reset count as 1 
        if (i > 0 && str[i] == str[i - 1]) 
            count++; 
        else
            count = 1; 

        // Update result if count is larger. 
        if (count > max) { 
            max = count; 
            result = i - max + 1; 
        } 
    } 
  
    return result; 
} 


