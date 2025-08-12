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
    int curr_size = 0, max_size = 0; 
    int index = 0; 
  
    for (int i = 0; i < str.Length; i++) 
    { 
        if (str[i] == str[i - 1]) 
            curr_size++; 
        else
        { 
            if (curr_size > max_size) 
            { 
                max_size = curr_size; 
                index = i - curr_size ; 
            } 
            curr_size = 1; 
        } 
    } 
  
    if (curr_size > max_size) 
    { 
        max_size = curr_size; 
        index = str.Length - curr_size; 
    } 
  
    return index; 
}


