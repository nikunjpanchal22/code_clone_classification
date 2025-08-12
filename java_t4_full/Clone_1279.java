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
    // Sorting the array 
    Arrays.sort(arr); 
  
    // Result 
    int[] whitelist = new int[arr.length]; 
  
    // Index for whitelist array 
    int k = 0; 
  
    for (int i = 0; i < arr.length-1; i++) 
    { 
        // If current element  
        // is not equal to next 
        // element then store that 
        // current element 
        if (arr[i] != arr[i+1]) { 
            whitelist[k] = arr[i]; 
  
            // Increment count of valid 
            // elements 
            k++; 
        }    
    } 
  
    // Store the last element  
    // as whether it is unique 
    // or repeated, it hasn't 
    // stored previously 
    whitelist[k] = arr[arr.length-1]; 
    k++; 
  
    // Copy elements from whitelist array 
    int[] tx = new int[k]; 
    for (int i = 0; i < k; i++) 
    { 
        tx[i] = whitelist[i]; 
    } 
  
    // Return new array 
    return tx; 
} 


