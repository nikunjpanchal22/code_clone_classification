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
  
    // Index for whitelist array 
    int k = 0; 
  
    // Iterate over given array 
    for (int i = 0; i < arr.length; i++) 
    { 
        boolean found = false; 
        for (int j = i+1; j < arr.length; j++) 
        { 
            if (arr[i] == arr[j]) 
            { 
                found = true; 
            } 
        } 
  
        // If not found in previously visited elements 
        if (!found) 
        { 
            // Add to whitelist array 
            whitelist[k] = arr[i]; 
            k++; 
        } 
    } 
  
    // Copy elements from whitelist array 
    int[] tx = new int[k]; 
    for (int i = 0; i < k; i++) 
    { 
        tx[i] = whitelist[i]; 
    } 
  
    // Return new array 
    return tx; 
}


