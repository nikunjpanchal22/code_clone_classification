public static int [] removeDuplicates (int [] arr) {
    int end = arr.length;
    for (int i = 0;
    i < end; i ++) {
        for (int j = i + 1;
        j < end; j ++) {
            if (arr [i] == arr [j]) {
                arr [j] = arr [end - 1];
                end --;
                j --;
            }
        }
    }
    int [] whitelist = new int [end];
    System.arraycopy (arr, 0, whitelist, 0, end);
    return whitelist;
}


 public static int [] removeDuplicates (int [] arr) 
{ 
    // Result 
    int[] whitelist = new int[arr.length]; 
  
    int count = 0;
    int end = arr.length;
    for (int i = 0; i < end; i++)  
    { 
        boolean found = false; 
        for (int j = 0; j < count; j++) 
        { 
            if (whitelist[j] == arr[i]) 
            { 
                found = true; 
            } 
        } 
  
        // If not found in previously visited elements 
        if (!found) 
        { 
            // Add to whitelist array 
            whitelist[count] = arr[i]; 
            count++; 
        } 
    } 

    // Copy elements from whitelist array 
    int[] tx = new int[count]; 
    for (int i = 0; i < count; i++) 
    { 
        tx[i] = whitelist[i]; 
    } 

    // Return new array 
    return tx; 
}


